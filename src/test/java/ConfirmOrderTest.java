import cn.hutool.json.JSONObject;
import com.show.video.paypal.PayPalApi;
import com.show.video.paypal.interceptor.HeaderInterceptor;
import com.show.video.paypal.interceptor.PaypalLog;
import com.show.video.paypal.request.CreateOrderRequest;
import com.show.video.paypal.request.body.ExperienceContext;
import com.show.video.paypal.request.body.Name;
import com.show.video.paypal.request.body.PaymentSource;
import com.show.video.paypal.request.body.Paypal;
import com.show.video.paypal.response.AccessTokenResponse;
import com.show.video.paypal.response.ConfirmOrderResponse;
import com.show.video.paypal.response.CreateOrderResponse;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 14:48
 */
public class ConfirmOrderTest {

    public static void main(String[] args) {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new PaypalLog());
        //！！！！千万别再生产或者测试环境打开BODY级别日志！！！！
        //！！！生产或者测试环境建议设置为这三种级别：NONE,BASIC,HEADERS,！！！
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        HeaderInterceptor headerInterceptor = new HeaderInterceptor();
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(headerInterceptor)
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        // 设置Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api-m.sandbox.paypal.com/")
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        PayPalApi payPalService = retrofit.create(PayPalApi.class);
        System.setProperty("https.protocols", "TLSv1.2,TLSv1.3");

        String clientId = "##############";
        String clientSecret = "##############";
        String credentials = Credentials.basic(clientId, clientSecret);

        try {
            CreateOrderRequest orderRequest = new CreateOrderRequest();
            PaymentSource paymentSource = new PaymentSource();

            Paypal paypal = new Paypal();
            paypal.setEmailAddress("##############@gmail.com");
            paypal.setName(new Name("##############", "##############"));

            ExperienceContext experienceContext = new ExperienceContext();
            experienceContext.setPaymentMethodPreference("IMMEDIATE_PAYMENT_REQUIRED");
            experienceContext.setBrandName("EXAMPLE INC");
            experienceContext.setLocale("en-US");
            experienceContext.setLandingPage("LOGIN");
            experienceContext.setShippingPreference("SET_PROVIDED_ADDRESS");
            experienceContext.setUserAction("PAY_NOW");
            experienceContext.setReturnUrl("https://##############/success.html");
            experienceContext.setCancelUrl("https://##############/fail.html");
            paypal.setExperienceContext(experienceContext);

            paymentSource.setPaypal(paypal);

            orderRequest.setPaymentSource(paymentSource);

            Response<AccessTokenResponse> clientCredentials = payPalService.getToken(credentials, "client_credentials").execute();
            String accessToken = clientCredentials.body().getAccessToken();
            System.out.println("Token: " + accessToken);
            String authorization = String.format("Bearer %s", accessToken);

            //4NV67930RL429250U
            Response<ConfirmOrderResponse> execute = payPalService.confirmPaymentSource(authorization, "4NV67930RL429250U", orderRequest).execute();
            System.out.println("execute: " + execute);
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }
}

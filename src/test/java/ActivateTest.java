import com.show.video.paypal.PayPalApi;
import com.show.video.paypal.interceptor.HeaderInterceptor;
import com.show.video.paypal.interceptor.PaypalLog;
import com.show.video.paypal.request.CreateOrderRequest;
import com.show.video.paypal.request.ReactivationReason;
import com.show.video.paypal.request.body.Amount;
import com.show.video.paypal.request.body.PurchaseUnit;
import com.show.video.paypal.response.AccessTokenResponse;
import com.show.video.paypal.response.CreateOrderResponse;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 14:48
 */
public class ActivateTest {

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


        String clientId = "*********";
        String clientSecret = "*********";
        String credentials = Credentials.basic(clientId, clientSecret);

        try{
            Response<AccessTokenResponse> clientCredentials = payPalService.getToken(credentials, "client_credentials").execute();
            String accessToken = clientCredentials.body().getAccessToken();
            System.out.println("Token: " + accessToken);
            String authorization = String.format("Bearer %s", accessToken);
            authorization = "Bearer *********";
            Amount amount = new Amount();
            amount.setValue("10");
            ReactivationReason reactivationReason = new ReactivationReason();
            reactivationReason.setReason("");
            String subscriptionId = "*********";
            Response<ResponseBody> execute1 = payPalService.getSubscription(authorization, subscriptionId).execute();

            System.out.println(execute1.body());

            Response<ResponseBody> execute = payPalService.activateSubscription(authorization, subscriptionId, reactivationReason).execute();
            //execute.code()
            System.out.println(execute.body());
        }catch(Exception ex){
            System.out.println(ex);
        }


    }
}

import com.show.video.paypal.PayPalApi;
import com.show.video.paypal.interceptor.PaypalLog;
import com.show.video.paypal.request.*;
import com.show.video.paypal.request.body.*;
import com.show.video.paypal.response.AccessTokenResponse;
import com.show.video.paypal.response.CreatePlanResponse;
import com.show.video.paypal.response.CreateSubscriptionResponse;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 11:13
 */
public class SubscriptionTest {

    public static void main(String[] args) {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new PaypalLog());
        //！！！！千万别再生产或者测试环境打开BODY级别日志！！！！
        //！！！生产或者测试环境建议设置为这三种级别：NONE,BASIC,HEADERS,！！！
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
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



        // 创建API服务
        PayPalApi payPalService = retrofit.create(PayPalApi.class);
        System.setProperty("https.protocols", "TLSv1.2,TLSv1.3");

        // 构建授权头部
        String clientId = "##############";
        String clientSecret = "##############";
        String credentials = Credentials.basic(clientId, clientSecret);

        // 调用API
        Call<AccessTokenResponse> call = payPalService.getToken( credentials,
                "client_credentials"
        );

        try {
            // 执行请求
            retrofit2.Response<AccessTokenResponse> response = call.execute();
            // 处理响应
            if (response.isSuccessful()) {
                System.out.println("Token: " + response.body().getAccessToken());
                String token = response.body().getAccessToken();
                String authorization = String.format("Bearer %s", token);
                String contentType = "application/json";

                CreateProductRequest createProductRequest = new CreateProductRequest();
                createProductRequest.setName("订阅");
                createProductRequest.setDescription("订阅");
                //1.创建产品
                //Call<ProductResponse> product = payPalService.createProduct(contentType, authorization, createProductRequest);
                //Response<ProductResponse> productResponse = product.execute();
                //ProductResponse productBody = productResponse.body();
                //String id = productBody.getId();
                String id = "PROD-6DF967741H878594A";
                System.out.println("Product: " + id);

                Frequency frequency = new Frequency();
                Amount amount = new Amount();
                amount.setValue(BigDecimal.valueOf(10).toString());

                PricingScheme pricingScheme = new PricingScheme();
                pricingScheme.setAmount(amount);

                BillingCycle billingCycle = new BillingCycle();
                billingCycle.setFrequency(frequency);
                billingCycle.setPricingScheme(pricingScheme);

                Amount setupFee = new Amount();
                setupFee.setValue(BigDecimal.valueOf(10).toString());

                PaymentPreferences paymentPreferences = new PaymentPreferences();
                paymentPreferences.setSetupFee(setupFee);

                CreateBillingPlanRequest createBillingPlanRequest = new CreateBillingPlanRequest();
                createBillingPlanRequest.setProductId(id);
                createBillingPlanRequest.setName("订阅");
                createBillingPlanRequest.setDescription("订阅");
                createBillingPlanRequest.setBillingCycles(Arrays.asList(billingCycle));
                createBillingPlanRequest.setPaymentPreferences(paymentPreferences);
                //2.创建计划
                Response<CreatePlanResponse> subscription = payPalService.createBillingPlan(authorization, createBillingPlanRequest).execute();
                String planId = subscription.body().getId();
                System.out.println("Plan: " + planId);

                ApplicationContext applicationContext = new ApplicationContext();
                applicationContext.setBrandName("##############");
                applicationContext.setLocale("en-US");
                applicationContext.setReturnUrl("https://renewed-kingfish-safely.ngrok-free.app/paypal/v1/subscriptions");
                applicationContext.setCancelUrl("https://renewed-kingfish-safely.ngrok-free.app/paypal/v1/subscriptions/cancel");


                SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
                subscriptionRequest.setPlanId(planId);
                subscriptionRequest.setApplicationContext(applicationContext);
                //3.创建订阅
                Response<CreateSubscriptionResponse> subEx = payPalService.createSubscription(authorization, subscriptionRequest).execute();
                String subId = subEx.body().getId();
                System.out.println("Subscription: " + subId);
            } else {
                System.out.println("Error: " + response.errorBody().string());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

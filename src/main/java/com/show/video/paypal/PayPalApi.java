package com.show.video.paypal;

import com.show.video.paypal.request.*;
import com.show.video.paypal.response.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 11:03
 */
public interface PayPalApi {

    /**
     * 获取令牌
     *
     * @param authorization 授权
     * @param grantType     授权类型
     * @return {@link Call}<{@link AccessTokenResponse}>
     */
    @FormUrlEncoded
    @POST("v1/oauth2/token")
    Call<AccessTokenResponse> getToken(
            @Header("Authorization") String authorization,
            @Field("grant_type") String grantType
    );


    /**
     * 创建订单
     *
     * @param authorization 授权
     * @param requestBody   请求正文
     * @return {@link Call}<{@link CreateOrderResponse}>
     */
    @POST("v2/checkout/orders")
    Call<CreateOrderResponse> createOrder(
            @Header("Authorization") String authorization,
            @Body CreateOrderRequest requestBody
    );

    /**
     * 捕获订单订单
     *
     * @param authorization 授权
     * @param id            付款人确认其付款意向的订单的 ID。
     * @return {@link Call}<{@link CreateOrderResponse}>
     */
    @POST("/v2/checkout/orders/{id}/capture")
    Call<CaptureOrderResponse> captureOrder(
            @Header("Authorization") String authorization,
            @Path("id") String id
    );

    /**
     * 确认订单   没有用 不需要调用
     *
     * @param authorization 授权
     * @param id            付款人确认其付款意向的订单的 ID。
     * @return {@link Call}<{@link CreateOrderResponse}>
     */
    @POST("/v2/checkout/orders/{id}/confirm-payment-source")
    Call<ConfirmOrderResponse> confirmPaymentSource(
            @Header("Authorization") String authorization,
            @Path("id") String id,
            @Body CreateOrderRequest requestBody
    );

    /**
     * 创建产品
     *
     * @param authorization 授权
     * @param requestBody   请求正文
     * @return {@link Call}<{@link ProductResponse}>
     */
    @POST("v1/catalogs/products")
    Call<ProductResponse> createProduct(
            @Header("Authorization") String authorization,
            @Body CreateProductRequest requestBody
    );

    /**
     * 创建计费计划
     *
     * @param request       请求
     * @param authorization 授权
     * @return {@link Call}<{@link CreatePlanResponse}>
     */
    @POST("v1/billing/plans")
    Call<CreatePlanResponse> createBillingPlan(
            @Header("Authorization") String authorization,
            @Body CreateBillingPlanRequest request
    );

    /**
     * 创建订阅
     *
     * @param authorization 授权
     * @param requestBody   请求正文
     * @return {@link Call}<{@link CreateSubscriptionResponse}>
     */
    @POST("v1/billing/subscriptions")
    Call<CreateSubscriptionResponse> createSubscription(
            @Header("Authorization") String authorization,
            @Body SubscriptionRequest requestBody
    );

    @GET("v1/billing/subscriptions/{subscriptionId}")
    Call<ResponseBody> getSubscription(
            @Header("Authorization") String authorization,
            @Path("subscriptionId") String subscriptionId
    );

    /**
     * 激活订阅
     *
     * @param subscriptionId 订阅id
     * @param requestBody    请求正文
     * @return {@link Call}<{@link ResponseBody}>
     */
    @POST("v1/billing/subscriptions/{subscriptionId}/activate")
    Call<ResponseBody> activateSubscription(
            @Header("Authorization") String authorization,
            @Path("subscriptionId") String subscriptionId,
            @Body ReactivationReason requestBody
    );
}

package com.show.video.paypal.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.*;
import com.show.video.paypal.request.body.Amount;
import lombok.Data;

/**
 * 订阅请求
 *
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 15:44
 */
@Data
public class SubscriptionRequest {

    @JsonProperty("plan_id")
    public String planId;

    @JsonProperty("start_time")
    public String startTime;

    @JsonProperty("quantity")
    public String quantity;

    @JsonProperty("shipping_amount")
    public Amount shippingAmount;

    @JsonProperty("subscriber")
    public Subscriber subscriber;

    @JsonProperty("application_context")
    public ApplicationContext applicationContext;

}

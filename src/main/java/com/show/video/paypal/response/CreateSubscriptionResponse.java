package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.constant.SubscriptionStatus;
import com.show.video.paypal.request.body.Amount;
import com.show.video.paypal.request.body.Link;
import com.show.video.paypal.request.body.Name;
import lombok.Data;

import java.util.List;

@Data
public class CreateSubscriptionResponse {

    @JsonProperty("id")
    public String id;

    /**
     * 状态
     * @see SubscriptionStatus
     */
    @JsonProperty("status")
    public String status;

    @JsonProperty("status_update_time")
    public String statusUpdateTime;

    @JsonProperty("plan_id")
    public String planId;

    @JsonProperty("plan_overridden")
    public boolean planOverridden;

    @JsonProperty("start_time")
    public String startTime;

    @JsonProperty("quantity")
    public String quantity;

    @JsonProperty("shipping_amount")
    public Amount shippingAmount;

    @JsonProperty("subscriber")
    public Name subscriber;

    @JsonProperty("create_time")
    public String createTime;

    @JsonProperty("links")
    public List<Link> links;
}
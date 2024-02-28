package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class BillingAgreementResource {

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("subscriber")
    private Subscriber subscriber;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("shipping_amount")
    private Amount shippingAmount;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("update_time")
    private String updateTime;

    @JsonProperty("billing_info")
    private BillingInfo billingInfo;

    @JsonProperty("links")
    private List<Link> links;

    @JsonProperty("id")
    private String id;

    @JsonProperty("plan_id")
    private String planId;

    @JsonProperty("auto_renewal")
    private boolean autoRenewal;

    @JsonProperty("status")
    private String status;

    @JsonProperty("status_update_time")
    private String statusUpdateTime;
}
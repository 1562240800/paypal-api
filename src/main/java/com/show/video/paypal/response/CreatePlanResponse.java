package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.*;
import lombok.Data;

import java.util.List;

@Data
public class CreatePlanResponse {

   @JsonProperty("id")
    public String id;

    @JsonProperty("product_id")
    public String productId;

    @JsonProperty("name")
    public String namze;

    @JsonProperty("description")
    public String description;

    @JsonProperty("status")
    public String status;

    @JsonProperty("usage_type")
    private String usageType;

    @JsonProperty("billing_cycles")
    public List<BillingCycle> billingCycles;

    @JsonProperty("payment_preferences")
    public PaymentPreferences paymentPreferences;

    @JsonProperty("taxes")
    public Taxes taxes;

    @JsonProperty("create_time")
    public String createTime;

    @JsonProperty("update_time")
    public String updateTime;

    @JsonProperty("links")
    public List<Link> links;
}



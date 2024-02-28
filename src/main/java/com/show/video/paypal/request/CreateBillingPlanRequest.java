package com.show.video.paypal.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.BillingCycle;
import com.show.video.paypal.request.body.PaymentPreferences;
import com.show.video.paypal.request.body.Taxes;
import lombok.Data;

import java.util.List;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 14:58
 */
@Data
public class CreateBillingPlanRequest {

    @JsonProperty("product_id")
    public String productId;

    @JsonProperty("name")
    public String name;

    @JsonProperty("description")
    public String description;

    @JsonProperty("billing_cycles")
    public List<BillingCycle> billingCycles;

    @JsonProperty("payment_preferences")
    public PaymentPreferences paymentPreferences;

    @JsonProperty("taxes")
    public Taxes taxes;
}

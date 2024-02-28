package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExperienceContext {

    @JsonProperty("payment_method_preference")
    public String paymentMethodPreference;

    @JsonProperty("brand_name")
    public String brandName;

    @JsonProperty("locale")
    public String locale;

    @JsonProperty("landing_page")
    public String landingPage;

    @JsonProperty("shipping_preference")
    public String shippingPreference;

    @JsonProperty("user_action")
    public String userAction;

    @JsonProperty("return_url")
    public String returnUrl;

    @JsonProperty("cancel_url")
    public String cancelUrl;
}
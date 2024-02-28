package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.constant.SetupFeeFailureAction;
import lombok.Data;

@Data
public class ApplicationContext {

        @JsonProperty("brand_name")
        public String brandName;

        @JsonProperty("locale")
        public String locale = "en-US";

        @JsonProperty("shipping_preference")
        public String shippingPreference = "NO_SHIPPING";

        @JsonProperty("user_action")
        public String userAction = SetupFeeFailureAction.CONTINUE;

        @JsonProperty("payment_method")
        public PaymentMethod paymentMethod;

        @JsonProperty("return_url")
        public String returnUrl;

        @JsonProperty("cancel_url")
        public String cancelUrl;
    }
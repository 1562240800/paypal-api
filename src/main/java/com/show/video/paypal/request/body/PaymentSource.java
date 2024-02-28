package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PaymentSource {

    @JsonProperty("paypal")
    public Paypal paypal;
}
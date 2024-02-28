package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PaymentMethod {

    @JsonProperty("payer_selected")
    public String payerSelected;

    @JsonProperty("payee_preferred")
    public String payeePreferred;
}
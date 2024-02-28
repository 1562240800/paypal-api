package com.show.video.paypal.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.constant.Intent;
import com.show.video.paypal.request.body.PaymentSource;
import com.show.video.paypal.request.body.PurchaseUnit;
import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequest {

    @JsonProperty("intent")
    public String intent = Intent.CAPTURE;

    @JsonProperty("purchase_units")
    public List<PurchaseUnit> purchaseUnits;

    @JsonProperty("payment_source")
    public PaymentSource paymentSource;
}







package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.Link;
import com.show.video.paypal.request.body.Payer;
import com.show.video.paypal.request.body.PaymentSource;
import com.show.video.paypal.request.body.PurchaseUnit;
import lombok.Data;

import java.util.List;

/**
 * @ClassName : CaptureOrderResponse
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 16:34
 */
@Data
public class CaptureOrderResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    @JsonProperty("payment_source")
    private PaymentSource paymentSource;

    @JsonProperty("purchase_units")
    private List<PurchaseUnits> purchaseUnits;

    @JsonProperty("payer")
    private Payer payer;

    @JsonProperty("links")
    private List<Link> links;
}

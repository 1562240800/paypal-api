package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @ClassName : SellerReceivableBreakdown
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 17:19
 */
public class SellerReceivableBreakdown {

    @JsonProperty("gross_amount")
    private GrossAmount grossAmount;

    @JsonProperty("paypal_fee")
    private PaypalFee paypalFee;

    @JsonProperty("net_amount")
    private NetAmount netAmount;

}

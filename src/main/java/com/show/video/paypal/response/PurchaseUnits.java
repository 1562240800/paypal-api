package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.Payments;
import com.show.video.paypal.request.body.Shipping;
import lombok.Data;

import java.util.List;

/**
 * @ClassName : PurchaseUnits
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 16:38
 */
@Data
public class PurchaseUnits {

    @JsonProperty("reference_id")
    private String referenceId;

    @JsonProperty("items")
    private List<Items> items;

    @JsonProperty("shipping")
    private Shipping shipping;

    @JsonProperty("payments")
    private Payments payments;
}

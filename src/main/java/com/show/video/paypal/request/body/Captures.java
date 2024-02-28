package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName : Captures
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 16:42
 */
@Data
public class Captures {

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    @JsonProperty("amount")
    private Amount amount;

    @JsonProperty("seller_protection")
    private SellerProtection sellerProtection;

    @JsonProperty("final_capture")
    private boolean finalCapture;

    @JsonProperty("disbursement_mode")
    private String disbursementMode;

    @JsonProperty("seller_receivable_breakdown")
    private SellerReceivableBreakdown sellerReceivableBreakdown;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("update_time")
    private String updateTime;


    @JsonProperty("links")
    private List<Link> links;
}

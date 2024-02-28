package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.constant.Intent;
import lombok.Data;

import java.util.List;

/**
 * @ClassName : SellerProtection
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 17:16
 */
@Data
public class SellerProtection {

    @JsonProperty("status")
    public String status;

    @JsonProperty("dispute_categories")
    public List<String> disputeCategories;
}

package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @ClassName : PaypalFee
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 17:22
 */
@Data
public class PaypalFee {

    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("value")
    private String value;
}

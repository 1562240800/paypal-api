package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @ClassName : NetAmount
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 17:23
 */
@Data
public class NetAmount {

    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("value")
    private String value;
}

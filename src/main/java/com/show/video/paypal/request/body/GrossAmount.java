package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @ClassName : GrossAmount
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 17:21
 */
@Data
public class GrossAmount {

    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("value")
    private String value;
}

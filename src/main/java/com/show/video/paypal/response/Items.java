package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @ClassName : Items
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 19:35
 */
@Data
public class Items {

    @JsonProperty("name")
    private String name;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("quantity")
    private String quantity;
}

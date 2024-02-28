package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @ClassName : Phone
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 16:13
 */
@Data
public class Phone {

    @JsonProperty("phone_type")
    public String phone_type;

    @JsonProperty("phone_number")
    public PhoneNumber phone_number;
}

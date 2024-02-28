package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @ClassName : PhoneNumber
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 16:14
 */
@Data
public class PhoneNumber {

    @JsonProperty("nationalNumber")
    private String national_number;
}


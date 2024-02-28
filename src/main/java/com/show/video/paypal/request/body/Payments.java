package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName : Payments
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 16:42
 */
@Data
public class Payments {

    @JsonProperty("captures")
    private List<Captures> captures;
}

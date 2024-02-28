package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 税金
 *
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 15:00
 */
@Data
public class Taxes {
    /**
     * 百分比
     */
    @JsonProperty("percentage")
    public String percentage;

    /**
     * 包容性
     */
    @JsonProperty("inclusive")
    public boolean inclusive = false;
}

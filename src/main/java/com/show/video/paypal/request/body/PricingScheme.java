package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 14:59
 */
@Data
public class PricingScheme {
    /**
     * 订阅收取的固定金额。固定金额的更改适用于现有和将来的订阅。
     * 对于现有订阅，价格更改后10天内的付款不受影响
     */
    @JsonProperty("fixed_price")
    public Amount amount;
}

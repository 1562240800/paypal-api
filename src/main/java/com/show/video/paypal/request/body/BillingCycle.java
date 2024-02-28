package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.constant.TenureType;
import lombok.Data;

/**
 * 计费周期
 *
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 14:58
 */
@Data
public class BillingCycle {

    @JsonProperty("frequency")
    public Frequency frequency;

    /**
     * 计费周期的任期类型。如果计划具有试用周期，则每个计划仅允许2个试用周期。 可能的值为：
     * REGULAR。定期的结算周期。
     * TRIAL。试用帐单周期。
     */
    @JsonProperty("tenure_type")
    public String tenureType = TenureType.REGULAR;

    /**
     * 在其他计费周期中，该周期的运行顺序。例如，试用计费周期的sequence值为，
     * 1而普通计费周期的的sequence值为2，因此试用周期在常规周期之前运行。
     */
    @JsonProperty("sequence")
    public int sequence = 1;

    /**
     * 此计费周期执行的次数。试验结算周期才能执行的有限次数（间值1和999对total_cycles）。
     * 定期计费周期可以执行无限倍（值0对total_cycles）或有限次数（间值1和999对total_cycles）
     */
    @JsonProperty("total_cycles")
    public int totalCycles;

    @JsonProperty("pricing_scheme")
    public PricingScheme pricingScheme;
}

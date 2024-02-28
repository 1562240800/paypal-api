package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.constant.IntervalUnit;
import lombok.Data;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 14:59
 */
@Data
public class Frequency {

    /**
     * 间隔单位
     */
    @JsonProperty("interval_unit")
    public String intervalUnit = IntervalUnit.MONTH;

    /**
     * 间隔计数
     * 订阅者计费之后的时间间隔数。例如，如果interval_unit是DAY用interval_count的 2，该订阅收费每两天一次。下表列出了最大允许值interval_count的每个interval_unit
     */
    @JsonProperty("interval_count")
    public int intervalCount = 1;
}

package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.constant.SetupFeeFailureAction;
import lombok.Data;

/**
 * 付款偏好
 *
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 15:00
 */
@Data
public class PaymentPreferences {

    /**
     * 自动账单未付
     */
    @JsonProperty("auto_bill_outstanding")
    public boolean autoBillOutstanding = true;

    @JsonProperty("setup_fee")
    public Amount setupFee;

    /**
     * 设置费用失败操作
     */
    @JsonProperty("setup_fee_failure_action")
    public String setupFeeFailureAction = SetupFeeFailureAction.CONTINUE;

    @JsonProperty("payment_failure_threshold")
    public int paymentFailureThreshold = 3;
}

package com.show.video.paypal.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.PaymentSource;
import lombok.Data;

/**
 * @ClassName : CaptureOrderRequest
 * @Description : 捕获订单实体
 * @Author : tgq
 * @Date: 2024-01-09 16:27
 */
@Data
public class CaptureOrderRequest {

    @JsonProperty("payment_source")
    public PaymentSource paymentSource;
}

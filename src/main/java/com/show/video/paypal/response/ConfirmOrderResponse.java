package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.Link;
import com.show.video.paypal.request.body.Payer;
import com.show.video.paypal.request.body.PaymentSource;
import lombok.Data;

import java.util.List;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 11:53
 */
@Data
public class ConfirmOrderResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("links")
    private List<Link> links;

    @JsonProperty("payment_source")
    public PaymentSource paymentSource;

    @JsonProperty("payer")
    public Payer payer;

    @JsonProperty("status")
    public String status;
}

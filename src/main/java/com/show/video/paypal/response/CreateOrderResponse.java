package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.Link;
import com.show.video.paypal.request.body.PaymentSource;
import lombok.Data;

import java.util.List;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 17:25
 */
@Data
public class CreateOrderResponse {

    @JsonProperty("id")
    public String id;

    @JsonProperty("status")
    public String status;

    @JsonProperty("payment_source")
    public PaymentSource paymentSource;

    @JsonProperty("links")
    public List<Link> links;
}

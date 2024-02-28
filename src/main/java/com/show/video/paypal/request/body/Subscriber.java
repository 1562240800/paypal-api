package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 15:45
 */
public class Subscriber {

    @JsonProperty("name")
    public Name name;

    @JsonProperty("email_address")
    public String emailAddress;

    @JsonProperty("shipping_address")
    public ShippingAddress shippingAddress;
}

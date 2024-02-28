package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ShippingAddress {

    @JsonProperty("name")
    public FullName fullName;

    @JsonProperty("address")
    public Address address;
}

package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Address {

    @JsonProperty("address_line_1")
    public String addressLine1;

    @JsonProperty("address_line_2")
    public String addressLine2;

    @JsonProperty("admin_area_2")
    public String adminArea2;

    @JsonProperty("admin_area_1")
    public String adminArea1;

    @JsonProperty("postal_code")
    public String postalCode;

    @JsonProperty("country_code")
    public String countryCode;
}
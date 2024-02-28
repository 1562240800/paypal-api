package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName : Shipping
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 16:41
 */
@Data
public class Shipping {

    @JsonProperty("address")
    private Address address;

    @JsonProperty("name")
    private Name name;

    @JsonProperty("trackers")
    private List<Trackers> trackers;
}

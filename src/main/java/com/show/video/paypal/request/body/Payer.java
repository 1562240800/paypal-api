package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @ClassName : Payer
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 16:09
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payer {

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonProperty("payer_id")
    private String payerId;

    @JsonProperty("name")
    private Name name;

  /*  @JsonProperty("phone")
    private Phone phone;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("address")
    private Address Address;*/
}

package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 15:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"full_name"})
public class Name {
    @JsonProperty("given_name")
    public String givenName;

    @JsonProperty("surname")
    public String surName;
}

package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FullName {

    @JsonProperty("full_name")
    public String fullName;
}


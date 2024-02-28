package com.show.video.paypal.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReactivationReason {
    @JsonProperty("reason")
    public String reason;
}

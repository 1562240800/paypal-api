package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseUnit {

    @JsonProperty("reference_id")
    public String referenceId;

    @JsonProperty("amount")
    public Amount amount;
}
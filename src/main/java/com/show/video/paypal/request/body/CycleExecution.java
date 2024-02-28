package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;

class CycleExecution {

    @JsonProperty("tenure_type")
    public String tenureType;

    @JsonProperty("sequence")
    public int sequence;

    @JsonProperty("cycles_completed")
    public int cyclesCompleted;

    @JsonProperty("cycles_remaining")
    public int cyclesRemaining;

    @JsonProperty("current_pricing_scheme_version")
    public int currentPricingSchemeVersion;
}
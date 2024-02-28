package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Paypal {
    @JsonProperty("experience_context")
    public ExperienceContext experienceContext;

    @JsonProperty("email_address")
    public String emailAddress;

    @JsonProperty("name")
    public Name name;

    public Paypal(ExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

}
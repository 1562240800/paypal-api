package com.show.video.paypal.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.Link;
import lombok.Data;

import java.util.List;

@Data
public class PayPalBaseEvent {

    @JsonProperty("id")
    public String id;

    @JsonProperty("create_time")
    public String createTime;

    @JsonProperty("resource_type")
    public String resourceType;

    @JsonProperty("event_type")
    public String eventType;

    @JsonProperty("summary")
    public String summary;

    @JsonProperty("resource")
    public Object resource;

    @JsonProperty("links")
    public List<Link> links;

    @JsonProperty("event_version")
    public String eventVersion;

    @JsonProperty("resource_version")
    public String resourceVersion;
}
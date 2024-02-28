package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 11:54
 */
@Data
public class Link {

    @JsonProperty("href")
    private String href;

    @JsonProperty("rel")
    private String rel;

    @JsonProperty("method")
    private String method;

    @JsonProperty("encType")
    private String encType;
}

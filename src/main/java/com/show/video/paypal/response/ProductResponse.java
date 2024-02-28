package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.request.body.Link;
import lombok.Data;

import java.util.List;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 11:53
 */
@Data
public class ProductResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("links")
    private List<Link> links;
}

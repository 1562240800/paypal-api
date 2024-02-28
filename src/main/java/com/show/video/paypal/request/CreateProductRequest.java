package com.show.video.paypal.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 11:56
 */
@Data
public class CreateProductRequest {

    @JsonProperty("name")
    public String name;

    @JsonProperty("description")
    public String description;

    @JsonProperty("type")
    public String type = "SERVICE";

    @JsonProperty("category")
    public String category = "SOFTWARE";

    @JsonProperty("home_url")
    public String homeUrl;
}

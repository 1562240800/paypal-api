package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName : Trackers
 * @Description :
 * @Author : tgq
 * @Date: 2024-01-09 19:41
 */
@Data
public class Trackers {
    @JsonProperty("id")
    private Shipping id;

    @JsonProperty("links")
    private List<Link> links;

    @JsonProperty("create_time")
    private Shipping createTime;

    @JsonProperty("update_time")
    private Shipping updateTime;
}

package com.show.video.paypal.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 11:33
 */
@Data
public class AccessTokenResponse {

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("app_id")
    private String appId;

    @JsonProperty("expires_in")
    private int expiresIn;

    @JsonProperty("nonce")
    private String nonce;
}

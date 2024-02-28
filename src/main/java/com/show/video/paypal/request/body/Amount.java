package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.show.video.paypal.constant.CurrencyCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 14:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Amount {

    /**
     * 该值可能是：
     * 整数，例如： JPY此类通常不是小数。
     * TND此类货币的小数部分可细分为千分之一。
     * 有关货币代码所需的小数位数
     */
    @JsonProperty("value")
    public String value;

    /**
     * 标识货币的三字符ISO-4217货币代码。
     */
    @JsonProperty("currency_code")
    public String currencyCode = CurrencyCode.USD;

    //@JsonProperty("details")
    //public TransactionDetails details;

}

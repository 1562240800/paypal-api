package com.show.video.paypal.interceptor;

import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 16:47
 */
@Slf4j(topic = "OKHTTP_LOG")
public class PaypalLog implements HttpLoggingInterceptor.Logger {

    @Override
    public void log(String msg) {
        log.info("Paypal-------->:{}", msg);
    }
}

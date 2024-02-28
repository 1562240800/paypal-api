package com.show.video.paypal.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.UUID;

/**
 * @author Wangyizhou
 * @Description
 * @date 2023/12/12 17:46
 */
public class HeaderInterceptor implements Interceptor {

    @NotNull
    @Override
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder()
                .header("PayPal-Request-Id", UUID.randomUUID().toString())
                .header("Content-Type", "application/json")
                .method(request.method(), request.body())
                .build();
        return chain.proceed(request);
    }
}

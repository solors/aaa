package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes7.dex */
public interface Interceptor {

    /* loaded from: classes7.dex */
    public interface Chain {
        @NonNull
        Call call();

        long connectTimeoutMillis();

        @NonNull
        Response proceed(@NonNull Request request) throws IOException;

        long readTimeoutMillis();

        @NonNull
        Request request();
    }

    @NonNull
    Response intercept(@NonNull Chain chain) throws IOException;
}

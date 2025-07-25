package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1mSDK;
import java.io.IOException;

/* loaded from: classes2.dex */
public class HttpException extends IOException {
    private final AFe1mSDK AFInAppEventParameterName;

    public HttpException(@NonNull Throwable th, @NonNull AFe1mSDK aFe1mSDK) {
        super(th.getMessage(), th);
        this.AFInAppEventParameterName = aFe1mSDK;
    }

    @NonNull
    public AFe1mSDK getMetrics() {
        return this.AFInAppEventParameterName;
    }
}

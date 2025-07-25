package com.smaato.sdk.core.network;

import java.io.IOException;

/* loaded from: classes7.dex */
public class HttpNoResponseBodyException extends IOException {
    private final Headers headers;
    private final int responseCode;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpNoResponseBodyException(Throwable th, int i, Headers headers) {
        super(th);
        this.responseCode = i;
        this.headers = headers;
    }

    public Headers getHeaders() {
        return this.headers;
    }

    public int getResponseCode() {
        return this.responseCode;
    }
}

package com.maticoo.sdk.utils.request.network.exception;

import java.io.IOException;

/* loaded from: classes6.dex */
public class ConnectException extends IOException {
    public ConnectException(String str) {
        super(str);
    }

    public ConnectException(String str, Throwable th) {
        super(str, th);
    }

    public ConnectException(Throwable th) {
        super(th);
    }
}

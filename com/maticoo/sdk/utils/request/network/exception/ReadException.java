package com.maticoo.sdk.utils.request.network.exception;

import java.io.IOException;

/* loaded from: classes6.dex */
public class ReadException extends IOException {
    public ReadException(String str) {
        super(str);
    }

    public ReadException(String str, Throwable th) {
        super(str, th);
    }

    public ReadException(Throwable th) {
        super(th);
    }
}

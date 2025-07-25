package com.iabtcf.exceptions;

/* loaded from: classes6.dex */
public class TCStringDecodeException extends RuntimeException {
    private static final long serialVersionUID = 4508672474002398542L;

    public TCStringDecodeException(Throwable th) {
        super(th);
    }

    public TCStringDecodeException(String str) {
        super(str);
    }

    public TCStringDecodeException(String str, Throwable th) {
        super(str, th);
    }
}

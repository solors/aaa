package com.iabtcf.exceptions;

/* loaded from: classes6.dex */
public class ByteParseException extends TCStringDecodeException {
    private static final long serialVersionUID = 2736378835587004853L;

    public ByteParseException(String str) {
        super(str);
    }

    public ByteParseException(String str, Throwable th) {
        super(str, th);
    }
}

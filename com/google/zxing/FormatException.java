package com.google.zxing;

/* loaded from: classes5.dex */
public final class FormatException extends ReaderException {

    /* renamed from: d */
    private static final FormatException f44156d;

    static {
        FormatException formatException = new FormatException();
        f44156d = formatException;
        formatException.setStackTrace(ReaderException.f44175c);
    }

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        return ReaderException.f44174b ? new FormatException() : f44156d;
    }

    private FormatException(Throwable th) {
        super(th);
    }

    public static FormatException getFormatInstance(Throwable th) {
        return ReaderException.f44174b ? new FormatException(th) : f44156d;
    }
}

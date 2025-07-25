package com.google.zxing;

/* loaded from: classes5.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: d */
    private static final NotFoundException f44163d;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f44163d = notFoundException;
        notFoundException.setStackTrace(ReaderException.f44175c);
    }

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return f44163d;
    }
}

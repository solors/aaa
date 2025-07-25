package com.google.zxing;

/* loaded from: classes5.dex */
public final class ChecksumException extends ReaderException {

    /* renamed from: d */
    private static final ChecksumException f44150d;

    static {
        ChecksumException checksumException = new ChecksumException();
        f44150d = checksumException;
        checksumException.setStackTrace(ReaderException.f44175c);
    }

    private ChecksumException() {
    }

    public static ChecksumException getChecksumInstance() {
        return ReaderException.f44174b ? new ChecksumException() : f44150d;
    }

    private ChecksumException(Throwable th) {
        super(th);
    }

    public static ChecksumException getChecksumInstance(Throwable th) {
        return ReaderException.f44174b ? new ChecksumException(th) : f44150d;
    }
}

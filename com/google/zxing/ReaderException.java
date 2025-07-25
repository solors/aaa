package com.google.zxing;

/* loaded from: classes5.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: b */
    protected static final boolean f44174b;

    /* renamed from: c */
    protected static final StackTraceElement[] f44175c;

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        f44174b = z;
        f44175c = new StackTraceElement[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderException(Throwable th) {
        super(th);
    }
}

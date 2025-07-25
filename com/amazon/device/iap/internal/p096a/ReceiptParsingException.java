package com.amazon.device.iap.internal.p096a;

/* renamed from: com.amazon.device.iap.internal.a.e */
/* loaded from: classes2.dex */
public class ReceiptParsingException extends RuntimeException {

    /* renamed from: a */
    private static final long f3189a = 7955687159702952249L;

    /* renamed from: b */
    private final String f3190b;

    /* renamed from: c */
    private final String f3191c;

    public ReceiptParsingException(String str, String str2) {
        this.f3190b = str;
        this.f3191c = str2;
    }

    /* renamed from: a */
    public String m102455a() {
        return this.f3190b;
    }

    /* renamed from: b */
    public String m102454b() {
        return this.f3191c;
    }

    public ReceiptParsingException(String str, String str2, Throwable th) {
        super(th);
        this.f3190b = str;
        this.f3191c = str2;
    }
}

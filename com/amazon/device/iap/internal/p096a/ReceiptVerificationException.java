package com.amazon.device.iap.internal.p096a;

/* renamed from: com.amazon.device.iap.internal.a.f */
/* loaded from: classes2.dex */
public class ReceiptVerificationException extends RuntimeException {

    /* renamed from: a */
    private static final long f3199a = 3715222306172636179L;

    /* renamed from: b */
    private final String f3200b;

    /* renamed from: c */
    private final String f3201c;

    /* renamed from: d */
    private final String f3202d;

    public ReceiptVerificationException(String str, String str2, String str3) {
        this.f3200b = str;
        this.f3201c = str2;
        this.f3202d = str3;
    }

    /* renamed from: a */
    public String m102450a() {
        return this.f3200b;
    }

    /* renamed from: b */
    public String m102449b() {
        return this.f3201c;
    }

    /* renamed from: c */
    public String m102448c() {
        return this.f3202d;
    }

    public ReceiptVerificationException(String str, String str2, String str3, Throwable th) {
        super(th);
        this.f3200b = str;
        this.f3201c = str2;
        this.f3202d = str3;
    }
}

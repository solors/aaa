package com.amazon.p047a.p048a.p071o.p076d;

/* renamed from: com.amazon.a.a.o.d.a */
/* loaded from: classes2.dex */
public class VerificationError {

    /* renamed from: a */
    private final VerificationErrorCode f2777a;

    /* renamed from: b */
    private final String f2778b;

    public VerificationError(VerificationErrorCode verificationErrorCode, String str) {
        this.f2777a = verificationErrorCode;
        this.f2778b = str;
    }

    /* renamed from: a */
    public VerificationErrorCode m102816a() {
        return this.f2777a;
    }

    /* renamed from: b */
    public String m102815b() {
        return this.f2778b;
    }

    public String toString() {
        return this.f2777a.mo102772a() + ": " + this.f2778b;
    }
}

package com.amazon.p047a.p077b;

import com.amazon.p047a.p048a.p071o.p076d.VerificationErrorCode;

/* renamed from: com.amazon.a.b.h */
/* loaded from: classes2.dex */
public enum LicenseVerificationErrorCode implements VerificationErrorCode {
    EXPIRATION,
    CUSTOMER_ID,
    DEVICE_ID,
    PACKAGE_NAME,
    CHECKSUM;

    @Override // com.amazon.p047a.p048a.p071o.p076d.VerificationErrorCode
    /* renamed from: a */
    public String mo102772a() {
        return name();
    }
}

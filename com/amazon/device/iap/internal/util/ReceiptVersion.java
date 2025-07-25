package com.amazon.device.iap.internal.util;

/* renamed from: com.amazon.device.iap.internal.util.d */
/* loaded from: classes2.dex */
public enum ReceiptVersion {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);
    

    /* renamed from: e */
    private int f3335e;

    ReceiptVersion(int i) {
        this.f3335e = i;
    }

    /* renamed from: a */
    int m102359a() {
        return this.f3335e;
    }

    /* renamed from: a */
    public boolean m102358a(ReceiptVersion receiptVersion) {
        return receiptVersion != null && this.f3335e < receiptVersion.f3335e;
    }
}

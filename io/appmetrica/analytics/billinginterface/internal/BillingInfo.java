package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class BillingInfo {
    @NonNull
    public final String productId;
    public final long purchaseTime;
    @NonNull
    public final String purchaseToken;
    public long sendTime;
    @NonNull
    public final ProductType type;

    public BillingInfo(@NonNull ProductType productType, @NonNull String str, @NonNull String str2, long j, long j2) {
        this.type = productType;
        this.productId = str;
        this.purchaseToken = str2;
        this.purchaseTime = j;
        this.sendTime = j2;
    }

    @NonNull
    public String toString() {
        return "BillingInfo{type=" + this.type + "productId='" + this.productId + "'purchaseToken='" + this.purchaseToken + "'purchaseTime=" + this.purchaseTime + "sendTime=" + this.sendTime + "}";
    }
}

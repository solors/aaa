package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public final class BillingResult {
    private int zza;
    private String zzb;

    /* compiled from: com.android.billingclient:billing@@6.1.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }

        /* synthetic */ Builder(zzbj zzbjVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    @NonNull
    public String toString() {
        String zzh = com.google.android.gms.internal.play_billing.zzb.zzh(this.zza);
        String str = this.zzb;
        return "Response Code: " + zzh + ", Debug Message: " + str;
    }
}

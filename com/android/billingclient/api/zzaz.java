package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public final class zzaz {
    private final List zza;
    private final BillingResult zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(BillingResult billingResult, @Nullable List list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BillingResult zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzb() {
        return this.zza;
    }
}

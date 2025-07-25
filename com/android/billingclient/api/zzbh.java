package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhy;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzii;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbh {
    @Nullable
    public static zzhy zza(int i, int i2, BillingResult billingResult) {
        try {
            zzhx zzv = zzhy.zzv();
            zzie zzv2 = zzii.zzv();
            zzv2.zzk(billingResult.getResponseCode());
            zzv2.zzj(billingResult.getDebugMessage());
            zzv2.zzl(i);
            zzv.zzi(zzv2);
            zzv.zzk(i2);
            return (zzhy) zzv.zzc();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    @Nullable
    public static zzic zzb(int i) {
        try {
            zzib zzv = zzic.zzv();
            zzv.zzj(i);
            return (zzic) zzv.zzc();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}

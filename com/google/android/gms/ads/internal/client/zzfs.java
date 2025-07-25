package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzfs extends zzdq {
    @Nullable
    private final OnPaidEventListener zza;

    public zzfs(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(zzu zzuVar) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zzuVar.zzb, zzuVar.zzc, zzuVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() {
        if (this.zza == null) {
            return true;
        }
        return false;
    }
}

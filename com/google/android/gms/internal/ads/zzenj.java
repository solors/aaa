package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzenj implements zzetq {
    @Nullable
    @VisibleForTesting
    final String zza;
    @VisibleForTesting
    final int zzb;

    public zzenj(@Nullable String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            Bundle zza = zzfcx.zza(bundle, "pii");
            bundle.putBundle("pii", zza);
            zza.putString("pvid", this.zza);
            zza.putInt("pvid_s", this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }
}

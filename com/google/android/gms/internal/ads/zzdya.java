package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzdya implements zzcyq {
    private final Context zza;
    private final zzbyi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdya(Context context, zzbyi zzbyiVar) {
        this.zza = context;
        this.zzb = zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
        if (!TextUtils.isEmpty(zzfcaVar.zzb.zzb.zze)) {
            this.zzb.zzm(this.zza, zzfcaVar.zza.zza.zzd);
            this.zzb.zzi(this.zza, zzfcaVar.zzb.zzb.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
    }
}

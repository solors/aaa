package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdtj implements zzdsx {
    private final long zza;
    private final zzekv zzb;

    public zzdtj(long j, Context context, zzdtc zzdtcVar, zzcgx zzcgxVar, String str) {
        this.zza = j;
        zzezt zzv = zzcgxVar.zzv();
        zzv.zzc(context);
        zzv.zza(new com.google.android.gms.ads.internal.client.zzs());
        zzv.zzb(str);
        zzekv zza = zzv.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdti(this, zzdtcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}

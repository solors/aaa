package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@Deprecated
/* loaded from: classes5.dex */
public class zzcai {
    private final zzcab zza;
    private final AtomicInteger zzb;

    public zzcai() {
        zzcab zzcabVar = new zzcab();
        this.zza = zzcabVar;
        this.zzb = new AtomicInteger(0);
        zzgch.zzr(zzcabVar, new zzcag(this), zzbzw.zzg);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzcaf zzcafVar, zzcad zzcadVar) {
        zzgch.zzr(this.zza, new zzcah(this, zzcafVar, zzcadVar), zzbzw.zzg);
    }
}

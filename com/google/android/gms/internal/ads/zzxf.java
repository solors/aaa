package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzxf implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxf(zzab zzabVar, int i) {
        this.zza = 1 == (zzabVar.zze & 1);
        this.zzb = zzlk.zza(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzxf zzxfVar) {
        return zzfxc.zzj().zzd(this.zzb, zzxfVar.zzb).zzd(this.zza, zzxfVar.zza).zza();
    }
}

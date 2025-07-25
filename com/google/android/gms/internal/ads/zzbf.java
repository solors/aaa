package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbf {
    private final zzv zza = new zzv();

    public final zzbf zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzbf zzb(zzbg zzbgVar) {
        zzx zzxVar;
        zzxVar = zzbgVar.zza;
        for (int i = 0; i < zzxVar.zzb(); i++) {
            this.zza.zza(zzxVar.zza(i));
        }
        return this;
    }

    public final zzbf zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzbf zzd(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzbg zze() {
        return new zzbg(this.zza.zzb(), null);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgvp {
    private final zzgvo zza;

    private zzgvp(zzgvo zzgvoVar) {
        this.zza = zzgvoVar;
    }

    public static zzgvp zzb(byte[] bArr, zzgeo zzgeoVar) {
        return new zzgvp(zzgvo.zzb(bArr));
    }

    public static zzgvp zzc(int i) {
        return new zzgvp(zzgvo.zzb(zzgnk.zzb(i)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzgeo zzgeoVar) {
        return this.zza.zzc();
    }
}

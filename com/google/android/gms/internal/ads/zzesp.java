package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzesp implements zzetq {
    private final String zza;
    private final int zzb;

    public zzesp(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcuv) obj).zzb.putString("request_id", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        zzcuvVar.zza.putString("request_id", this.zza);
        if (this.zzb == 2) {
            zzcuvVar.zza.putInt("sod", 1);
        }
    }
}

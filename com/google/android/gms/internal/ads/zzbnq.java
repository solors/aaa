package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbnq implements zzcaf {
    final /* synthetic */ zzbnr zza;

    public zzbnq(zzbnr zzbnrVar) {
        this.zza = zzbnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbmn zzbmnVar = (zzbmn) obj;
        zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnp
            @Override // java.lang.Runnable
            public final void run() {
                zzbmn zzbmnVar2 = zzbmnVar;
                zzbmnVar2.zzr("/result", zzbjo.zzo);
                zzbmnVar2.zzc();
            }
        });
    }
}

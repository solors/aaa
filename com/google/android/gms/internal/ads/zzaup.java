package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaup implements zzfol {
    final /* synthetic */ zzfni zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaup(zzfni zzfniVar) {
        this.zza = zzfniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}

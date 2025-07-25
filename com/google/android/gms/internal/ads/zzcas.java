package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcas implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcaw zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcas(zzcaw zzcawVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcax zzcaxVar;
        zzcax zzcaxVar2;
        zzcaw zzcawVar = this.zzc;
        zzcaxVar = zzcawVar.zzq;
        if (zzcaxVar != null) {
            int i = this.zza;
            int i2 = this.zzb;
            zzcaxVar2 = zzcawVar.zzq;
            zzcaxVar2.zzj(i, i2);
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcar implements Runnable {
    final /* synthetic */ zzcaw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcar(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcax zzcaxVar;
        zzcax zzcaxVar2;
        zzcaw zzcawVar = this.zza;
        zzcaxVar = zzcawVar.zzq;
        if (zzcaxVar != null) {
            zzcaxVar2 = zzcawVar.zzq;
            zzcaxVar2.zzh();
        }
    }
}

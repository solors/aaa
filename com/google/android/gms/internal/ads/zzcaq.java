package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcaq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcaw zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcaq(zzcaw zzcawVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcax zzcaxVar;
        zzcax zzcaxVar2;
        zzcaw zzcawVar = this.zzc;
        zzcaxVar = zzcawVar.zzq;
        if (zzcaxVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzcaxVar2 = zzcawVar.zzq;
            zzcaxVar2.zzb(str, str2);
        }
    }
}

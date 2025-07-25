package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcao implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcaw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcao(zzcaw zzcawVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcax zzcaxVar;
        zzcax zzcaxVar2;
        zzcaw.zzl(this.zzb, this.zza);
        zzcaw zzcawVar = this.zzb;
        zzcaxVar = zzcawVar.zzq;
        if (zzcaxVar != null) {
            zzcaxVar2 = zzcawVar.zzq;
            zzcaxVar2.zzf();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfky extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzfla zzb;
    final /* synthetic */ zzcfo zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfky(zzfla zzflaVar, zzcfo zzcfoVar, Timer timer) {
        this.zzc = zzcfoVar;
        this.zza = timer;
        this.zzb = zzflaVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzh();
        this.zzc.zza(true);
        this.zza.cancel();
    }
}

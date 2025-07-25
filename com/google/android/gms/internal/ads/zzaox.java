package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaox implements Runnable {
    final /* synthetic */ zzapm zza;
    final /* synthetic */ zzaoy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaox(zzaoy zzaoyVar, zzapm zzapmVar) {
        this.zza = zzapmVar;
        this.zzb = zzaoyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

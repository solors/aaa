package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfmx {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfmw zzd = null;

    public zzfmx() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfmw zzfmwVar = (zzfmw) this.zzc.poll();
        this.zzd = zzfmwVar;
        if (zzfmwVar != null) {
            zzfmwVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfmw zzfmwVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfmw zzfmwVar) {
        zzfmwVar.zzb(this);
        this.zzc.add(zzfmwVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}

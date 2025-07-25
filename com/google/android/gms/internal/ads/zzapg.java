package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzapg extends Thread {
    private final BlockingQueue zza;
    private final zzapf zzb;
    private final zzaow zzc;
    private volatile boolean zzd = false;
    private final zzapd zze;

    public zzapg(BlockingQueue blockingQueue, zzapf zzapfVar, zzaow zzaowVar, zzapd zzapdVar) {
        this.zza = blockingQueue;
        this.zzb = zzapfVar;
        this.zzc = zzaowVar;
        this.zze = zzapdVar;
    }

    private void zzb() throws InterruptedException {
        zzapm zzapmVar = (zzapm) this.zza.take();
        SystemClock.elapsedRealtime();
        zzapmVar.zzt(3);
        try {
            try {
                zzapmVar.zzm("network-queue-take");
                zzapmVar.zzw();
                TrafficStats.setThreadStatsTag(zzapmVar.zzc());
                zzapi zza = this.zzb.zza(zzapmVar);
                zzapmVar.zzm("network-http-complete");
                if (zza.zze && zzapmVar.zzv()) {
                    zzapmVar.zzp("not-modified");
                    zzapmVar.zzr();
                } else {
                    zzaps zzh = zzapmVar.zzh(zza);
                    zzapmVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzapmVar.zzj(), zzh.zzb);
                        zzapmVar.zzm("network-cache-written");
                    }
                    zzapmVar.zzq();
                    this.zze.zzb(zzapmVar, zzh, null);
                    zzapmVar.zzs(zzh);
                }
            } catch (zzapv e) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzapmVar, e);
                zzapmVar.zzr();
            } catch (Exception e2) {
                zzapy.zzc(e2, "Unhandled exception %s", e2.toString());
                zzapv zzapvVar = new zzapv(e2);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzapmVar, zzapvVar);
                zzapmVar.zzr();
            }
        } finally {
            zzapmVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapy.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}

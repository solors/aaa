package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaoy extends Thread {
    private static final boolean zza = zzapy.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaow zzd;
    private volatile boolean zze = false;
    private final zzapz zzf;
    private final zzapd zzg;

    public zzaoy(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaow zzaowVar, zzapd zzapdVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaowVar;
        this.zzg = zzapdVar;
        this.zzf = new zzapz(this, blockingQueue2, zzapdVar);
    }

    private void zzc() throws InterruptedException {
        zzapm zzapmVar = (zzapm) this.zzb.take();
        zzapmVar.zzm("cache-queue-take");
        zzapmVar.zzt(1);
        try {
            zzapmVar.zzw();
            zzaov zza2 = this.zzd.zza(zzapmVar.zzj());
            if (zza2 == null) {
                zzapmVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzapmVar)) {
                    this.zzc.put(zzapmVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzapmVar.zzm("cache-hit-expired");
                    zzapmVar.zze(zza2);
                    if (!this.zzf.zzc(zzapmVar)) {
                        this.zzc.put(zzapmVar);
                    }
                } else {
                    zzapmVar.zzm("cache-hit");
                    zzaps zzh = zzapmVar.zzh(new zzapi(zza2.zza, zza2.zzg));
                    zzapmVar.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzapmVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzapmVar.zzj(), true);
                        zzapmVar.zze(null);
                        if (!this.zzf.zzc(zzapmVar)) {
                            this.zzc.put(zzapmVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzapmVar.zzm("cache-hit-refresh-needed");
                        zzapmVar.zze(zza2);
                        zzh.zzd = true;
                        if (!this.zzf.zzc(zzapmVar)) {
                            this.zzg.zzb(zzapmVar, zzh, new zzaox(this, zzapmVar));
                        } else {
                            this.zzg.zzb(zzapmVar, zzh, null);
                        }
                    } else {
                        this.zzg.zzb(zzapmVar, zzh, null);
                    }
                }
            }
        } finally {
            zzapmVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzapy.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapy.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}

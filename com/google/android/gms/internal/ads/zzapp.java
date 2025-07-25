package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzapp {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaow zze;
    private final zzapf zzf;
    private final zzapg[] zzg;
    private zzaoy zzh;
    private final List zzi;
    private final List zzj;
    private final zzapd zzk;

    public zzapp(zzaow zzaowVar, zzapf zzapfVar, int i) {
        zzapd zzapdVar = new zzapd(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaowVar;
        this.zzf = zzapfVar;
        this.zzg = new zzapg[4];
        this.zzk = zzapdVar;
    }

    public final zzapm zza(zzapm zzapmVar) {
        zzapmVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzapmVar);
        }
        zzapmVar.zzg(this.zza.incrementAndGet());
        zzapmVar.zzm("add-to-queue");
        zzc(zzapmVar, 0);
        this.zzc.add(zzapmVar);
        return zzapmVar;
    }

    public final void zzb(zzapm zzapmVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzapmVar);
        }
        synchronized (this.zzi) {
            for (zzapo zzapoVar : this.zzi) {
                zzapoVar.zza();
            }
        }
        zzc(zzapmVar, 5);
    }

    public final void zzc(zzapm zzapmVar, int i) {
        synchronized (this.zzj) {
            for (zzapn zzapnVar : this.zzj) {
                zzapnVar.zza();
            }
        }
    }

    public final void zzd() {
        zzaoy zzaoyVar = this.zzh;
        if (zzaoyVar != null) {
            zzaoyVar.zzb();
        }
        zzapg[] zzapgVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzapg zzapgVar = zzapgVarArr[i];
            if (zzapgVar != null) {
                zzapgVar.zza();
            }
        }
        zzaoy zzaoyVar2 = new zzaoy(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaoyVar2;
        zzaoyVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzapg zzapgVar2 = new zzapg(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i2] = zzapgVar2;
            zzapgVar2.start();
        }
    }
}

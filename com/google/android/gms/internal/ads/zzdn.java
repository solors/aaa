package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdn {
    private final zzcx zza;
    private final zzdh zzb;
    private final zzdl zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    @GuardedBy("releasedLock")
    private boolean zzh;
    private boolean zzi;

    public zzdn(Looper looper, zzcx zzcxVar, zzdl zzdlVar) {
        this(new CopyOnWriteArraySet(), looper, zzcxVar, zzdlVar, true);
    }

    public static /* synthetic */ boolean zzg(zzdn zzdnVar, Message message) {
        Iterator it = zzdnVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzdm) it.next()).zzb(zzdnVar.zzc);
            if (zzdnVar.zzb.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        boolean z;
        if (!this.zzi) {
            return;
        }
        if (Thread.currentThread() == this.zzb.zza().getThread()) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
    }

    @CheckResult
    public final zzdn zza(Looper looper, zzdl zzdlVar) {
        return new zzdn(this.zzd, looper, this.zza, zzdlVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzdm(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (!this.zzf.isEmpty()) {
            if (!this.zzb.zzg(1)) {
                zzdh zzdhVar = this.zzb;
                zzdhVar.zzk(zzdhVar.zzb(1));
            }
            boolean z = !this.zze.isEmpty();
            this.zze.addAll(this.zzf);
            this.zzf.clear();
            if (!z) {
                while (!this.zze.isEmpty()) {
                    ((Runnable) this.zze.peekFirst()).run();
                    this.zze.removeFirst();
                }
            }
        }
    }

    public final void zzd(final int i, final zzdk zzdkVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdj
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdk zzdkVar2 = zzdkVar;
                    ((zzdm) it.next()).zza(i, zzdkVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzdm) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzdm zzdmVar = (zzdm) it.next();
            if (zzdmVar.zza.equals(obj)) {
                zzdmVar.zzc(this.zzc);
                this.zzd.remove(zzdmVar);
            }
        }
    }

    private zzdn(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzcx zzcxVar, zzdl zzdlVar, boolean z) {
        this.zza = zzcxVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdlVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzcxVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdi
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzdn.zzg(zzdn.this, message);
                return true;
            }
        });
        this.zzi = z;
    }
}

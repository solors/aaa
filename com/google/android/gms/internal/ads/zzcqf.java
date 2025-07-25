package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.WorkerThread;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcqf extends zzcom {
    private final zzbhn zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcqf(zzcqy zzcqyVar, zzbhn zzbhnVar, Runnable runnable, Executor executor) {
        super(zzcqyVar);
        this.zzc = zzbhnVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzj(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final View zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final zzfbp zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final zzfbp zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqz
    @WorkerThread
    public final void zzk() {
        final zzcqd zzcqdVar = new zzcqd(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqe
            {
                zzcqf.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcqf.this.zzl(zzcqdVar);
            }
        });
    }

    public final /* synthetic */ void zzl(Runnable runnable) {
        try {
            if (!this.zzc.zze(ObjectWrapper.wrap(runnable))) {
                zzj(((zzcqd) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzj(((zzcqd) runnable).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final void zzi(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar) {
    }
}

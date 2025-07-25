package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C21114v8;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgbe extends zzgbx implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    ListenableFuture zza;
    Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbe(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (listenableFuture == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzs(listenableFuture);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzgch.zzp(listenableFuture));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th) {
                try {
                    zzgda.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzd(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            zzd(e2.getCause());
        } catch (Exception e3) {
            zzd(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        String str;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture.toString() + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + C21114v8.C21123i.f54139e;
        } else if (zza != null) {
            return str.concat(zza);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object obj, Object obj2) throws Exception;

    abstract void zzf(Object obj);
}

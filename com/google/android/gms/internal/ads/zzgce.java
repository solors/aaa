package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgce implements Runnable {
    final Future zza;
    final zzgcd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgce(Future future, zzgcd zzgcdVar) {
        this.zza = future;
        this.zzb = zzgcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzgdl) && (zza = zzgdm.zza((zzgdl) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgch.zzp(this.zza));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfuh zza = zzfuj.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}

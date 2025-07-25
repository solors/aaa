package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzmn {
    @VisibleForTesting
    protected long zza;
    final /* synthetic */ zzmh zzb;
    @VisibleForTesting
    private long zzc;
    private final zzat zzd;

    public zzmn(zzmh zzmhVar) {
        this.zzb = zzmhVar;
        this.zzd = new zzmq(this, zzmhVar.zzu);
        long elapsedRealtime = zzmhVar.zzb().elapsedRealtime();
        this.zzc = elapsedRealtime;
        this.zza = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    @WorkerThread
    public final long zza(long j) {
        long j2 = j - this.zza;
        this.zza = j;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zzb(long j) {
        this.zzd.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zzc(long j) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j;
        this.zza = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzmn zzmnVar) {
        zzmnVar.zzb.zzt();
        zzmnVar.zza(false, false, zzmnVar.zzb.zzb().elapsedRealtime());
        zzmnVar.zzb.zzc().zza(zzmnVar.zzb.zzb().elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzd.zza();
        if (this.zzb.zze().zza(zzbf.zzcy)) {
            this.zzc = this.zzb.zzb().elapsedRealtime();
        } else {
            this.zzc = 0L;
        }
        this.zza = this.zzc;
    }

    @WorkerThread
    public final boolean zza(boolean z, boolean z2, long j) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long j2 = j - this.zzc;
        if (!z && j2 < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = zza(j);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zznp.zza(this.zzb.zzn().zza(!this.zzb.zze().zzv()), bundle, true);
        if (!z2) {
            this.zzb.zzm().zzc("auto", "_e", bundle);
        }
        this.zzc = j;
        this.zzd.zza();
        this.zzd.zza(zzbf.zzba.zza(null).longValue());
        return true;
    }
}

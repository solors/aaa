package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzls implements zzkk {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbe zzd = zzbe.zza;

    public zzls(zzcx zzcxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        long zza;
        long j = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzbe zzbeVar = this.zzd;
            if (zzbeVar.zzb == 1.0f) {
                zza = zzei.zzs(elapsedRealtime);
            } else {
                zza = zzbeVar.zza(elapsedRealtime);
            }
            return j + zza;
        }
        return j;
    }

    public final void zzb(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final zzbe zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (!this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
            this.zza = true;
        }
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzbe zzbeVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}

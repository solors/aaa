package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcdq implements zzkg {
    private final zzyk zza = new zzyk(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
    private int zzf;
    private boolean zzg;

    @VisibleForTesting
    final void zza(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zzb(zzog zzogVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzc(zzog zzogVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzd(zzog zzogVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zze(zzog zzogVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzf(zzkf zzkfVar, zzwj zzwjVar, zzxv[] zzxvVarArr) {
        int i;
        this.zzf = 0;
        for (zzxv zzxvVar : zzxvVarArr) {
            if (zzxvVar != null) {
                int i2 = this.zzf;
                int i3 = zzxvVar.zzg().zzc;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i = 131072;
                            if (i3 != 3 && i3 != 5 && i3 != 6) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            i = 131072000;
                        }
                    } else {
                        i = 13107200;
                    }
                } else {
                    i = 144310272;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(zzog zzogVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzh(zzkf zzkfVar) {
        boolean z;
        long j = zzkfVar.zzb;
        boolean z2 = true;
        if (j > this.zzc) {
            z = false;
        } else if (j < this.zzb) {
            z = true;
        } else {
            z = true;
        }
        int zza = this.zza.zza();
        int i = this.zzf;
        if (!z && (!z || !this.zzg || zza >= i)) {
            z2 = false;
        }
        this.zzg = z2;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final /* synthetic */ boolean zzi(zzbq zzbqVar, zzug zzugVar, long j) {
        zzdo.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj(zzkf zzkfVar) {
        long j;
        if (zzkfVar.zzd) {
            j = this.zze;
        } else {
            j = this.zzd;
        }
        if (j > 0 && zzkfVar.zzb < j) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzyk zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzo(int i) {
        this.zzb = i * 1000;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfbn {
    private final Clock zza;
    private final zzdrw zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfbn(Clock clock, zzdrw zzdrwVar) {
        this.zza = clock;
        this.zzb = zzdrwVar;
    }

    private final void zze() {
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            if (this.zze == 3) {
                if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfP)).longValue() <= currentTimeMillis) {
                    this.zze = 1;
                }
            }
        }
    }

    private final void zzf(int i, int i2) {
        zze();
        Object obj = this.zzc;
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            if (this.zze != i) {
                return;
            }
            this.zze = i2;
            if (this.zze == 3) {
                this.zzd = currentTimeMillis;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmS)).booleanValue()) {
            zzdrv zza = this.zzb.zza();
            zza.zzb("action", "mbs_state");
            if (true != z) {
                str = "0";
            } else {
                str = "1";
            }
            zza.zzb("mbs_state", str);
            zza.zzg();
        }
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            if (this.zze == 3) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            if (this.zze == 2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}

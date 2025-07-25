package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfjg {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final Random zzf = new Random();
    private long zzc = 0;

    public zzfjg(long j, double d, long j2, double d2) {
        this.zza = j;
        this.zzb = j2;
        zzc();
    }

    public final long zza() {
        double d;
        long j;
        double d2 = this.zze;
        return ((long) (d2 - (0.2d * d2))) + ((long) (this.zzf.nextDouble() * ((((long) (d2 + d)) - j) + 1)));
    }

    public final void zzb() {
        double d = this.zze;
        this.zze = Math.min((long) (d + d), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final synchronized void zzd(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.zzd = i;
    }

    public final boolean zze() {
        if (this.zzc > Math.max(this.zzd, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzz)).intValue()) && this.zze >= this.zzb) {
            return true;
        }
        return false;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaal {
    private final zzaak zza;
    private final zzaap zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzcx zzk = zzcx.zza;

    public zzaal(Context context, zzaak zzaakVar, long j) {
        this.zza = zzaakVar;
        this.zzb = new zzaap(context);
    }

    private final void zzq(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r15 > 100000) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r20 >= r24) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r17.zzc != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.zzaaj r27) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaal.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.zzaaj):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z) {
        this.zzd = z ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzei.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzq(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i) {
        this.zzb.zzj(i);
    }

    public final void zzk(zzcx zzcxVar) {
        this.zzk = zzcxVar;
    }

    public final void zzl(float f) {
        this.zzb.zzc(f);
    }

    public final void zzm(@Nullable Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }

    public final boolean zzo(boolean z) {
        boolean z2 = true;
        if (!z || this.zzd != 3) {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            if (this.zzk.zzb() >= this.zzh) {
                z2 = false;
            }
            return z2;
        }
        this.zzh = -9223372036854775807L;
        return z2;
    }

    public final boolean zzp() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzei.zzs(this.zzk.zzb());
        if (i != 3) {
            return true;
        }
        return false;
    }
}

package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzlb {
    private static final zzug zzu = new zzug(new Object(), -1);
    public final zzbq zza;
    public final zzug zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    @Nullable
    public final zzib zzf;
    public final boolean zzg;
    public final zzwj zzh;
    public final zzyc zzi;
    public final List zzj;
    public final zzug zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbe zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzlb(zzbq zzbqVar, zzug zzugVar, long j, long j2, int i, @Nullable zzib zzibVar, boolean z, zzwj zzwjVar, zzyc zzycVar, List list, zzug zzugVar2, boolean z2, int i2, int i3, zzbe zzbeVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzbqVar;
        this.zzb = zzugVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzibVar;
        this.zzg = z;
        this.zzh = zzwjVar;
        this.zzi = zzycVar;
        this.zzj = list;
        this.zzk = zzugVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = i3;
        this.zzo = zzbeVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static zzlb zzg(zzyc zzycVar) {
        zzbq zzbqVar = zzbq.zza;
        zzug zzugVar = zzu;
        return new zzlb(zzbqVar, zzugVar, -9223372036854775807L, 0L, 1, null, false, zzwj.zza, zzycVar, zzfxn.zzn(), zzugVar, false, 1, 0, zzbe.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzug zzh() {
        return zzu;
    }

    @CheckResult
    public final zzlb zza(zzug zzugVar) {
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzugVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlb zzb(zzug zzugVar, long j, long j2, long j3, long j4, zzwj zzwjVar, zzyc zzycVar, List list) {
        zzug zzugVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzbe zzbeVar = this.zzo;
        long j5 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzlb(this.zza, zzugVar, j2, j3, this.zze, this.zzf, this.zzg, zzwjVar, zzycVar, list, zzugVar2, z, i, i2, zzbeVar, j5, j4, j, elapsedRealtime, false);
    }

    @CheckResult
    public final zzlb zzc(boolean z, int i, int i2) {
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, i2, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlb zzd(@Nullable zzib zzibVar) {
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzibVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlb zze(int i) {
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlb zzf(zzbq zzbqVar) {
        return new zzlb(zzbqVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzi() {
        if (this.zze == 3 && this.zzl && this.zzn == 0) {
            return true;
        }
        return false;
    }
}

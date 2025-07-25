package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzajd {
    public zzail zza;
    public long zzb;
    public long zzc;
    public int zzd;
    public int zze;
    public boolean zzk;
    @Nullable
    public zzajc zzm;
    public boolean zzo;
    public long zzp;
    public boolean zzq;
    public long[] zzf = new long[0];
    public int[] zzg = new int[0];
    public int[] zzh = new int[0];
    public long[] zzi = new long[0];
    public boolean[] zzj = new boolean[0];
    public boolean[] zzl = new boolean[0];
    public final zzdy zzn = new zzdy();

    public final void zza(int i) {
        this.zzn.zzI(i);
        this.zzk = true;
        this.zzo = true;
    }

    public final boolean zzb(int i) {
        if (this.zzk && this.zzl[i]) {
            return true;
        }
        return false;
    }
}

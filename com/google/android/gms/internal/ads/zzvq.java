package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzvq implements zzye {
    public long zza;
    public long zzb;
    @Nullable
    public zzyd zzc;
    @Nullable
    public zzvq zzd;

    public zzvq(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzvq zzb() {
        this.zzc = null;
        zzvq zzvqVar = this.zzd;
        this.zzd = null;
        return zzvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final zzyd zzc() {
        zzyd zzydVar = this.zzc;
        zzydVar.getClass();
        return zzydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    @Nullable
    public final zzye zzd() {
        zzvq zzvqVar = this.zzd;
        if (zzvqVar != null && zzvqVar.zzc != null) {
            return zzvqVar;
        }
        return null;
    }

    public final void zze(long j, int i) {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        this.zza = j;
        this.zzb = j + 65536;
    }
}

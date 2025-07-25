package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzkh {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkh() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzkh zzd(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzcw.zzd(z);
        this.zzc = j;
        return this;
    }

    public final zzkh zze(long j) {
        this.zza = j;
        return this;
    }

    public final zzkh zzf(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzcw.zzd(z);
        this.zzb = f;
        return this;
    }

    public final zzkj zzg() {
        return new zzkj(this, null);
    }

    public /* synthetic */ zzkh(zzkj zzkjVar, zzki zzkiVar) {
        this.zza = zzkjVar.zza;
        this.zzb = zzkjVar.zzb;
        this.zzc = zzkjVar.zzc;
    }
}

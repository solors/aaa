package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzjz {
    public zzlb zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzjz(zzlb zzlbVar) {
        this.zza = zzlbVar;
    }

    public final void zza(int i) {
        boolean z = true;
        if (1 != ((this.zze ? 1 : 0) | i)) {
            z = false;
        }
        this.zze = z;
        this.zzb += i;
    }

    public final void zzb(zzlb zzlbVar) {
        boolean z;
        boolean z2 = this.zze;
        if (this.zza != zzlbVar) {
            z = true;
        } else {
            z = false;
        }
        this.zze = z2 | z;
        this.zza = zzlbVar;
    }

    public final void zzc(int i) {
        boolean z = true;
        if (this.zzc && this.zzd != 5) {
            if (i != 5) {
                z = false;
            }
            zzcw.zzd(z);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }
}

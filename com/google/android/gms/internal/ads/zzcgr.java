package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcgr {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgr(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcgr zza() {
        return new zzcgr(0, 0, 0);
    }

    public static zzcgr zzb(int i, int i2) {
        return new zzcgr(1, i, i2);
    }

    public static zzcgr zzc(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        if (zzsVar.zzd) {
            return new zzcgr(3, 0, 0);
        }
        if (zzsVar.zzi) {
            return new zzcgr(2, 0, 0);
        }
        if (zzsVar.zzh) {
            return new zzcgr(0, 0, 0);
        }
        return new zzcgr(1, zzsVar.zzf, zzsVar.zzc);
    }

    public static zzcgr zzd() {
        return new zzcgr(5, 0, 0);
    }

    public static zzcgr zze() {
        return new zzcgr(4, 0, 0);
    }

    public final boolean zzf() {
        if (this.zzc == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        if (this.zzc == 2) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if (this.zzc == 5) {
            return true;
        }
        return false;
    }

    public final boolean zzi() {
        if (this.zzc == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzj() {
        if (this.zzc == 4) {
            return true;
        }
        return false;
    }
}

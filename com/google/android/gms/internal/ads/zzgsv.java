package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgsv extends zzgxr implements zzgzd {
    private static final zzgsv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgsl zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgsv zzgsvVar = new zzgsv();
        zza = zzgsvVar;
        zzgxr.zzbZ(zzgsv.class, zzgsvVar);
    }

    private zzgsv() {
    }

    public static zzgsu zzc() {
        return (zzgsu) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzgsv zzgsvVar, zzgsl zzgslVar) {
        zzgslVar.getClass();
        zzgsvVar.zzd = zzgslVar;
        zzgsvVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgsl zzb() {
        zzgsl zzgslVar = this.zzd;
        if (zzgslVar == null) {
            return zzgsl.zzd();
        }
        return zzgslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int ordinal = zzgxqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                zzgzk zzgzkVar = zzb;
                                if (zzgzkVar == null) {
                                    synchronized (zzgsv.class) {
                                        zzgzkVar = zzb;
                                        if (zzgzkVar == null) {
                                            zzgzkVar = new zzgxm(zza);
                                            zzb = zzgzkVar;
                                        }
                                    }
                                }
                                return zzgzkVar;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new zzgsu(null);
                }
                return new zzgsv();
            }
            return zzgxr.zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgtp zzf() {
        zzgtp zzb2 = zzgtp.zzb(this.zzg);
        if (zzb2 == null) {
            return zzgtp.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final boolean zzj() {
        if ((this.zzc & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        i2 = 0;
                    } else {
                        i2 = 5;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}

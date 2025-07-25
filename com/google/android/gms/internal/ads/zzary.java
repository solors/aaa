package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzary extends zzgxr implements zzgzd {
    private static final zzary zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzary zzaryVar = new zzary();
        zza = zzaryVar;
        zzgxr.zzbZ(zzary.class, zzaryVar);
    }

    private zzary() {
    }

    public static zzary zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zzd;
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
                                    synchronized (zzary.class) {
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
                    return new zzarw(null);
                }
                return new zzary();
            }
            return zzgxr.zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzf;
    }

    public final boolean zzh() {
        return this.zzh;
    }
}

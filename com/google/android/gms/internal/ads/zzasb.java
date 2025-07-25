package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzasb extends zzgxr implements zzgzd {
    public static final /* synthetic */ int zza = 0;
    private static final zzasb zzb;
    private static volatile zzgzk zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        zzasb zzasbVar = new zzasb();
        zzb = zzasbVar;
        zzgxr.zzbZ(zzasb.class, zzasbVar);
    }

    private zzasb() {
    }

    public static zzasb zzb() {
        return zzb;
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
                                zzgzk zzgzkVar = zzc;
                                if (zzgzkVar == null) {
                                    synchronized (zzasb.class) {
                                        zzgzkVar = zzc;
                                        if (zzgzkVar == null) {
                                            zzgzkVar = new zzgxm(zzb);
                                            zzc = zzgzkVar;
                                        }
                                    }
                                }
                                return zzgzkVar;
                            }
                            throw null;
                        }
                        return zzb;
                    }
                    return new zzarz(null);
                }
                return new zzasb();
            }
            return zzgxr.zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}

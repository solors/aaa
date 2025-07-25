package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzarg extends zzgxr implements zzgzd {
    private static final zzarg zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private zzary zzi;
    private zzasb zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        zzarg zzargVar = new zzarg();
        zza = zzargVar;
        zzgxr.zzbZ(zzarg.class, zzargVar);
    }

    private zzarg() {
    }

    public static zzare zza() {
        return (zzare) zza.zzaZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzarg zzargVar, boolean z) {
        zzargVar.zzc |= 8;
        zzargVar.zzg = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzarg zzargVar, String str) {
        str.getClass();
        zzargVar.zzc |= 4;
        zzargVar.zzf = str;
    }

    public final zzary zzc() {
        zzary zzaryVar = this.zzi;
        if (zzaryVar == null) {
            return zzary.zzc();
        }
        return zzaryVar;
    }

    public final zzasb zzd() {
        zzasb zzasbVar = this.zzj;
        if (zzasbVar == null) {
            return zzasb.zzb();
        }
        return zzasbVar;
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
                                    synchronized (zzarg.class) {
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
                    return new zzare(null);
                }
                return new zzarg();
            }
            return zzgxr.zzbQ(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzarh.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzg;
    }
}

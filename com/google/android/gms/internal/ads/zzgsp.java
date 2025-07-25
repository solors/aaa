package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgsp extends zzgxr implements zzgzd {
    private static final zzgsp zza;
    private static volatile zzgzk zzb;
    private String zzc = "";
    private zzgwj zzd = zzgwj.zzb;
    private int zze;

    static {
        zzgsp zzgspVar = new zzgsp();
        zza = zzgspVar;
        zzgxr.zzbZ(zzgsp.class, zzgspVar);
    }

    private zzgsp() {
    }

    public static zzgsn zza() {
        return (zzgsn) zza.zzaZ();
    }

    public static zzgsn zzb(zzgsp zzgspVar) {
        return (zzgsn) zza.zzba(zzgspVar);
    }

    public static zzgsp zzd() {
        return zza;
    }

    public static zzgsp zzf(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
        return (zzgsp) zzgxr.zzbx(zza, bArr, zzgxbVar);
    }

    public static /* synthetic */ void zzk(zzgsp zzgspVar, String str) {
        str.getClass();
        zzgspVar.zzc = str;
    }

    public static /* synthetic */ void zzl(zzgsp zzgspVar, zzgwj zzgwjVar) {
        zzgwjVar.getClass();
        zzgspVar.zzd = zzgwjVar;
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
                                    synchronized (zzgsp.class) {
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
                    return new zzgsn(null);
                }
                return new zzgsp();
            }
            return zzgxr.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgtp zzg() {
        zzgtp zzb2 = zzgtp.zzb(this.zze);
        if (zzb2 == null) {
            return zzgtp.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final zzgwj zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}

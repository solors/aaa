package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgsx extends zzgxr implements zzgzd {
    private static final zzgsx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgyd zzd = zzgxr.zzbK();

    static {
        zzgsx zzgsxVar = new zzgsx();
        zza = zzgsxVar;
        zzgxr.zzbZ(zzgsx.class, zzgsxVar);
    }

    private zzgsx() {
    }

    public static zzgst zzc() {
        return (zzgst) zza.zzaZ();
    }

    public static zzgsx zzg(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
        return (zzgsx) zzgxr.zzbu(zza, inputStream, zzgxbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzgsx zzgsxVar, zzgsv zzgsvVar) {
        zzgsvVar.getClass();
        zzgyd zzgydVar = zzgsxVar.zzd;
        if (!zzgydVar.zzc()) {
            zzgsxVar.zzd = zzgxr.zzbL(zzgydVar);
        }
        zzgsxVar.zzd.add(zzgsvVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzgsv zzd(int i) {
        return (zzgsv) this.zzd.get(i);
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
                                    synchronized (zzgsx.class) {
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
                    return new zzgst(null);
                }
                return new zzgsx();
            }
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgsv.class});
        }
        return (byte) 1;
    }

    public final List zzh() {
        return this.zzd;
    }
}

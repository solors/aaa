package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzglx {
    public static final zzglp zza = new zzglv(null);

    public static zzglu zza(zzgnf zzgnfVar) {
        zzgdz zzgdzVar;
        zzglr zzglrVar = new zzglr();
        zzglrVar.zzb(zzgnfVar.zza());
        for (List<zzgnd> list : zzgnfVar.zze()) {
            for (zzgnd zzgndVar : list) {
                int zzf = zzgndVar.zzf() - 2;
                if (zzf != 1) {
                    if (zzf != 2) {
                        if (zzf == 3) {
                            zzgdzVar = zzgdz.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzgdzVar = zzgdz.zzb;
                    }
                } else {
                    zzgdzVar = zzgdz.zza;
                }
                int zza2 = zzgndVar.zza();
                String zze = zzgndVar.zze();
                if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                    zze = zze.substring(34);
                }
                zzglrVar.zza(zzgdzVar, zza2, zze, zzgndVar.zzb().name());
            }
        }
        if (zzgnfVar.zzc() != null) {
            zzglrVar.zzc(zzgnfVar.zzc().zza());
        }
        try {
            return zzglrVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}

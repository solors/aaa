package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgoj implements zzgng {
    private static final zzgoj zza = new zzgoj();

    private zzgoj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd() throws GeneralSecurityException {
        zzgmh.zza().zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final Class zza() {
        return zzgog.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final Class zzb() {
        return zzgog.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final /* bridge */ /* synthetic */ Object zzc(zzgnf zzgnfVar) throws GeneralSecurityException {
        if (zzgnfVar.zzc() != null) {
            for (List<zzgnd> list : zzgnfVar.zze()) {
                for (zzgnd zzgndVar : list) {
                    zzgog zzgogVar = (zzgog) zzgndVar.zzd();
                }
            }
            return new zzgoh(zzgnfVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}

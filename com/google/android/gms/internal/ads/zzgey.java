package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgey implements zzgng {
    private static final zzgey zza = new zzgey();
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgev
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            return zzgkc.zzb((zzglk) zzgdxVar);
        }
    }, zzglk.class, zzgdn.class);

    zzgey() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzgmh.zza().zzf(zza);
        zzgmh.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final Class zza() {
        return zzgdn.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final Class zzb() {
        return zzgdn.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final /* synthetic */ Object zzc(zzgnf zzgnfVar) throws GeneralSecurityException {
        return new zzgew(zzgnfVar, null);
    }
}

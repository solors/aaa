package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgpd implements zzgng {
    private static final zzgpd zza = new zzgpd();
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgpa
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            return zzgpx.zza((zzglk) zzgdxVar);
        }
    }, zzglk.class, zzgej.class);

    zzgpd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd() throws GeneralSecurityException {
        zzgmh.zza().zzf(zza);
        zzgmh.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final Class zza() {
        return zzgej.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final Class zzb() {
        return zzgej.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final /* synthetic */ Object zzc(zzgnf zzgnfVar) throws GeneralSecurityException {
        return new zzgpb(zzgnfVar, null);
    }
}

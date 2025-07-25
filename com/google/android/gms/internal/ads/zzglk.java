package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzglk extends zzgdx {
    private final zzgnh zza;

    public zzglk(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        zzc(zzgnhVar, zzgeoVar);
        this.zza = zzgnhVar;
    }

    private static void zzc(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        int i = zzglj.zzb[zzgnhVar.zzb().ordinal()];
    }

    public final zzgnh zza(zzgeo zzgeoVar) throws GeneralSecurityException {
        zzc(this.zza, zzgeoVar);
        return this.zza;
    }

    public final Integer zzb() {
        return this.zza.zzf();
    }
}

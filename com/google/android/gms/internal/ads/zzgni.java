package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgni implements zzgnm {
    private final zzgvo zza;
    private final zzgsp zzb;

    private zzgni(zzgsp zzgspVar, zzgvo zzgvoVar) {
        this.zzb = zzgspVar;
        this.zza = zzgvoVar;
    }

    public static zzgni zza(zzgsp zzgspVar) throws GeneralSecurityException {
        return new zzgni(zzgspVar, zzgnu.zza(zzgspVar.zzi()));
    }

    public static zzgni zzb(zzgsp zzgspVar) {
        return new zzgni(zzgspVar, zzgnu.zzb(zzgspVar.zzi()));
    }

    public final zzgsp zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final zzgvo zzd() {
        return this.zza;
    }
}

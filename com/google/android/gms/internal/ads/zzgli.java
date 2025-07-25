package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgli implements zzgdy {
    final String zza;
    final Class zzb;
    final zzgsj zzc;

    zzgli(String str, Class cls, zzgsj zzgsjVar, zzgzk zzgzkVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgsjVar;
    }

    public static zzgdy zzd(String str, Class cls, zzgsj zzgsjVar, zzgzk zzgzkVar) {
        return new zzgli(str, cls, zzgsjVar, zzgzkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final zzgsl zza(zzgwj zzgwjVar) throws GeneralSecurityException {
        zzgsn zza = zzgsp.zza();
        zza.zzb(this.zza);
        zza.zzc(zzgwjVar);
        zza.zza(zzgtp.RAW);
        zzgnh zzgnhVar = (zzgnh) zzgmk.zzc().zzd(zzgma.zzb().zza(zzgmk.zzc().zzb(zzgni.zza((zzgsp) zza.zzbr())), null), zzgnh.class, zzgdw.zza());
        zzgsi zza2 = zzgsl.zza();
        zza2.zzb(zzgnhVar.zzg());
        zza2.zzc(zzgnhVar.zze());
        zza2.zza(zzgnhVar.zzb());
        return (zzgsl) zza2.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final Object zzc(zzgwj zzgwjVar) throws GeneralSecurityException {
        return zzgmh.zza().zzc(zzgmk.zzc().zza(zzgnh.zza(this.zza, zzgwjVar, this.zzc, zzgtp.RAW, null), zzgdw.zza()), this.zzb);
    }
}

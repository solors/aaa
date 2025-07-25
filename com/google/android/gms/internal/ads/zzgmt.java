package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgmt {
    private final Class zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgmt(Class cls, Class cls2, zzgms zzgmsVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgmt zzb(zzgmr zzgmrVar, Class cls, Class cls2) {
        return new zzgmq(cls, cls2, zzgmrVar);
    }

    public abstract zzgnm zza(zzgek zzgekVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

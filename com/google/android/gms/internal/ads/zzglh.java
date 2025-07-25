package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzglh {
    private final Class zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzglh(Class cls, Class cls2, zzglg zzglgVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzglh zzb(zzglf zzglfVar, Class cls, Class cls2) {
        return new zzgle(cls, cls2, zzglfVar);
    }

    public abstract zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

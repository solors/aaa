package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgnb {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgnb(zzgmy zzgmyVar, zzgna zzgnaVar) {
        Map map;
        Map map2;
        map = zzgmyVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgmyVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgng) this.zzb.get(cls)).zza();
        }
        String obj = cls.toString();
        throw new GeneralSecurityException("No input primitive class for " + obj + " available");
    }

    public final Object zzb(zzgdx zzgdxVar, Class cls) throws GeneralSecurityException {
        zzgmz zzgmzVar = new zzgmz(zzgdxVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgmzVar)) {
            return ((zzgmx) this.zza.get(zzgmzVar)).zza(zzgdxVar);
        }
        String obj = zzgmzVar.toString();
        throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available");
    }

    public final Object zzc(zzgnf zzgnfVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzgng zzgngVar = (zzgng) this.zzb.get(cls);
            if (zzgnfVar.zzd().equals(zzgngVar.zza()) && zzgngVar.zza().equals(zzgnfVar.zzd())) {
                return zzgngVar.zzc(zzgnfVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgen {
    public static final /* synthetic */ int zza = 0;

    static {
        Logger.getLogger(zzgen.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzgdn.class);
        hashSet.add(zzgdt.class);
        hashSet.add(zzgep.class);
        hashSet.add(zzgdv.class);
        hashSet.add(zzgdu.class);
        hashSet.add(zzgej.class);
        hashSet.add(zzgpy.class);
        hashSet.add(zzgel.class);
        hashSet.add(zzgem.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzgen() {
    }

    public static Class zza(Class cls) {
        try {
            return zzgmh.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzb(zzgsl zzgslVar, Class cls) throws GeneralSecurityException {
        String zzg = zzgslVar.zzg();
        return zzgkz.zzc().zza(zzg, cls).zzc(zzgslVar.zzf());
    }
}

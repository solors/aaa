package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzguw {
    public static final zzguw zza = new zzguw(new zzgux());
    public static final zzguw zzb = new zzguw(new zzgvb());
    private final zzguu zzc;

    static {
        new zzguw(new zzgvd());
        new zzguw(new zzgvc());
        new zzguw(new zzguy());
        new zzguw(new zzgva());
        new zzguw(new zzguz());
    }

    public zzguw(zzgve zzgveVar) {
        zzguu zzgutVar;
        if (!zzgkt.zzb()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                zzgutVar = new zzgur(zzgveVar, null);
            } else {
                zzgutVar = new zzgus(zzgveVar, null);
            }
        } else {
            zzgutVar = new zzgut(zzgveVar, null);
        }
        this.zzc = zzgutVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzc.zza(str);
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgzm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzm zzb = new zzgzm();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzgzw zzc = new zzgyu();

    private zzgzm() {
    }

    public static zzgzm zza() {
        return zzb;
    }

    public final zzgzv zzb(Class cls) {
        zzgye.zzc(cls, "messageType");
        zzgzv zzgzvVar = (zzgzv) this.zzd.get(cls);
        if (zzgzvVar == null) {
            zzgzvVar = this.zzc.zza(cls);
            zzgye.zzc(cls, "messageType");
            zzgzv zzgzvVar2 = (zzgzv) this.zzd.putIfAbsent(cls, zzgzvVar);
            if (zzgzvVar2 != null) {
                return zzgzvVar2;
            }
        }
        return zzgzvVar;
    }
}

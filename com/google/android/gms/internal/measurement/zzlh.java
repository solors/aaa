package com.google.android.gms.internal.measurement;

import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzlh {
    private static final zzlh zza = new zzlh();
    private final ConcurrentMap<Class<?>, zzll<?>> zzc = new ConcurrentHashMap();
    private final zzlk zzb = new zzkh();

    private zzlh() {
    }

    public static zzlh zza() {
        return zza;
    }

    public final <T> zzll<T> zza(Class<T> cls) {
        zzjm.zza(cls, "messageType");
        zzll<T> zzllVar = (zzll<T>) this.zzc.get(cls);
        if (zzllVar == null) {
            zzll<T> zza2 = this.zzb.zza(cls);
            zzjm.zza(cls, "messageType");
            zzjm.zza(zza2, C3729a.f3343E);
            zzll<T> zzllVar2 = (zzll<T>) this.zzc.putIfAbsent(cls, zza2);
            return zzllVar2 != null ? zzllVar2 : zza2;
        }
        return zzllVar;
    }

    public final <T> zzll<T> zza(T t) {
        return zza((Class) t.getClass());
    }
}

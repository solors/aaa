package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
final class zzjl implements zzkq {
    private static final zzjl zza = new zzjl();

    private zzjl() {
    }

    public static zzjl zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final boolean zzb(Class<?> cls) {
        return zzjk.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final zzkr zza(Class<?> cls) {
        if (zzjk.class.isAssignableFrom(cls)) {
            try {
                return (zzkr) zzjk.zza((Class<zzjk>) cls.asSubclass(zzjk.class)).zza(zzjk.zze.zzc, (Object) null, (Object) null);
            } catch (Exception e) {
                String name = cls.getName();
                throw new RuntimeException("Unable to get message info for " + name, e);
            }
        }
        String name2 = cls.getName();
        throw new IllegalArgumentException("Unsupported message type: " + name2);
    }
}

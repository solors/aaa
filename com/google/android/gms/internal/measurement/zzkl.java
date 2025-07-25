package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzkl<K, V> {
    public static <K, V> int zza(zzkk<K, V> zzkkVar, K k, V v) {
        return zzjd.zza(zzkkVar.zza, 1, k) + zzjd.zza(zzkkVar.zzc, 2, v);
    }

    public static <K, V> void zza(zzit zzitVar, zzkk<K, V> zzkkVar, K k, V v) throws IOException {
        zzjd.zza(zzitVar, zzkkVar.zza, 1, k);
        zzjd.zza(zzitVar, zzkkVar.zzc, 2, v);
    }
}

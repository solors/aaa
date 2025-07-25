package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
final class zzkc implements zzkd {
    private static <E> zzjt<E> zzc(Object obj, long j) {
        return (zzjt) zzmg.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzkd
    public final <L> List<L> zza(Object obj, long j) {
        zzjt zzc = zzc(obj, j);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzjt zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzmg.zza(obj, j, zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkd
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.zzkd
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzjt<E> zzc = zzc(obj, j);
        zzjt<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzjt<E> zzjtVar = zzc;
        zzjtVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zzc3 = zzc.zzc();
            zzjt<E> zzjtVar2 = zzc;
            if (!zzc3) {
                zzjtVar2 = zzc.zza(size2 + size);
            }
            zzjtVar2.addAll(zzc2);
            zzjtVar = zzjtVar2;
        }
        if (size > 0) {
            zzc2 = zzjtVar;
        }
        zzmg.zza(obj, j, zzc2);
    }
}

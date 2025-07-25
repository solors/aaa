package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgyp {
    public static final List zza(Object obj, long j) {
        int i;
        zzgyd zzgydVar = (zzgyd) zzhao.zzh(obj, j);
        if (!zzgydVar.zzc()) {
            int size = zzgydVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzgyd zzf = zzgydVar.zzf(i);
            zzhao.zzv(obj, j, zzf);
            return zzf;
        }
        return zzgydVar;
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
final class zzkp implements zzkm {
    @Override // com.google.android.gms.internal.measurement.zzkm
    public final int zza(int i, Object obj, Object obj2) {
        zzkn zzknVar = (zzkn) obj;
        zzkl zzklVar = (zzkl) obj2;
        if (zzknVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzknVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzb(Object obj) {
        return zzkn.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzc(Object obj) {
        ((zzkn) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Map<?, ?> zzd(Object obj) {
        return (zzkn) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Map<?, ?> zze(Object obj) {
        return (zzkn) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final boolean zzf(Object obj) {
        if (!((zzkn) obj).zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final zzkk<?, ?> zza(Object obj) {
        zzkl zzklVar = (zzkl) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zza(Object obj, Object obj2) {
        zzkn zzknVar = (zzkn) obj;
        zzkn zzknVar2 = (zzkn) obj2;
        if (!zzknVar2.isEmpty()) {
            if (!zzknVar.zzd()) {
                zzknVar = zzknVar.zzb();
            }
            zzknVar.zza(zzknVar2);
        }
        return zzknVar;
    }
}

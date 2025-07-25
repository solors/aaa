package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final /* synthetic */ class zzan {
    public static zzaq zza(zzak zzakVar, zzaq zzaqVar, zzh zzhVar, List<zzaq> list) {
        if (zzakVar.zzc(zzaqVar.zzf())) {
            zzaq zza = zzakVar.zza(zzaqVar.zzf());
            if (zza instanceof zzal) {
                return ((zzal) zza).zza(zzhVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", zzaqVar.zzf()));
        } else if ("hasOwnProperty".equals(zzaqVar.zzf())) {
            zzg.zza("hasOwnProperty", 1, list);
            if (zzakVar.zzc(zzhVar.zza(list.get(0)).zzf())) {
                return zzaq.zzh;
            }
            return zzaq.zzi;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", zzaqVar.zzf()));
        }
    }

    public static Iterator<zzaq> zza(Map<String, zzaq> map) {
        return new zzam(map.keySet().iterator());
    }
}

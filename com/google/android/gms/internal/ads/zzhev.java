package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzhev extends zzhen {
    static {
        zzhes.zza(Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhev(Map map, zzhet zzhetVar) {
        super(map);
    }

    public static zzheu zzc(int i) {
        return new zzheu(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzheo.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhfa) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}

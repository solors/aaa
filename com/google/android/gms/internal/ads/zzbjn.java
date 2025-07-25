package com.google.android.gms.internal.ads;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbjn implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        if (map.keySet().contains("start")) {
            zzcexVar.zzax(true);
        }
        if (map.keySet().contains(C32664c2oc2i.c2oc2o)) {
            zzcexVar.zzax(false);
        }
    }
}

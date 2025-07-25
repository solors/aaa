package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbjl implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcexVar.zzde();
        } else if ("resume".equals(str)) {
            zzcexVar.zzdf();
        }
    }
}

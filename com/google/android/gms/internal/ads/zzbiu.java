package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbiu implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcex zzcexVar = (zzcex) obj;
        zzbfk zzK = zzcexVar.zzK();
        if (zzK != null && (zza = zzK.zza()) != null) {
            zzcexVar.zze("nativeAdViewSignalsReady", zza);
        } else {
            zzcexVar.zze("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}

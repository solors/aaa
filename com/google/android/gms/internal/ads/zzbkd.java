package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbkd implements zzbke {
    final /* synthetic */ zzcab zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkd(zzbkf zzbkfVar, zzcab zzcabVar) {
        this.zza = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zza(@Nullable String str) {
        this.zza.zzd(new zzbnv(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}

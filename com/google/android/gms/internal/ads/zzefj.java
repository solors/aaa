package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzefj implements zzecy {
    private final zzdpm zza;

    public zzefj(zzdpm zzdpmVar) {
        this.zza = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    @Nullable
    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        return new zzecz(this.zza.zzc(str, jSONObject), new zzees(), str);
    }
}

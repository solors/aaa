package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzevs implements zzetq {
    private final List zza;

    public zzevs(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            ((JSONObject) obj).put(TelemetryCategory.EID, TextUtils.join(",", this.zza));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }
}

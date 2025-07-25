package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzbsi {
    private final zzcex zza;
    private final String zzb;

    public zzbsi(zzcex zzcexVar, String str) {
        this.zza = zzcexVar;
        this.zzb = str;
    }

    public final void zzg(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzh(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcex zzcexVar = this.zza;
            if (zzcexVar != null) {
                zzcexVar.zze("onError", put);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzi(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzk(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching state change.", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C20096if;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcnd implements zzbnz {
    private final Context zza;
    private final zzayg zzb;
    private final PowerManager zzc;

    public zzcnd(Context context, zzayg zzaygVar) {
        this.zza = context;
        this.zzb = zzaygVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    /* renamed from: zza */
    public final JSONObject zzb(zzcng zzcngVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayj zzayjVar = zzcngVar.zzf;
        if (zzayjVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z = zzayjVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcngVar.zzd).put(ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcngVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzv.zzs().zze()).put("appVolume", com.google.android.gms.ads.internal.zzv.zzs().zza()).put(C21114v8.C21123i.f54121P, com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzayjVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayjVar.zzc.top).put("bottom", zzayjVar.zzc.bottom).put("left", zzayjVar.zzc.left).put("right", zzayjVar.zzc.right)).put("adBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayjVar.zzd.top).put("bottom", zzayjVar.zzd.bottom).put("left", zzayjVar.zzd.left).put("right", zzayjVar.zzd.right)).put("globalVisibleBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayjVar.zze.top).put("bottom", zzayjVar.zze.bottom).put("left", zzayjVar.zze.left).put("right", zzayjVar.zze.right)).put("globalVisibleBoxVisible", zzayjVar.zzf).put("localVisibleBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayjVar.zzg.top).put("bottom", zzayjVar.zzg.bottom).put("left", zzayjVar.zzg.left).put("right", zzayjVar.zzg.right)).put("localVisibleBoxVisible", zzayjVar.zzh).put("hitBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayjVar.zzi.top).put("bottom", zzayjVar.zzi.bottom).put("left", zzayjVar.zzi.left).put("right", zzayjVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put(C20096if.f50580k, zzcngVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzby)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzayjVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcngVar.zze)) {
                jSONObject3.put("doneReasonCode", ApsMetricsDataMap.APSMETRICS_FIELD_URL);
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzfma {
    private final String zza;
    private zzfnc zzb;
    private long zzc;
    private int zzd;

    public zzfma(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzfnc(null);
    }

    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j) {
        if (j >= this.zzc && this.zzd != 3) {
            this.zzd = 3;
            zzflr.zza().zzh(zza(), this.zza, str);
        }
    }

    public final void zze() {
        zzflr.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfkq zzfkqVar) {
        zzflr.zza().zzd(zza(), this.zza, zzfkqVar.zzb());
    }

    public final void zzg(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfmg.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzflr.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzflr.zza().zzh(zza(), this.zza, str);
        }
    }

    public void zzi(zzfkt zzfktVar, zzfkr zzfkrVar) {
        zzj(zzfktVar, zzfkrVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(zzfkt zzfktVar, zzfkr zzfkrVar, JSONObject jSONObject) {
        String zzh = zzfktVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfmg.zze(jSONObject2, "environment", "app");
        zzfmg.zze(jSONObject2, "adSessionType", zzfkrVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfmg.zze(jSONObject3, "deviceType", str + "; " + str2);
        zzfmg.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfmg.zze(jSONObject3, "os", "Android");
        zzfmg.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfmg.zze(jSONObject2, "deviceCategory", zzfmf.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfmg.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfmg.zze(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfkrVar.zze().zzb());
        zzfmg.zze(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfkrVar.zze().zzc());
        zzfmg.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfmg.zze(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfmg.zze(jSONObject5, "appId", zzflp.zzb().zza().getApplicationContext().getPackageName());
        zzfmg.zze(jSONObject2, "app", jSONObject5);
        if (zzfkrVar.zzf() != null) {
            zzfmg.zze(jSONObject2, "contentUrl", zzfkrVar.zzf());
        }
        if (zzfkrVar.zzg() != null) {
            zzfmg.zze(jSONObject2, "customReferenceData", zzfkrVar.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfkrVar.zzh().iterator();
        if (!it.hasNext()) {
            zzflr.zza().zzj(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzfld zzfldVar = (zzfld) it.next();
            throw null;
        }
    }

    public final void zzk(boolean z) {
        String str;
        if (zzp()) {
            if (true != z) {
                str = "backgrounded";
            } else {
                str = "foregrounded";
            }
            zzflr.zza().zzi(zza(), this.zza, str);
        }
    }

    public final void zzl(float f) {
        zzflr.zza().zze(zza(), this.zza, f);
    }

    public final void zzm(boolean z) {
        String str;
        if (zzp()) {
            if (true != z) {
                str = "unlocked";
            } else {
                str = "locked";
            }
            zzflr.zza().zzg(zza(), this.zza, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn(WebView webView) {
        this.zzb = new zzfnc(webView);
    }

    public final boolean zzp() {
        if (this.zzb.get() != 0) {
            return true;
        }
        return false;
    }

    public void zzo() {
    }
}

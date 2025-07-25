package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbcd {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbcc zzbccVar : this.zzb) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbcm.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        for (zzbcc zzbccVar : this.zzc) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar);
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbcm.zzb());
        return zza;
    }

    public final void zzc(zzbcc zzbccVar) {
        this.zzb.add(zzbccVar);
    }

    public final void zzd(zzbcc zzbccVar) {
        this.zza.add(zzbccVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbcc zzbccVar : this.zza) {
            if (zzbccVar.zze() == 1) {
                zzbccVar.zzd(editor, zzbccVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Flag Json is null.");
        }
    }
}

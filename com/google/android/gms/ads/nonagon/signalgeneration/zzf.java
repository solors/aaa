package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbcl;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzf {
    private final Context zza;
    @Nullable
    private final ApplicationInfo zzb;
    private final List zzc;
    private final VersionInfoParcel zzd;
    private final JSONObject zze = new JSONObject();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzf(Context context, zzbbu zzbbuVar, List list, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = list;
        this.zzd = versionInfoParcel;
    }

    public final JSONObject zza() {
        if (!this.zzf.get()) {
            zzb();
        }
        return this.zze;
    }

    public final void zzb() {
        String[] split;
        if (!this.zzf.getAndSet(true)) {
            PackageInfo packageInfo = null;
            try {
                if (this.zzb != null) {
                    packageInfo = Wrappers.packageManager(this.zza).getPackageInfo(this.zzb.packageName, 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                try {
                    this.zze.put("vc", packageInfo.versionCode);
                    this.zze.put("vnm", packageInfo.versionName);
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PawAppSignalGenerator.initialize");
                    return;
                }
            }
            ApplicationInfo applicationInfo = this.zzb;
            if (applicationInfo != null) {
                this.zze.put("pn", applicationInfo.packageName);
            }
            JSONObject jSONObject = this.zze;
            List list = this.zzc;
            ArrayList arrayList = new ArrayList();
            for (String str : ((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjG)).split(",", -1)) {
                if (list.contains(str)) {
                    arrayList.add(str);
                }
            }
            jSONObject.put(TelemetryCategory.EID, arrayList);
            this.zze.put("js", this.zzd.afmaVersion);
            Iterator<String> keys = this.zze.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = this.zze.get(next);
                if (obj != null) {
                    this.zze.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
                }
            }
        }
    }
}

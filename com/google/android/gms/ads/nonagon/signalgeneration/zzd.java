package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzd {
    private SharedPreferences zza;
    private SharedPreferences.Editor zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(Context context) {
        this.zzc = context;
    }

    private final void zzk() {
        synchronized (this.zzd) {
            if (this.zza != null) {
                return;
            }
            SharedPreferences sharedPreferences = this.zzc.getSharedPreferences("query_info_shared_prefs", 0);
            this.zza = sharedPreferences;
            this.zzb = sharedPreferences.edit();
        }
    }

    public final int zza() {
        int i;
        zzk();
        synchronized (this.zzd) {
            i = this.zza.getInt("aav", -1);
        }
        return i;
    }

    public final int zzb() {
        int i;
        zzk();
        synchronized (this.zzd) {
            i = this.zza.getInt("vc", -1);
        }
        return i;
    }

    @Nullable
    public final String zzc(String str) {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(str, null);
            this.zzb.remove(str).commit();
        }
        return string;
    }

    @Nullable
    public final String zzd() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, null);
        }
        return string;
    }

    @Nullable
    public final String zze() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("pn", null);
        }
        return string;
    }

    public final Map zzf() {
        HashMap hashMap;
        zzk();
        synchronized (this.zzd) {
            Map<String, ?> all = this.zza.getAll();
            hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER) && !Objects.equals(entry.getKey(), "aav")) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return hashMap;
    }

    public final void zzg() {
        zzk();
        synchronized (this.zzd) {
            this.zzb.clear().commit();
        }
    }

    public final void zzh(String str, String str2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString(str, str2).commit();
        }
    }

    public final void zzi(String str, int i, String str2, int i2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString("pn", str).putInt("vc", i).putString(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, str2).putInt("aav", i2).commit();
        }
    }

    public final boolean zzj(String str) {
        boolean contains;
        zzk();
        synchronized (this.zzd) {
            contains = this.zza.contains(str);
        }
        return contains;
    }
}

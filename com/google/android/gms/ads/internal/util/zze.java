package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzben;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {
    public static void zza(String str) {
        if (zzc()) {
            if (str != null && str.length() > 4000) {
                boolean z = true;
                for (String str2 : com.google.android.gms.ads.internal.util.client.zzo.zza.zzd(str)) {
                    if (z) {
                        Log.v("Ads", str2);
                    } else {
                        Log.v("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.v("Ads", str);
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2) && ((Boolean) zzben.zza.zze()).booleanValue()) {
            return true;
        }
        return false;
    }
}

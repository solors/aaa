package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfmk {
    public static void zza() {
        if (zzfkn.zzb()) {
            return;
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static void zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void zzc(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void zzd(String str, int i, String str2) {
        if (str.length() <= 256) {
            return;
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }
}

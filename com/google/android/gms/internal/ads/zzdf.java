package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdf {
    public static void zza(boolean z, String str) throws zzde {
        if (z) {
            return;
        }
        throw new zzde(str);
    }

    public static boolean zzb(Context context) {
        int i = zzei.zza;
        if (i >= 24) {
            if (i >= 26 || (!"samsung".equals(zzei.zzc) && !"XT1650".equals(zzei.zzd))) {
                if (i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                    return false;
                }
                return zzd("EGL_EXT_protected_content");
            }
            return false;
        }
        return false;
    }

    public static boolean zzc() {
        return zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains(str)) {
            return false;
        }
        return true;
    }
}

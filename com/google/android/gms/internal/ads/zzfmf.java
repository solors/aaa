package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfmf {
    private static UiModeManager zza;

    public static zzfkv zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType != 4) {
                    return zzfkv.OTHER;
                }
                return zzfkv.CTV;
            }
            return zzfkv.MOBILE;
        }
        return zzfkv.OTHER;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

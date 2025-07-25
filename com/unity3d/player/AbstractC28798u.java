package com.unity3d.player;

import android.util.Log;
import com.mobilefuse.sdk.config.ExternalUsageHelpers;

/* renamed from: com.unity3d.player.u */
/* loaded from: classes7.dex */
abstract class AbstractC28798u {

    /* renamed from: a */
    protected static boolean f74898a = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void Log(int i, String str) {
        if (f74898a) {
            return;
        }
        if (i == 6) {
            Log.e(ExternalUsageHelpers.SDK_MODULE_UNITY, str);
        }
        if (i == 5) {
            Log.w(ExternalUsageHelpers.SDK_MODULE_UNITY, str);
        }
    }
}

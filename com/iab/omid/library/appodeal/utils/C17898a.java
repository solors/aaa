package com.iab.omid.library.appodeal.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.appodeal.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.appodeal.utils.a */
/* loaded from: classes6.dex */
public final class C17898a {

    /* renamed from: a */
    private static UiModeManager f45114a;

    /* renamed from: a */
    public static DeviceCategory m64805a() {
        UiModeManager uiModeManager = f45114a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m64804a(Context context) {
        if (context != null) {
            f45114a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

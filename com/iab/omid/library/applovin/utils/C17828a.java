package com.iab.omid.library.applovin.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.applovin.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.applovin.utils.a */
/* loaded from: classes6.dex */
public final class C17828a {

    /* renamed from: a */
    private static UiModeManager f44980a;

    /* renamed from: a */
    public static DeviceCategory m65054a() {
        UiModeManager uiModeManager = f44980a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m65053a(Context context) {
        if (context != null) {
            f44980a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

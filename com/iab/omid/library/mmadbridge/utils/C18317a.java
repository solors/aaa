package com.iab.omid.library.mmadbridge.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.mmadbridge.utils.a */
/* loaded from: classes6.dex */
public final class C18317a {

    /* renamed from: a */
    private static UiModeManager f46002a;

    /* renamed from: a */
    public static DeviceCategory m63159a() {
        UiModeManager uiModeManager = f46002a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m63158a(Context context) {
        if (context != null) {
            f46002a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

package com.iab.omid.library.amazon.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.amazon.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.amazon.utils.a */
/* loaded from: classes6.dex */
public final class C17767a {

    /* renamed from: a */
    private static UiModeManager f44851a;

    /* renamed from: a */
    public static DeviceCategory m65295a() {
        UiModeManager uiModeManager = f44851a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m65294a(Context context) {
        if (context != null) {
            f44851a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

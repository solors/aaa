package com.iab.omid.library.mobilefuse.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.mobilefuse.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.mobilefuse.utils.a */
/* loaded from: classes6.dex */
public final class C18387a {

    /* renamed from: a */
    private static UiModeManager f46137a;

    /* renamed from: a */
    public static DeviceCategory m62906a() {
        UiModeManager uiModeManager = f46137a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m62905a(Context context) {
        if (context != null) {
            f46137a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

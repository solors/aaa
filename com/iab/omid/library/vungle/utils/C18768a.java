package com.iab.omid.library.vungle.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.vungle.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.vungle.utils.a */
/* loaded from: classes6.dex */
public final class C18768a {

    /* renamed from: a */
    private static UiModeManager f46933a;

    /* renamed from: a */
    public static DeviceCategory m61425a() {
        UiModeManager uiModeManager = f46933a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m61424a(Context context) {
        if (context != null) {
            f46933a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

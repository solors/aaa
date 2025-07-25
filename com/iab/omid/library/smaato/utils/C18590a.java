package com.iab.omid.library.smaato.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.smaato.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.smaato.utils.a */
/* loaded from: classes6.dex */
public final class C18590a {

    /* renamed from: a */
    private static UiModeManager f46542a;

    /* renamed from: a */
    public static DeviceCategory m62147a() {
        UiModeManager uiModeManager = f46542a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m62146a(Context context) {
        if (context != null) {
            f46542a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

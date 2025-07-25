package com.iab.omid.library.unity3d.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.unity3d.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.unity3d.utils.a */
/* loaded from: classes6.dex */
public final class C18706a {

    /* renamed from: a */
    private static UiModeManager f46799a;

    /* renamed from: a */
    public static DeviceCategory m61671a() {
        UiModeManager uiModeManager = f46799a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m61670a(Context context) {
        if (context != null) {
            f46799a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

package com.iab.omid.library.bytedance2.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.bytedance2.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.bytedance2.utils.a */
/* loaded from: classes6.dex */
public final class C18010a {

    /* renamed from: a */
    private static UiModeManager f45365a;

    /* renamed from: a */
    public static DeviceCategory m64346a() {
        UiModeManager uiModeManager = f45365a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m64345a(Context context) {
        if (context != null) {
            f45365a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

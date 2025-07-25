package com.iab.omid.library.pubnativenet.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.pubnativenet.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.pubnativenet.utils.a */
/* loaded from: classes6.dex */
public final class C18527a {

    /* renamed from: a */
    private static UiModeManager f46407a;

    /* renamed from: a */
    public static DeviceCategory m62400a() {
        UiModeManager uiModeManager = f46407a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m62399a(Context context) {
        if (context != null) {
            f46407a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

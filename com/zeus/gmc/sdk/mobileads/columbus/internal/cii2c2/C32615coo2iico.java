package com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.xiaomi.adsession.DeviceCategory;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.coo2iico */
/* loaded from: classes8.dex */
public final class C32615coo2iico {
    private static UiModeManager coo2iico;

    public static DeviceCategory coo2iico() {
        UiModeManager uiModeManager = coo2iico;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    public static void coo2iico(Context context) {
        if (context != null) {
            coo2iico = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

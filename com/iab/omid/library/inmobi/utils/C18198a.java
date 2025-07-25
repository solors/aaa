package com.iab.omid.library.inmobi.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.inmobi.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.inmobi.utils.a */
/* loaded from: classes6.dex */
public final class C18198a {

    /* renamed from: a */
    private static UiModeManager f45743a;

    /* renamed from: a */
    public static DeviceCategory m63643a() {
        UiModeManager uiModeManager = f45743a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m63642a(Context context) {
        if (context != null) {
            f45743a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

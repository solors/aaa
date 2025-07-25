package com.iab.omid.library.taurusx.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.taurusx.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.taurusx.utils.a */
/* loaded from: classes6.dex */
public final class C18649a {

    /* renamed from: a */
    private static UiModeManager f46671a;

    /* renamed from: a */
    public static DeviceCategory m61905a() {
        UiModeManager uiModeManager = f46671a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m61904a(Context context) {
        if (context != null) {
            f46671a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

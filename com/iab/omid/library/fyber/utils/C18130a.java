package com.iab.omid.library.fyber.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.fyber.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.fyber.utils.a */
/* loaded from: classes6.dex */
public final class C18130a {

    /* renamed from: a */
    private static UiModeManager f45613a;

    /* renamed from: a */
    public static DeviceCategory m63888a() {
        UiModeManager uiModeManager = f45613a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
        }
        return DeviceCategory.OTHER;
    }

    /* renamed from: a */
    public static void m63887a(Context context) {
        if (context != null) {
            f45613a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

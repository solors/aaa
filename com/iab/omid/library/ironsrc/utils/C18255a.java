package com.iab.omid.library.ironsrc.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.ironsrc.utils.a */
/* loaded from: classes6.dex */
public final class C18255a {

    /* renamed from: a */
    private static UiModeManager f45868a;

    /* renamed from: a */
    public static DeviceCategory m63405a() {
        int currentModeType = f45868a.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    /* renamed from: a */
    public static void m63404a(Context context) {
        if (context != null) {
            f45868a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

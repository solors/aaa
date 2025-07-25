package com.chartboost.sdk.impl;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: com.chartboost.sdk.impl.gc */
/* loaded from: classes3.dex */
public abstract class AbstractC9872gc {

    /* renamed from: a */
    public static UiModeManager f22128a;

    /* renamed from: a */
    public static EnumC10375y3 m81602a() {
        UiModeManager uiModeManager = f22128a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            return currentModeType != 1 ? currentModeType != 4 ? EnumC10375y3.OTHER : EnumC10375y3.CTV : EnumC10375y3.MOBILE;
        }
        return EnumC10375y3.OTHER;
    }

    /* renamed from: a */
    public static void m81601a(Context context) {
        if (context != null) {
            f22128a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

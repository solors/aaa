package com.zeus.gmc.sdk.mobileads.columbus.remote.module.util;

import com.amazon.p047a.p048a.p071o.KiwiConstants;

/* loaded from: classes8.dex */
public final class SystemProperties {
    private static final String TAG = "SProp";

    private SystemProperties() {
    }

    public static String get(String str, String str2) {
        try {
            return (String) Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            MLog.m25899e(TAG, "Get exception", e);
            return str2;
        }
    }

    public static String get(String str) {
        return get(str, "");
    }
}

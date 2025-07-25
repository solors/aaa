package com.meevii.adsdk.common.util;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class SessionUtil {
    private static final AtomicBoolean isNotFirstSession = new AtomicBoolean(false);

    public static boolean isNotFirstSession() {
        return isNotFirstSession.get();
    }

    public static void setNotFirstSession(boolean z) {
        isNotFirstSession.set(z);
    }
}

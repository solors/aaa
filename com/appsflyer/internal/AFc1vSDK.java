package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class AFc1vSDK {
    public static boolean AFInAppEventType(@Nullable String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean valueOf(@Nullable String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }
}

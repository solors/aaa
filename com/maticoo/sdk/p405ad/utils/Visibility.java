package com.maticoo.sdk.p405ad.utils;

/* renamed from: com.maticoo.sdk.ad.utils.Visibility */
/* loaded from: classes6.dex */
public class Visibility {
    private Visibility() {
    }

    public static boolean hasScreenVisibilityChanged(int i, int i2) {
        if (isScreenVisible(i) != isScreenVisible(i2)) {
            return true;
        }
        return false;
    }

    public static boolean isScreenVisible(int i) {
        if (i == 0) {
            return true;
        }
        return false;
    }
}

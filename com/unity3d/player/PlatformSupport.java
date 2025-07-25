package com.unity3d.player;

import android.os.Build;

/* loaded from: classes7.dex */
public class PlatformSupport {
    static final boolean MARSHMALLOW_SUPPORT;
    static final boolean NOUGAT_SUPPORT;
    static final boolean PIE_SUPPORT;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        MARSHMALLOW_SUPPORT = true;
        NOUGAT_SUPPORT = true;
        if (i < 28) {
            z = false;
        }
        PIE_SUPPORT = z;
    }
}

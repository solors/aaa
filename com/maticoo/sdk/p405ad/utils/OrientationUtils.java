package com.maticoo.sdk.p405ad.utils;

import android.content.Context;

/* renamed from: com.maticoo.sdk.ad.utils.OrientationUtils */
/* loaded from: classes6.dex */
public class OrientationUtils {
    public static int getOrientationType(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        return 0;
    }

    public static int getRequestedOrientationType(Context context, int i) {
        boolean z;
        if (context.getResources().getConfiguration().orientation == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i == 3) {
            if (!z) {
                return 6;
            }
        } else if (i == 2) {
            return 0;
        }
        return 1;
    }
}

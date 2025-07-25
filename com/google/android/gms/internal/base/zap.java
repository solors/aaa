package com.google.android.gms.internal.base;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zap {
    public static final int zaa;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        } else {
            i = 0;
        }
        zaa = i;
    }
}

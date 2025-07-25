package com.google.android.gms.internal.p383authapi;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbbk */
/* loaded from: classes5.dex */
public final class zbbk {
    public static final int zba;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        } else {
            i = 0;
        }
        zba = i;
    }
}

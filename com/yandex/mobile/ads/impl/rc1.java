package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class rc1 {
    private rc1() {
    }

    /* renamed from: a */
    public static oc1 m30076a() {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i = oc1.f83452a;
        Intrinsics.checkNotNullParameter(handler, "handler");
        return new pc1(true, handler);
    }
}

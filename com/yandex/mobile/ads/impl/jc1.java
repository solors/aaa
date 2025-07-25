package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jc1 {
    @NotNull
    /* renamed from: a */
    public static ic1 m32944a(@NotNull me0 htmlWebViewRenderer) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        return new ic1(htmlWebViewRenderer, new Handler(Looper.getMainLooper()), new nu1(), new RunnableC30367g7());
    }
}

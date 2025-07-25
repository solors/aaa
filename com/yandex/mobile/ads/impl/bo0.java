package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class bo0 {
    /* renamed from: a */
    public static void m35456a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

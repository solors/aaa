package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class me2 {
    @NotNull
    /* renamed from: a */
    public static Rect m32026a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Rect rect = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (NullPointerException unused) {
        }
        view.getRootView().getLocationOnScreen(r1);
        int i = -r1[0];
        int i2 = -r1[1];
        int[] iArr = {i, i2};
        rect.offset(i, i2);
        return rect;
    }
}

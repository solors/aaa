package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e30 {
    @NotNull

    /* renamed from: a */
    private final C32027zz f78431a = new C32027zz();

    /* renamed from: a */
    public final boolean m34691a(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i5 = i3 - i;
        int i6 = i4 - i2;
        C32027zz c32027zz = this.f78431a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c32027zz.getClass();
        int m25947a = C32027zz.m25947a(context, 144.0f);
        C32027zz c32027zz2 = this.f78431a;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        c32027zz2.getClass();
        int m25947a2 = C32027zz.m25947a(context2, 96.0f);
        if (i5 >= m25947a && i6 >= m25947a2) {
            return true;
        }
        return false;
    }
}

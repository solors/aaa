package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import be.MathJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.zz */
/* loaded from: classes8.dex */
public final class C32027zz {
    /* renamed from: a */
    public static int m25947a(@NotNull Context context, float f) {
        int m103791d;
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d = MathJVM.m103791d(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
        return m103791d;
    }
}

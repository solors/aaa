package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.tg */
/* loaded from: classes8.dex */
public final class C31450tg {
    @ColorInt
    /* renamed from: a */
    public static final int m29175a(@NotNull Context context, @AttrRes int i) {
        int i2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            i2 = obtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            i2 = ViewCompat.MEASURED_STATE_MASK;
        }
        obtainStyledAttributes.recycle();
        return i2;
    }
}

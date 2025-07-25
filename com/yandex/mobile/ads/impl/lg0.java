package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lg0 {
    /* renamed from: a */
    private static String m32272a(String str, ImageView.ScaleType scaleType) {
        int ordinal = scaleType.ordinal();
        return "#S" + ordinal + str;
    }

    @NotNull
    /* renamed from: b */
    public static String m32271b(@NotNull String url, @NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        return m32272a(url, scaleType);
    }

    @NotNull
    /* renamed from: a */
    public static String m32273a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return m32272a(url, ImageView.ScaleType.CENTER_INSIDE);
    }
}

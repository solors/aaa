package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ph1 {
    @NotNull
    /* renamed from: a */
    public static String m30657a(long j) {
        long ceil = (long) Math.ceil(((float) j) / ((float) 1000));
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(ceil / 60), Long.valueOf(ceil % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}

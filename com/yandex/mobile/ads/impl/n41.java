package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class n41 {
    @Nullable
    /* renamed from: a */
    public static Float m31661a(@Nullable String str) {
        if (str != null) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
                Object[] args = new Object[0];
                int i = um0.f86330b;
                Intrinsics.checkNotNullParameter(args, "args");
            }
        }
        return null;
    }
}

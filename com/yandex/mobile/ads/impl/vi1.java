package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.py0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vi1 {
    @NotNull

    /* renamed from: a */
    private static final py0 f86760a;

    /* renamed from: b */
    public static final /* synthetic */ int f86761b = 0;

    static {
        int i = py0.f84119d;
        f86760a = py0.C31161a.m30553a();
    }

    /* renamed from: a */
    public static void m28305a(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (um0.m28730a() || fy0.f79355a.m34057a()) {
            C37612s0 c37612s0 = C37612s0.f99333a;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            if (um0.m28730a()) {
                Log.w("Yandex Mobile Ads", format2);
            }
            if (fy0.f79355a.m34057a()) {
                f86760a.m30558a(ey0.f78840c, "Yandex Mobile Ads", format2);
            }
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.py0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class km0 {
    @NotNull

    /* renamed from: a */
    private static final py0 f81488a;
    @NotNull

    /* renamed from: b */
    private static final String f81489b;

    /* renamed from: c */
    private static boolean f81490c;

    static {
        int i = py0.f84119d;
        f81488a = py0.C31161a.m30553a();
        f81489b = "YandexAds";
        f81490c = true;
    }

    /* renamed from: a */
    private static String m32489a(String str) {
        return "[Integration] " + str;
    }

    /* renamed from: b */
    public static final void m32486b(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f81490c || fy0.f79355a.m34057a()) {
            C37612s0 c37612s0 = C37612s0.f99333a;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String m32489a = m32489a(format2);
            if (f81490c) {
                Log.i(f81489b, m32489a);
            }
            if (fy0.f79355a.m34057a()) {
                f81488a.m30558a(ey0.f78839b, f81489b, m32489a);
            }
        }
    }

    /* renamed from: c */
    public static final void m32485c(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f81490c || fy0.f79355a.m34057a()) {
            C37612s0 c37612s0 = C37612s0.f99333a;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String m32489a = m32489a(format2);
            if (f81490c) {
                Log.w(f81489b, m32489a);
            }
            if (fy0.f79355a.m34057a()) {
                f81488a.m30558a(ey0.f78840c, f81489b, m32489a);
            }
        }
    }

    /* renamed from: a */
    public static final void m32487a(boolean z) {
        f81490c = z;
    }

    /* renamed from: a */
    public static final void m32488a(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f81490c || fy0.f79355a.m34057a()) {
            C37612s0 c37612s0 = C37612s0.f99333a;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String m32489a = m32489a(format2);
            if (f81490c) {
                Log.e(f81489b, m32489a);
            }
            if (fy0.f79355a.m34057a()) {
                f81488a.m30558a(ey0.f78841d, f81489b, m32489a);
            }
        }
    }
}

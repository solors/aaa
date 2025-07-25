package com.yandex.mobile.ads.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class i82 {
    @Nullable
    /* renamed from: a */
    public static final Long m33346a(@Nullable String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
                um0.m28726c(new Object[0]);
                return null;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static final Integer m33345b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static final void m33347a(@Nullable Object obj) {
        Intrinsics.checkNotNullParameter("AdBreak", "fieldDescription");
        if (obj != null) {
            return;
        }
        m33348a();
        throw null;
    }

    /* renamed from: a */
    private static void m33348a() {
        throw new IllegalArgumentException("AdBreak not set!");
    }
}

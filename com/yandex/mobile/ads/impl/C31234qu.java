package com.yandex.mobile.ads.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.qu */
/* loaded from: classes8.dex */
public final class C31234qu {
    @NotNull

    /* renamed from: a */
    private static final C31235a f84536a = new C31235a();

    /* renamed from: com.yandex.mobile.ads.impl.qu$a */
    /* loaded from: classes8.dex */
    public static final class C31235a extends ThreadLocal<DateFormat> {
        C31235a() {
        }

        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(z32.f88700d);
            return simpleDateFormat;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final String m30218a(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String format = f84536a.get().format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}

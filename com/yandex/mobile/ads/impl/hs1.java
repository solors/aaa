package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hs1 {
    @NotNull

    /* renamed from: a */
    private final qy0 f80175a;

    public /* synthetic */ hs1() {
        this(new qy0());
    }

    @NotNull
    /* renamed from: a */
    public final String m33471a() {
        this.f80175a.getClass();
        t52 m30184a = qy0.m30184a();
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "%d.%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(m30184a.m29283a()), Integer.valueOf(m30184a.m29282b()), Integer.valueOf(m30184a.m29281c())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    /* renamed from: b */
    public final String m33470b() {
        this.f80175a.getClass();
        t52 m30184a = qy0.m30184a();
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(m30184a.m29283a()), Integer.valueOf(m30184a.m29282b()), Integer.valueOf(m30184a.m29281c())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public hs1(@NotNull qy0 mobileAdsVersionInfoProvider) {
        Intrinsics.checkNotNullParameter(mobileAdsVersionInfoProvider, "mobileAdsVersionInfoProvider");
        this.f80175a = mobileAdsVersionInfoProvider;
    }
}

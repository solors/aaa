package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.g42;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gi0 {
    @NotNull

    /* renamed from: b */
    private static final List<g42.EnumC30362a> f79663b;
    @NotNull

    /* renamed from: a */
    private final hi0 f79664a;

    static {
        List<g42.EnumC30362a> m17163p;
        m17163p = C37563v.m17163p(g42.EnumC30362a.f79483c, g42.EnumC30362a.f79484d, g42.EnumC30362a.f79489i);
        f79663b = m17163p;
    }

    public /* synthetic */ gi0() {
        this(new hi0());
    }

    /* renamed from: a */
    public final void m33830a(@NotNull FrameLayout adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.f79664a.m33550a(adView);
    }

    public gi0(@NotNull hi0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f79664a = renderer;
    }

    /* renamed from: a */
    public final void m33829a(@NotNull g42 validationResult, @NotNull FrameLayout adView) {
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(adView, "adView");
        g42.EnumC30362a m33929b = validationResult.m33929b();
        this.f79664a.m33549a(adView, validationResult, !f79663b.contains(m33929b));
    }
}

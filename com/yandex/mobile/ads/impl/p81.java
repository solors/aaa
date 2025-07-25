package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class p81 {
    @NotNull

    /* renamed from: a */
    private final List<C31034of<?>> f83743a;
    @NotNull

    /* renamed from: b */
    private final List<ot1> f83744b;
    @NotNull

    /* renamed from: c */
    private final List<String> f83745c;
    @Nullable

    /* renamed from: d */
    private final String f83746d;
    @Nullable

    /* renamed from: e */
    private final AdImpressionData f83747e;

    public p81(@NotNull List assets, @NotNull ArrayList showNotices, @NotNull ArrayList renderTrackingUrls, @Nullable String str, @Nullable AdImpressionData adImpressionData) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        this.f83743a = assets;
        this.f83744b = showNotices;
        this.f83745c = renderTrackingUrls;
        this.f83746d = str;
        this.f83747e = adImpressionData;
    }

    @Nullable
    /* renamed from: a */
    public final String m30813a() {
        return this.f83746d;
    }

    @NotNull
    /* renamed from: b */
    public final List<C31034of<?>> m30812b() {
        return this.f83743a;
    }

    @Nullable
    /* renamed from: c */
    public final AdImpressionData m30811c() {
        return this.f83747e;
    }

    @NotNull
    /* renamed from: d */
    public final List<String> m30810d() {
        return this.f83745c;
    }

    @NotNull
    /* renamed from: e */
    public final List<ot1> m30809e() {
        return this.f83744b;
    }
}

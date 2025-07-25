package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vy1 implements un0 {
    @NotNull

    /* renamed from: b */
    private final View f87039b;

    public vy1(@NotNull ac1 htmlWebView) {
        Intrinsics.checkNotNullParameter(htmlWebView, "htmlWebView");
        this.f87039b = htmlWebView;
    }

    @Override // com.yandex.mobile.ads.impl.un0
    @NotNull
    /* renamed from: a */
    public final String mo26283a() {
        boolean isHardwareAccelerated = this.f87039b.isHardwareAccelerated();
        C37612s0 c37612s0 = C37612s0.f99333a;
        return C31714w0.m28089a(new Object[]{Boolean.valueOf(isHardwareAccelerated)}, 1, "supports: {inlineVideo: %s}", "format(...)");
    }
}

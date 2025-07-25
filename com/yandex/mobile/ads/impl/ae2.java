package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ae2 implements Runnable {

    /* renamed from: b */
    private final int f76774b;
    @Nullable

    /* renamed from: c */
    private final String f76775c;
    @NotNull

    /* renamed from: d */
    private final me0 f76776d;

    public ae2(int i, @Nullable String str, @NotNull me0 htmlWebViewRenderer) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        this.f76774b = i;
        this.f76775c = str;
        this.f76776d = htmlWebViewRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76776d.mo32036a(this.f76774b, this.f76775c);
    }
}

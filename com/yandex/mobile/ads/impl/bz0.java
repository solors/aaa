package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class bz0 implements InterfaceC31672vn {
    @NotNull

    /* renamed from: a */
    private final pz0 f77452a;

    public bz0(@NotNull pz0 mraidWebView) {
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        this.f77452a = mraidWebView;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31672vn
    /* renamed from: a */
    public final void mo28252a(@NotNull xo0 link, @NotNull C31830xn clickListenerCreator) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        this.f77452a.setClickListener(new az0(link, clickListenerCreator));
    }
}

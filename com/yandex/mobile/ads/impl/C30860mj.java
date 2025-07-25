package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.mj */
/* loaded from: classes8.dex */
public class C30860mj implements fe0 {
    @NotNull

    /* renamed from: a */
    private final ac1 f82227a;

    public C30860mj(@NotNull ac1 parentHtmlWebView) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        this.f82227a = parentHtmlWebView;
        parentHtmlWebView.setId(2);
    }

    @Override // com.yandex.mobile.ads.impl.fe0
    /* renamed from: a */
    public void mo30181a(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        this.f82227a.m27887b(htmlResponse);
    }

    @Override // com.yandex.mobile.ads.impl.fe0
    public void invalidate() {
        this.f82227a.mo27885d();
    }

    /* renamed from: a */
    public void mo30182a(@NotNull le0 htmlWebViewListener) {
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        this.f82227a.setHtmlWebViewListener(htmlWebViewListener);
    }
}

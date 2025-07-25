package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.qi */
/* loaded from: classes8.dex */
public final class C31213qi {
    @NotNull

    /* renamed from: a */
    private final C31136pi<ExtendedNativeAdView> f84372a;

    public C31213qi(@NotNull C31136pi<ExtendedNativeAdView> layoutDesignsController) {
        Intrinsics.checkNotNullParameter(layoutDesignsController, "layoutDesignsController");
        this.f84372a = layoutDesignsController;
    }

    /* renamed from: a */
    public final void m30353a() {
        this.f84372a.m30655a();
    }

    /* renamed from: a */
    public final void m30352a(@Nullable qu1 qu1Var, @NotNull InterfaceC30464hi attachEventListener) {
        Intrinsics.checkNotNullParameter(attachEventListener, "attachEventListener");
        if (this.f84372a.m30654a(qu1Var)) {
            attachEventListener.mo29544a();
        } else {
            attachEventListener.mo29543a(C30774l7.m32329h());
        }
    }
}

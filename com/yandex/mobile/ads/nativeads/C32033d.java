package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.InterfaceC31679vs;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.nativeads.d */
/* loaded from: classes8.dex */
public final class C32033d implements CustomClickHandlerEventListener {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31679vs f89236a;

    public C32033d(@NotNull InterfaceC31679vs coreListener) {
        Intrinsics.checkNotNullParameter(coreListener, "coreListener");
        this.f89236a = coreListener;
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onLeftApplication() {
        this.f89236a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onReturnedToApplication() {
        this.f89236a.onReturnedToApplication();
    }
}

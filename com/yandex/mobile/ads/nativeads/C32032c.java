package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.InterfaceC31608us;
import com.yandex.mobile.ads.impl.InterfaceC31679vs;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.nativeads.c */
/* loaded from: classes8.dex */
public final class C32032c implements InterfaceC31608us {
    @NotNull

    /* renamed from: a */
    private final CustomClickHandler f89235a;

    public C32032c(@NotNull CustomClickHandler customClickHandler) {
        Intrinsics.checkNotNullParameter(customClickHandler, "customClickHandler");
        this.f89235a = customClickHandler;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31608us
    /* renamed from: a */
    public final void mo25940a(@NotNull String url, @NotNull InterfaceC31679vs listener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f89235a.handleCustomClick(url, new C32033d(listener));
    }
}

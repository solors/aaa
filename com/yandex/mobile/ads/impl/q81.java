package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q81 implements ja0, t81 {
    @NotNull

    /* renamed from: a */
    private final s81 f84254a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31470to f84255b;

    public q81(@NotNull s81 nativeWebViewController, @NotNull InterfaceC31470to closeShowListener) {
        Intrinsics.checkNotNullParameter(nativeWebViewController, "nativeWebViewController");
        Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
        this.f84254a = nativeWebViewController;
        this.f84255b = closeShowListener;
    }

    @Override // com.yandex.mobile.ads.impl.t81
    /* renamed from: a */
    public final void mo29259a() {
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void invalidate() {
        this.f84254a.m29677b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void start() {
        this.f84254a.m29679a(this);
    }

    @Override // com.yandex.mobile.ads.impl.t81
    /* renamed from: a */
    public final void mo29258a(boolean z) {
        if (z) {
            return;
        }
        this.f84255b.mo29100a();
        this.f84254a.m29677b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void resume() {
    }
}

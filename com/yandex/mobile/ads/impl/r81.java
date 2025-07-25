package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class r81 implements ja0, t81 {
    @NotNull

    /* renamed from: a */
    private final s81 f84674a;
    @Nullable

    /* renamed from: b */
    private InterfaceC30068c3 f84675b;

    public r81(@NotNull s81 nativeWebViewController, @NotNull InterfaceC30068c3 adCompleteListener) {
        Intrinsics.checkNotNullParameter(nativeWebViewController, "nativeWebViewController");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        this.f84674a = nativeWebViewController;
        this.f84675b = adCompleteListener;
    }

    @Override // com.yandex.mobile.ads.impl.t81
    /* renamed from: a */
    public final void mo29258a(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void invalidate() {
        this.f84674a.m29677b(this);
        this.f84675b = null;
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void start() {
        this.f84674a.m29679a(this);
    }

    @Override // com.yandex.mobile.ads.impl.t81
    /* renamed from: a */
    public final void mo29259a() {
        InterfaceC30068c3 interfaceC30068c3 = this.f84675b;
        if (interfaceC30068c3 != null) {
            interfaceC30068c3.mo30350b();
        }
        this.f84674a.m29677b(this);
        this.f84675b = null;
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void resume() {
    }
}

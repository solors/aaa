package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.tb */
/* loaded from: classes8.dex */
public final class C31434tb implements InterfaceC30925nb {
    @NotNull

    /* renamed from: a */
    private final String f85570a;
    @NotNull

    /* renamed from: b */
    private final Runnable f85571b;

    public C31434tb(@NotNull String request, @NotNull Runnable adtuneRequestRunnable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(adtuneRequestRunnable, "adtuneRequestRunnable");
        this.f85570a = request;
        this.f85571b = adtuneRequestRunnable;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30925nb
    /* renamed from: a */
    public final void mo29242a() {
        this.f85571b.run();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30925nb
    /* renamed from: a */
    public final boolean mo29241a(@Nullable String str, @Nullable String str2) {
        return Intrinsics.m17075f("mobileads", str) && Intrinsics.m17075f(this.f85570a, str2);
    }
}

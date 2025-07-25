package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e41 implements InterfaceC30613ja {
    @NotNull

    /* renamed from: a */
    private final z61 f78450a;

    public e41(@NotNull z61 nativeAdValidator) {
        Intrinsics.checkNotNullParameter(nativeAdValidator, "nativeAdValidator");
        this.f78450a = nativeAdValidator;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30613ja
    /* renamed from: a */
    public final boolean mo33006a() {
        return this.f78450a.mo26332c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30613ja
    /* renamed from: b */
    public final boolean mo33005b() {
        return !this.f78450a.mo26334b();
    }
}

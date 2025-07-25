package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class az0 implements InterfaceC31596un {
    @NotNull

    /* renamed from: a */
    private final xo0 f76976a;
    @NotNull

    /* renamed from: b */
    private final C31830xn f76977b;

    public az0(@NotNull xo0 link, @NotNull C31830xn clickListenerCreator) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        this.f76976a = link;
        this.f76977b = clickListenerCreator;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31596un
    /* renamed from: a */
    public final void mo28722a(@NotNull pz0 view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f76977b.m27454a(new xo0(this.f76976a.m27443a(), this.f76976a.m27441c(), this.f76976a.m27440d(), url, this.f76976a.m27442b())).onClick(view);
    }
}

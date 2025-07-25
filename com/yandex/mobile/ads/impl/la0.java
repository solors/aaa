package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class la0 implements q12, t32 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31919yq f81753a;
    @Nullable

    /* renamed from: b */
    private Map<String, String> f81754b;

    /* renamed from: c */
    private boolean f81755c;

    public la0(@NotNull InterfaceC31919yq contentPresenter) {
        Intrinsics.checkNotNullParameter(contentPresenter, "contentPresenter");
        this.f81753a = contentPresenter;
    }

    @Override // com.yandex.mobile.ads.impl.q12
    /* renamed from: a */
    public final void mo30540a(@Nullable Map<String, String> map) {
        this.f81754b = map;
    }

    @Override // com.yandex.mobile.ads.impl.t32
    /* renamed from: a */
    public final void mo29309a(boolean z) {
        this.f81755c = z;
        this.f81753a.mo26642a(z);
    }

    @NotNull
    /* renamed from: a */
    public final ka0 m32299a() {
        return new ka0(this.f81755c, this.f81754b);
    }
}

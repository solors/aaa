package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import kotlin.collections.MutableCollections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m72 implements l72, n72 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashSet f82074a = new LinkedHashSet();
    @NotNull

    /* renamed from: b */
    private final LinkedHashSet f82075b = new LinkedHashSet();

    /* renamed from: a */
    public final void m32080a(@NotNull l72... newProgressChangeListeners) {
        Intrinsics.checkNotNullParameter(newProgressChangeListeners, "newProgressChangeListeners");
        MutableCollections.m17622F(this.f82074a, newProgressChangeListeners);
    }

    @Override // com.yandex.mobile.ads.impl.n72
    /* renamed from: b */
    public final void mo31649b() {
        for (n72 n72Var : this.f82075b) {
            n72Var.mo31649b();
        }
    }

    /* renamed from: a */
    public final void m32079a(@NotNull n72... newProgressLifecycleListeners) {
        Intrinsics.checkNotNullParameter(newProgressLifecycleListeners, "newProgressLifecycleListeners");
        MutableCollections.m17622F(this.f82075b, newProgressLifecycleListeners);
    }

    @Override // com.yandex.mobile.ads.impl.l72
    /* renamed from: a */
    public final void mo26256a(long j, long j2) {
        for (l72 l72Var : this.f82074a) {
            l72Var.mo26256a(j, j2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.n72
    /* renamed from: a */
    public final void mo31650a() {
        for (n72 n72Var : this.f82075b) {
            n72Var.mo31650a();
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.tp */
/* loaded from: classes8.dex */
public final class C31471tp<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30890mz<V>[] f85786a;

    @SafeVarargs
    public C31471tp(@NotNull InterfaceC30890mz<V>... designComponentBinders) {
        Intrinsics.checkNotNullParameter(designComponentBinders, "designComponentBinders");
        this.f85786a = designComponentBinders;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        for (InterfaceC30890mz<V> interfaceC30890mz : this.f85786a) {
            interfaceC30890mz.mo26077a(container);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
        for (InterfaceC30890mz<V> interfaceC30890mz : this.f85786a) {
            interfaceC30890mz.mo26075c();
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class rx1<T extends View> implements Runnable {
    @NotNull

    /* renamed from: b */
    private final T f84941b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC30456hd<T> f84942c;

    public rx1(@NotNull T view, @NotNull InterfaceC30456hd<T> animator) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f84941b = view;
        this.f84942c = animator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f84942c.mo27501a(this.f84941b);
    }
}

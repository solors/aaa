package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class r41<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @Nullable

    /* renamed from: a */
    private final t41 f84624a;

    public /* synthetic */ r41(b61 b61Var, w82 w82Var) {
        this(b61Var, w82Var, new s41(w82Var, b61Var));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        t41 t41Var = this.f84624a;
        if (t41Var != null) {
            t41Var.m29298d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
        t41 t41Var = this.f84624a;
        if (t41Var != null) {
            t41Var.m29299c();
        }
    }

    public r41(@NotNull b61 nativeMediaContent, @NotNull w82 videoEventController, @NotNull s41 contentCompleteControllerFactory) {
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(contentCompleteControllerFactory, "contentCompleteControllerFactory");
        this.f84624a = contentCompleteControllerFactory.m29865a();
    }
}

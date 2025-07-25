package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.vo */
/* loaded from: classes8.dex */
public final class C31673vo implements InterfaceC31913yo {
    @NotNull

    /* renamed from: a */
    private final Dialog f86828a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31308rq f86829b;

    public C31673vo(@NotNull Dialog dialog, @NotNull InterfaceC31308rq contentCloseListener) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f86828a = dialog;
        this.f86829b = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31913yo
    /* renamed from: a */
    public final void mo26825a() {
        C31940yz.m26513a(this.f86828a);
        this.f86829b.mo27153f();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31913yo
    /* renamed from: b */
    public final void mo26824b() {
        C31940yz.m26513a(this.f86828a);
    }
}

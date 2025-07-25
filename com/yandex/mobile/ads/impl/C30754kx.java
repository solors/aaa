package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.kx */
/* loaded from: classes8.dex */
public final class C30754kx implements InterfaceC31941z<C30678jx> {
    @NotNull

    /* renamed from: a */
    private final C30887mx f81601a;

    public C30754kx(@NotNull C30887mx deeplinkRenderer) {
        Intrinsics.checkNotNullParameter(deeplinkRenderer, "deeplinkRenderer");
        this.f81601a = deeplinkRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31941z
    /* renamed from: a */
    public final void mo26510a(View view, C30678jx c30678jx) {
        C30678jx action = c30678jx;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        Context context = view.getContext();
        C30887mx c30887mx = this.f81601a;
        Intrinsics.m17074g(context);
        c30887mx.m31754a(context, action);
    }
}

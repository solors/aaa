package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d80 implements InterfaceC31941z<c80> {
    @NotNull

    /* renamed from: a */
    private final m80 f77998a;

    public d80(@NotNull m80 feedbackRenderer) {
        Intrinsics.checkNotNullParameter(feedbackRenderer, "feedbackRenderer");
        this.f77998a = feedbackRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31941z
    /* renamed from: a */
    public final void mo26510a(View view, c80 c80Var) {
        c80 action = c80Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        Context context = view.getContext();
        m80 m80Var = this.f77998a;
        Intrinsics.m17074g(context);
        m80Var.m32078a(context, action);
    }
}

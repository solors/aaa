package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class al1 {
    @NotNull

    /* renamed from: a */
    private final cl1 f76824a;

    public /* synthetic */ al1() {
        this(new cl1());
    }

    @NotNull
    /* renamed from: a */
    public final yk1 m35835a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Button m35221a = this.f76824a.m35221a(context);
        m35221a.setTag(ac2.m35919a("replay_button"));
        m35221a.setVisibility(8);
        yk1 yk1Var = new yk1(context, m35221a);
        yk1Var.addView(m35221a);
        return yk1Var;
    }

    public al1(@NotNull cl1 replayButtonCreator) {
        Intrinsics.checkNotNullParameter(replayButtonCreator, "replayButtonCreator");
        this.f76824a = replayButtonCreator;
    }
}

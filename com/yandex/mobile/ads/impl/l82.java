package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class l82 implements View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final xo0 f81741a;
    @NotNull

    /* renamed from: b */
    private final C31830xn f81742b;
    @Nullable

    /* renamed from: c */
    private final C30746kt f81743c;

    public l82(@NotNull xo0 link, @NotNull C31830xn clickListenerCreator, @Nullable C30746kt c30746kt) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        this.f81741a = link;
        this.f81742b = clickListenerCreator;
        this.f81743c = c30746kt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        xo0 xo0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f81743c != null) {
            xo0Var = new xo0(this.f81741a.m27443a(), this.f81741a.m27441c(), this.f81741a.m27440d(), this.f81743c.m32445b(), this.f81741a.m27442b());
        } else {
            xo0Var = this.f81741a;
        }
        this.f81742b.m27454a(xo0Var).onClick(view);
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.n21;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class db2 implements InterfaceC31672vn {
    @NotNull

    /* renamed from: a */
    private final View f78027a;

    public db2(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f78027a = view;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31672vn
    /* renamed from: a */
    public final void mo28252a(@NotNull xo0 link, @NotNull C31830xn clickListenerCreator) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        Context context = this.f78027a.getContext();
        View.OnClickListener m27454a = clickListenerCreator.m27454a(link);
        Intrinsics.m17074g(context);
        View$OnTouchListenerC31142pn view$OnTouchListenerC31142pn = new View$OnTouchListenerC31142pn(context, m27454a);
        int i = n21.f82581e;
        t31 t31Var = new t31(context, m27454a, view$OnTouchListenerC31142pn, n21.C30907a.m31692a());
        this.f78027a.setOnTouchListener(t31Var);
        this.f78027a.setOnClickListener(t31Var);
    }
}

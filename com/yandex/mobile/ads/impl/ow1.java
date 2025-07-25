package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ow1 implements View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final qw1 f83637a;
    @NotNull

    /* renamed from: b */
    private final r32 f83638b;

    public ow1(@NotNull qw1 socialAdInfo, @NotNull r32 urlViewerLauncher) {
        Intrinsics.checkNotNullParameter(socialAdInfo, "socialAdInfo");
        Intrinsics.checkNotNullParameter(urlViewerLauncher, "urlViewerLauncher");
        this.f83637a = socialAdInfo;
        this.f83638b = urlViewerLauncher;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Context context = v.getContext();
        String m30202a = this.f83637a.m30202a();
        r32 r32Var = this.f83638b;
        Intrinsics.m17074g(context);
        r32Var.m30157a(context, m30202a);
    }
}

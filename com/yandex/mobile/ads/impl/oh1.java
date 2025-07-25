package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.impl.be1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class oh1 implements xh1, we1 {
    @NotNull

    /* renamed from: a */
    private final xh1 f83521a;
    @NotNull

    /* renamed from: b */
    private be1 f83522b;
    @Nullable

    /* renamed from: c */
    private b90 f83523c;

    public oh1(@NotNull xh1 progressProvider) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        this.f83521a = progressProvider;
        this.f83522b = be1.C30015a.m35485a();
    }

    @Override // com.yandex.mobile.ads.impl.xh1
    @NotNull
    /* renamed from: a */
    public final be1 mo26294a() {
        xh1 xh1Var = this.f83523c;
        if (xh1Var == null) {
            xh1Var = this.f83521a;
        }
        be1 mo26294a = xh1Var.mo26294a();
        this.f83522b = mo26294a;
        return mo26294a;
    }

    @Override // com.yandex.mobile.ads.impl.we1
    /* renamed from: a */
    public final void mo27925a(@Nullable Player player) {
        this.f83523c = player == null ? new b90(this.f83522b) : null;
    }
}

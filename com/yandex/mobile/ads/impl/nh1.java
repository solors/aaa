package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import com.yandex.mobile.ads.impl.ce1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class nh1 implements wh1, ve1 {
    @NotNull

    /* renamed from: a */
    private final wh1 f82785a;
    @NotNull

    /* renamed from: b */
    private ce1 f82786b;
    @Nullable

    /* renamed from: c */
    private a90 f82787c;

    public nh1(@NotNull wh1 progressProvider) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        this.f82785a = progressProvider;
        this.f82786b = ce1.C30088a.m35240a();
    }

    @Override // com.yandex.mobile.ads.impl.wh1
    @NotNull
    /* renamed from: a */
    public final ce1 mo26975a() {
        wh1 wh1Var = this.f82787c;
        if (wh1Var == null) {
            wh1Var = this.f82785a;
        }
        ce1 mo26975a = wh1Var.mo26975a();
        this.f82786b = mo26975a;
        return mo26975a;
    }

    @Override // com.yandex.mobile.ads.impl.ve1
    /* renamed from: a */
    public final void mo28325a(@Nullable Player player) {
        this.f82787c = player == null ? new a90(this.f82786b) : null;
    }
}

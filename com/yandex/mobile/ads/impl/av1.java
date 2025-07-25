package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class av1 implements l72 {
    @NotNull

    /* renamed from: a */
    private final zu1 f76920a;
    @Nullable

    /* renamed from: b */
    private final x72 f76921b;

    /* renamed from: c */
    private boolean f76922c;

    public /* synthetic */ av1(ik0 ik0Var, kl0 kl0Var) {
        this(ik0Var, kl0Var, new zu1(ik0Var), kl0Var.m32499g());
    }

    @Override // com.yandex.mobile.ads.impl.l72
    /* renamed from: a */
    public final void mo26256a(long j, long j2) {
        x72 x72Var;
        if (!this.f76922c && (x72Var = this.f76921b) != null) {
            if (j2 >= x72Var.m27626a()) {
                this.f76920a.m25984a();
                this.f76922c = true;
                return;
            }
            this.f76920a.m25983a(this.f76921b.m27626a(), j2);
        }
    }

    public av1(@NotNull ik0 viewHolderManager, @NotNull kl0 instreamVideoAd, @NotNull zu1 skipCountDownConfigurator, @Nullable x72 x72Var) {
        Intrinsics.checkNotNullParameter(viewHolderManager, "viewHolderManager");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(skipCountDownConfigurator, "skipCountDownConfigurator");
        this.f76920a = skipCountDownConfigurator;
        this.f76921b = x72Var;
    }
}

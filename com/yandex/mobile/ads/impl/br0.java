package com.yandex.mobile.ads.impl;

import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class br0 implements ze1 {
    @NotNull

    /* renamed from: a */
    private final pj0 f77387a;
    @NotNull

    /* renamed from: b */
    private final C31920yr f77388b;

    public br0(@NotNull pj0 instreamAdPlayerController, @NotNull C31920yr instreamAdBreak) {
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        this.f77387a = instreamAdPlayerController;
        this.f77388b = instreamAdBreak;
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final float getVolume() {
        Object m17529r0;
        m17529r0 = _Collections.m17529r0(this.f77388b.m26628g());
        kl0 kl0Var = (kl0) m17529r0;
        if (kl0Var != null) {
            return this.f77387a.m30634c(kl0Var);
        }
        return 0.0f;
    }
}

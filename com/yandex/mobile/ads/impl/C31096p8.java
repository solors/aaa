package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.p8 */
/* loaded from: classes8.dex */
public final class C31096p8 {
    @NotNull

    /* renamed from: a */
    private EnumC31024o8 f83741a = EnumC31024o8.f83362b;

    @NotNull
    /* renamed from: a */
    public final synchronized EnumC31024o8 m30815a() {
        return this.f83741a;
    }

    /* renamed from: a */
    public final synchronized void m30814a(@NotNull EnumC31024o8 enumC31024o8) {
        Intrinsics.checkNotNullParameter(enumC31024o8, "<set-?>");
        this.f83741a = enumC31024o8;
    }
}

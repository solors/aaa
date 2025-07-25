package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class nh2 implements q52 {
    @NotNull

    /* renamed from: a */
    private final za1 f82788a;

    public nh2(@NotNull za1 omSdkUsageValidator) {
        Intrinsics.checkNotNullParameter(omSdkUsageValidator, "omSdkUsageValidator");
        this.f82788a = omSdkUsageValidator;
    }

    @Override // com.yandex.mobile.ads.impl.q52
    @Nullable
    /* renamed from: a */
    public final mh2 mo30464a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f82788a.m26292a(context)) {
            return new mh2(context);
        }
        return null;
    }
}

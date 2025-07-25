package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class qh2 implements s52 {
    @NotNull

    /* renamed from: a */
    private final za1 f84371a;

    public qh2(@NotNull za1 omSdkUsageValidator) {
        Intrinsics.checkNotNullParameter(omSdkUsageValidator, "omSdkUsageValidator");
        this.f84371a = omSdkUsageValidator;
    }

    @Override // com.yandex.mobile.ads.impl.s52
    @Nullable
    /* renamed from: a */
    public final ph2 mo29849a(@NotNull Context context, @NotNull j72 videoAdPosition, @Nullable x72 x72Var, @NotNull List verifications) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        Intrinsics.checkNotNullParameter(verifications, "verifications");
        if (this.f84371a.m26292a(context)) {
            return new ph2(context, videoAdPosition, x72Var, verifications, new qa2(context), new ab1(), new gh2(context).mo30597b());
        }
        return null;
    }
}

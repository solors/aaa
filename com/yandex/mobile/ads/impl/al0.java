package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class al0 {
    @NotNull

    /* renamed from: a */
    private final C30761l0 f76823a;

    public al0(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull C30746kt creative, @NotNull C30359g3 adConfiguration) {
        FalseClick falseClick;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        C29946a c29946a = new C29946a();
        C30972nt m32444c = creative.m32444c();
        if (m32444c != null) {
            falseClick = m32444c.m31317a();
        } else {
            falseClick = null;
        }
        this.f76823a = new C30761l0(context, adConfiguration, null, c29946a, falseClick);
    }

    /* renamed from: a */
    public final void m35836a() {
        this.f76823a.m32386e();
    }

    /* renamed from: com.yandex.mobile.ads.impl.al0$a */
    /* loaded from: classes8.dex */
    private static final class C29946a implements InterfaceC30896n0 {
        @Override // com.yandex.mobile.ads.impl.InterfaceC30896n0
        public final void onReturnedToApplication() {
        }
    }
}

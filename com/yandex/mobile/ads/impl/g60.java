package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g60 {
    @NotNull

    /* renamed from: a */
    private final FalseClick f79529a;
    @NotNull

    /* renamed from: b */
    private final C30710k9 f79530b;

    public /* synthetic */ g60(Context context, C30359g3 c30359g3, FalseClick falseClick) {
        this(context, c30359g3, falseClick, new C30710k9(context, c30359g3));
    }

    /* renamed from: a */
    public final void m33915a(long j) {
        if (j <= this.f79529a.m44529c()) {
            this.f79530b.m32625a(this.f79529a.m44528d());
        }
    }

    public g60(@NotNull Context context, @NotNull C30359g3 adConfiguration, @NotNull FalseClick falseClick, @NotNull C30710k9 adTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(falseClick, "falseClick");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        this.f79529a = falseClick;
        this.f79530b = adTracker;
    }
}

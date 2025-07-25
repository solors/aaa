package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o */
/* loaded from: classes7.dex */
public final class C25040o {
    @NotNull

    /* renamed from: a */
    public final String f64937a;
    @NotNull

    /* renamed from: b */
    public final List<String> f64938b;

    public C25040o(@NotNull String clickThroughUrl, @NotNull List<String> clickTrackingUrlList) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTrackingUrlList, "clickTrackingUrlList");
        this.f64937a = clickThroughUrl;
        this.f64938b = clickTrackingUrlList;
    }

    @NotNull
    /* renamed from: a */
    public final String m45241a() {
        return this.f64937a;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m45240b() {
        return this.f64938b;
    }
}

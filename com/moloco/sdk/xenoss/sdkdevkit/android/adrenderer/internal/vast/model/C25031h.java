package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h */
/* loaded from: classes7.dex */
public final class C25031h {
    @NotNull

    /* renamed from: a */
    public final String f64914a;
    @NotNull

    /* renamed from: b */
    public final List<String> f64915b;

    public C25031h(@NotNull String clickThroughUrl, @NotNull List<String> clickTrackingUrls) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
        this.f64914a = clickThroughUrl;
        this.f64915b = clickTrackingUrls;
    }

    @NotNull
    /* renamed from: a */
    public final String m45258a() {
        return this.f64914a;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m45257b() {
        return this.f64915b;
    }
}

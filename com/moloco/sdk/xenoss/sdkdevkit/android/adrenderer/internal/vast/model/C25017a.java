package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a */
/* loaded from: classes7.dex */
public final class C25017a {
    @Nullable

    /* renamed from: a */
    public final C25023b0 f64882a;
    @NotNull

    /* renamed from: b */
    public final List<C25023b0> f64883b;
    @NotNull

    /* renamed from: c */
    public final List<C25023b0> f64884c;

    public C25017a(@Nullable C25023b0 c25023b0, @NotNull List<C25023b0> clickTrackingList, @NotNull List<C25023b0> customClickList) {
        Intrinsics.checkNotNullParameter(clickTrackingList, "clickTrackingList");
        Intrinsics.checkNotNullParameter(customClickList, "customClickList");
        this.f64882a = c25023b0;
        this.f64883b = clickTrackingList;
        this.f64884c = customClickList;
    }

    @Nullable
    /* renamed from: a */
    public final C25023b0 m45280a() {
        return this.f64882a;
    }

    @NotNull
    /* renamed from: b */
    public final List<C25023b0> m45279b() {
        return this.f64883b;
    }

    @NotNull
    /* renamed from: c */
    public final List<C25023b0> m45278c() {
        return this.f64884c;
    }
}

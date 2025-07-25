package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b */
/* loaded from: classes7.dex */
public final class C25022b {
    @Nullable

    /* renamed from: a */
    public final String f64888a;
    @Nullable

    /* renamed from: b */
    public final Integer f64889b;
    @NotNull

    /* renamed from: c */
    public final AbstractC25024c f64890c;

    public C25022b(@Nullable String str, @Nullable Integer num, @NotNull AbstractC25024c child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f64888a = str;
        this.f64889b = num;
        this.f64890c = child;
    }

    @NotNull
    /* renamed from: a */
    public final AbstractC25024c m45274a() {
        return this.f64890c;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m45273b() {
        return this.f64889b;
    }
}

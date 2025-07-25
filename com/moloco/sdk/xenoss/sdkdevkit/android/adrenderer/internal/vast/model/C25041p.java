package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p */
/* loaded from: classes7.dex */
public final class C25041p {
    @Nullable

    /* renamed from: a */
    public final String f64939a;
    @NotNull

    /* renamed from: b */
    public final String f64940b;

    public C25041p(@Nullable String str, @NotNull String impressionUrl) {
        Intrinsics.checkNotNullParameter(impressionUrl, "impressionUrl");
        this.f64939a = str;
        this.f64940b = impressionUrl;
    }

    @NotNull
    /* renamed from: a */
    public final String m45239a() {
        return this.f64940b;
    }
}

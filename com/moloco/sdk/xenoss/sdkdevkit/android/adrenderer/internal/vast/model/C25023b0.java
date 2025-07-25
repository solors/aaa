package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 */
/* loaded from: classes7.dex */
public final class C25023b0 {
    @Nullable

    /* renamed from: a */
    public final String f64891a;
    @NotNull

    /* renamed from: b */
    public final String f64892b;

    public C25023b0(@Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f64891a = str;
        this.f64892b = url;
    }

    @NotNull
    /* renamed from: a */
    public final String m45272a() {
        return this.f64892b;
    }
}

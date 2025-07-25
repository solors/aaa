package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y */
/* loaded from: classes7.dex */
public final class C25052y {
    @NotNull

    /* renamed from: a */
    public final List<C25022b> f64992a;
    @Nullable

    /* renamed from: b */
    public final String f64993b;
    @Nullable

    /* renamed from: c */
    public final String f64994c;

    public C25052y(@NotNull List<C25022b> ads, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        this.f64992a = ads;
        this.f64993b = str;
        this.f64994c = str2;
    }

    @NotNull
    /* renamed from: a */
    public final List<C25022b> m45212a() {
        return this.f64992a;
    }

    @Nullable
    /* renamed from: b */
    public final String m45211b() {
        return this.f64993b;
    }
}

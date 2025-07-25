package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v */
/* loaded from: classes7.dex */
public final class C25049v {
    @NotNull

    /* renamed from: a */
    public final String f64972a;
    @NotNull

    /* renamed from: b */
    public final EnumC25036k f64973b;

    public C25049v(@NotNull String resource, @NotNull EnumC25036k creativeType) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        this.f64972a = resource;
        this.f64973b = creativeType;
    }

    @NotNull
    /* renamed from: a */
    public final EnumC25036k m45218a() {
        return this.f64973b;
    }

    @NotNull
    /* renamed from: b */
    public final String m45217b() {
        return this.f64972a;
    }
}

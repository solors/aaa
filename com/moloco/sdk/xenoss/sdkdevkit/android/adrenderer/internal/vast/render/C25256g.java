package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC25045t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g */
/* loaded from: classes7.dex */
public final class C25256g {
    @NotNull

    /* renamed from: a */
    public final String f65578a;
    @NotNull

    /* renamed from: b */
    public final AbstractC25045t f65579b;

    public C25256g(@NotNull String url, @NotNull AbstractC25045t offset) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f65578a = url;
        this.f65579b = offset;
    }

    @NotNull
    /* renamed from: a */
    public final AbstractC25045t m44897a() {
        return this.f65579b;
    }

    @NotNull
    /* renamed from: b */
    public final String m44896b() {
        return this.f65578a;
    }
}

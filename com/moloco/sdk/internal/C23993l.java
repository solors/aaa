package com.moloco.sdk.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.internal.l */
/* loaded from: classes7.dex */
public final class C23993l {
    @NotNull

    /* renamed from: a */
    public final String f62072a;

    /* renamed from: b */
    public final int f62073b;

    public C23993l(@NotNull String description, int i) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f62072a = description;
        this.f62073b = i;
    }

    @NotNull
    /* renamed from: a */
    public final String m47233a() {
        return this.f62072a;
    }

    /* renamed from: b */
    public final int m47232b() {
        return this.f62073b;
    }
}

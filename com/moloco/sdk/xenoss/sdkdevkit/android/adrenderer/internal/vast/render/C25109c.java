package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC25018a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c */
/* loaded from: classes7.dex */
public final class C25109c {
    @NotNull

    /* renamed from: a */
    public final AbstractC25018a0 f65121a;

    /* renamed from: b */
    public final int f65122b;

    /* renamed from: c */
    public final int f65123c;
    @Nullable

    /* renamed from: d */
    public final String f65124d;
    @NotNull

    /* renamed from: e */
    public final List<String> f65125e;
    @NotNull

    /* renamed from: f */
    public final List<String> f65126f;

    public C25109c(@NotNull AbstractC25018a0 resource, int i, int i2, @Nullable String str, @NotNull List<String> clickTracking, @NotNull List<String> creativeViewTracking) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(creativeViewTracking, "creativeViewTracking");
        this.f65121a = resource;
        this.f65122b = i;
        this.f65123c = i2;
        this.f65124d = str;
        this.f65125e = clickTracking;
        this.f65126f = creativeViewTracking;
    }

    @Nullable
    /* renamed from: a */
    public final String m45129a() {
        return this.f65124d;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m45128b() {
        return this.f65125e;
    }

    @NotNull
    /* renamed from: c */
    public final List<String> m45127c() {
        return this.f65126f;
    }

    /* renamed from: d */
    public final int m45126d() {
        return this.f65123c;
    }

    @NotNull
    /* renamed from: e */
    public final AbstractC25018a0 m45125e() {
        return this.f65121a;
    }

    /* renamed from: f */
    public final int m45124f() {
        return this.f65122b;
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC25018a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC25045t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e */
/* loaded from: classes7.dex */
public final class C25254e {
    @NotNull

    /* renamed from: a */
    public final AbstractC25018a0 f65563a;

    /* renamed from: b */
    public final int f65564b;

    /* renamed from: c */
    public final int f65565c;
    @Nullable

    /* renamed from: d */
    public final String f65566d;
    @NotNull

    /* renamed from: e */
    public final List<String> f65567e;
    @NotNull

    /* renamed from: f */
    public final List<String> f65568f;
    @Nullable

    /* renamed from: g */
    public final Long f65569g;
    @Nullable

    /* renamed from: h */
    public final AbstractC25045t f65570h;

    public C25254e(@NotNull AbstractC25018a0 resource, int i, int i2, @Nullable String str, @NotNull List<String> clickTracking, @NotNull List<String> viewTracking, @Nullable Long l, @Nullable AbstractC25045t abstractC25045t) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(viewTracking, "viewTracking");
        this.f65563a = resource;
        this.f65564b = i;
        this.f65565c = i2;
        this.f65566d = str;
        this.f65567e = clickTracking;
        this.f65568f = viewTracking;
        this.f65569g = l;
        this.f65570h = abstractC25045t;
    }

    @Nullable
    /* renamed from: a */
    public final String m44914a() {
        return this.f65566d;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m44913b() {
        return this.f65567e;
    }

    @Nullable
    /* renamed from: c */
    public final Long m44912c() {
        return this.f65569g;
    }

    /* renamed from: d */
    public final int m44911d() {
        return this.f65565c;
    }

    @Nullable
    /* renamed from: e */
    public final AbstractC25045t m44910e() {
        return this.f65570h;
    }

    @NotNull
    /* renamed from: f */
    public final AbstractC25018a0 m44909f() {
        return this.f65563a;
    }

    @NotNull
    /* renamed from: g */
    public final List<String> m44908g() {
        return this.f65568f;
    }

    /* renamed from: h */
    public final int m44907h() {
        return this.f65564b;
    }
}

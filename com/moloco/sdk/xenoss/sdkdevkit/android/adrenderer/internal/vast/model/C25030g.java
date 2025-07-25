package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g */
/* loaded from: classes7.dex */
public final class C25030g {
    @Nullable

    /* renamed from: a */
    public final String f64905a;
    @Nullable

    /* renamed from: b */
    public final Integer f64906b;
    @Nullable

    /* renamed from: c */
    public final Integer f64907c;
    @Nullable

    /* renamed from: d */
    public final String f64908d;
    @Nullable

    /* renamed from: e */
    public final String f64909e;
    @Nullable

    /* renamed from: f */
    public final C25031h f64910f;
    @Nullable

    /* renamed from: g */
    public final C25028e f64911g;
    @NotNull

    /* renamed from: h */
    public final List<C25050w> f64912h;
    @NotNull

    /* renamed from: i */
    public final List<AbstractC25018a0> f64913i;

    /* JADX WARN: Multi-variable type inference failed */
    public C25030g(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable C25031h c25031h, @Nullable C25028e c25028e, @NotNull List<C25050w> creativeViewTrackingList, @NotNull List<? extends AbstractC25018a0> resources) {
        Intrinsics.checkNotNullParameter(creativeViewTrackingList, "creativeViewTrackingList");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f64905a = str;
        this.f64906b = num;
        this.f64907c = num2;
        this.f64908d = str2;
        this.f64909e = str3;
        this.f64910f = c25031h;
        this.f64911g = c25028e;
        this.f64912h = creativeViewTrackingList;
        this.f64913i = resources;
    }

    @Nullable
    /* renamed from: a */
    public final String m45264a() {
        return this.f64909e;
    }

    @Nullable
    /* renamed from: b */
    public final C25031h m45263b() {
        return this.f64910f;
    }

    @NotNull
    /* renamed from: c */
    public final List<C25050w> m45262c() {
        return this.f64912h;
    }

    @Nullable
    /* renamed from: d */
    public final Integer m45261d() {
        return this.f64907c;
    }

    @NotNull
    /* renamed from: e */
    public final List<AbstractC25018a0> m45260e() {
        return this.f64913i;
    }

    @Nullable
    /* renamed from: f */
    public final Integer m45259f() {
        return this.f64906b;
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n */
/* loaded from: classes7.dex */
public final class C25039n {
    @Nullable

    /* renamed from: a */
    public final String f64928a;
    @Nullable

    /* renamed from: b */
    public final Integer f64929b;
    @Nullable

    /* renamed from: c */
    public final Integer f64930c;
    @Nullable

    /* renamed from: d */
    public final String f64931d;
    @Nullable

    /* renamed from: e */
    public final AbstractC25045t f64932e;
    @Nullable

    /* renamed from: f */
    public final Long f64933f;
    @Nullable

    /* renamed from: g */
    public final C25040o f64934g;
    @NotNull

    /* renamed from: h */
    public final List<String> f64935h;
    @NotNull

    /* renamed from: i */
    public final AbstractC25018a0 f64936i;

    public C25039n(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable AbstractC25045t abstractC25045t, @Nullable Long l, @Nullable C25040o c25040o, @NotNull List<String> viewTrackingUrlList, @NotNull AbstractC25018a0 resource) {
        Intrinsics.checkNotNullParameter(viewTrackingUrlList, "viewTrackingUrlList");
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.f64928a = str;
        this.f64929b = num;
        this.f64930c = num2;
        this.f64931d = str2;
        this.f64932e = abstractC25045t;
        this.f64933f = l;
        this.f64934g = c25040o;
        this.f64935h = viewTrackingUrlList;
        this.f64936i = resource;
    }

    @Nullable
    /* renamed from: a */
    public final String m45249a() {
        return this.f64931d;
    }

    @Nullable
    /* renamed from: b */
    public final C25040o m45248b() {
        return this.f64934g;
    }

    @Nullable
    /* renamed from: c */
    public final Long m45247c() {
        return this.f64933f;
    }

    @Nullable
    /* renamed from: d */
    public final Integer m45246d() {
        return this.f64930c;
    }

    @Nullable
    /* renamed from: e */
    public final AbstractC25045t m45245e() {
        return this.f64932e;
    }

    @NotNull
    /* renamed from: f */
    public final AbstractC25018a0 m45244f() {
        return this.f64936i;
    }

    @NotNull
    /* renamed from: g */
    public final List<String> m45243g() {
        return this.f64935h;
    }

    @Nullable
    /* renamed from: h */
    public final Integer m45242h() {
        return this.f64929b;
    }
}

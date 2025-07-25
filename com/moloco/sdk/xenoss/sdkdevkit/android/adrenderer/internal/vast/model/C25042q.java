package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q */
/* loaded from: classes7.dex */
public final class C25042q {
    @Nullable

    /* renamed from: a */
    public final C25029f f64941a;
    @Nullable

    /* renamed from: b */
    public final String f64942b;
    @Nullable

    /* renamed from: c */
    public final String f64943c;
    @Nullable

    /* renamed from: d */
    public final String f64944d;
    @Nullable

    /* renamed from: e */
    public final C25048u f64945e;
    @NotNull

    /* renamed from: f */
    public final List<C25041p> f64946f;
    @NotNull

    /* renamed from: g */
    public final List<String> f64947g;
    @NotNull

    /* renamed from: h */
    public final List<C25032i> f64948h;

    public C25042q(@Nullable C25029f c25029f, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable C25048u c25048u, @NotNull List<C25041p> impressions, @NotNull List<String> errorUrls, @NotNull List<C25032i> creatives) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        this.f64941a = c25029f;
        this.f64942b = str;
        this.f64943c = str2;
        this.f64944d = str3;
        this.f64945e = c25048u;
        this.f64946f = impressions;
        this.f64947g = errorUrls;
        this.f64948h = creatives;
    }

    @NotNull
    /* renamed from: a */
    public final List<C25032i> m45238a() {
        return this.f64948h;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m45237b() {
        return this.f64947g;
    }

    @NotNull
    /* renamed from: c */
    public final List<C25041p> m45236c() {
        return this.f64946f;
    }
}

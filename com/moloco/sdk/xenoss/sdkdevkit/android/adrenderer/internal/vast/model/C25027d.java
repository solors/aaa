package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d */
/* loaded from: classes7.dex */
public final class C25027d {
    @NotNull

    /* renamed from: a */
    public final String f64895a;
    @Nullable

    /* renamed from: b */
    public final Boolean f64896b;
    @Nullable

    /* renamed from: c */
    public final C25029f f64897c;
    @NotNull

    /* renamed from: d */
    public final List<C25041p> f64898d;
    @NotNull

    /* renamed from: e */
    public final List<String> f64899e;
    @NotNull

    /* renamed from: f */
    public final List<C25032i> f64900f;

    public C25027d(@NotNull String vastAdTagUrl, @Nullable Boolean bool, @Nullable C25029f c25029f, @NotNull List<C25041p> impressions, @NotNull List<String> errorUrls, @NotNull List<C25032i> creatives) {
        Intrinsics.checkNotNullParameter(vastAdTagUrl, "vastAdTagUrl");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        this.f64895a = vastAdTagUrl;
        this.f64896b = bool;
        this.f64897c = c25029f;
        this.f64898d = impressions;
        this.f64899e = errorUrls;
        this.f64900f = creatives;
    }

    @NotNull
    /* renamed from: a */
    public final List<C25032i> m45269a() {
        return this.f64900f;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m45268b() {
        return this.f64899e;
    }

    @Nullable
    /* renamed from: c */
    public final Boolean m45267c() {
        return this.f64896b;
    }

    @NotNull
    /* renamed from: d */
    public final List<C25041p> m45266d() {
        return this.f64898d;
    }

    @NotNull
    /* renamed from: e */
    public final String m45265e() {
        return this.f64895a;
    }
}

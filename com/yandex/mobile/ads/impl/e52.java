package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class e52 {
    @NotNull

    /* renamed from: a */
    private final z52 f78457a;
    @NotNull

    /* renamed from: b */
    private final C30746kt f78458b;
    @NotNull

    /* renamed from: c */
    private final et0 f78459c;
    @Nullable

    /* renamed from: d */
    private final qw1 f78460d;
    @Nullable

    /* renamed from: e */
    private final String f78461e;
    @Nullable

    /* renamed from: f */
    private final JSONObject f78462f;
    @Nullable

    /* renamed from: g */
    private final C30777l9 f78463g;

    public e52(@NotNull z52 videoAd, @NotNull C30746kt creative, @NotNull et0 mediaFile, @Nullable qw1 qw1Var, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable C30777l9 c30777l9) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        this.f78457a = videoAd;
        this.f78458b = creative;
        this.f78459c = mediaFile;
        this.f78460d = qw1Var;
        this.f78461e = str;
        this.f78462f = jSONObject;
        this.f78463g = c30777l9;
    }

    @Nullable
    /* renamed from: a */
    public final C30777l9 m34663a() {
        return this.f78463g;
    }

    @NotNull
    /* renamed from: b */
    public final C30746kt m34662b() {
        return this.f78458b;
    }

    @NotNull
    /* renamed from: c */
    public final et0 m34661c() {
        return this.f78459c;
    }

    @Nullable
    /* renamed from: d */
    public final qw1 m34660d() {
        return this.f78460d;
    }

    @NotNull
    /* renamed from: e */
    public final z52 m34659e() {
        return this.f78457a;
    }

    @Nullable
    /* renamed from: f */
    public final String m34658f() {
        return this.f78461e;
    }

    @Nullable
    /* renamed from: g */
    public final JSONObject m34657g() {
        return this.f78462f;
    }
}

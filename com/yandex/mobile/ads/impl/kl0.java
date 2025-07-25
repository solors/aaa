package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class kl0 {
    @NotNull

    /* renamed from: a */
    private final String f81467a;
    @NotNull

    /* renamed from: b */
    private final cl0 f81468b;
    @NotNull

    /* renamed from: c */
    private final List<cl0> f81469c;
    @NotNull

    /* renamed from: d */
    private final i72 f81470d;
    @Nullable

    /* renamed from: e */
    private final x72 f81471e;
    @NotNull

    /* renamed from: f */
    private final ij0 f81472f;
    @Nullable

    /* renamed from: g */
    private final JSONObject f81473g;

    /* renamed from: h */
    private final long f81474h;

    public kl0(@NotNull String videoAdId, @NotNull cl0 recommendedMediaFile, @NotNull ArrayList mediaFiles, @NotNull i72 adPodInfo, @Nullable x72 x72Var, @NotNull ij0 adInfo, @Nullable JSONObject jSONObject, long j) {
        Intrinsics.checkNotNullParameter(videoAdId, "videoAdId");
        Intrinsics.checkNotNullParameter(recommendedMediaFile, "recommendedMediaFile");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f81467a = videoAdId;
        this.f81468b = recommendedMediaFile;
        this.f81469c = mediaFiles;
        this.f81470d = adPodInfo;
        this.f81471e = x72Var;
        this.f81472f = adInfo;
        this.f81473g = jSONObject;
        this.f81474h = j;
    }

    @NotNull
    /* renamed from: a */
    public final ij0 m32505a() {
        return this.f81472f;
    }

    @NotNull
    /* renamed from: b */
    public final i72 m32504b() {
        return this.f81470d;
    }

    /* renamed from: c */
    public final long m32503c() {
        return this.f81474h;
    }

    @Nullable
    /* renamed from: d */
    public final JSONObject m32502d() {
        return this.f81473g;
    }

    @NotNull
    /* renamed from: e */
    public final List<cl0> m32501e() {
        return this.f81469c;
    }

    @NotNull
    /* renamed from: f */
    public final cl0 m32500f() {
        return this.f81468b;
    }

    @Nullable
    /* renamed from: g */
    public final x72 m32499g() {
        return this.f81471e;
    }

    @NotNull
    public final String toString() {
        return this.f81467a;
    }
}

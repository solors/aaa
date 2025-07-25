package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class m62<T> {
    @NotNull

    /* renamed from: a */
    private final C30746kt f82061a;
    @NotNull

    /* renamed from: b */
    private final z52 f82062b;
    @NotNull

    /* renamed from: c */
    private final et0 f82063c;

    /* renamed from: d */
    private final T f82064d;
    @Nullable

    /* renamed from: e */
    private final qw1 f82065e;
    @NotNull

    /* renamed from: f */
    private final String f82066f;
    @Nullable

    /* renamed from: g */
    private final C30777l9 f82067g;

    /* JADX WARN: Multi-variable type inference failed */
    public m62(@NotNull C30746kt creative, @NotNull z52 vastVideoAd, @NotNull et0 mediaFile, Object obj, @Nullable qw1 qw1Var, @NotNull String preloadRequestId, @Nullable C30777l9 c30777l9) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(vastVideoAd, "vastVideoAd");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(preloadRequestId, "preloadRequestId");
        this.f82061a = creative;
        this.f82062b = vastVideoAd;
        this.f82063c = mediaFile;
        this.f82064d = obj;
        this.f82065e = qw1Var;
        this.f82066f = preloadRequestId;
        this.f82067g = c30777l9;
    }

    @Nullable
    /* renamed from: a */
    public final C30777l9 m32088a() {
        return this.f82067g;
    }

    @NotNull
    /* renamed from: b */
    public final C30746kt m32087b() {
        return this.f82061a;
    }

    @NotNull
    /* renamed from: c */
    public final et0 m32086c() {
        return this.f82063c;
    }

    /* renamed from: d */
    public final T m32085d() {
        return this.f82064d;
    }

    @NotNull
    /* renamed from: e */
    public final String m32084e() {
        return this.f82066f;
    }

    @Nullable
    /* renamed from: f */
    public final qw1 m32083f() {
        return this.f82065e;
    }

    @NotNull
    /* renamed from: g */
    public final z52 m32082g() {
        return this.f82062b;
    }
}

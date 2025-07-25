package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f9 */
/* loaded from: classes8.dex */
public final class C30300f9 {
    @Nullable

    /* renamed from: a */
    private af1 f79013a;
    @NotNull

    /* renamed from: b */
    private final LinkedHashMap f79014b = new LinkedHashMap();

    public C30300f9(@Nullable af1 af1Var) {
        this.f79013a = af1Var;
    }

    /* renamed from: a */
    public final void m34198a() {
        this.f79014b.clear();
    }

    /* renamed from: b */
    public final boolean m34194b() {
        Collection values = this.f79014b.values();
        if (!values.contains(bk0.f77337d) && !values.contains(bk0.f77338e)) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: c */
    public final af1 m34193c() {
        return this.f79013a;
    }

    @NotNull
    /* renamed from: a */
    public final bk0 m34196a(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        bk0 bk0Var = (bk0) this.f79014b.get(videoAd);
        return bk0Var == null ? bk0.f77335b : bk0Var;
    }

    /* renamed from: a */
    public final void m34195a(@NotNull kl0 videoAd, @NotNull bk0 instreamAdStatus) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(instreamAdStatus, "instreamAdStatus");
        this.f79014b.put(videoAd, instreamAdStatus);
    }

    /* renamed from: a */
    public final void m34197a(@Nullable af1 af1Var) {
        this.f79013a = af1Var;
    }
}

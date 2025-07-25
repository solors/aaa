package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class uu0 {
    @NotNull

    /* renamed from: a */
    private final WeakHashMap<e21, Object> f86413a = new WeakHashMap<>();

    /* renamed from: a */
    public final void m28632a(@NotNull e21 nativeAdEventController) {
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        this.f86413a.put(nativeAdEventController, null);
    }

    /* renamed from: b */
    public final void m28631b() {
        for (e21 e21Var : this.f86413a.keySet()) {
            e21Var.m34697c();
        }
    }

    /* renamed from: c */
    public final void m28630c() {
        for (e21 e21Var : this.f86413a.keySet()) {
            e21Var.m34696d();
        }
    }

    /* renamed from: d */
    public final void m28629d() {
        for (e21 e21Var : this.f86413a.keySet()) {
            e21Var.m34695e();
        }
    }

    /* renamed from: a */
    public final void m28634a() {
        for (e21 e21Var : this.f86413a.keySet()) {
            e21Var.m34698b();
        }
    }

    /* renamed from: a */
    public final void m28633a(@Nullable AdImpressionData adImpressionData) {
        for (e21 e21Var : this.f86413a.keySet()) {
            e21Var.mo28775a(adImpressionData);
        }
    }
}

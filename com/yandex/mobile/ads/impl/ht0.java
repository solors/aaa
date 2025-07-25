package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ht0 {
    @NotNull

    /* renamed from: a */
    private final ft0 f80178a;
    @NotNull

    /* renamed from: b */
    private final C31755wk f80179b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ht0(android.content.Context r3) {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.zj1 r0 = new com.yandex.mobile.ads.impl.zj1
            r0.<init>(r3)
            com.yandex.mobile.ads.impl.ft0 r0 = r0.m26147a()
            com.yandex.mobile.ads.impl.wk r1 = new com.yandex.mobile.ads.impl.wk
            r1.<init>(r0)
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ht0.<init>(android.content.Context):void");
    }

    @Nullable
    /* renamed from: a */
    public final et0 m33468a(@NotNull C30746kt creative) {
        double d;
        int max;
        double abs;
        Intrinsics.checkNotNullParameter(creative, "creative");
        double d2 = -1.0d;
        et0 et0Var = null;
        for (et0 et0Var2 : creative.m32440g()) {
            if (Intrinsics.m17075f("video/mp4", et0Var2.m34446e())) {
                d = 1.5d;
            } else {
                d = 1.0d;
            }
            int m27878a = this.f80179b.m27878a(et0Var2);
            int m34083a = this.f80178a.m34083a();
            if (((int) Math.max(0.0d, m27878a)) < 100) {
                abs = 10.0d;
            } else {
                abs = ((int) Math.abs(m34083a - max)) / m34083a;
            }
            double d3 = d / (abs + 1.0d);
            if (d3 > d2) {
                et0Var = et0Var2;
                d2 = d3;
            }
        }
        return et0Var;
    }

    public ht0(@NotNull Context context, @NotNull ft0 referenceMediaFileInfo, @NotNull C31755wk bitrateProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(referenceMediaFileInfo, "referenceMediaFileInfo");
        Intrinsics.checkNotNullParameter(bitrateProvider, "bitrateProvider");
        this.f80178a = referenceMediaFileInfo;
        this.f80179b = bitrateProvider;
    }
}

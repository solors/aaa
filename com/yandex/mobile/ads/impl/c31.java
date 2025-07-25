package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class c31 {
    @NotNull

    /* renamed from: a */
    private final j82 f77488a;
    @NotNull

    /* renamed from: b */
    private final h01 f77489b;

    public /* synthetic */ c31() {
        this(new j82(), new h01());
    }

    @Nullable
    /* renamed from: a */
    public final C31062os m35369a(@Nullable eu0 eu0Var) {
        C31062os c31062os;
        float f;
        if (eu0Var != null) {
            y52 m34429c = eu0Var.m34429c();
            List<bh0> m34431a = eu0Var.m34431a();
            xr0 m34430b = eu0Var.m34430b();
            if (m34429c != null) {
                j82 j82Var = this.f77488a;
                m62<u71> videoAdInfo = m34429c.m27026b();
                j82Var.getClass();
                Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
                u71 m32085d = videoAdInfo.m32085d();
                if (m32085d.getAdHeight() != 0) {
                    f = m32085d.getAdWidth() / m32085d.getAdHeight();
                } else {
                    f = 1.7777778f;
                }
                return new C31062os(f);
            }
            if (m34431a != null && m34431a.size() > 1) {
                this.f77489b.getClass();
                c31062os = new C31062os((float) h01.m33743a(m34431a));
            } else if (m34430b != null) {
                c31062os = new C31062os(m34430b.m27422a());
            }
            return c31062os;
        }
        return null;
    }

    public c31(@NotNull j82 aspectRatioProvider, @NotNull h01 multiBannerRatioProvider) {
        Intrinsics.checkNotNullParameter(aspectRatioProvider, "aspectRatioProvider");
        Intrinsics.checkNotNullParameter(multiBannerRatioProvider, "multiBannerRatioProvider");
        this.f77488a = aspectRatioProvider;
        this.f77489b = multiBannerRatioProvider;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ue2 {
    @NotNull

    /* renamed from: a */
    private final ze2 f86241a;
    @NotNull

    /* renamed from: b */
    private final g82 f86242b;
    @NotNull

    /* renamed from: c */
    private final pe2 f86243c;

    public /* synthetic */ ue2(Context context, z52 z52Var) {
        this(context, z52Var, new ze2(z52Var), new g82(), new pe2(context, z52Var));
    }

    @NotNull
    /* renamed from: a */
    public final List<z52> m28799a(@NotNull List<z52> videoAds) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        xe2 m26249a = this.f86241a.m26249a();
        if (m26249a != null) {
            if (!m26249a.m27543a()) {
                this.f86242b.getClass();
                videoAds = g82.m33910a(videoAds).m34200a();
            }
            if (!m26249a.m27542b()) {
                videoAds = _Collections.m17559T0(videoAds, 1);
            }
            return this.f86243c.m30685a(videoAds);
        }
        return videoAds;
    }

    public ue2(@NotNull Context context, @NotNull z52 wrapperAd, @NotNull ze2 wrapperConfigurationProvider, @NotNull g82 wrappersProviderFactory, @NotNull pe2 wrappedVideoAdCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(wrapperConfigurationProvider, "wrapperConfigurationProvider");
        Intrinsics.checkNotNullParameter(wrappersProviderFactory, "wrappersProviderFactory");
        Intrinsics.checkNotNullParameter(wrappedVideoAdCreator, "wrappedVideoAdCreator");
        this.f86241a = wrapperConfigurationProvider;
        this.f86242b = wrappersProviderFactory;
        this.f86243c = wrappedVideoAdCreator;
    }
}

package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class y01 implements ThreadFactory {
    @NotNull

    /* renamed from: b */
    private static final String f87978b = "YandexAds.UrlTracker";
    @NotNull

    /* renamed from: c */
    public static final String f87979c = "YandexAds.BaseController";
    @NotNull

    /* renamed from: d */
    public static final String f87980d = "YandexAds.AdvertisingId";
    @NotNull

    /* renamed from: a */
    private final String f87981a;

    public y01(@NotNull String threadName) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        this.f87981a = threadName;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public final Thread newThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return new Thread(runnable, this.f87981a);
    }
}

package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h21 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31256r4 f79852a;
    @NotNull

    /* renamed from: b */
    private final f21 f79853b;
    @NotNull

    /* renamed from: c */
    private final o81 f79854c;
    @NotNull

    /* renamed from: d */
    private final ju0 f79855d;
    @NotNull

    /* renamed from: e */
    private final m12 f79856e;

    public h21(@NotNull InterfaceC31256r4 adInfoReportDataProviderFactory, @NotNull f21 eventControllerFactory, @NotNull o81 nativeViewRendererFactory, @NotNull ju0 mediaViewAdapterFactory, @NotNull m12 trackingManagerFactory) {
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(eventControllerFactory, "eventControllerFactory");
        Intrinsics.checkNotNullParameter(nativeViewRendererFactory, "nativeViewRendererFactory");
        Intrinsics.checkNotNullParameter(mediaViewAdapterFactory, "mediaViewAdapterFactory");
        Intrinsics.checkNotNullParameter(trackingManagerFactory, "trackingManagerFactory");
        this.f79852a = adInfoReportDataProviderFactory;
        this.f79853b = eventControllerFactory;
        this.f79854c = nativeViewRendererFactory;
        this.f79855d = mediaViewAdapterFactory;
        this.f79856e = trackingManagerFactory;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC31256r4 m33720a() {
        return this.f79852a;
    }

    @NotNull
    /* renamed from: b */
    public final f21 m33719b() {
        return this.f79853b;
    }

    @NotNull
    /* renamed from: c */
    public final ju0 m33718c() {
        return this.f79855d;
    }

    @NotNull
    /* renamed from: d */
    public final o81 m33717d() {
        return this.f79854c;
    }

    @NotNull
    /* renamed from: e */
    public final m12 m33716e() {
        return this.f79856e;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p71 {
    @NotNull

    /* renamed from: a */
    private final C31539ty f83734a;
    @NotNull

    /* renamed from: b */
    private final w80 f83735b;

    public /* synthetic */ p71(Context context, C31952z4 c31952z4) {
        this(context, c31952z4, new C31539ty(context, c31952z4), new w80(context, c31952z4));
    }

    /* renamed from: a */
    public final void m30824a() {
        this.f83734a.m28943a();
        this.f83735b.m28012a();
    }

    /* renamed from: a */
    public final void m30823a(@NotNull Context context, @NotNull l11 nativeAdBlock, @NotNull c92 videoLoadListener, @NotNull C31612uu debugEventsReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        C30149d8<?> m32374b = nativeAdBlock.m32374b();
        if (m32374b.m35072P()) {
            boolean m32668a = k60.m32668a(context, j60.f80761c);
            if (Intrinsics.m17075f(w71.f87136c.m28017a(), m32374b.m35084D()) && m32668a) {
                this.f83735b.m28011a(nativeAdBlock, videoLoadListener, debugEventsReporter);
                return;
            } else {
                this.f83734a.m28942a(nativeAdBlock, videoLoadListener, debugEventsReporter);
                return;
            }
        }
        videoLoadListener.mo35095d();
    }

    public p71(@NotNull Context context, @NotNull C31952z4 adLoadingPhasesManager, @NotNull C31539ty defaultNativeVideoLoader, @NotNull w80 firstNativeVideoLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(defaultNativeVideoLoader, "defaultNativeVideoLoader");
        Intrinsics.checkNotNullParameter(firstNativeVideoLoader, "firstNativeVideoLoader");
        this.f83734a = defaultNativeVideoLoader;
        this.f83735b = firstNativeVideoLoader;
    }

    /* renamed from: a */
    public final void m30822a(@NotNull Context context, @NotNull m62<u71> videoAdInfo, @NotNull C30149d8<?> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        boolean m32668a = k60.m32668a(context, j60.f80761c);
        if (Intrinsics.m17075f(w71.f87136c.m28017a(), adResponse.m35084D()) && m32668a) {
            this.f83735b.m28010a(videoAdInfo.m32084e());
        }
    }
}

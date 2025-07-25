package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class v31 {
    @NotNull

    /* renamed from: a */
    private final wg0 f86549a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31911yn f86550b;
    @NotNull

    /* renamed from: c */
    private final f41 f86551c;
    @NotNull

    /* renamed from: d */
    private final Map<String, InterfaceC31123pf<?>> f86552d;

    public v31(@NotNull g41 nativeAdWeakViewHolder, @NotNull C30359g3 adConfiguration, @NotNull wg0 imageProvider, @NotNull th0 impressionEventsObservable, @NotNull InterfaceC31911yn onClickListenerFactory, @NotNull h21 nativeAdFactoriesProvider, @NotNull C29932ag assetValueProvider, @NotNull b61 nativeMediaContent, @NotNull i51 nativeForcePauseObserver, @NotNull C30149d8 adResponse, @NotNull p81 nativeVisualBlock, @NotNull u11 nativeAdControllers, @NotNull ou0 mediaViewRenderController, @NotNull f41 weakViewProvider, @NotNull td2 mediaControlsProvider, @NotNull iu0 mediaViewAdapterCreator, @NotNull Map assetAdapters) {
        Intrinsics.checkNotNullParameter(nativeAdWeakViewHolder, "nativeAdWeakViewHolder");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(onClickListenerFactory, "onClickListenerFactory");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(assetValueProvider, "assetValueProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVisualBlock, "nativeVisualBlock");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(weakViewProvider, "weakViewProvider");
        Intrinsics.checkNotNullParameter(mediaControlsProvider, "mediaControlsProvider");
        Intrinsics.checkNotNullParameter(mediaViewAdapterCreator, "mediaViewAdapterCreator");
        Intrinsics.checkNotNullParameter(assetAdapters, "assetAdapters");
        this.f86549a = imageProvider;
        this.f86550b = onClickListenerFactory;
        this.f86551c = weakViewProvider;
        this.f86552d = assetAdapters;
    }

    /* renamed from: a */
    public final void m28544a() {
        for (InterfaceC31123pf<?> interfaceC31123pf : this.f86552d.values()) {
            if (interfaceC31123pf != null) {
                interfaceC31123pf.mo28957a();
            }
        }
    }

    /* renamed from: b */
    public final void m28542b() {
        for (InterfaceC31123pf<?> interfaceC31123pf : this.f86552d.values()) {
            if (interfaceC31123pf != null) {
                interfaceC31123pf.destroy();
            }
        }
    }

    @NotNull
    /* renamed from: c */
    public final Map<String, InterfaceC31123pf<?>> m28541c() {
        return this.f86552d;
    }

    @NotNull
    /* renamed from: d */
    public final wg0 m28540d() {
        return this.f86549a;
    }

    @Nullable
    /* renamed from: e */
    public final View m28539e() {
        return this.f86551c.m34232d();
    }

    @NotNull
    /* renamed from: f */
    public final InterfaceC31911yn m28538f() {
        return this.f86550b;
    }

    @NotNull
    /* renamed from: g */
    public final f41 m28537g() {
        return this.f86551c;
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC31123pf<?> m28543a(@Nullable C31034of<?> c31034of) {
        if (c31034of != null) {
            return this.f86552d.get(c31034of.m31043b());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ v31(com.yandex.mobile.ads.impl.g41 r30, com.yandex.mobile.ads.impl.C30359g3 r31, com.yandex.mobile.ads.impl.wg0 r32, com.yandex.mobile.ads.impl.th0 r33, com.yandex.mobile.ads.impl.InterfaceC31911yn r34, com.yandex.mobile.ads.impl.h21 r35, com.yandex.mobile.ads.impl.C29932ag r36, com.yandex.mobile.ads.impl.b61 r37, com.yandex.mobile.ads.impl.i51 r38, com.yandex.mobile.ads.impl.C30149d8 r39, com.yandex.mobile.ads.impl.p81 r40, com.yandex.mobile.ads.impl.u11 r41, com.yandex.mobile.ads.impl.ou0 r42, com.yandex.mobile.ads.impl.it1 r43) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r41
            r13 = r42
            com.yandex.mobile.ads.impl.f41 r15 = r30.m33932a()
            r14 = r15
            r26 = r0
            com.yandex.mobile.ads.impl.td2 r0 = new com.yandex.mobile.ads.impl.td2
            r27 = r1
            r1 = r15
            r15 = r0
            r0.<init>(r1)
            com.yandex.mobile.ads.impl.iu0 r28 = new com.yandex.mobile.ads.impl.iu0
            r16 = r28
            com.yandex.mobile.ads.impl.ju0 r21 = r35.m33718c()
            r17 = r28
            r18 = r36
            r19 = r31
            r20 = r33
            r22 = r41
            r23 = r42
            r24 = r0
            r25 = r43
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            com.yandex.mobile.ads.impl.rf r0 = new com.yandex.mobile.ads.impl.rf
            com.yandex.mobile.ads.impl.pq1 r17 = r31.m33949q()
            com.yandex.mobile.ads.impl.nx0 r25 = r17.mo30597b()
            r17 = r0
            r18 = r1
            r19 = r32
            r20 = r28
            r21 = r37
            r22 = r38
            r23 = r39
            r24 = r40
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.HashMap r17 = r0.m30058a()
            r0 = r26
            r1 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v31.<init>(com.yandex.mobile.ads.impl.g41, com.yandex.mobile.ads.impl.g3, com.yandex.mobile.ads.impl.wg0, com.yandex.mobile.ads.impl.th0, com.yandex.mobile.ads.impl.yn, com.yandex.mobile.ads.impl.h21, com.yandex.mobile.ads.impl.ag, com.yandex.mobile.ads.impl.b61, com.yandex.mobile.ads.impl.i51, com.yandex.mobile.ads.impl.d8, com.yandex.mobile.ads.impl.p81, com.yandex.mobile.ads.impl.u11, com.yandex.mobile.ads.impl.ou0, com.yandex.mobile.ads.impl.it1):void");
    }
}

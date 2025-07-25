package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* renamed from: com.yandex.mobile.ads.impl.xr */
/* loaded from: classes8.dex */
public final class C31835xr implements c32 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30043bs f87779a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30192dt f87780b;
    @NotNull

    /* renamed from: c */
    private final el0 f87781c;
    @NotNull

    /* renamed from: d */
    private final yi0 f87782d;
    @NotNull

    /* renamed from: e */
    private final xi0 f87783e;
    @NotNull

    /* renamed from: f */
    private final a62 f87784f;
    @NotNull

    /* renamed from: g */
    private final rj0 f87785g;
    @NotNull

    /* renamed from: h */
    private final tl0 f87786h;
    @NotNull

    /* renamed from: i */
    private final xl0 f87787i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C31835xr(android.content.Context r13, com.yandex.mobile.ads.impl.pq1 r14, com.yandex.mobile.ads.impl.C31763wr r15, com.yandex.mobile.ads.impl.InterfaceC30043bs r16, com.yandex.mobile.ads.impl.InterfaceC30192dt r17) {
        /*
            r12 = this;
            com.yandex.mobile.ads.impl.tj0 r6 = new com.yandex.mobile.ads.impl.tj0
            r6.<init>()
            com.yandex.mobile.ads.impl.ul0 r7 = new com.yandex.mobile.ads.impl.ul0
            r7.<init>()
            com.yandex.mobile.ads.impl.el0 r8 = new com.yandex.mobile.ads.impl.el0
            r8.<init>()
            int r0 = com.yandex.mobile.ads.impl.yi0.f88225d
            com.yandex.mobile.ads.impl.yi0 r9 = com.yandex.mobile.ads.impl.yi0.C31899a.m26892a()
            com.yandex.mobile.ads.impl.xi0 r10 = new com.yandex.mobile.ads.impl.xi0
            r10.<init>()
            com.yandex.mobile.ads.impl.a62 r11 = new com.yandex.mobile.ads.impl.a62
            r11.<init>()
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31835xr.<init>(android.content.Context, com.yandex.mobile.ads.impl.pq1, com.yandex.mobile.ads.impl.wr, com.yandex.mobile.ads.impl.bs, com.yandex.mobile.ads.impl.dt):void");
    }

    /* renamed from: a */
    public final void m27429a(@NotNull h50 instreamAdView, @NotNull List<k62> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        C31835xr m26897a = this.f87782d.m26897a(instreamAdView);
        if (!Intrinsics.m17075f(this, m26897a)) {
            if (m26897a != null && m26897a.f87782d.m26895a(m26897a)) {
                m26897a.f87787i.m27460d();
            }
            if (this.f87782d.m26895a(this)) {
                this.f87787i.m27460d();
            }
            this.f87782d.m26896a(instreamAdView, this);
        }
        this.f87785g.m30035a(this.f87779a);
        this.f87786h.m29108a(this.f87780b);
        this.f87787i.m27465a(instreamAdView, friendlyOverlays);
    }

    /* renamed from: b */
    public final void m27426b() {
        this.f87787i.m27461c();
    }

    /* renamed from: c */
    public final void m27425c() {
        this.f87783e.getClass();
    }

    /* renamed from: d */
    public final void m27424d() {
        this.f87783e.getClass();
    }

    /* renamed from: e */
    public final void m27423e() {
        if (this.f87782d.m26895a(this)) {
            this.f87787i.m27460d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final void invalidateAdPlayer() {
        this.f87785g.m30034b(this.f87779a);
        this.f87787i.m27466a();
    }

    public C31835xr(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull C31763wr instreamAd, @NotNull InterfaceC30043bs instreamAdPlayer, @NotNull InterfaceC30192dt videoPlayer, @NotNull tj0 instreamAdPlayerReuseControllerFactory, @NotNull ul0 instreamVideoPlayerReuseControllerFactory, @NotNull el0 instreamAdPlaybackEventListener, @NotNull yi0 bindingManager, @NotNull xi0 updateCreativeUiElementsListener, @NotNull a62 customVideoAdCreativePlaybackProxyListener) {
        List m17163p;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(instreamAdPlayerReuseControllerFactory, "instreamAdPlayerReuseControllerFactory");
        Intrinsics.checkNotNullParameter(instreamVideoPlayerReuseControllerFactory, "instreamVideoPlayerReuseControllerFactory");
        Intrinsics.checkNotNullParameter(instreamAdPlaybackEventListener, "instreamAdPlaybackEventListener");
        Intrinsics.checkNotNullParameter(bindingManager, "bindingManager");
        Intrinsics.checkNotNullParameter(updateCreativeUiElementsListener, "updateCreativeUiElementsListener");
        Intrinsics.checkNotNullParameter(customVideoAdCreativePlaybackProxyListener, "customVideoAdCreativePlaybackProxyListener");
        this.f87779a = instreamAdPlayer;
        this.f87780b = videoPlayer;
        this.f87781c = instreamAdPlaybackEventListener;
        this.f87782d = bindingManager;
        this.f87783e = updateCreativeUiElementsListener;
        this.f87784f = customVideoAdCreativePlaybackProxyListener;
        instreamAdPlayerReuseControllerFactory.getClass();
        this.f87785g = tj0.m29119a(this);
        instreamVideoPlayerReuseControllerFactory.getClass();
        this.f87786h = ul0.m28734a(this);
        xl0 xl0Var = new xl0(context, sdkEnvironmentModule, instreamAd, new pj0(instreamAdPlayer), new m92(videoPlayer));
        this.f87787i = xl0Var;
        xl0Var.m27464a(instreamAdPlaybackEventListener);
        m17163p = C37563v.m17163p(customVideoAdCreativePlaybackProxyListener, updateCreativeUiElementsListener);
        xl0Var.m27463a(new C32008zp(m17163p));
    }

    /* renamed from: a */
    public final void m27430a() {
        this.f87786h.m29107b(this.f87780b);
        this.f87787i.m27462b();
    }

    /* renamed from: a */
    public final void m27427a(@Nullable pl0 pl0Var) {
        this.f87784f.m35947a(pl0Var);
    }

    /* renamed from: a */
    public final void m27428a(@Nullable hg2 hg2Var) {
        this.f87781c.m34499a(hg2Var);
    }
}

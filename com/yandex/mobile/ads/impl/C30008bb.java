package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bb */
/* loaded from: classes8.dex */
public final class C30008bb {

    /* renamed from: f */
    private static final long f77247f = TimeUnit.SECONDS.toMillis(5);
    @NotNull

    /* renamed from: a */
    private final Dialog f77248a;
    @NotNull

    /* renamed from: b */
    private final C31101pb f77249b;
    @NotNull

    /* renamed from: c */
    private final n30 f77250c;
    @NotNull

    /* renamed from: d */
    private final ib1 f77251d;
    @NotNull

    /* renamed from: e */
    private final Handler f77252e;

    /* renamed from: com.yandex.mobile.ads.impl.bb$b */
    /* loaded from: classes8.dex */
    private final class RunnableC30010b implements Runnable {
        public RunnableC30010b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31940yz.m26513a(C30008bb.this.f77248a);
        }
    }

    public C30008bb(@NotNull Dialog dialog, @NotNull C31101pb adtuneWebView, @NotNull n30 eventListenerController, @NotNull ib1 openUrlHandler, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(adtuneWebView, "adtuneWebView");
        Intrinsics.checkNotNullParameter(eventListenerController, "eventListenerController");
        Intrinsics.checkNotNullParameter(openUrlHandler, "openUrlHandler");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f77248a = dialog;
        this.f77249b = adtuneWebView;
        this.f77250c = eventListenerController;
        this.f77251d = openUrlHandler;
        this.f77252e = handler;
    }

    /* renamed from: d */
    public static final void m35516d(C30008bb c30008bb) {
        c30008bb.f77252e.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.yandex.mobile.ads.impl.bb$a */
    /* loaded from: classes8.dex */
    private final class C30009a implements InterfaceC31345sb {
        public C30009a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31345sb
        /* renamed from: a */
        public final void mo29657a(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            C30008bb.this.f77251d.mo28740a(url);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31345sb
        /* renamed from: b */
        public final void mo29656b() {
            C30008bb.this.f77250c.mo31677a();
            C31940yz.m26513a(C30008bb.this.f77248a);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31345sb
        /* renamed from: a */
        public final void mo29658a() {
            C30008bb.m35516d(C30008bb.this);
        }
    }

    /* renamed from: a */
    public final void m35519a(@NotNull String url, @NotNull String optOutUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(optOutUrl, "optOutUrl");
        this.f77249b.setAdtuneWebViewListener(new C30009a());
        this.f77249b.setOptOutUrl(optOutUrl);
        this.f77249b.loadUrl(url);
        this.f77252e.postDelayed(new RunnableC30010b(), f77247f);
        this.f77248a.show();
    }
}

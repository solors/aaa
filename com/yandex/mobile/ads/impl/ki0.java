package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ki0 {
    @NotNull

    /* renamed from: a */
    private final vx0 f81425a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31678vr f81426b;

    public ki0(@NotNull vx0 mobileAdsExecutor, @NotNull InterfaceC31678vr initializationListener) {
        Intrinsics.checkNotNullParameter(mobileAdsExecutor, "mobileAdsExecutor");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        this.f81425a = mobileAdsExecutor;
        this.f81426b = initializationListener;
    }

    /* renamed from: b */
    public static /* synthetic */ void m32556b(ki0 ki0Var) {
        m32557a(ki0Var);
    }

    /* renamed from: a */
    public final void m32558a() {
        this.f81425a.m28127b(new Runnable() { // from class: com.yandex.mobile.ads.impl.vr2
            @Override // java.lang.Runnable
            public final void run() {
                ki0.m32556b(ki0.this);
            }
        });
    }

    /* renamed from: a */
    public static final void m32557a(ki0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f81426b.onInitializationCompleted();
    }
}

package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.common.AdImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class g21 implements InterfaceC30896n0 {
    @NotNull

    /* renamed from: a */
    private final Handler f79448a;
    @Nullable

    /* renamed from: b */
    private InterfaceC30655js f79449b;

    public /* synthetic */ g21() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public static /* synthetic */ void m33989b(g21 g21Var, AdImpressionData adImpressionData) {
        m33992a(g21Var, adImpressionData);
    }

    /* renamed from: c */
    public static final void m33988c(g21 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30655js interfaceC30655js = this$0.f79449b;
        if (interfaceC30655js != null) {
            interfaceC30655js.onReturnedToApplication();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m33987d(g21 g21Var) {
        m33988c(g21Var);
    }

    /* renamed from: e */
    public static /* synthetic */ void m33986e(g21 g21Var) {
        m33993a(g21Var);
    }

    /* renamed from: f */
    public static /* synthetic */ void m33985f(g21 g21Var) {
        m33990b(g21Var);
    }

    /* renamed from: a */
    public final void m33995a() {
        this.f79448a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.wo2
            @Override // java.lang.Runnable
            public final void run() {
                g21.m33986e(g21.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30896n0
    public final void onLeftApplication() {
        this.f79448a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.uo2
            @Override // java.lang.Runnable
            public final void run() {
                g21.m33985f(g21.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30896n0
    public final void onReturnedToApplication() {
        this.f79448a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.xo2
            @Override // java.lang.Runnable
            public final void run() {
                g21.m33987d(g21.this);
            }
        });
    }

    /* renamed from: a */
    public static final void m33993a(g21 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30655js interfaceC30655js = this$0.f79449b;
        if (interfaceC30655js != null) {
            interfaceC30655js.closeNativeAd();
        }
    }

    /* renamed from: b */
    public static final void m33990b(g21 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30655js interfaceC30655js = this$0.f79449b;
        if (interfaceC30655js != null) {
            interfaceC30655js.onAdClicked();
        }
        InterfaceC30655js interfaceC30655js2 = this$0.f79449b;
        if (interfaceC30655js2 != null) {
            interfaceC30655js2.onLeftApplication();
        }
    }

    public g21(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f79448a = handler;
    }

    /* renamed from: a */
    public final void m33994a(@Nullable final AdImpressionData adImpressionData) {
        this.f79448a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vo2
            @Override // java.lang.Runnable
            public final void run() {
                g21.m33989b(g21.this, adImpressionData);
            }
        });
    }

    /* renamed from: a */
    public static final void m33992a(g21 this$0, AdImpressionData adImpressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30655js interfaceC30655js = this$0.f79449b;
        if (interfaceC30655js != null) {
            interfaceC30655js.mo26241a(adImpressionData);
        }
    }

    /* renamed from: a */
    public final void m33991a(@Nullable InterfaceC30655js interfaceC30655js) {
        this.f79449b = interfaceC30655js;
    }
}

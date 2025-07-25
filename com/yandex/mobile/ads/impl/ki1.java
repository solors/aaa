package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.common.AdImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ki1 implements ya0 {
    @Nullable

    /* renamed from: a */
    private final xa0 f81427a;
    @NotNull

    /* renamed from: b */
    private final Handler f81428b;
    @Nullable

    /* renamed from: c */
    private InterfaceC30966nr f81429c;

    public /* synthetic */ ki1(xa0 xa0Var) {
        this(xa0Var, new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static final void m32553a(ki1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30966nr interfaceC30966nr = this$0.f81429c;
        if (interfaceC30966nr != null) {
            interfaceC30966nr.onAdClicked();
        }
    }

    /* renamed from: b */
    public static final void m32550b(ki1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30966nr interfaceC30966nr = this$0.f81429c;
        if (interfaceC30966nr != null) {
            interfaceC30966nr.onAdDismissed();
        }
    }

    /* renamed from: c */
    public static final void m32549c(ki1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30966nr interfaceC30966nr = this$0.f81429c;
        if (interfaceC30966nr != null) {
            interfaceC30966nr.onAdShown();
        }
        xa0 xa0Var = this$0.f81427a;
        if (xa0Var != null) {
            xa0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    public final void onAdClicked() {
        this.f81428b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.yr2
            {
                ki1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ki1.m32553a(ki1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    public final void onAdDismissed() {
        this.f81428b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.zr2
            {
                ki1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ki1.m32550b(ki1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    public final void onAdShown() {
        this.f81428b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.xr2
            {
                ki1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ki1.m32549c(ki1.this);
            }
        });
    }

    public ki1(@Nullable xa0 xa0Var, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f81427a = xa0Var;
        this.f81428b = handler;
    }

    /* renamed from: a */
    public final void m32555a(@NotNull final C30602j6 adPresentationError) {
        Intrinsics.checkNotNullParameter(adPresentationError, "adPresentationError");
        this.f81428b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.as2
            @Override // java.lang.Runnable
            public final void run() {
                ki1.m32554a(adPresentationError, this);
            }
        });
    }

    /* renamed from: a */
    public static final void m32554a(C30602j6 adPresentationError, ki1 this$0) {
        Intrinsics.checkNotNullParameter(adPresentationError, "$adPresentationError");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ut1 ut1Var = new ut1(adPresentationError.m33039a());
        InterfaceC30966nr interfaceC30966nr = this$0.f81429c;
        if (interfaceC30966nr != null) {
            interfaceC30966nr.mo29626a(ut1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo26974a(@Nullable final AdImpressionData adImpressionData) {
        this.f81428b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.wr2
            {
                ki1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ki1.m32552a(ki1.this, adImpressionData);
            }
        });
    }

    /* renamed from: a */
    public static final void m32552a(ki1 this$0, AdImpressionData adImpressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30966nr interfaceC30966nr = this$0.f81429c;
        if (interfaceC30966nr != null) {
            interfaceC30966nr.mo29628a(adImpressionData);
        }
    }

    /* renamed from: a */
    public final void m32551a(@Nullable sf2 sf2Var) {
        this.f81429c = sf2Var;
    }
}

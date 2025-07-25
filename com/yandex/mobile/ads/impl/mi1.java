package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.common.AdImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class mi1 implements ya0 {
    @Nullable

    /* renamed from: a */
    private final xa0 f82222a;
    @NotNull

    /* renamed from: b */
    private final Handler f82223b;
    @Nullable

    /* renamed from: c */
    private InterfaceC30336fs f82224c;

    public /* synthetic */ mi1(xa0 xa0Var) {
        this(xa0Var, new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static final void m31994a(mi1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30336fs interfaceC30336fs = this$0.f82224c;
        if (interfaceC30336fs != null) {
            interfaceC30336fs.onAdClicked();
        }
    }

    /* renamed from: b */
    public static final void m31991b(mi1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30336fs interfaceC30336fs = this$0.f82224c;
        if (interfaceC30336fs != null) {
            interfaceC30336fs.onAdDismissed();
        }
    }

    /* renamed from: c */
    public static final void m31990c(mi1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30336fs interfaceC30336fs = this$0.f82224c;
        if (interfaceC30336fs != null) {
            interfaceC30336fs.onAdShown();
        }
        xa0 xa0Var = this$0.f82222a;
        if (xa0Var != null) {
            xa0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    public final void onAdClicked() {
        this.f82223b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.ts2
            {
                mi1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mi1.m31994a(mi1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    public final void onAdDismissed() {
        this.f82223b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.ss2
            {
                mi1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mi1.m31991b(mi1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    public final void onAdShown() {
        this.f82223b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.us2
            {
                mi1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mi1.m31990c(mi1.this);
            }
        });
    }

    public mi1(@Nullable xa0 xa0Var, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f82222a = xa0Var;
        this.f82223b = handler;
    }

    /* renamed from: a */
    public final void m31996a(@NotNull final C30602j6 adPresentationError) {
        Intrinsics.checkNotNullParameter(adPresentationError, "adPresentationError");
        this.f82223b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.rs2
            @Override // java.lang.Runnable
            public final void run() {
                mi1.m31995a(adPresentationError, this);
            }
        });
    }

    /* renamed from: a */
    public static final void m31995a(C30602j6 adPresentationError, mi1 this$0) {
        Intrinsics.checkNotNullParameter(adPresentationError, "$adPresentationError");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ut1 ut1Var = new ut1(adPresentationError.m33039a());
        InterfaceC30336fs interfaceC30336fs = this$0.f82224c;
        if (interfaceC30336fs != null) {
            interfaceC30336fs.mo30672a(ut1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo26974a(@Nullable final AdImpressionData adImpressionData) {
        this.f82223b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vs2
            {
                mi1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mi1.m31993a(mi1.this, adImpressionData);
            }
        });
    }

    /* renamed from: a */
    public static final void m31993a(mi1 this$0, AdImpressionData adImpressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC30336fs interfaceC30336fs = this$0.f82224c;
        if (interfaceC30336fs != null) {
            interfaceC30336fs.mo30674a(adImpressionData);
        }
    }

    /* renamed from: a */
    public final void m31992a(@Nullable pg2 pg2Var) {
        this.f82224c = pg2Var;
    }
}

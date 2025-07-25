package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yf2 implements InterfaceC31229qr {
    @Nullable

    /* renamed from: a */
    private final ClosableBannerAdEventListener f88193a;

    /* renamed from: com.yandex.mobile.ads.impl.yf2$a */
    /* loaded from: classes8.dex */
    static final class C31886a extends Lambda implements Functions<Unit> {
        C31886a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = yf2.this.f88193a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.closeBannerAd();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yf2$b */
    /* loaded from: classes8.dex */
    static final class C31887b extends Lambda implements Functions<Unit> {
        C31887b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = yf2.this.f88193a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdClicked();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yf2$c */
    /* loaded from: classes8.dex */
    static final class C31888c extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ AdRequestError f88197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31888c(AdRequestError adRequestError) {
            super(0);
            this.f88197c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = yf2.this.f88193a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdFailedToLoad(this.f88197c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yf2$d */
    /* loaded from: classes8.dex */
    static final class C31889d extends Lambda implements Functions<Unit> {
        C31889d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = yf2.this.f88193a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdLoaded();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yf2$e */
    /* loaded from: classes8.dex */
    static final class C31890e extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ ag2 f88200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31890e(ag2 ag2Var) {
            super(0);
            this.f88200c = ag2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = yf2.this.f88193a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onImpression(this.f88200c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yf2$f */
    /* loaded from: classes8.dex */
    static final class C31891f extends Lambda implements Functions<Unit> {
        C31891f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = yf2.this.f88193a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onLeftApplication();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yf2$g */
    /* loaded from: classes8.dex */
    static final class C31892g extends Lambda implements Functions<Unit> {
        C31892g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = yf2.this.f88193a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onReturnedToApplication();
            }
            return Unit.f99208a;
        }
    }

    public yf2(@Nullable ClosableBannerAdEventListener closableBannerAdEventListener) {
        this.f88193a = closableBannerAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void closeBannerAd() {
        new CallbackStackTraceMarker(new C31886a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new C31887b());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new C31889d());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new C31891f());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new C31892g());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    /* renamed from: a */
    public final void mo26928a(@NotNull C31082p3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new C31888c(new AdRequestError(error.m30850b(), error.m30848d(), error.m30851a())));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    /* renamed from: a */
    public final void mo26929a(@Nullable AdImpressionData adImpressionData) {
        new CallbackStackTraceMarker(new C31890e(adImpressionData != null ? new ag2(adImpressionData) : null));
    }
}

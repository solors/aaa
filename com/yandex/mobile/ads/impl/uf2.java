package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class uf2 implements InterfaceC31229qr {
    @Nullable

    /* renamed from: a */
    private final BannerAdEventListener f86250a;

    /* renamed from: com.yandex.mobile.ads.impl.uf2$a */
    /* loaded from: classes8.dex */
    static final class C31575a extends Lambda implements Functions<Unit> {
        C31575a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            BannerAdEventListener bannerAdEventListener = uf2.this.f86250a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdClicked();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uf2$b */
    /* loaded from: classes8.dex */
    static final class C31576b extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ AdRequestError f86253c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31576b(AdRequestError adRequestError) {
            super(0);
            this.f86253c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            BannerAdEventListener bannerAdEventListener = uf2.this.f86250a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdFailedToLoad(this.f86253c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uf2$c */
    /* loaded from: classes8.dex */
    static final class C31577c extends Lambda implements Functions<Unit> {
        C31577c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            BannerAdEventListener bannerAdEventListener = uf2.this.f86250a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdLoaded();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uf2$d */
    /* loaded from: classes8.dex */
    static final class C31578d extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ ag2 f86256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31578d(ag2 ag2Var) {
            super(0);
            this.f86256c = ag2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            BannerAdEventListener bannerAdEventListener = uf2.this.f86250a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onImpression(this.f86256c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uf2$e */
    /* loaded from: classes8.dex */
    static final class C31579e extends Lambda implements Functions<Unit> {
        C31579e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            BannerAdEventListener bannerAdEventListener = uf2.this.f86250a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onLeftApplication();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uf2$f */
    /* loaded from: classes8.dex */
    static final class C31580f extends Lambda implements Functions<Unit> {
        C31580f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            BannerAdEventListener bannerAdEventListener = uf2.this.f86250a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onReturnedToApplication();
            }
            return Unit.f99208a;
        }
    }

    public uf2(@Nullable BannerAdEventListener bannerAdEventListener) {
        this.f86250a = bannerAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new C31575a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new C31577c());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new C31579e());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new C31580f());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    /* renamed from: a */
    public final void mo26928a(@NotNull C31082p3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new C31576b(new AdRequestError(error.m30850b(), error.m30848d(), error.m30851a())));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    /* renamed from: a */
    public final void mo26929a(@Nullable AdImpressionData adImpressionData) {
        new CallbackStackTraceMarker(new C31578d(adImpressionData != null ? new ag2(adImpressionData) : null));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31229qr
    public final void closeBannerAd() {
    }
}

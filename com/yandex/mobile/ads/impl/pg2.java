package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class pg2 implements InterfaceC30336fs {
    @Nullable

    /* renamed from: a */
    private final InterstitialAdEventListener f83953a;

    /* renamed from: com.yandex.mobile.ads.impl.pg2$a */
    /* loaded from: classes8.dex */
    static final class C31128a extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31128a() {
            super(0);
            pg2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            InterstitialAdEventListener interstitialAdEventListener = pg2.this.f83953a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdClicked();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pg2$b */
    /* loaded from: classes8.dex */
    static final class C31129b extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31129b() {
            super(0);
            pg2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            InterstitialAdEventListener interstitialAdEventListener = pg2.this.f83953a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdDismissed();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pg2$c */
    /* loaded from: classes8.dex */
    static final class C31130c extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ kf2 f83957c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31130c(kf2 kf2Var) {
            super(0);
            pg2.this = r1;
            this.f83957c = kf2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            InterstitialAdEventListener interstitialAdEventListener = pg2.this.f83953a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdFailedToShow(this.f83957c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pg2$d */
    /* loaded from: classes8.dex */
    static final class C31131d extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ ag2 f83959c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31131d(ag2 ag2Var) {
            super(0);
            pg2.this = r1;
            this.f83959c = ag2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            InterstitialAdEventListener interstitialAdEventListener = pg2.this.f83953a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdImpression(this.f83959c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pg2$e */
    /* loaded from: classes8.dex */
    static final class C31132e extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31132e() {
            super(0);
            pg2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            InterstitialAdEventListener interstitialAdEventListener = pg2.this.f83953a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdShown();
            }
            return Unit.f99208a;
        }
    }

    public pg2(@Nullable InterstitialAdEventListener interstitialAdEventListener) {
        this.f83953a = interstitialAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30336fs
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new C31128a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30336fs
    public final void onAdDismissed() {
        new CallbackStackTraceMarker(new C31129b());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30336fs
    public final void onAdShown() {
        new CallbackStackTraceMarker(new C31132e());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30336fs
    /* renamed from: a */
    public final void mo30672a(@NotNull ut1 adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        new CallbackStackTraceMarker(new C31130c(new kf2(adError.m28636a())));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30336fs
    /* renamed from: a */
    public final void mo30674a(@Nullable AdImpressionData adImpressionData) {
        new CallbackStackTraceMarker(new C31131d(adImpressionData != null ? new ag2(adImpressionData) : null));
    }
}

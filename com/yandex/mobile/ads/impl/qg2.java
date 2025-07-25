package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class qg2 implements InterfaceC30411gs {
    @Nullable

    /* renamed from: a */
    private final InterstitialAdLoadListener f84361a;

    /* renamed from: com.yandex.mobile.ads.impl.qg2$a */
    /* loaded from: classes8.dex */
    static final class C31209a extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ AdRequestError f84363c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31209a(AdRequestError adRequestError) {
            super(0);
            this.f84363c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            InterstitialAdLoadListener interstitialAdLoadListener = qg2.this.f84361a;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdFailedToLoad(this.f84363c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qg2$b */
    /* loaded from: classes8.dex */
    static final class C31210b extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ og2 f84365c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31210b(og2 og2Var) {
            super(0);
            this.f84365c = og2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            InterstitialAdLoadListener interstitialAdLoadListener = qg2.this.f84361a;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdLoaded(this.f84365c);
            }
            return Unit.f99208a;
        }
    }

    public qg2(@Nullable InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f84361a = interstitialAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30411gs
    /* renamed from: a */
    public final void mo30364a(@NotNull C31082p3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new C31209a(new AdRequestError(error.m30850b(), error.m30848d(), error.m30851a())));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30411gs
    /* renamed from: a */
    public final void mo30365a(@NotNull InterfaceC30268es interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        new CallbackStackTraceMarker(new C31210b(new og2(interstitialAd, new lf2())));
    }
}

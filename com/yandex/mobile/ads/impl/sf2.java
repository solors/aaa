package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sf2 implements InterfaceC30966nr {
    @Nullable

    /* renamed from: a */
    private final AppOpenAdEventListener f85223a;

    /* renamed from: com.yandex.mobile.ads.impl.sf2$a */
    /* loaded from: classes8.dex */
    static final class C31350a extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31350a() {
            super(0);
            sf2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            AppOpenAdEventListener appOpenAdEventListener = sf2.this.f85223a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdClicked();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sf2$b */
    /* loaded from: classes8.dex */
    static final class C31351b extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31351b() {
            super(0);
            sf2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            AppOpenAdEventListener appOpenAdEventListener = sf2.this.f85223a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdDismissed();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sf2$c */
    /* loaded from: classes8.dex */
    static final class C31352c extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ kf2 f85227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31352c(kf2 kf2Var) {
            super(0);
            sf2.this = r1;
            this.f85227c = kf2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            AppOpenAdEventListener appOpenAdEventListener = sf2.this.f85223a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdFailedToShow(this.f85227c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sf2$d */
    /* loaded from: classes8.dex */
    static final class C31353d extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ ag2 f85229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31353d(ag2 ag2Var) {
            super(0);
            sf2.this = r1;
            this.f85229c = ag2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            AppOpenAdEventListener appOpenAdEventListener = sf2.this.f85223a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdImpression(this.f85229c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sf2$e */
    /* loaded from: classes8.dex */
    static final class C31354e extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31354e() {
            super(0);
            sf2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            AppOpenAdEventListener appOpenAdEventListener = sf2.this.f85223a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdShown();
            }
            return Unit.f99208a;
        }
    }

    public sf2(@Nullable AppOpenAdEventListener appOpenAdEventListener) {
        this.f85223a = appOpenAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30966nr
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new C31350a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30966nr
    public final void onAdDismissed() {
        new CallbackStackTraceMarker(new C31351b());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30966nr
    public final void onAdShown() {
        new CallbackStackTraceMarker(new C31354e());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30966nr
    /* renamed from: a */
    public final void mo29626a(@NotNull ut1 adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        new CallbackStackTraceMarker(new C31352c(new kf2(adError.m28636a())));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30966nr
    /* renamed from: a */
    public final void mo29628a(@Nullable AdImpressionData adImpressionData) {
        new CallbackStackTraceMarker(new C31353d(adImpressionData != null ? new ag2(adImpressionData) : null));
    }
}

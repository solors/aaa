package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class tf2 implements InterfaceC31060or {
    @Nullable

    /* renamed from: a */
    private final AppOpenAdLoadListener f85649a;

    /* renamed from: com.yandex.mobile.ads.impl.tf2$a */
    /* loaded from: classes8.dex */
    static final class C31448a extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ AdRequestError f85651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31448a(AdRequestError adRequestError) {
            super(0);
            this.f85651c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            AppOpenAdLoadListener appOpenAdLoadListener = tf2.this.f85649a;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdFailedToLoad(this.f85651c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tf2$b */
    /* loaded from: classes8.dex */
    static final class C31449b extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ rf2 f85653c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31449b(rf2 rf2Var) {
            super(0);
            this.f85653c = rf2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            AppOpenAdLoadListener appOpenAdLoadListener = tf2.this.f85649a;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdLoaded(this.f85653c);
            }
            return Unit.f99208a;
        }
    }

    public tf2(@Nullable AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f85649a = appOpenAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31060or
    /* renamed from: a */
    public final void mo29177a(@NotNull C31082p3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new C31448a(new AdRequestError(error.m30850b(), error.m30848d(), error.m30851a())));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31060or
    /* renamed from: a */
    public final void mo29178a(@NotNull InterfaceC30878mr appOpenAd) {
        Intrinsics.checkNotNullParameter(appOpenAd, "appOpenAd");
        new CallbackStackTraceMarker(new C31449b(new rf2(appOpenAd, new lf2())));
    }
}

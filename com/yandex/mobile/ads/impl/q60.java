package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.feed.FeedAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class q60 implements InterfaceC31475tr {
    @Nullable

    /* renamed from: a */
    private final FeedAdLoadListener f84239a;

    /* renamed from: com.yandex.mobile.ads.impl.q60$a */
    /* loaded from: classes8.dex */
    static final class C31179a extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ AdRequestError f84241c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31179a(AdRequestError adRequestError) {
            super(0);
            this.f84241c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            FeedAdLoadListener feedAdLoadListener = q60.this.f84239a;
            if (feedAdLoadListener != null) {
                feedAdLoadListener.onAdFailedToLoad(this.f84241c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q60$b */
    /* loaded from: classes8.dex */
    static final class C31180b extends Lambda implements Functions<Unit> {
        C31180b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            FeedAdLoadListener feedAdLoadListener = q60.this.f84239a;
            if (feedAdLoadListener != null) {
                feedAdLoadListener.onAdLoaded();
            }
            return Unit.f99208a;
        }
    }

    public q60(@Nullable FeedAdLoadListener feedAdLoadListener) {
        this.f84239a = feedAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31475tr
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new C31180b());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31475tr
    /* renamed from: a */
    public final void mo29076a(@NotNull C31082p3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new C31179a(new AdRequestError(error.m30850b(), error.m30848d(), error.m30851a())));
    }
}

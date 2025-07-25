package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ig2 implements InterfaceC29961as {
    @NotNull

    /* renamed from: a */
    private final InstreamAdLoadListener f80453a;

    /* renamed from: com.yandex.mobile.ads.impl.ig2$a */
    /* loaded from: classes8.dex */
    static final class C30553a extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ String f80455c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30553a(String str) {
            super(0);
            this.f80455c = str;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ig2.this.f80453a.onInstreamAdFailedToLoad(this.f80455c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ig2$b */
    /* loaded from: classes8.dex */
    static final class C30554b extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ cg2 f80457c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30554b(cg2 cg2Var) {
            super(0);
            this.f80457c = cg2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            ig2.this.f80453a.onInstreamAdLoaded(this.f80457c);
            return Unit.f99208a;
        }
    }

    public ig2(@NotNull InstreamAdLoadListener yandexAdLoadListener) {
        Intrinsics.checkNotNullParameter(yandexAdLoadListener, "yandexAdLoadListener");
        this.f80453a = yandexAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29961as
    public final void onInstreamAdFailedToLoad(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new CallbackStackTraceMarker(new C30553a(reason));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29961as
    /* renamed from: a */
    public final void mo31442a(@NotNull C31763wr instreamAd) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        new CallbackStackTraceMarker(new C30554b(new cg2(instreamAd)));
    }
}

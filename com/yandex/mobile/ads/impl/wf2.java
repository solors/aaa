package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wf2 implements InterfaceC31390sr {
    @NotNull

    /* renamed from: a */
    private final BidderTokenLoadListener f87250a;

    /* renamed from: com.yandex.mobile.ads.impl.wf2$a */
    /* loaded from: classes8.dex */
    static final class C31745a extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ String f87252c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31745a(String str) {
            super(0);
            this.f87252c = str;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            wf2.this.f87250a.onBidderTokenLoaded(this.f87252c);
            return Unit.f99208a;
        }
    }

    public wf2(@NotNull BidderTokenLoadListener bidderTokenLoadListener) {
        Intrinsics.checkNotNullParameter(bidderTokenLoadListener, "bidderTokenLoadListener");
        this.f87250a = bidderTokenLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31390sr
    public final void onBidderTokenLoaded(@NotNull String bidderToken) {
        Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
        new CallbackStackTraceMarker(new C31745a(bidderToken));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31390sr
    /* renamed from: a */
    public final void mo27917a() {
        Intrinsics.checkNotNullParameter("Cannot load bidder token. Token generation failed", "failureReason");
        new CallbackStackTraceMarker(new vf2(this));
    }
}

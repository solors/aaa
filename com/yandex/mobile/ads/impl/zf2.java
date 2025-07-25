package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zf2 implements InterfaceC30655js {
    @NotNull

    /* renamed from: a */
    private final ClosableNativeAdEventListener f88843a;

    /* renamed from: com.yandex.mobile.ads.impl.zf2$a */
    /* loaded from: classes8.dex */
    static final class C31978a extends Lambda implements Functions<Unit> {
        C31978a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            zf2.this.f88843a.closeNativeAd();
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zf2$b */
    /* loaded from: classes8.dex */
    static final class C31979b extends Lambda implements Functions<Unit> {
        C31979b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            zf2.this.f88843a.onAdClicked();
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zf2$c */
    /* loaded from: classes8.dex */
    static final class C31980c extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ ag2 f88847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31980c(ag2 ag2Var) {
            super(0);
            this.f88847c = ag2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            zf2.this.f88843a.onImpression(this.f88847c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zf2$d */
    /* loaded from: classes8.dex */
    static final class C31981d extends Lambda implements Functions<Unit> {
        C31981d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            zf2.this.f88843a.onLeftApplication();
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zf2$e */
    /* loaded from: classes8.dex */
    static final class C31982e extends Lambda implements Functions<Unit> {
        C31982e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            zf2.this.f88843a.onReturnedToApplication();
            return Unit.f99208a;
        }
    }

    public zf2(@NotNull ClosableNativeAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f88843a = adEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void closeNativeAd() {
        new CallbackStackTraceMarker(new C31978a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new C31979b());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new C31981d());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new C31982e());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    /* renamed from: a */
    public final void mo26241a(@Nullable AdImpressionData adImpressionData) {
        new CallbackStackTraceMarker(new C31980c(adImpressionData != null ? new ag2(adImpressionData) : null));
    }
}

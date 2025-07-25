package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class tg2 implements InterfaceC30655js {
    @NotNull

    /* renamed from: a */
    private final NativeAdEventListener f85658a;

    /* renamed from: com.yandex.mobile.ads.impl.tg2$a */
    /* loaded from: classes8.dex */
    static final class C31451a extends Lambda implements Functions<Unit> {
        C31451a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            tg2.this.f85658a.onAdClicked();
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tg2$b */
    /* loaded from: classes8.dex */
    static final class C31452b extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ ag2 f85661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31452b(ag2 ag2Var) {
            super(0);
            this.f85661c = ag2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            tg2.this.f85658a.onImpression(this.f85661c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tg2$c */
    /* loaded from: classes8.dex */
    static final class C31453c extends Lambda implements Functions<Unit> {
        C31453c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            tg2.this.f85658a.onLeftApplication();
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tg2$d */
    /* loaded from: classes8.dex */
    static final class C31454d extends Lambda implements Functions<Unit> {
        C31454d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            tg2.this.f85658a.onReturnedToApplication();
            return Unit.f99208a;
        }
    }

    public tg2(@NotNull NativeAdEventListener nativeAdEventListener) {
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        this.f85658a = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new C31451a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new C31453c());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new C31454d());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    /* renamed from: a */
    public final void mo26241a(@Nullable AdImpressionData adImpressionData) {
        new CallbackStackTraceMarker(new C31452b(adImpressionData != null ? new ag2(adImpressionData) : null));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void closeNativeAd() {
    }
}

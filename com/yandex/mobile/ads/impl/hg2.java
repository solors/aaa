package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hg2 implements vi0 {
    @NotNull

    /* renamed from: a */
    private final InstreamAdListener f80063a;

    /* renamed from: com.yandex.mobile.ads.impl.hg2$a */
    /* loaded from: classes8.dex */
    static final class C30460a extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ String f80065c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30460a(String str) {
            super(0);
            this.f80065c = str;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            hg2.this.f80063a.onError(this.f80065c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hg2$b */
    /* loaded from: classes8.dex */
    static final class C30461b extends Lambda implements Functions<Unit> {
        C30461b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            hg2.this.f80063a.onInstreamAdCompleted();
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hg2$c */
    /* loaded from: classes8.dex */
    static final class C30462c extends Lambda implements Functions<Unit> {
        C30462c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            hg2.this.f80063a.onInstreamAdPrepared();
            return Unit.f99208a;
        }
    }

    public hg2(@NotNull InstreamAdListener instreamAdListener) {
        Intrinsics.checkNotNullParameter(instreamAdListener, "instreamAdListener");
        this.f80063a = instreamAdListener;
    }

    @Override // com.yandex.mobile.ads.impl.vi0
    public final void onError(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new CallbackStackTraceMarker(new C30460a(reason));
    }

    @Override // com.yandex.mobile.ads.impl.vi0
    public final void onInstreamAdCompleted() {
        new CallbackStackTraceMarker(new C30461b());
    }

    @Override // com.yandex.mobile.ads.impl.vi0
    public final void onInstreamAdPrepared() {
        new CallbackStackTraceMarker(new C30462c());
    }
}

package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class eg2 implements qq0 {
    @NotNull

    /* renamed from: a */
    private final InstreamAdBreakEventListener f78563a;

    /* renamed from: com.yandex.mobile.ads.impl.eg2$a */
    /* loaded from: classes8.dex */
    static final class C30237a extends Lambda implements Functions<Unit> {
        C30237a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            eg2.this.f78563a.onInstreamAdBreakCompleted();
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eg2$b */
    /* loaded from: classes8.dex */
    static final class C30238b extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ String f78566c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30238b(String str) {
            super(0);
            this.f78566c = str;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            eg2.this.f78563a.onInstreamAdBreakError(this.f78566c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eg2$c */
    /* loaded from: classes8.dex */
    static final class C30239c extends Lambda implements Functions<Unit> {
        C30239c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            eg2.this.f78563a.onInstreamAdBreakPrepared();
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eg2$d */
    /* loaded from: classes8.dex */
    static final class C30240d extends Lambda implements Functions<Unit> {
        C30240d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            eg2.this.f78563a.onInstreamAdBreakStarted();
            return Unit.f99208a;
        }
    }

    public eg2(@NotNull InstreamAdBreakEventListener adBreakEventListener) {
        Intrinsics.checkNotNullParameter(adBreakEventListener, "adBreakEventListener");
        this.f78563a = adBreakEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void onInstreamAdBreakCompleted() {
        new CallbackStackTraceMarker(new C30237a());
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void onInstreamAdBreakError(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new CallbackStackTraceMarker(new C30238b(reason));
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void onInstreamAdBreakPrepared() {
        new CallbackStackTraceMarker(new C30239c());
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void onInstreamAdBreakStarted() {
        new CallbackStackTraceMarker(new C30240d());
    }
}

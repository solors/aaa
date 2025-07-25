package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class sh2 implements pl0 {
    @NotNull

    /* renamed from: a */
    private final VideoAdPlaybackListener f85253a;
    @NotNull

    /* renamed from: b */
    private final ng2 f85254b;

    /* renamed from: com.yandex.mobile.ads.impl.sh2$a */
    /* loaded from: classes8.dex */
    static final class C31363a extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31363a(VideoAd videoAd) {
            super(0);
            this.f85256c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onAdClicked(this.f85256c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$b */
    /* loaded from: classes8.dex */
    static final class C31364b extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85258c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31364b(VideoAd videoAd) {
            super(0);
            this.f85258c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onAdCompleted(this.f85258c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$c */
    /* loaded from: classes8.dex */
    static final class C31365c extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31365c(VideoAd videoAd) {
            super(0);
            this.f85260c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onAdError(this.f85260c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$d */
    /* loaded from: classes8.dex */
    static final class C31366d extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31366d(VideoAd videoAd) {
            super(0);
            this.f85262c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onAdPaused(this.f85262c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$e */
    /* loaded from: classes8.dex */
    static final class C31367e extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31367e(VideoAd videoAd) {
            super(0);
            this.f85264c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onAdResumed(this.f85264c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$f */
    /* loaded from: classes8.dex */
    static final class C31368f extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31368f(VideoAd videoAd) {
            super(0);
            this.f85266c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onAdSkipped(this.f85266c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$g */
    /* loaded from: classes8.dex */
    static final class C31369g extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85268c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31369g(VideoAd videoAd) {
            super(0);
            this.f85268c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onAdStarted(this.f85268c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$h */
    /* loaded from: classes8.dex */
    static final class C31370h extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31370h(VideoAd videoAd) {
            super(0);
            this.f85270c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onAdStopped(this.f85270c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$i */
    /* loaded from: classes8.dex */
    static final class C31371i extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31371i(VideoAd videoAd) {
            super(0);
            this.f85272c = videoAd;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onImpression(this.f85272c);
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh2$j */
    /* loaded from: classes8.dex */
    static final class C31372j extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ VideoAd f85274c;

        /* renamed from: d */
        final /* synthetic */ float f85275d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31372j(VideoAd videoAd, float f) {
            super(0);
            this.f85274c = videoAd;
            this.f85275d = f;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            sh2.this.f85253a.onVolumeChanged(this.f85274c, this.f85275d);
            return Unit.f99208a;
        }
    }

    public sh2(@NotNull VideoAdPlaybackListener videoAdPlaybackListener, @NotNull ng2 videoAdAdapterCache) {
        Intrinsics.checkNotNullParameter(videoAdPlaybackListener, "videoAdPlaybackListener");
        Intrinsics.checkNotNullParameter(videoAdAdapterCache, "videoAdAdapterCache");
        this.f85253a = videoAdPlaybackListener;
        this.f85254b = videoAdAdapterCache;
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: b */
    public final void mo26039b(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31366d(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: c */
    public final void mo26038c(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31369g(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: d */
    public final void mo26037d(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31367e(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: e */
    public final void mo26036e(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31370h(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: f */
    public final void mo26035f(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31364b(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: g */
    public final void mo26034g(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31365c(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: h */
    public final void mo26033h(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31363a(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: i */
    public final void mo26032i(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31371i(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: a */
    public final void mo26042a(@NotNull ej0 videoAdCreativePlayback) {
        Intrinsics.checkNotNullParameter(videoAdCreativePlayback, "videoAdCreativePlayback");
        new CallbackStackTraceMarker(new th2(this, this.f85254b.m31515a(videoAdCreativePlayback.m34516a())));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: a */
    public final void mo26041a(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31368f(this.f85254b.m31515a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    /* renamed from: a */
    public final void mo26040a(@NotNull kl0 videoAd, float f) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        new CallbackStackTraceMarker(new C31372j(this.f85254b.m31515a(videoAd), f));
    }
}

package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class eh2 implements InterfaceC31923ys {
    @Nullable

    /* renamed from: a */
    private final RewardedAdEventListener f78602a;

    /* renamed from: com.yandex.mobile.ads.impl.eh2$a */
    /* loaded from: classes8.dex */
    static final class C30243a extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30243a() {
            super(0);
            eh2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            RewardedAdEventListener rewardedAdEventListener = eh2.this.f78602a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdClicked();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eh2$b */
    /* loaded from: classes8.dex */
    static final class C30244b extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30244b() {
            super(0);
            eh2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            RewardedAdEventListener rewardedAdEventListener = eh2.this.f78602a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdDismissed();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eh2$c */
    /* loaded from: classes8.dex */
    static final class C30245c extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ kf2 f78606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30245c(kf2 kf2Var) {
            super(0);
            eh2.this = r1;
            this.f78606c = kf2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            RewardedAdEventListener rewardedAdEventListener = eh2.this.f78602a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdFailedToShow(this.f78606c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eh2$d */
    /* loaded from: classes8.dex */
    static final class C30246d extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ ag2 f78608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30246d(ag2 ag2Var) {
            super(0);
            eh2.this = r1;
            this.f78608c = ag2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            RewardedAdEventListener rewardedAdEventListener = eh2.this.f78602a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdImpression(this.f78608c);
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eh2$e */
    /* loaded from: classes8.dex */
    static final class C30247e extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30247e() {
            super(0);
            eh2.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            RewardedAdEventListener rewardedAdEventListener = eh2.this.f78602a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdShown();
            }
            return Unit.f99208a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eh2$f */
    /* loaded from: classes8.dex */
    static final class C30248f extends Lambda implements Functions<Unit> {

        /* renamed from: c */
        final /* synthetic */ ch2 f78611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30248f(ch2 ch2Var) {
            super(0);
            eh2.this = r1;
            this.f78611c = ch2Var;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            RewardedAdEventListener rewardedAdEventListener = eh2.this.f78602a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onRewarded(this.f78611c);
            }
            return Unit.f99208a;
        }
    }

    public eh2(@Nullable RewardedAdEventListener rewardedAdEventListener) {
        this.f78602a = rewardedAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31923ys
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new C30243a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31923ys
    public final void onAdDismissed() {
        new CallbackStackTraceMarker(new C30244b());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31923ys
    public final void onAdShown() {
        new CallbackStackTraceMarker(new C30247e());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31923ys
    /* renamed from: a */
    public final void mo26615a(@NotNull ut1 adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        new CallbackStackTraceMarker(new C30245c(new kf2(adError.m28636a())));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31923ys
    /* renamed from: a */
    public final void mo26617a(@Nullable AdImpressionData adImpressionData) {
        new CallbackStackTraceMarker(new C30246d(adImpressionData != null ? new ag2(adImpressionData) : null));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31923ys
    /* renamed from: a */
    public final void mo26616a(@NotNull ln1 reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        new CallbackStackTraceMarker(new C30248f(new ch2(reward)));
    }
}

package com.mobilefuse.sdk.controllers;

import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.Debugging;
import com.mobilefuse.sdk.WinningBidInfo;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.internal.repository.AdRepository;
import com.mobilefuse.sdk.internal.repository.ParsedAdMarkupResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.state.AdState;
import com.mobilefuse.sdk.state.AdStateKt;
import com.mobilefuse.sdk.state.Stateful;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdLoadingController.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdLoadingController extends Stateful<AdState> {
    @NotNull
    private Function1<? super AdError, Unit> onError;
    @NotNull
    private Functions<Unit> onLoadingComplete;
    @NotNull
    private Function2<? super ParsedAdMarkup, ? super MfxBidResponse, Unit> onMarkupReceived;
    @Nullable
    private WinningBidInfo winningBidInfo;

    public AdLoadingController() {
        super(AdState.IDLE);
        this.onError = AdLoadingController$onError$1.INSTANCE;
        this.onMarkupReceived = AdLoadingController$onMarkupReceived$1.INSTANCE;
        this.onLoadingComplete = AdLoadingController$onLoadingComplete$1.INSTANCE;
    }

    @NotNull
    public final Function1<AdError, Unit> getOnError() {
        return this.onError;
    }

    @NotNull
    public final Functions<Unit> getOnLoadingComplete() {
        return this.onLoadingComplete;
    }

    @NotNull
    public final Function2<ParsedAdMarkup, MfxBidResponse, Unit> getOnMarkupReceived() {
        return this.onMarkupReceived;
    }

    @Nullable
    public final WinningBidInfo getWinningBidInfo() {
        return this.winningBidInfo;
    }

    public final void loadAd(@NotNull AdRepository<ParsedAdMarkupResponse> adRepository) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        if (stateIsOneOf(AdState.DESTROYED)) {
            return;
        }
        if (AdStateKt.hasAd(this)) {
            Debugging.logDebug$default(this, "Ad can't be loaded: Current ad state is " + getState().name(), null, 2, null);
            this.onError.invoke(AdError.AD_ALREADY_LOADED);
            return;
        }
        setState(AdState.LOADING);
        adRepository.loadAd(new AdLoadingController$loadAd$1(this), new AdLoadingController$loadAd$2(this, adRepository));
    }

    public final void setOnError(@NotNull Function1<? super AdError, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onError = function1;
    }

    public final void setOnLoadingComplete(@NotNull Functions<Unit> functions) {
        Intrinsics.checkNotNullParameter(functions, "<set-?>");
        this.onLoadingComplete = functions;
    }

    public final void setOnMarkupReceived(@NotNull Function2<? super ParsedAdMarkup, ? super MfxBidResponse, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onMarkupReceived = function2;
    }
}

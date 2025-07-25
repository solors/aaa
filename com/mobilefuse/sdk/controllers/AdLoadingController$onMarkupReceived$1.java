package com.mobilefuse.sdk.controllers;

import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdLoadingController.kt */
@Metadata
/* loaded from: classes7.dex */
final class AdLoadingController$onMarkupReceived$1 extends Lambda implements Function2<ParsedAdMarkup, MfxBidResponse, Unit> {
    public static final AdLoadingController$onMarkupReceived$1 INSTANCE = new AdLoadingController$onMarkupReceived$1();

    AdLoadingController$onMarkupReceived$1() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ParsedAdMarkup parsedAdMarkup, @NotNull MfxBidResponse mfxBidResponse) {
        Intrinsics.checkNotNullParameter(parsedAdMarkup, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(mfxBidResponse, "<anonymous parameter 1>");
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(ParsedAdMarkup parsedAdMarkup, MfxBidResponse mfxBidResponse) {
        invoke2(parsedAdMarkup, mfxBidResponse);
        return Unit.f99208a;
    }
}

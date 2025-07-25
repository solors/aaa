package com.mobilefuse.sdk.controllers;

import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.state.AdState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdLoadingController.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdLoadingController$loadAd$1 extends Lambda implements Function1<BaseError, Unit> {
    final /* synthetic */ AdLoadingController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLoadingController$loadAd$1(AdLoadingController adLoadingController) {
        super(1);
        this.this$0 = adLoadingController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BaseError baseError) {
        invoke2(baseError);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull BaseError it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.setState(AdState.NOT_FILLED);
    }
}

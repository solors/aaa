package com.mobilefuse.sdk.controllers;

import com.mobilefuse.sdk.AdError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdLoadingController.kt */
@Metadata
/* loaded from: classes7.dex */
final class AdLoadingController$onError$1 extends Lambda implements Function1<AdError, Unit> {
    public static final AdLoadingController$onError$1 INSTANCE = new AdLoadingController$onError$1();

    AdLoadingController$onError$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AdError it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdError adError) {
        invoke2(adError);
        return Unit.f99208a;
    }
}

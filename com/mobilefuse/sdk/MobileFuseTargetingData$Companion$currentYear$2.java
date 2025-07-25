package com.mobilefuse.sdk;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: MobileFuseTargetingData.kt */
@Metadata
/* loaded from: classes7.dex */
final class MobileFuseTargetingData$Companion$currentYear$2 extends Lambda implements Functions<Integer> {
    public static final MobileFuseTargetingData$Companion$currentYear$2 INSTANCE = new MobileFuseTargetingData$Companion$currentYear$2();

    MobileFuseTargetingData$Companion$currentYear$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Integer invoke() {
        return Integer.valueOf(invoke2());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final int invoke2() {
        return Utils.getCurrentYear();
    }
}

package com.mobilefuse.sdk.mfx;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: MfxRequestAd.kt */
@Metadata
/* loaded from: classes7.dex */
final class MfxRequestAdKt$createBidRequest$1 extends Lambda implements Functions<Boolean> {
    final /* synthetic */ boolean $limitedUserDataProcessing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfxRequestAdKt$createBidRequest$1(boolean z) {
        super(0);
        this.$limitedUserDataProcessing = z;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(invoke2());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2() {
        return this.$limitedUserDataProcessing;
    }
}

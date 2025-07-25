package com.mobilefuse.sdk.privacy;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PrivacyCenter.kt */
@Metadata
/* loaded from: classes7.dex */
final /* synthetic */ class PrivacyCenter$isDntLimitsUserData$1 extends FunctionReferenceImpl implements Functions<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PrivacyCenter$isDntLimitsUserData$1(PrivacyCenter privacyCenter) {
        super(0, privacyCenter, PrivacyCenterKt.class, "dntFactory", "dntFactory(Lcom/mobilefuse/sdk/privacy/PrivacyCenter;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(invoke2());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2() {
        return PrivacyCenterKt.dntFactory((PrivacyCenter) this.receiver);
    }
}

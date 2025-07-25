package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.privacy.PrivacyCenter;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetEidSource.kt */
@Metadata
/* loaded from: classes7.dex */
public final class GetEidSourceKt$getEidSource$2 extends Lambda implements Functions<Boolean> {
    public static final GetEidSourceKt$getEidSource$2 INSTANCE = new GetEidSourceKt$getEidSource$2();

    GetEidSourceKt$getEidSource$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(invoke2());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2() {
        return PrivacyCenter.isSdkLimitedToSendUserData$default(null, 1, null);
    }
}

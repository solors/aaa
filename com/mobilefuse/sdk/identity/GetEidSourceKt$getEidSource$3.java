package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.MobileFuseSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetEidSource.kt */
@Metadata
/* loaded from: classes7.dex */
public final /* synthetic */ class GetEidSourceKt$getEidSource$3 extends FunctionReferenceImpl implements Functions<String> {
    public static final GetEidSourceKt$getEidSource$3 INSTANCE = new GetEidSourceKt$getEidSource$3();

    GetEidSourceKt$getEidSource$3() {
        super(0, MobileFuseSettings.class, "getAdvertisingId", "getAdvertisingId()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final String invoke() {
        return MobileFuseSettings.getAdvertisingId();
    }
}

package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.network.client.HttpParamsPostBody;
import com.mobilefuse.sdk.network.client.HttpPostRequest;
import com.mobilefuse.sdk.p543rx.AdvertisingIdFlow;
import com.mobilefuse.sdk.p543rx.Flow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MfxRequestAd.kt */
@Metadata
/* loaded from: classes7.dex */
public final /* synthetic */ class MfxRequestAdKt$requestMfxAd$1 extends FunctionReferenceImpl implements Function1<Flow<? extends HttpPostRequest<? extends HttpParamsPostBody>>, Flow<? extends HttpPostRequest<? extends HttpParamsPostBody>>> {
    public static final MfxRequestAdKt$requestMfxAd$1 INSTANCE = new MfxRequestAdKt$requestMfxAd$1();

    MfxRequestAdKt$requestMfxAd$1() {
        super(1, AdvertisingIdFlow.class, "waitForAdvertisingId", "waitForAdvertisingId(Lcom/mobilefuse/sdk/rx/Flow;)Lcom/mobilefuse/sdk/rx/Flow;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Flow<? extends HttpPostRequest<? extends HttpParamsPostBody>> invoke(Flow<? extends HttpPostRequest<? extends HttpParamsPostBody>> flow) {
        return invoke2((Flow<HttpPostRequest<HttpParamsPostBody>>) flow);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Flow<HttpPostRequest<HttpParamsPostBody>> invoke2(@NotNull Flow<HttpPostRequest<HttpParamsPostBody>> p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        return AdvertisingIdFlow.waitForAdvertisingId(p1);
    }
}

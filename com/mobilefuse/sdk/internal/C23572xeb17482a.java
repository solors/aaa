package com.mobilefuse.sdk.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MobileFuseBiddingTokenProvider_getTokenData.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider_getTokenDataKt$getBiddingTokenData$1 */
/* loaded from: classes7.dex */
public final class C23572xeb17482a extends Lambda implements Functions<Unit> {
    final /* synthetic */ TokenDataListener $listener;
    final /* synthetic */ IMobileFuseBiddingTokenRequest $request;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23572xeb17482a(IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest, TokenDataListener tokenDataListener) {
        super(0);
        this.$request = iMobileFuseBiddingTokenRequest;
        this.$listener = tokenDataListener;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<String, String> buildTokenWithRequest;
        try {
            buildTokenWithRequest = MobileFuseBiddingTokenProvider_getTokenData.buildTokenWithRequest(this.$request);
            this.$listener.onDataGenerated(buildTokenWithRequest);
        } catch (Throwable th) {
            TokenDataListener tokenDataListener = this.$listener;
            tokenDataListener.onDataGenerationFailed("Failed to generate token with internal error: " + th.getMessage());
        }
    }
}

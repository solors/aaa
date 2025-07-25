package com.mobilefuse.sdk.internal;

import android.util.Base64;
import com.mobilefuse.sdk.encoding.Gzip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseBiddingTokenProvider$Companion$getToken$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ TokenGeneratorListener $listener;
    final /* synthetic */ MobileFuseBiddingTokenRequest $request;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseBiddingTokenProvider$Companion$getToken$1(MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest, TokenGeneratorListener tokenGeneratorListener) {
        super(0);
        this.$request = mobileFuseBiddingTokenRequest;
        this.$listener = tokenGeneratorListener;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        JSONObject buildJsonObjectWithRequest;
        try {
            buildJsonObjectWithRequest = MobileFuseBiddingTokenProvider.Companion.buildJsonObjectWithRequest(this.$request);
            String jSONObject = buildJsonObjectWithRequest.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
            String token = Base64.encodeToString(Gzip.toGzipByteArray(jSONObject), 2);
            TokenGeneratorListener tokenGeneratorListener = this.$listener;
            Intrinsics.checkNotNullExpressionValue(token, "token");
            tokenGeneratorListener.onTokenGenerated(token);
        } catch (Throwable th) {
            TokenGeneratorListener tokenGeneratorListener2 = this.$listener;
            tokenGeneratorListener2.onTokenGenerationFailed("Failed to generate token with internal error: " + th.getMessage());
        }
    }
}

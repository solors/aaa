package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStrings;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.p687v1.GetTokenEventRequestKt;
import gatewayprotocol.p687v1.GetTokenEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetAndroidTokenEventRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class GetAndroidTokenEventRequest implements GetHbTokenEventRequest {
    @Override // com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest
    @Nullable
    public Object invoke(@NotNull ByteString byteString, @NotNull BiddingSignals biddingSignals, @NotNull Continuation<? super GetTokenEventRequestOuterClass.GetTokenEventRequest> continuation) {
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        GetTokenEventRequestKt.Dsl _create = companion._create(newBuilder);
        _create.setTokenId(byteString);
        String it = biddingSignals.getRvSignal();
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            _create.setRewarded(ByteStrings.toByteStringUtf8(it));
        }
        String it2 = biddingSignals.getInterstitialSignal();
        if (it2 != null) {
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            _create.setInterstitial(ByteStrings.toByteStringUtf8(it2));
        }
        String it3 = biddingSignals.getBannerSignal();
        if (it3 != null) {
            Intrinsics.checkNotNullExpressionValue(it3, "it");
            _create.setBanner(ByteStrings.toByteStringUtf8(it3));
        }
        return _create._build();
    }
}

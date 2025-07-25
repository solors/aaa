package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.p687v1.GetTokenEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetHbTokenEventRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetHbTokenEventRequest {
    @Nullable
    Object invoke(@NotNull ByteString byteString, @NotNull BiddingSignals biddingSignals, @NotNull Continuation<? super GetTokenEventRequestOuterClass.GetTokenEventRequest> continuation);
}

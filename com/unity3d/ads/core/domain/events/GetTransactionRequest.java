package com.unity3d.ads.core.domain.events;

import gatewayprotocol.p687v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetTransactionRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetTransactionRequest {
    @Nullable
    Object invoke(@NotNull List<TransactionEventRequestOuterClass.TransactionData> list, @NotNull Continuation<? super TransactionEventRequestOuterClass.TransactionEventRequest> continuation);
}

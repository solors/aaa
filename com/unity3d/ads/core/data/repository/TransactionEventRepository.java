package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p687v1.TransactionEventRequestOuterClass;
import ge.SharedFlow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransactionEventRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public interface TransactionEventRepository {
    void addTransactionEvent(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    @NotNull
    SharedFlow<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents();
}

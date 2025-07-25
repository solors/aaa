package com.unity3d.ads.core.extensions;

import gatewayprotocol.p687v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.TransactionStateExtensionsKt */
/* loaded from: classes7.dex */
public final class TransactionStateExtensions {
    @NotNull
    public static final TransactionEventRequestOuterClass.TransactionState fromPurchaseState(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED;
                }
                return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PENDING;
            }
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_UNSPECIFIED;
        }
        return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PURCHASED;
    }
}

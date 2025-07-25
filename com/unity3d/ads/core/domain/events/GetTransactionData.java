package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import gatewayprotocol.p687v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: GetTransactionData.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetTransactionData {
    @NotNull
    TransactionEventRequestOuterClass.TransactionData invoke(@NotNull PurchaseBridge purchaseBridge, @NotNull SkuDetailsBridge skuDetailsBridge);
}

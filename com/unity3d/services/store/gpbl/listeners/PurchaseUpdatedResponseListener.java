package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchaseUpdatedResponseListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface PurchaseUpdatedResponseListener {
    void onPurchaseUpdated(@NotNull BillingResultBridge billingResultBridge, @Nullable List<? extends PurchaseBridge> list);
}

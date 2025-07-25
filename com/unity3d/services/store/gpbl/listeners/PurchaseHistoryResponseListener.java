package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchaseHistoryResponseListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryUpdated(@NotNull BillingResultBridge billingResultBridge, @Nullable List<? extends PurchaseHistoryRecordBridge> list);
}

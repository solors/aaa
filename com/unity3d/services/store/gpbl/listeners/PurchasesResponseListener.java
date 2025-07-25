package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchasesResponseListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface PurchasesResponseListener {
    void onPurchaseResponse(@NotNull BillingResultBridge billingResultBridge, @Nullable List<? extends PurchaseBridge> list);
}

package com.unity3d.services.store.gpbl.listeners;

import kotlin.Metadata;

/* compiled from: StoreEventListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface StoreEventListener extends PurchaseHistoryResponseListener, SkuDetailsResponseListener, PurchasesResponseListener, PurchaseUpdatedResponseListener, FeatureSupportedListener, BillingInitializationListener {
    int getOperationId();
}

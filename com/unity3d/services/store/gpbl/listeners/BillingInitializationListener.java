package com.unity3d.services.store.gpbl.listeners;

import kotlin.Metadata;

/* compiled from: BillingInitializationListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface BillingInitializationListener extends BillingClientStateListener, PurchaseUpdatedResponseListener {
    void onIsAlreadyInitialized();
}

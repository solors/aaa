package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BillingClientStateListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(@NotNull BillingResultBridge billingResultBridge);
}

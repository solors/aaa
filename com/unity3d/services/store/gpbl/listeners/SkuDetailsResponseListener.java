package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SkuDetailsResponseListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface SkuDetailsResponseListener {
    void onSkuDetailsUpdated(@NotNull BillingResultBridge billingResultBridge, @Nullable List<? extends SkuDetailsBridge> list);
}

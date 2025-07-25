package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryResponse(@NonNull BillingResult billingResult, @Nullable List<PurchaseHistoryRecord> list);
}

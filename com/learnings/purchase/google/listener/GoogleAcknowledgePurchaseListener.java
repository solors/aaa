package com.learnings.purchase.google.listener;

import com.learnings.purchase.PurchaseError;

/* loaded from: classes6.dex */
public interface GoogleAcknowledgePurchaseListener {
    void onFail(PurchaseError purchaseError);

    void onSuccess();
}

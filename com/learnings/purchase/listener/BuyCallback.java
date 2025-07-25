package com.learnings.purchase.listener;

import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseError;

/* loaded from: classes6.dex */
public interface BuyCallback {
    void onFail(PurchaseError purchaseError);

    void onSuccess(PurchaseData purchaseData);
}

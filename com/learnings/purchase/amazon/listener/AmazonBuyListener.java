package com.learnings.purchase.amazon.listener;

import com.amazon.device.iap.model.Receipt;
import com.learnings.purchase.PurchaseError;

/* loaded from: classes6.dex */
public interface AmazonBuyListener {
    void onFail(PurchaseError purchaseError);

    void onSuccess(Receipt receipt);
}

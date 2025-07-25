package com.learnings.purchase.amazon.listener;

import com.amazon.device.iap.model.Receipt;
import com.learnings.purchase.PurchaseError;
import java.util.List;

/* loaded from: classes6.dex */
public interface AmazonPurchaseListener {
    void onFail(PurchaseError purchaseError);

    void onSuccess(List<Receipt> list);
}

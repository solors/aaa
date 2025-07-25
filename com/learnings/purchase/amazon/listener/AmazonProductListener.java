package com.learnings.purchase.amazon.listener;

import com.amazon.device.iap.model.Product;
import com.learnings.purchase.PurchaseError;
import java.util.Map;

/* loaded from: classes6.dex */
public interface AmazonProductListener {
    void onFail(PurchaseError purchaseError);

    void onSuccess(Map<String, Product> map);
}

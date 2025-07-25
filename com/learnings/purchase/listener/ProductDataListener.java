package com.learnings.purchase.listener;

import com.learnings.purchase.ProductData;
import com.learnings.purchase.PurchaseError;
import java.util.List;

/* loaded from: classes6.dex */
public interface ProductDataListener {
    void onFail(PurchaseError purchaseError);

    void onSuccess(List<ProductData> list);
}

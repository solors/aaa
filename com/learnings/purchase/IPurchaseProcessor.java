package com.learnings.purchase;

import com.learnings.purchase.ProductData;
import com.learnings.purchase.PurchaseDispatcher;
import com.learnings.purchase.listener.ProductDataListener;
import com.learnings.purchase.listener.PurchaseDataListener;
import java.util.List;

/* loaded from: classes6.dex */
public interface IPurchaseProcessor {
    void addProducts(ProductData.ProductType productType, List<String> list, ProductDataListener productDataListener);

    void buy(PurchaseDispatcher.BuyParams buyParams);

    void init(PurchaseInitParameter purchaseInitParameter);

    void queryAllPurchases(PurchaseDataListener purchaseDataListener);
}

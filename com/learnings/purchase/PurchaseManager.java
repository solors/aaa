package com.learnings.purchase;

import com.learnings.purchase.ProductData;
import com.learnings.purchase.PurchaseDispatcher;
import com.learnings.purchase.event.EventManager;
import com.learnings.purchase.listener.ProductDataListener;
import com.learnings.purchase.listener.PurchaseDataListener;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class PurchaseManager {
    public static void addProducts(ProductData.ProductType productType, List<String> list, ProductDataListener productDataListener) {
        PurchaseDispatcher.get().addProducts(productType, list, productDataListener);
    }

    public static void buy(PurchaseDispatcher.BuyParams buyParams) {
        PurchaseDispatcher.get().buy(buyParams);
    }

    public static Map<String, ProductData> getAllProductData() {
        return PurchaseDispatcher.get().getAllProductData();
    }

    public static ProductData getProductData(String str) {
        return PurchaseDispatcher.get().getProductData(str);
    }

    public static void init(PurchaseInitParameter purchaseInitParameter) {
        PurchaseDispatcher.get().init(purchaseInitParameter);
    }

    public static void queryAllPurchases(PurchaseDataListener purchaseDataListener) {
        PurchaseDispatcher.get().queryAllPurchases(purchaseDataListener);
    }

    public static void setLearningsId(String str) {
        EventManager.get().setLearningsId(str);
    }
}

package com.learnings.purchase;

import com.learnings.purchase.ProductData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ProductDataManager {
    private final Map<String, ProductData> mProductDataMap;
    private final Map<String, ProductData.ProductType> mProductTypeDataMap;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class Holder {
        private static final ProductDataManager singleton = new ProductDataManager();

        private Holder() {
        }
    }

    public static ProductDataManager get() {
        return Holder.singleton;
    }

    public Map<String, ProductData> getAllProductData() {
        return this.mProductDataMap;
    }

    public ProductData getProductData(String str) {
        return this.mProductDataMap.get(str);
    }

    public ProductData.ProductType getProductType(String str) {
        return this.mProductTypeDataMap.get(str);
    }

    public void init(PurchaseInitParameter purchaseInitParameter) {
        updateProductType(ProductData.ProductType.CONSUMABLE, purchaseInitParameter.getConsumableProductList());
        updateProductType(ProductData.ProductType.ENTITLED, purchaseInitParameter.getEntitledProductList());
        updateProductType(ProductData.ProductType.SUBSCRIPTION, purchaseInitParameter.getSubscriptionProductList());
    }

    public void updateProduct(String str, ProductData productData) {
        this.mProductDataMap.put(str, productData);
    }

    public void updateProductType(ProductData.ProductType productType, List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                this.mProductTypeDataMap.put(str, productType);
            }
        }
    }

    private ProductDataManager() {
        this.mProductDataMap = new HashMap();
        this.mProductTypeDataMap = new HashMap();
    }
}

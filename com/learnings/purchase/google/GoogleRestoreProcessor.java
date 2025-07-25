package com.learnings.purchase.google;

import android.text.TextUtils;
import com.android.billingclient.api.ProductDetails;
import com.learnings.purchase.ProductData;
import com.learnings.purchase.ProductDataManager;
import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseLogUtil;
import com.learnings.purchase.event.EventManager;
import com.learnings.purchase.restore.BaseRestoreProcessor;
import com.learnings.purchase.restore.p404db.RestorePurchaseEntity;

/* loaded from: classes6.dex */
public class GoogleRestoreProcessor extends BaseRestoreProcessor {
    private static final String TAG = "Purchase_GoogleRestoreProcessor";

    private void restoreConsumablePurchase(PurchaseData purchaseData) {
        try {
            ProductData productData = ProductDataManager.get().getProductData(purchaseData.getProductId());
            if (productData == null || productData.getType() != ProductData.ProductType.CONSUMABLE || queryPurchase(purchaseData.getToken()) != null) {
                return;
            }
            PurchaseLogUtil.log(TAG, "restoreConsumablePurchase：" + purchaseData);
            notifyPurchaseRestored(purchaseData);
            savePurchase(purchaseData, RestorePurchaseEntity.RESTORE_TYPE_CONSUMABLE);
            PurchaseLogUtil.log(TAG, "restoreConsumablePurchase success: " + purchaseData);
        } catch (Throwable th) {
            th.printStackTrace();
            PurchaseLogUtil.log(TAG, "restoreConsumablePurchase failed: " + th.getMessage());
        }
    }

    private void restorePendingPurchase(PurchaseData purchaseData) {
        try {
            RestorePurchaseEntity queryPurchase = queryPurchase(purchaseData.getToken());
            if (queryPurchase != null && TextUtils.equals(queryPurchase.getType(), "pending")) {
                PurchaseLogUtil.log(TAG, "restorePendingPurchase：" + purchaseData);
                notifyPurchaseRestored(purchaseData);
                ProductData productData = ProductDataManager.get().getProductData(purchaseData.getProductId());
                if (productData != null && productData.getType() == ProductData.ProductType.CONSUMABLE) {
                    savePurchase(purchaseData, RestorePurchaseEntity.RESTORE_TYPE_CONSUMABLE);
                } else {
                    deletePurchase(queryPurchase);
                    PurchaseLogUtil.log(TAG, "restorePendingPurchase deletePurchase");
                }
                sendEvent(purchaseData);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            PurchaseLogUtil.log(TAG, "restorePendingPurchase failed: " + th.getMessage());
        }
    }

    private void sendEvent(PurchaseData purchaseData) {
        ProductData productData = ProductDataManager.get().getProductData(purchaseData.getProductId());
        if (productData == null) {
            return;
        }
        GoogleEventBuilder googleEventBuilder = new GoogleEventBuilder();
        googleEventBuilder.setSkuId(productData.getProductId());
        googleEventBuilder.setType(((ProductDetails) productData.getSourceData()).getProductType());
        googleEventBuilder.setDisplayCurrency(productData.getPriceCurrencyCode());
        googleEventBuilder.setDisplayPrice(String.valueOf(productData.getPriceAmountMicros()));
        googleEventBuilder.setSuccess(true);
        googleEventBuilder.setStatus("success");
        googleEventBuilder.setPurchaseTime(purchaseData.getPurchaseTime());
        googleEventBuilder.setOrderId(purchaseData.getOrderId());
        googleEventBuilder.setToken(purchaseData.getToken());
        EventManager.get().sendEvent(googleEventBuilder);
    }

    @Override // com.learnings.purchase.restore.IRestoreProcessor
    public void restorePurchase(PurchaseData purchaseData) {
        restorePendingPurchase(purchaseData);
        restoreConsumablePurchase(purchaseData);
    }
}

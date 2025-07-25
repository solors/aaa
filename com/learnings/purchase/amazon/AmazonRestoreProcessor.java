package com.learnings.purchase.amazon;

import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseLogUtil;
import com.learnings.purchase.restore.BaseRestoreProcessor;
import com.learnings.purchase.restore.p404db.RestorePurchaseEntity;

/* loaded from: classes6.dex */
public class AmazonRestoreProcessor extends BaseRestoreProcessor {
    private static final String TAG = "Purchase_AmazonRestoreProcessor";

    @Override // com.learnings.purchase.restore.IRestoreProcessor
    public void restorePurchase(PurchaseData purchaseData) {
        try {
            if (((Receipt) purchaseData.getSourceData()).getProductType() != ProductType.CONSUMABLE || queryPurchase(purchaseData.getToken()) != null) {
                return;
            }
            notifyPurchaseRestored(purchaseData);
            savePurchase(purchaseData, RestorePurchaseEntity.RESTORE_TYPE_CONSUMABLE);
            PurchaseLogUtil.log(TAG, "restoreConsumablePurchase success: " + purchaseData);
        } catch (Throwable th) {
            th.printStackTrace();
            PurchaseLogUtil.log(TAG, "restorePurchase failed: " + th.getMessage());
        }
    }
}

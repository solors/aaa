package com.learnings.purchase.restore;

import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseInitParameter;

/* loaded from: classes6.dex */
public interface IRestoreProcessor {
    void init(PurchaseInitParameter purchaseInitParameter);

    void restorePurchase(PurchaseData purchaseData);

    void savePurchase(PurchaseData purchaseData, String str);
}

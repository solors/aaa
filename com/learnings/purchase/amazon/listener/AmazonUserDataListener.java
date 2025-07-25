package com.learnings.purchase.amazon.listener;

import com.amazon.device.iap.model.UserData;
import com.learnings.purchase.PurchaseError;

/* loaded from: classes6.dex */
public interface AmazonUserDataListener {
    void onFail(PurchaseError purchaseError);

    void onSuccess(UserData userData);
}

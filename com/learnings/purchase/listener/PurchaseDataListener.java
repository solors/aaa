package com.learnings.purchase.listener;

import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseError;
import java.util.List;

/* loaded from: classes6.dex */
public interface PurchaseDataListener {
    void onFail(PurchaseError purchaseError);

    void onSuccess(List<PurchaseData> list);
}

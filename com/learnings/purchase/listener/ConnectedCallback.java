package com.learnings.purchase.listener;

import com.learnings.purchase.PurchaseError;

/* loaded from: classes6.dex */
public interface ConnectedCallback {
    void onFail(PurchaseError purchaseError);

    void onSuccess();
}

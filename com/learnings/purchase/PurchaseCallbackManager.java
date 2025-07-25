package com.learnings.purchase;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class PurchaseCallbackManager {
    private final List<PurchaseCallback> mPurchaseCallbackList;

    /* loaded from: classes6.dex */
    private static class Holder {
        private static final PurchaseCallbackManager singleton = new PurchaseCallbackManager();

        private Holder() {
        }
    }

    /* loaded from: classes6.dex */
    public interface PurchaseCallback {
        void onSuccess(PurchaseData purchaseData);
    }

    public static PurchaseCallbackManager get() {
        return Holder.singleton;
    }

    public void addPurchaseCallback(PurchaseCallback purchaseCallback) {
        if (purchaseCallback != null && !this.mPurchaseCallbackList.contains(purchaseCallback)) {
            this.mPurchaseCallbackList.add(purchaseCallback);
        }
    }

    public void onSuccess(PurchaseData purchaseData) {
        if (this.mPurchaseCallbackList.isEmpty()) {
            return;
        }
        for (PurchaseCallback purchaseCallback : this.mPurchaseCallbackList) {
            purchaseCallback.onSuccess(purchaseData);
        }
    }

    public void removePurchaseCallback(PurchaseCallback purchaseCallback) {
        this.mPurchaseCallbackList.remove(purchaseCallback);
    }

    private PurchaseCallbackManager() {
        this.mPurchaseCallbackList = new ArrayList();
    }
}

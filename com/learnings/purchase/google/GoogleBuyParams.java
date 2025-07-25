package com.learnings.purchase.google;

import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseError;

/* loaded from: classes6.dex */
class GoogleBuyParams {
    private GoogleBuyCallback mGoogleBuyCallback;
    private String mProductId;

    /* loaded from: classes6.dex */
    public interface GoogleBuyCallback {
        void onFail(PurchaseError purchaseError);

        void onPending(PurchaseData purchaseData);

        void onSuccess(PurchaseData purchaseData);
    }

    public GoogleBuyParams(String str, GoogleBuyCallback googleBuyCallback) {
        this.mProductId = str;
        this.mGoogleBuyCallback = googleBuyCallback;
    }

    public void callbackFail(PurchaseError purchaseError) {
        GoogleBuyCallback googleBuyCallback = this.mGoogleBuyCallback;
        if (googleBuyCallback != null) {
            googleBuyCallback.onFail(purchaseError);
        }
    }

    public void callbackPending(PurchaseData purchaseData) {
        GoogleBuyCallback googleBuyCallback = this.mGoogleBuyCallback;
        if (googleBuyCallback != null) {
            googleBuyCallback.onPending(purchaseData);
        }
    }

    public void callbackSuccess(PurchaseData purchaseData) {
        GoogleBuyCallback googleBuyCallback = this.mGoogleBuyCallback;
        if (googleBuyCallback != null) {
            googleBuyCallback.onSuccess(purchaseData);
        }
    }

    public String getProductId() {
        return this.mProductId;
    }
}

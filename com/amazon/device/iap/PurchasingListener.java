package com.amazon.device.iap;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;

/* loaded from: classes2.dex */
public interface PurchasingListener {
    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);

    void onUserDataResponse(UserDataResponse userDataResponse);
}

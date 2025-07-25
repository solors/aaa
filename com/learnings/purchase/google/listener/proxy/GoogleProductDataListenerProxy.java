package com.learnings.purchase.google.listener.proxy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.learnings.purchase.google.GoogleDataHelper;
import com.learnings.purchase.google.GooglePurchaseError;
import com.learnings.purchase.google.listener.proxy.GoogleProductDataListenerProxy;
import com.learnings.purchase.listener.BaseListenerProxy;
import com.learnings.purchase.listener.ProductDataListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class GoogleProductDataListenerProxy extends BaseListenerProxy implements ProductDetailsResponseListener {
    private ProductDataListener mProductDataListener;

    public GoogleProductDataListenerProxy(ProductDataListener productDataListener) {
        this.mProductDataListener = productDataListener;
    }

    public /* synthetic */ void lambda$onProductDetailsResponse$0(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() == 0) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(GoogleDataHelper.generate((ProductDetails) it.next()));
                }
            }
            this.mProductDataListener.onSuccess(arrayList);
            return;
        }
        this.mProductDataListener.onFail(GooglePurchaseError.get(billingResult.getResponseCode()));
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(@NonNull final BillingResult billingResult, @Nullable final List<ProductDetails> list) {
        if (this.mProductDataListener == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: v4.e
            {
                GoogleProductDataListenerProxy.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GoogleProductDataListenerProxy.this.lambda$onProductDetailsResponse$0(billingResult, list);
            }
        });
    }
}

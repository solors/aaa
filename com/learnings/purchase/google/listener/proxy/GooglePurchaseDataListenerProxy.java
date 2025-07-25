package com.learnings.purchase.google.listener.proxy;

import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.learnings.purchase.google.GoogleDataHelper;
import com.learnings.purchase.google.GooglePurchaseError;
import com.learnings.purchase.google.listener.proxy.GooglePurchaseDataListenerProxy;
import com.learnings.purchase.listener.BaseListenerProxy;
import com.learnings.purchase.listener.PurchaseDataListener;
import java.util.List;

/* loaded from: classes6.dex */
public class GooglePurchaseDataListenerProxy extends BaseListenerProxy implements PurchasesResponseListener {
    private PurchaseDataListener mPurchaseDataListener;

    public GooglePurchaseDataListenerProxy(PurchaseDataListener purchaseDataListener) {
        this.mPurchaseDataListener = purchaseDataListener;
    }

    public /* synthetic */ void lambda$onQueryPurchasesResponse$0(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() == 0) {
            this.mPurchaseDataListener.onSuccess(GoogleDataHelper.generate(list));
        } else {
            this.mPurchaseDataListener.onFail(GooglePurchaseError.get(billingResult.getResponseCode()));
        }
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(@NonNull final BillingResult billingResult, @NonNull final List<Purchase> list) {
        if (this.mPurchaseDataListener == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: v4.f
            {
                GooglePurchaseDataListenerProxy.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GooglePurchaseDataListenerProxy.this.lambda$onQueryPurchasesResponse$0(billingResult, list);
            }
        });
    }
}

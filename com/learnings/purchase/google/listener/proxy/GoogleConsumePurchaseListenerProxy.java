package com.learnings.purchase.google.listener.proxy;

import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.learnings.purchase.google.GooglePurchaseError;
import com.learnings.purchase.google.listener.GoogleConsumePurchaseListener;
import com.learnings.purchase.google.listener.proxy.GoogleConsumePurchaseListenerProxy;
import com.learnings.purchase.listener.BaseListenerProxy;

/* loaded from: classes6.dex */
public class GoogleConsumePurchaseListenerProxy extends BaseListenerProxy implements ConsumeResponseListener {
    private GoogleConsumePurchaseListener mGoogleConsumePurchaseListener;

    public GoogleConsumePurchaseListenerProxy(GoogleConsumePurchaseListener googleConsumePurchaseListener) {
        this.mGoogleConsumePurchaseListener = googleConsumePurchaseListener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m53635a(GoogleConsumePurchaseListenerProxy googleConsumePurchaseListenerProxy, BillingResult billingResult, String str) {
        googleConsumePurchaseListenerProxy.lambda$onConsumeResponse$0(billingResult, str);
    }

    public /* synthetic */ void lambda$onConsumeResponse$0(BillingResult billingResult, String str) {
        if (billingResult.getResponseCode() == 0) {
            this.mGoogleConsumePurchaseListener.onSuccess(str);
        } else {
            this.mGoogleConsumePurchaseListener.onFail(GooglePurchaseError.get(billingResult.getResponseCode()));
        }
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(@NonNull final BillingResult billingResult, @NonNull final String str) {
        if (this.mGoogleConsumePurchaseListener == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: v4.d
            @Override // java.lang.Runnable
            public final void run() {
                GoogleConsumePurchaseListenerProxy.m53635a(GoogleConsumePurchaseListenerProxy.this, billingResult, str);
            }
        });
    }
}

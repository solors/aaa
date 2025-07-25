package com.learnings.purchase.google.listener.proxy;

import androidx.annotation.NonNull;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingResult;
import com.learnings.purchase.google.GooglePurchaseError;
import com.learnings.purchase.google.listener.GoogleAcknowledgePurchaseListener;
import com.learnings.purchase.google.listener.proxy.GoogleAcknowledgePurchaseListenerProxy;
import com.learnings.purchase.listener.BaseListenerProxy;

/* loaded from: classes6.dex */
public class GoogleAcknowledgePurchaseListenerProxy extends BaseListenerProxy implements AcknowledgePurchaseResponseListener {
    private GoogleAcknowledgePurchaseListener mGoogleAcknowledgePurchaseListener;

    public GoogleAcknowledgePurchaseListenerProxy(GoogleAcknowledgePurchaseListener googleAcknowledgePurchaseListener) {
        this.mGoogleAcknowledgePurchaseListener = googleAcknowledgePurchaseListener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m53638a(GoogleAcknowledgePurchaseListenerProxy googleAcknowledgePurchaseListenerProxy, BillingResult billingResult) {
        googleAcknowledgePurchaseListenerProxy.lambda$onAcknowledgePurchaseResponse$0(billingResult);
    }

    public /* synthetic */ void lambda$onAcknowledgePurchaseResponse$0(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            this.mGoogleAcknowledgePurchaseListener.onSuccess();
        } else {
            this.mGoogleAcknowledgePurchaseListener.onFail(GooglePurchaseError.get(billingResult.getResponseCode()));
        }
    }

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public void onAcknowledgePurchaseResponse(@NonNull final BillingResult billingResult) {
        if (this.mGoogleAcknowledgePurchaseListener == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: v4.a
            @Override // java.lang.Runnable
            public final void run() {
                GoogleAcknowledgePurchaseListenerProxy.m53638a(GoogleAcknowledgePurchaseListenerProxy.this, billingResult);
            }
        });
    }
}

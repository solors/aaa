package com.learnings.purchase.google.listener.proxy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.learnings.purchase.google.listener.proxy.GooglePurchasesUpdatedListenerProxy;
import com.learnings.purchase.listener.BaseListenerProxy;
import java.util.List;

/* loaded from: classes6.dex */
public class GooglePurchasesUpdatedListenerProxy extends BaseListenerProxy implements PurchasesUpdatedListener {
    private PurchasesUpdatedListener mPurchasesUpdatedListener;

    public GooglePurchasesUpdatedListenerProxy(PurchasesUpdatedListener purchasesUpdatedListener) {
        this.mPurchasesUpdatedListener = purchasesUpdatedListener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m53632a(GooglePurchasesUpdatedListenerProxy googlePurchasesUpdatedListenerProxy, BillingResult billingResult, List list) {
        googlePurchasesUpdatedListenerProxy.lambda$onPurchasesUpdated$0(billingResult, list);
    }

    public /* synthetic */ void lambda$onPurchasesUpdated$0(BillingResult billingResult, List list) {
        this.mPurchasesUpdatedListener.onPurchasesUpdated(billingResult, list);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(@NonNull final BillingResult billingResult, @Nullable final List<Purchase> list) {
        if (this.mPurchasesUpdatedListener == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: v4.g
            @Override // java.lang.Runnable
            public final void run() {
                GooglePurchasesUpdatedListenerProxy.m53632a(GooglePurchasesUpdatedListenerProxy.this, billingResult, list);
            }
        });
    }
}

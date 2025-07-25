package com.learnings.purchase.google.listener.proxy;

import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.learnings.purchase.google.listener.proxy.GoogleBillingClientStateListenerProxy;
import com.learnings.purchase.listener.BaseListenerProxy;

/* loaded from: classes6.dex */
public class GoogleBillingClientStateListenerProxy extends BaseListenerProxy implements BillingClientStateListener {
    private BillingClientStateListener mBillingClientStateListener;

    public GoogleBillingClientStateListenerProxy(BillingClientStateListener billingClientStateListener) {
        this.mBillingClientStateListener = billingClientStateListener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m53637a(GoogleBillingClientStateListenerProxy googleBillingClientStateListenerProxy) {
        googleBillingClientStateListenerProxy.lambda$onBillingServiceDisconnected$0();
    }

    /* renamed from: b */
    public static /* synthetic */ void m53636b(GoogleBillingClientStateListenerProxy googleBillingClientStateListenerProxy, BillingResult billingResult) {
        googleBillingClientStateListenerProxy.lambda$onBillingSetupFinished$1(billingResult);
    }

    public /* synthetic */ void lambda$onBillingServiceDisconnected$0() {
        this.mBillingClientStateListener.onBillingServiceDisconnected();
    }

    public /* synthetic */ void lambda$onBillingSetupFinished$1(BillingResult billingResult) {
        this.mBillingClientStateListener.onBillingSetupFinished(billingResult);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        if (this.mBillingClientStateListener == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: v4.c
            @Override // java.lang.Runnable
            public final void run() {
                GoogleBillingClientStateListenerProxy.m53637a(GoogleBillingClientStateListenerProxy.this);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(@NonNull final BillingResult billingResult) {
        if (this.mBillingClientStateListener == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: v4.b
            @Override // java.lang.Runnable
            public final void run() {
                GoogleBillingClientStateListenerProxy.m53636b(GoogleBillingClientStateListenerProxy.this, billingResult);
            }
        });
    }
}

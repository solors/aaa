package com.learnings.purchase.restore;

import com.learnings.purchase.Platform;
import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseInitParameter;
import com.learnings.purchase.PurchaseWorker;
import com.learnings.purchase.amazon.AmazonRestoreProcessor;
import com.learnings.purchase.google.GoogleRestoreProcessor;

/* loaded from: classes6.dex */
public class PurchaseRestoreManager implements IRestoreProcessor {
    private IRestoreProcessor mRestoreProcessor;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class Holder {
        private static final PurchaseRestoreManager singleton = new PurchaseRestoreManager();

        private Holder() {
        }
    }

    public static PurchaseRestoreManager get() {
        return Holder.singleton;
    }

    public /* synthetic */ void lambda$init$0(PurchaseInitParameter purchaseInitParameter) {
        IRestoreProcessor googleRestoreProcessor;
        if (purchaseInitParameter.getPlatform() == Platform.AMAZON) {
            googleRestoreProcessor = new AmazonRestoreProcessor();
        } else {
            googleRestoreProcessor = new GoogleRestoreProcessor();
        }
        this.mRestoreProcessor = googleRestoreProcessor;
        googleRestoreProcessor.init(purchaseInitParameter);
    }

    public /* synthetic */ void lambda$restorePurchase$2(PurchaseData purchaseData) {
        IRestoreProcessor iRestoreProcessor = this.mRestoreProcessor;
        if (iRestoreProcessor != null) {
            iRestoreProcessor.restorePurchase(purchaseData);
        }
    }

    public /* synthetic */ void lambda$savePurchase$1(PurchaseData purchaseData, String str) {
        IRestoreProcessor iRestoreProcessor = this.mRestoreProcessor;
        if (iRestoreProcessor != null) {
            iRestoreProcessor.savePurchase(purchaseData, str);
        }
    }

    @Override // com.learnings.purchase.restore.IRestoreProcessor
    public void init(final PurchaseInitParameter purchaseInitParameter) {
        PurchaseWorker.get().run(new Runnable() { // from class: com.learnings.purchase.restore.c
            {
                PurchaseRestoreManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PurchaseRestoreManager.this.lambda$init$0(purchaseInitParameter);
            }
        });
    }

    @Override // com.learnings.purchase.restore.IRestoreProcessor
    public void restorePurchase(final PurchaseData purchaseData) {
        PurchaseWorker.get().run(new Runnable() { // from class: com.learnings.purchase.restore.d
            {
                PurchaseRestoreManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PurchaseRestoreManager.this.lambda$restorePurchase$2(purchaseData);
            }
        });
    }

    @Override // com.learnings.purchase.restore.IRestoreProcessor
    public void savePurchase(final PurchaseData purchaseData, final String str) {
        PurchaseWorker.get().run(new Runnable() { // from class: com.learnings.purchase.restore.b
            {
                PurchaseRestoreManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PurchaseRestoreManager.this.lambda$savePurchase$1(purchaseData, str);
            }
        });
    }

    private PurchaseRestoreManager() {
    }
}

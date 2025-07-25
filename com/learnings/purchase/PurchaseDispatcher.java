package com.learnings.purchase;

import android.app.Activity;
import android.os.Bundle;
import com.learnings.purchase.ProductData;
import com.learnings.purchase.amazon.AmazonPurchaseProcessor;
import com.learnings.purchase.event.EventManager;
import com.learnings.purchase.google.GooglePurchaseProcessor;
import com.learnings.purchase.listener.BuyCallback;
import com.learnings.purchase.listener.ProductDataListener;
import com.learnings.purchase.listener.PurchaseDataListener;
import com.learnings.purchase.restore.PurchaseRestoreManager;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class PurchaseDispatcher implements IPurchaseProcessor {
    private static final String TAG = "Purchase_PurchaseDispatcher";
    private volatile boolean isInit;
    private IPurchaseProcessor mPurchaseProcessor;

    /* loaded from: classes6.dex */
    public static class BuyParams {
        private final Activity activity;
        private BuyCallback buyCallback;
        private Bundle extraData;
        private String oldProductId;
        private final String productId;

        public BuyParams(Activity activity, String str) {
            this.activity = activity;
            this.productId = str;
        }

        public Activity getActivity() {
            return this.activity;
        }

        public BuyCallback getBuyCallback() {
            return this.buyCallback;
        }

        public Bundle getExtraData() {
            return this.extraData;
        }

        public String getOldProductId() {
            return this.oldProductId;
        }

        public String getProductId() {
            return this.productId;
        }

        public BuyParams setBuyCallback(BuyCallback buyCallback) {
            this.buyCallback = buyCallback;
            return this;
        }

        public BuyParams setExtraData(Bundle bundle) {
            this.extraData = bundle;
            return this;
        }

        public BuyParams setOldProductId(String str) {
            this.oldProductId = str;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static class Holder {
        private static final PurchaseDispatcher singleton = new PurchaseDispatcher();

        private Holder() {
        }
    }

    public static PurchaseDispatcher get() {
        return Holder.singleton;
    }

    @Override // com.learnings.purchase.IPurchaseProcessor
    public void addProducts(ProductData.ProductType productType, List<String> list, ProductDataListener productDataListener) {
        ProductDataManager.get().updateProductType(productType, list);
        IPurchaseProcessor iPurchaseProcessor = this.mPurchaseProcessor;
        if (iPurchaseProcessor != null) {
            iPurchaseProcessor.addProducts(productType, list, productDataListener);
        }
    }

    @Override // com.learnings.purchase.IPurchaseProcessor
    public void buy(BuyParams buyParams) {
        IPurchaseProcessor iPurchaseProcessor = this.mPurchaseProcessor;
        if (iPurchaseProcessor != null) {
            iPurchaseProcessor.buy(buyParams);
        }
    }

    public Map<String, ProductData> getAllProductData() {
        return ProductDataManager.get().getAllProductData();
    }

    public ProductData getProductData(String str) {
        return ProductDataManager.get().getProductData(str);
    }

    @Override // com.learnings.purchase.IPurchaseProcessor
    public void init(PurchaseInitParameter purchaseInitParameter) {
        IPurchaseProcessor googlePurchaseProcessor;
        if (this.isInit) {
            return;
        }
        PurchaseLogUtil.setShowLog(purchaseInitParameter.isShowLog());
        EventManager.get().init(purchaseInitParameter);
        ProductDataManager.get().init(purchaseInitParameter);
        PurchaseRestoreManager.get().init(purchaseInitParameter);
        if (purchaseInitParameter.getPlatform() == Platform.AMAZON) {
            googlePurchaseProcessor = new AmazonPurchaseProcessor();
        } else {
            googlePurchaseProcessor = new GooglePurchaseProcessor();
        }
        this.mPurchaseProcessor = googlePurchaseProcessor;
        googlePurchaseProcessor.init(purchaseInitParameter);
        this.isInit = true;
        PurchaseLogUtil.log(TAG, "init: " + this.mPurchaseProcessor.getClass().getSimpleName());
    }

    @Override // com.learnings.purchase.IPurchaseProcessor
    public void queryAllPurchases(PurchaseDataListener purchaseDataListener) {
        IPurchaseProcessor iPurchaseProcessor = this.mPurchaseProcessor;
        if (iPurchaseProcessor != null) {
            iPurchaseProcessor.queryAllPurchases(purchaseDataListener);
        }
    }

    private PurchaseDispatcher() {
    }
}

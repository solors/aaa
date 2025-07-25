package com.learnings.purchase;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.purchase.listener.ConnectedCallback;
import com.learnings.purchase.listener.PurchaseRestoredListener;
import java.util.List;

/* loaded from: classes6.dex */
public class PurchaseInitParameter {
    private ConnectedCallback connectedCallback;
    private List<String> consumableProductList;
    private Context context;
    private List<String> entitledProductList;
    private boolean isShowLog;
    private Platform platform;
    private String productionId;
    private PurchaseRestoredListener purchaseRestoredListener;
    private List<String> subscriptionProductList;

    /* loaded from: classes6.dex */
    public static class Builder {
        private ConnectedCallback connectedCallback;
        private List<String> consumableProductList;
        private Context context;
        private List<String> entitledProductList;
        private boolean isShowLog;
        private String productionId;
        private PurchaseRestoredListener purchaseRestoredListener;
        private List<String> subscriptionProductList;

        public Builder(Context context) {
            this.context = context.getApplicationContext();
        }

        public PurchaseInitParameter build() {
            if (this.context != null) {
                if (!TextUtils.isEmpty(this.productionId)) {
                    return new PurchaseInitParameter(this);
                }
                throw new IllegalArgumentException("productionId must set, use setProductionId(String productionId)");
            }
            throw new NullPointerException("context must set, use Builder(Application context)");
        }

        public Builder setConnectedCallback(ConnectedCallback connectedCallback) {
            this.connectedCallback = connectedCallback;
            return this;
        }

        public Builder setConsumableProductList(List<String> list) {
            this.consumableProductList = list;
            return this;
        }

        public Builder setEntitledProductList(List<String> list) {
            this.entitledProductList = list;
            return this;
        }

        public Builder setProductionId(String str) {
            this.productionId = str;
            return this;
        }

        public Builder setPurchaseRestoredListener(PurchaseRestoredListener purchaseRestoredListener) {
            this.purchaseRestoredListener = purchaseRestoredListener;
            return this;
        }

        public Builder setShowLog(boolean z) {
            this.isShowLog = z;
            return this;
        }

        public Builder setSubscriptionProductList(List<String> list) {
            this.subscriptionProductList = list;
            return this;
        }
    }

    public ConnectedCallback getConnectedCallback() {
        return this.connectedCallback;
    }

    public List<String> getConsumableProductList() {
        return this.consumableProductList;
    }

    public Context getContext() {
        return this.context;
    }

    public List<String> getEntitledProductList() {
        return this.entitledProductList;
    }

    public Platform getPlatform() {
        Platform platform;
        if (this.platform == null) {
            if (Utils.isAmazon(this.context)) {
                platform = Platform.AMAZON;
            } else {
                platform = Platform.GOOGLE;
            }
            this.platform = platform;
        }
        return this.platform;
    }

    public String getProductionId() {
        return this.productionId;
    }

    public PurchaseRestoredListener getPurchaseRestoredListener() {
        return this.purchaseRestoredListener;
    }

    public List<String> getSubscriptionProductList() {
        return this.subscriptionProductList;
    }

    public boolean isShowLog() {
        return this.isShowLog;
    }

    private PurchaseInitParameter(Builder builder) {
        this.context = builder.context;
        this.entitledProductList = builder.entitledProductList;
        this.consumableProductList = builder.consumableProductList;
        this.subscriptionProductList = builder.subscriptionProductList;
        this.connectedCallback = builder.connectedCallback;
        this.purchaseRestoredListener = builder.purchaseRestoredListener;
        this.isShowLog = builder.isShowLog;
        this.productionId = builder.productionId;
    }
}

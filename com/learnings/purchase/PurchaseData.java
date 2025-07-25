package com.learnings.purchase;

/* loaded from: classes6.dex */
public class PurchaseData {
    private String orderId;
    private String productId;
    private long purchaseTime;
    private Object sourceData;
    private String token;

    public String getOrderId() {
        return this.orderId;
    }

    public ProductData getProductData() {
        return ProductDataManager.get().getProductData(this.productId);
    }

    public String getProductId() {
        return this.productId;
    }

    public long getPurchaseTime() {
        return this.purchaseTime;
    }

    public Object getSourceData() {
        return this.sourceData;
    }

    public String getToken() {
        return this.token;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setPurchaseTime(long j) {
        this.purchaseTime = j;
    }

    public void setSourceData(Object obj) {
        this.sourceData = obj;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "\nPurchaseData{\ntoken = " + this.token + "\nproductId = " + this.productId + "\norderId = " + this.orderId + "\npurchaseTime = " + this.purchaseTime + "\nsourceData = " + this.sourceData + "\n}\n";
    }
}

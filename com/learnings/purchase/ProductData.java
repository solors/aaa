package com.learnings.purchase;

import com.learnings.purchase.google.GoogleEventBuilder;
import com.learnings.purchase.restore.p404db.RestorePurchaseEntity;

/* loaded from: classes6.dex */
public class ProductData {
    private String description;
    private String displayPrice;
    private Platform platform;
    private double priceAmountMicros;
    private String priceCurrencyCode;
    private String productId;
    private Object sourceData;
    private String title;
    private ProductType type;

    /* loaded from: classes6.dex */
    public enum ProductType {
        CONSUMABLE(RestorePurchaseEntity.RESTORE_TYPE_CONSUMABLE),
        ENTITLED("entitled"),
        SUBSCRIPTION(GoogleEventBuilder.PRODUCT_TYPE_SUB);
        
        private String value;

        ProductType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisplayPrice() {
        return this.displayPrice;
    }

    public Platform getPlatform() {
        return this.platform;
    }

    public double getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public String getProductId() {
        return this.productId;
    }

    public Object getSourceData() {
        return this.sourceData;
    }

    public String getTitle() {
        return this.title;
    }

    public ProductType getType() {
        return this.type;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDisplayPrice(String str) {
        this.displayPrice = str;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public void setPriceAmountMicros(double d) {
        this.priceAmountMicros = d;
    }

    public void setPriceCurrencyCode(String str) {
        this.priceCurrencyCode = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setSourceData(Object obj) {
        this.sourceData = obj;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(ProductType productType) {
        this.type = productType;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nProductData {\nplatform = ");
        Platform platform = this.platform;
        String str2 = "unknown";
        if (platform == null) {
            str = "unknown";
        } else {
            str = platform.getValue();
        }
        sb2.append(str);
        sb2.append("\nproductId = ");
        sb2.append(this.productId);
        sb2.append("\ntype = ");
        ProductType productType = this.type;
        if (productType != null) {
            str2 = productType.getValue();
        }
        sb2.append(str2);
        sb2.append("\ntitle = ");
        sb2.append(this.title);
        sb2.append("\ndescription = ");
        sb2.append(this.description);
        sb2.append("\ndisplayPrice = ");
        sb2.append(this.displayPrice);
        sb2.append("\npriceAmountMicros = ");
        sb2.append(this.priceAmountMicros);
        sb2.append("\npriceCurrencyCode = ");
        sb2.append(this.priceCurrencyCode);
        sb2.append("\nsourceData = ");
        sb2.append(this.sourceData);
        sb2.append("\n");
        sb2.append('}');
        sb2.append("\n");
        return sb2.toString();
    }
}

package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.p047a.p048a.p071o.Validator;
import com.ironsource.C21114v8;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Receipt {
    private static final String CANCEL_DATE = "endDate";
    private static final Date DATE_CANCELED = new Date(1);
    private static final String DEFERRED_DATE = "deferredDate";
    private static final String DEFERRED_SKU = "deferredSku";
    private static final String PRODUCT_TYPE = "itemType";
    private static final String PURCHASE_DATE = "purchaseDate";
    private static final String RECEIPT_ID = "receiptId";
    private static final String SKU = "sku";
    private static final String TERM_SKU = "termSku";
    private final Date cancelDate;
    private final Date deferredDate;
    private final String deferredSku;
    private final ProductType productType;
    private final Date purchaseDate;
    private final String receiptId;
    private final String sku;
    private final String termSku;

    public Receipt(ReceiptBuilder receiptBuilder) {
        Validator.m102807a((Object) receiptBuilder.getSku(), "sku");
        Validator.m102807a(receiptBuilder.getProductType(), C21114v8.C21122h.f54077m);
        if (ProductType.SUBSCRIPTION == receiptBuilder.getProductType()) {
            Validator.m102807a(receiptBuilder.getPurchaseDate(), "purchaseDate");
        }
        this.receiptId = receiptBuilder.getReceiptId();
        this.sku = receiptBuilder.getSku();
        this.productType = receiptBuilder.getProductType();
        this.purchaseDate = receiptBuilder.getPurchaseDate();
        this.cancelDate = receiptBuilder.getCancelDate();
        this.deferredSku = receiptBuilder.getDeferredSku();
        this.deferredDate = receiptBuilder.getDeferredDate();
        this.termSku = receiptBuilder.getTermSku();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Receipt.class != obj.getClass()) {
            return false;
        }
        Receipt receipt = (Receipt) obj;
        Date date = this.cancelDate;
        if (date == null) {
            if (receipt.cancelDate != null) {
                return false;
            }
        } else if (!date.equals(receipt.cancelDate)) {
            return false;
        }
        if (this.productType != receipt.productType) {
            return false;
        }
        Date date2 = this.purchaseDate;
        if (date2 == null) {
            if (receipt.purchaseDate != null) {
                return false;
            }
        } else if (!date2.equals(receipt.purchaseDate)) {
            return false;
        }
        String str = this.receiptId;
        if (str == null) {
            if (receipt.receiptId != null) {
                return false;
            }
        } else if (!str.equals(receipt.receiptId)) {
            return false;
        }
        String str2 = this.sku;
        if (str2 == null) {
            if (receipt.sku != null) {
                return false;
            }
        } else if (!str2.equals(receipt.sku)) {
            return false;
        }
        String str3 = this.deferredSku;
        if (str3 == null) {
            if (receipt.deferredSku != null) {
                return false;
            }
        } else if (!str3.equals(receipt.deferredSku)) {
            return false;
        }
        Date date3 = this.deferredDate;
        if (date3 == null) {
            if (receipt.deferredDate != null) {
                return false;
            }
        } else if (!date3.equals(receipt.deferredDate) || !this.termSku.equals(receipt.termSku)) {
            return false;
        }
        return true;
    }

    public Date getCancelDate() {
        return this.cancelDate;
    }

    public Date getDeferredDate() {
        return this.deferredDate;
    }

    public String getDeferredSku() {
        return this.deferredSku;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public String getReceiptId() {
        return this.receiptId;
    }

    public String getSku() {
        return this.sku;
    }

    public String getTermSku() {
        return this.termSku;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        Date date = this.cancelDate;
        int i = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        ProductType productType = this.productType;
        if (productType == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = productType.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date2 = this.purchaseDate;
        if (date2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Date date3 = this.deferredDate;
        if (date3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str = this.receiptId;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str2 = this.sku;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str3 = this.deferredSku;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str4 = this.termSku;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i8 + i;
    }

    public boolean isCanceled() {
        if (this.cancelDate != null) {
            return true;
        }
        return false;
    }

    public boolean isDeferred() {
        if (this.deferredDate != null) {
            return true;
        }
        return false;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("receiptId", this.receiptId);
            jSONObject.put("sku", this.sku);
            jSONObject.put("itemType", this.productType);
            jSONObject.put("purchaseDate", this.purchaseDate);
            jSONObject.put("endDate", this.cancelDate);
            jSONObject.put("deferredSku", this.deferredSku);
            jSONObject.put("deferredDate", this.deferredDate);
            jSONObject.put("termSku", this.termSku);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSON().toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }
}

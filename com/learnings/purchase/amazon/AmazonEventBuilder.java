package com.learnings.purchase.amazon;

import android.os.Bundle;
import android.text.TextUtils;
import com.learnings.purchase.event.BaseEventBuilder;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class AmazonEventBuilder extends BaseEventBuilder {
    private String receiptId;

    @Override // com.learnings.purchase.event.BaseEventBuilder
    public Bundle generateEventBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("status", checkString(this.status));
        bundle.putString("reason", checkString(this.reason));
        bundle.putString("sku_id", checkString(this.skuId));
        bundle.putString("receipt_id", checkString(this.receiptId));
        double d = 0.0d;
        try {
            if (!TextUtils.isEmpty(this.displayPrice)) {
                d = Double.parseDouble(this.displayPrice);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        bundle.putDouble("display_price", d);
        bundle.putString("currency", checkString(this.displayCurrency));
        bundle.putString("type", checkString(this.type));
        Bundle bundle2 = this.extraData;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // com.learnings.purchase.event.BaseEventBuilder
    public String generateEventJson() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            jSONObject.put("is_free_trail", false);
            jSONObject.put("production_id", BaseEventBuilder.sProductionId);
            if (!TextUtils.isEmpty(this.skuId)) {
                jSONObject.put("sku_id", this.skuId);
            }
            if (!TextUtils.isEmpty(this.orderId)) {
                jSONObject.put("order_id", this.orderId);
            }
            jSONObject.put("purchase_time", this.purchaseTime);
            if (!TextUtils.isEmpty(this.displayCurrency)) {
                jSONObject.put("display_currency", this.displayCurrency);
            }
            if (!TextUtils.isEmpty(this.displayPrice)) {
                jSONObject.put("display_price", this.displayPrice);
            }
            if (this.isSuccess) {
                str = "success";
            } else {
                str = "failed";
            }
            jSONObject.put("status", str);
            if (!TextUtils.isEmpty(this.reason)) {
                jSONObject.put("reason", this.reason);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public AmazonEventBuilder setReceiptId(String str) {
        this.receiptId = str;
        return this;
    }
}

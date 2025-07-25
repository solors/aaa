package com.learnings.purchase.event;

import android.os.Bundle;
import android.text.TextUtils;
import com.learnings.purchase.event.p403db.EventEntity;
import java.util.UUID;

/* loaded from: classes6.dex */
public abstract class BaseEventBuilder {
    public static final String STATUS_FAILED = "failed";
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_SUCCESS = "success";
    protected static String sProductionId;
    protected String displayCurrency;
    protected String displayPrice;
    protected Bundle extraData;
    protected boolean isSuccess;
    protected String orderId;
    protected long purchaseTime;
    protected String reason;
    protected String skuId;
    protected String status;
    protected String type;

    public static void setProductionId(String str) {
        sProductionId = str;
    }

    public EventEntity build() {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setEventId(UUID.randomUUID().toString());
        eventEntity.setEventJson(generateEventJson());
        return eventEntity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String checkString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unset";
        }
        return str;
    }

    public abstract Bundle generateEventBundle();

    public abstract String generateEventJson();

    public void setDisplayCurrency(String str) {
        this.displayCurrency = str;
    }

    public void setDisplayPrice(String str) {
        this.displayPrice = str;
    }

    public void setExtraData(Bundle bundle) {
        this.extraData = bundle;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPurchaseTime(long j) {
        this.purchaseTime = j;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setSkuId(String str) {
        this.skuId = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public void setType(String str) {
        this.type = str;
    }
}

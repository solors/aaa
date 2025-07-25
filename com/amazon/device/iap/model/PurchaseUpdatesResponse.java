package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PurchaseUpdatesResponse {
    private static final String HAS_MORE = "HAS_MORE";
    private static final String RECEIPTS = "RECEIPTS";
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")";
    private static final String USER_DATA = "USER_DATA";
    private final boolean hasMore;
    private final List<Receipt> receipts;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    /* loaded from: classes2.dex */
    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public PurchaseUpdatesResponse(PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder) {
        List<Receipt> receipts;
        Validator.m102807a(purchaseUpdatesResponseBuilder.getRequestId(), "requestId");
        Validator.m102807a(purchaseUpdatesResponseBuilder.getRequestStatus(), KiwiConstants.f2671C);
        if (RequestStatus.SUCCESSFUL == purchaseUpdatesResponseBuilder.getRequestStatus()) {
            Validator.m102807a(purchaseUpdatesResponseBuilder.getUserData(), "userData");
            Validator.m102807a((Object) purchaseUpdatesResponseBuilder.getReceipts(), KiwiConstants.f2675G);
        }
        this.requestId = purchaseUpdatesResponseBuilder.getRequestId();
        this.requestStatus = purchaseUpdatesResponseBuilder.getRequestStatus();
        this.userData = purchaseUpdatesResponseBuilder.getUserData();
        if (purchaseUpdatesResponseBuilder.getReceipts() == null) {
            receipts = new ArrayList<>();
        } else {
            receipts = purchaseUpdatesResponseBuilder.getReceipts();
        }
        this.receipts = receipts;
        this.hasMore = purchaseUpdatesResponseBuilder.hasMore();
    }

    public List<Receipt> getReceipts() {
        return this.receipts;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public UserData getUserData() {
        return this.userData;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public JSONObject toJSON() throws JSONException {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(REQUEST_ID, this.requestId);
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        UserData userData = this.userData;
        if (userData != null) {
            obj = userData.toJSON();
        } else {
            obj = "";
        }
        jSONObject.put(USER_DATA, obj);
        JSONArray jSONArray = new JSONArray();
        List<Receipt> list = this.receipts;
        if (list != null) {
            for (Receipt receipt : list) {
                jSONArray.put(receipt.toJSON());
            }
        }
        jSONObject.put(RECEIPTS, jSONArray);
        jSONObject.put(HAS_MORE, this.hasMore);
        return jSONObject;
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[6];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        objArr[2] = this.requestStatus;
        objArr[3] = this.userData;
        List<Receipt> list = this.receipts;
        if (list != null) {
            str = Arrays.toString(list.toArray());
        } else {
            str = "null";
        }
        objArr[4] = str;
        objArr[5] = Boolean.valueOf(this.hasMore);
        return String.format(TO_STRING_FORMAT, objArr);
    }
}

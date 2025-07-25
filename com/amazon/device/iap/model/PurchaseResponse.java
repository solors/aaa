package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.p047a.p048a.p071o.Validator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PurchaseResponse {
    private static final String RECEIPT = "receipt";
    private static final String REQUEST_ID = "requestId";
    private static final String REQUEST_STATUS = "requestStatus";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)";
    private static final String USER_DATA = "userData";
    private final Receipt receipt;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    /* loaded from: classes2.dex */
    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        INVALID_SKU,
        ALREADY_PURCHASED,
        PENDING,
        NOT_SUPPORTED;

        public static RequestStatus safeValueOf(String str) {
            if (Validator.m102806a(str)) {
                return null;
            }
            if ("ALREADY_ENTITLED".equalsIgnoreCase(str)) {
                return ALREADY_PURCHASED;
            }
            return valueOf(str.toUpperCase());
        }
    }

    public PurchaseResponse(PurchaseResponseBuilder purchaseResponseBuilder) {
        Validator.m102807a(purchaseResponseBuilder.getRequestId(), "requestId");
        Validator.m102807a(purchaseResponseBuilder.getRequestStatus(), "requestStatus");
        if (purchaseResponseBuilder.getRequestStatus() == RequestStatus.SUCCESSFUL) {
            Validator.m102807a(purchaseResponseBuilder.getReceipt(), "receipt");
            Validator.m102807a(purchaseResponseBuilder.getUserData(), USER_DATA);
        }
        this.requestId = purchaseResponseBuilder.getRequestId();
        this.userData = purchaseResponseBuilder.getUserData();
        this.receipt = purchaseResponseBuilder.getReceipt();
        this.requestStatus = purchaseResponseBuilder.getRequestStatus();
    }

    public Receipt getReceipt() {
        return this.receipt;
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

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("requestId", this.requestId);
        jSONObject2.put("requestStatus", this.requestStatus);
        UserData userData = this.userData;
        Object obj = "";
        if (userData == null) {
            jSONObject = "";
        } else {
            jSONObject = userData.toJSON();
        }
        jSONObject2.put(USER_DATA, jSONObject);
        if (getReceipt() != null) {
            obj = getReceipt().toJSON();
        }
        jSONObject2.put("receipt", obj);
        return jSONObject2;
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[5];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        RequestStatus requestStatus = this.requestStatus;
        if (requestStatus != null) {
            str = requestStatus.toString();
        } else {
            str = "null";
        }
        objArr[2] = str;
        objArr[3] = this.userData;
        objArr[4] = this.receipt;
        return String.format(TO_STRING_FORMAT, objArr);
    }
}

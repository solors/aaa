package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class UserDataResponse {
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")";
    private static final String USER_DATA = "USER_DATA";
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    /* loaded from: classes2.dex */
    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public UserDataResponse(UserDataResponseBuilder userDataResponseBuilder) {
        Validator.m102807a(userDataResponseBuilder.getRequestId(), "requestId");
        Validator.m102807a(userDataResponseBuilder.getRequestStatus(), KiwiConstants.f2671C);
        this.requestId = userDataResponseBuilder.getRequestId();
        this.requestStatus = userDataResponseBuilder.getRequestStatus();
        this.userData = userDataResponseBuilder.getUserData();
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
        return jSONObject;
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        RequestStatus requestStatus = this.requestStatus;
        String str2 = "null";
        if (requestStatus == null) {
            str = "null";
        } else {
            str = requestStatus.toString();
        }
        objArr[2] = str;
        UserData userData = this.userData;
        if (userData != null) {
            str2 = userData.toString();
        }
        objArr[3] = str2;
        return String.format(TO_STRING_FORMAT, objArr);
    }
}

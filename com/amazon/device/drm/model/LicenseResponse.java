package com.amazon.device.drm.model;

import com.amazon.device.drm.p090a.p093c.LicenseResponseBuilder;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LicenseResponse {
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "LicenseResponse: {requestId: \"%s\", requestStatus: \"%s\"}";
    private final RequestId requestId;
    private final RequestStatus requestStatus;

    /* loaded from: classes2.dex */
    public enum RequestStatus {
        LICENSED,
        NOT_LICENSED,
        ERROR_VERIFICATION,
        ERROR_INVALID_LICENSING_KEYS,
        EXPIRED,
        UNKNOWN_ERROR
    }

    public LicenseResponse(LicenseResponseBuilder licenseResponseBuilder) {
        Validator.m102807a(licenseResponseBuilder.m102497b(), "requestId");
        Validator.m102807a(licenseResponseBuilder.m102496c(), KiwiConstants.f2671C);
        this.requestId = licenseResponseBuilder.m102497b();
        this.requestStatus = licenseResponseBuilder.m102496c();
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        jSONObject.put(REQUEST_ID, this.requestId);
        return jSONObject;
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.requestId;
        RequestStatus requestStatus = this.requestStatus;
        if (requestStatus != null) {
            str = requestStatus.toString();
        } else {
            str = "null";
        }
        objArr[1] = str;
        return String.format(TO_STRING_FORMAT, objArr);
    }
}

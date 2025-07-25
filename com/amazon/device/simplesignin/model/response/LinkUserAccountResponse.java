package com.amazon.device.simplesignin.model.response;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;

/* loaded from: classes2.dex */
public class LinkUserAccountResponse {
    private String linkId;
    private RequestId requestId;
    private RequestStatus requestStatus;
    private SuccessCode successCode;

    /* loaded from: classes2.dex */
    public enum SuccessCode {
        LinkAlreadyExists,
        LinkEstablished,
        ConsentDenied
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof LinkUserAccountResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkUserAccountResponse)) {
            return false;
        }
        LinkUserAccountResponse linkUserAccountResponse = (LinkUserAccountResponse) obj;
        if (!linkUserAccountResponse.canEqual(this)) {
            return false;
        }
        RequestId requestId = getRequestId();
        RequestId requestId2 = linkUserAccountResponse.getRequestId();
        if (requestId != null ? !requestId.equals(requestId2) : requestId2 != null) {
            return false;
        }
        RequestStatus requestStatus = getRequestStatus();
        RequestStatus requestStatus2 = linkUserAccountResponse.getRequestStatus();
        if (requestStatus != null ? !requestStatus.equals(requestStatus2) : requestStatus2 != null) {
            return false;
        }
        SuccessCode successCode = getSuccessCode();
        SuccessCode successCode2 = linkUserAccountResponse.getSuccessCode();
        if (successCode != null ? !successCode.equals(successCode2) : successCode2 != null) {
            return false;
        }
        String linkId = getLinkId();
        String linkId2 = linkUserAccountResponse.getLinkId();
        if (linkId != null ? linkId.equals(linkId2) : linkId2 == null) {
            return true;
        }
        return false;
    }

    public String getLinkId() {
        return this.linkId;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public SuccessCode getSuccessCode() {
        return this.successCode;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        RequestId requestId = getRequestId();
        int i = 43;
        if (requestId == null) {
            hashCode = 43;
        } else {
            hashCode = requestId.hashCode();
        }
        RequestStatus requestStatus = getRequestStatus();
        int i2 = (hashCode + 59) * 59;
        if (requestStatus == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = requestStatus.hashCode();
        }
        int i3 = i2 + hashCode2;
        SuccessCode successCode = getSuccessCode();
        int i4 = i3 * 59;
        if (successCode == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = successCode.hashCode();
        }
        int i5 = i4 + hashCode3;
        String linkId = getLinkId();
        int i6 = i5 * 59;
        if (linkId != null) {
            i = linkId.hashCode();
        }
        return i6 + i;
    }

    public void setLinkId(String str) {
        this.linkId = str;
    }

    public void setRequestId(RequestId requestId) {
        this.requestId = requestId;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public void setSuccessCode(SuccessCode successCode) {
        this.successCode = successCode;
    }
}

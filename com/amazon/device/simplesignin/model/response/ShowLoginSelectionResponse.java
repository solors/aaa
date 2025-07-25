package com.amazon.device.simplesignin.model.response;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;

/* loaded from: classes2.dex */
public class ShowLoginSelectionResponse {
    private String linkId;
    private RequestId requestId;
    private RequestStatus requestStatus;
    private UserSelection userSelection;

    /* loaded from: classes2.dex */
    public enum UserSelection {
        ManualSignIn,
        LoginSelected
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof ShowLoginSelectionResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowLoginSelectionResponse)) {
            return false;
        }
        ShowLoginSelectionResponse showLoginSelectionResponse = (ShowLoginSelectionResponse) obj;
        if (!showLoginSelectionResponse.canEqual(this)) {
            return false;
        }
        RequestId requestId = getRequestId();
        RequestId requestId2 = showLoginSelectionResponse.getRequestId();
        if (requestId != null ? !requestId.equals(requestId2) : requestId2 != null) {
            return false;
        }
        RequestStatus requestStatus = getRequestStatus();
        RequestStatus requestStatus2 = showLoginSelectionResponse.getRequestStatus();
        if (requestStatus != null ? !requestStatus.equals(requestStatus2) : requestStatus2 != null) {
            return false;
        }
        UserSelection userSelection = getUserSelection();
        UserSelection userSelection2 = showLoginSelectionResponse.getUserSelection();
        if (userSelection != null ? !userSelection.equals(userSelection2) : userSelection2 != null) {
            return false;
        }
        String linkId = getLinkId();
        String linkId2 = showLoginSelectionResponse.getLinkId();
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

    public UserSelection getUserSelection() {
        return this.userSelection;
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
        UserSelection userSelection = getUserSelection();
        int i4 = i3 * 59;
        if (userSelection == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = userSelection.hashCode();
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

    public void setUserSelection(UserSelection userSelection) {
        this.userSelection = userSelection;
    }
}

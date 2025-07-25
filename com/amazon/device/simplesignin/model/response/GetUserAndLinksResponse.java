package com.amazon.device.simplesignin.model.response;

import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import java.util.List;

/* loaded from: classes2.dex */
public class GetUserAndLinksResponse {
    private String amazonUserId;
    private List<Link> links;
    private RequestId requestId;
    private RequestStatus requestStatus;

    protected boolean canEqual(Object obj) {
        return obj instanceof GetUserAndLinksResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserAndLinksResponse)) {
            return false;
        }
        GetUserAndLinksResponse getUserAndLinksResponse = (GetUserAndLinksResponse) obj;
        if (!getUserAndLinksResponse.canEqual(this)) {
            return false;
        }
        RequestId requestId = getRequestId();
        RequestId requestId2 = getUserAndLinksResponse.getRequestId();
        if (requestId != null ? !requestId.equals(requestId2) : requestId2 != null) {
            return false;
        }
        RequestStatus requestStatus = getRequestStatus();
        RequestStatus requestStatus2 = getUserAndLinksResponse.getRequestStatus();
        if (requestStatus != null ? !requestStatus.equals(requestStatus2) : requestStatus2 != null) {
            return false;
        }
        String amazonUserId = getAmazonUserId();
        String amazonUserId2 = getUserAndLinksResponse.getAmazonUserId();
        if (amazonUserId != null ? !amazonUserId.equals(amazonUserId2) : amazonUserId2 != null) {
            return false;
        }
        List<Link> links = getLinks();
        List<Link> links2 = getUserAndLinksResponse.getLinks();
        if (links != null ? links.equals(links2) : links2 == null) {
            return true;
        }
        return false;
    }

    public String getAmazonUserId() {
        return this.amazonUserId;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
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
        String amazonUserId = getAmazonUserId();
        int i4 = i3 * 59;
        if (amazonUserId == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = amazonUserId.hashCode();
        }
        int i5 = i4 + hashCode3;
        List<Link> links = getLinks();
        int i6 = i5 * 59;
        if (links != null) {
            i = links.hashCode();
        }
        return i6 + i;
    }

    public void setAmazonUserId(String str) {
        this.amazonUserId = str;
    }

    public void setLinks(List<Link> list) {
        this.links = list;
    }

    public void setRequestId(RequestId requestId) {
        this.requestId = requestId;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}

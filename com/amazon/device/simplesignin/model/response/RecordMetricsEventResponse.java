package com.amazon.device.simplesignin.model.response;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;

/* loaded from: classes2.dex */
public class RecordMetricsEventResponse {
    private RequestId requestId;
    private RequestStatus requestStatus;

    protected boolean canEqual(Object obj) {
        return obj instanceof RecordMetricsEventResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordMetricsEventResponse)) {
            return false;
        }
        RecordMetricsEventResponse recordMetricsEventResponse = (RecordMetricsEventResponse) obj;
        if (!recordMetricsEventResponse.canEqual(this)) {
            return false;
        }
        RequestId requestId = getRequestId();
        RequestId requestId2 = recordMetricsEventResponse.getRequestId();
        if (requestId != null ? !requestId.equals(requestId2) : requestId2 != null) {
            return false;
        }
        RequestStatus requestStatus = getRequestStatus();
        RequestStatus requestStatus2 = recordMetricsEventResponse.getRequestStatus();
        if (requestStatus != null ? requestStatus.equals(requestStatus2) : requestStatus2 == null) {
            return true;
        }
        return false;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public int hashCode() {
        int hashCode;
        RequestId requestId = getRequestId();
        int i = 43;
        if (requestId == null) {
            hashCode = 43;
        } else {
            hashCode = requestId.hashCode();
        }
        RequestStatus requestStatus = getRequestStatus();
        int i2 = (hashCode + 59) * 59;
        if (requestStatus != null) {
            i = requestStatus.hashCode();
        }
        return i2 + i;
    }

    public void setRequestId(RequestId requestId) {
        this.requestId = requestId;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}

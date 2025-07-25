package com.amazon.device.simplesignin.p107a.p108a.p112c;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;

/* renamed from: com.amazon.device.simplesignin.a.a.c.a */
/* loaded from: classes2.dex */
public class RecordMetricsEvent extends SSIKiwiRequest {
    public RecordMetricsEvent(RequestId requestId, SSIEventRequest sSIEventRequest) {
        super(requestId);
        super.mo102461a(new RecordMetricsEventCommand(this, sSIEventRequest));
    }
}

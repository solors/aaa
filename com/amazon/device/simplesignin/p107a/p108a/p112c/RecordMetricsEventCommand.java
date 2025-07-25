package com.amazon.device.simplesignin.p107a.p108a.p112c;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.Map;

/* renamed from: com.amazon.device.simplesignin.a.a.c.b */
/* loaded from: classes2.dex */
public class RecordMetricsEventCommand extends SSIKiwiCommandBase {

    /* renamed from: b */
    private static final String f3394b = "SSI_PublishMetric";

    /* renamed from: c */
    private static final String f3395c = "1.0";

    /* renamed from: d */
    private static final String f3396d = "b";

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecordMetricsEventCommand(RecordMetricsEvent recordMetricsEvent, SSIEventRequest sSIEventRequest) {
        super(recordMetricsEvent, f3394b, "1.0");
        super.m102923a(C3729a.f3370t, sSIEventRequest.getEvent().toString());
        super.m102923a(C3729a.f3371u, sSIEventRequest.getEpochTimestamp());
        if (sSIEventRequest.getFailureReason() != null) {
            super.m102923a(C3729a.f3372v, sSIEventRequest.getFailureReason().toString());
        } else {
            super.m102923a(C3729a.f3372v, "NA");
        }
    }

    @Override // com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase
    /* renamed from: a */
    protected void mo102339a(RequestStatus requestStatus) {
        m102346b(requestStatus);
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws RemoteException {
        Map mo102570b = successResult.mo102570b();
        if (!mo102570b.containsKey("success")) {
            mo102339a(RequestStatus.FAILURE);
            return false;
        }
        m102346b(RequestStatus.SUCCESSFUL);
        return Boolean.parseBoolean(mo102570b.get("success").toString());
    }

    /* renamed from: b */
    private void m102346b(RequestStatus requestStatus) {
        SSIKiwiRequest sSIKiwiRequest = (SSIKiwiRequest) m102918j();
        String str = f3396d;
        Log.i(str, "Response for request id: " + sSIKiwiRequest.m102342e() + " is: " + requestStatus.toString());
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        recordMetricsEventResponse.setRequestId(sSIKiwiRequest.m102342e());
        recordMetricsEventResponse.setRequestStatus(requestStatus);
        super.m102349a(recordMetricsEventResponse);
    }
}

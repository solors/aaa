package com.amazon.device.simplesignin.p107a.p108a.p110b;

import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;
import com.amazon.device.simplesignin.p107a.p117d.ResponseModelGenerator;
import java.util.Map;

/* renamed from: com.amazon.device.simplesignin.a.a.b.c */
/* loaded from: classes2.dex */
public abstract class LinkUserAccountCommandBase extends SSIKiwiCommandBase {
    /* JADX INFO: Access modifiers changed from: protected */
    public LinkUserAccountCommandBase(SSIKiwiRequest sSIKiwiRequest, String str, String str2) {
        super(sSIKiwiRequest, str, str2);
    }

    @Override // com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase
    /* renamed from: a */
    protected void mo102339a(RequestStatus requestStatus) {
        m102351a(requestStatus, null, null);
    }

    /* renamed from: a */
    protected void m102351a(RequestStatus requestStatus, String str, LinkUserAccountResponse.SuccessCode successCode) {
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        linkUserAccountResponse.setRequestId(((SSIKiwiRequest) m102918j()).m102342e());
        linkUserAccountResponse.setRequestStatus(requestStatus);
        linkUserAccountResponse.setLinkId(str);
        linkUserAccountResponse.setSuccessCode(successCode);
        super.m102349a(linkUserAccountResponse);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m102350a(Map map) {
        if (!map.containsKey(C3729a.f3363m)) {
            mo102339a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) map.get(C3729a.f3363m);
        if (str == null) {
            mo102339a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (!map.containsKey(C3729a.f3361k) || map.get(C3729a.f3361k) == null) ? null : (String) map.get(C3729a.f3361k);
        if (map.containsKey(C3729a.f3362l) && map.get(C3729a.f3362l) != null) {
            str2 = ResponseModelGenerator.m102305a((String) map.get(C3729a.f3362l));
        }
        m102351a(RequestStatus.SUCCESSFUL, str2, LinkUserAccountResponse.SuccessCode.valueOf(str));
        return true;
    }
}

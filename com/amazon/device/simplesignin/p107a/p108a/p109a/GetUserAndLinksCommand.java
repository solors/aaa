package com.amazon.device.simplesignin.p107a.p108a.p109a;

import android.os.RemoteException;
import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;
import com.amazon.device.simplesignin.p107a.p117d.ResponseModelGenerator;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.List;
import java.util.Map;

/* renamed from: com.amazon.device.simplesignin.a.a.a.b */
/* loaded from: classes2.dex */
public class GetUserAndLinksCommand extends SSIKiwiCommandBase {

    /* renamed from: b */
    private static final String f3377b = "SSI_GetUserAndLinks";

    /* renamed from: c */
    private static final String f3378c = "1.0";

    /* renamed from: d */
    private static final String f3379d = "b";

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetUserAndLinksCommand(GetUserAndLinks getUserAndLinks, String str) {
        super(getUserAndLinks, f3377b, "1.0");
        super.m102923a(C3729a.f3351a, str);
    }

    @Override // com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase
    /* renamed from: a */
    protected void mo102339a(RequestStatus requestStatus) {
        if (!RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) && !RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            m102354a(requestStatus, null, null);
        } else {
            m102354a(RequestStatus.FAILURE, null, null);
        }
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws RemoteException {
        Map mo102570b = successResult.mo102570b();
        if (mo102570b.containsKey(C3729a.f3352b) && mo102570b.containsKey(C3729a.f3353c)) {
            String str = (String) mo102570b.get(C3729a.f3352b);
            String str2 = (String) mo102570b.get(C3729a.f3353c);
            if (str != null && str2 != null) {
                List<Link> m102304a = ResponseModelGenerator.m102304a(str, str2);
                if (m102304a == null) {
                    mo102339a(RequestStatus.FAILURE);
                    return false;
                }
                m102354a(RequestStatus.SUCCESSFUL, str, m102304a);
                return true;
            }
            mo102339a(RequestStatus.FAILURE);
            return false;
        }
        mo102339a(RequestStatus.FAILURE);
        return false;
    }

    /* renamed from: a */
    private void m102354a(RequestStatus requestStatus, String str, List<Link> list) {
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        getUserAndLinksResponse.setRequestId(((SSIKiwiRequest) m102918j()).m102342e());
        getUserAndLinksResponse.setRequestStatus(requestStatus);
        getUserAndLinksResponse.setAmazonUserId(str);
        getUserAndLinksResponse.setLinks(list);
        super.m102349a(getUserAndLinksResponse);
    }
}

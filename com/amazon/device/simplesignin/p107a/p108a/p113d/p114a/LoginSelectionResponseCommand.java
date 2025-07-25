package com.amazon.device.simplesignin.p107a.p108a.p113d.p114a;

import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.amazon.device.simplesignin.a.a.d.a.b */
/* loaded from: classes2.dex */
public class LoginSelectionResponseCommand extends SSIKiwiCommandBase {

    /* renamed from: b */
    private static final String f3398b = "SSI_LoginSelectionResponse";

    /* renamed from: c */
    private static final String f3399c = "1.0";

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoginSelectionResponseCommand(LoginSelectionResponse loginSelectionResponse) {
        super(loginSelectionResponse, f3398b, "1.0");
    }

    @Override // com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase
    /* renamed from: a */
    protected void mo102339a(RequestStatus requestStatus) {
        if (!RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) && !RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            m102341a(requestStatus, null, null);
        } else {
            m102341a(RequestStatus.FAILURE, null, null);
        }
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws Exception {
        Map mo102570b = successResult.mo102570b();
        if (!mo102570b.containsKey(C3729a.f3367q)) {
            mo102339a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) mo102570b.get(C3729a.f3367q);
        if (str == null) {
            mo102339a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (String) mo102570b.get(C3729a.f3368r);
        ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
        if (userSelection.name().equals(str) && str2 != null) {
            m102341a(RequestStatus.SUCCESSFUL, str2, userSelection);
            return true;
        }
        m102341a(RequestStatus.SUCCESSFUL, null, ShowLoginSelectionResponse.UserSelection.ManualSignIn);
        return true;
    }

    /* renamed from: a */
    private void m102341a(RequestStatus requestStatus, String str, ShowLoginSelectionResponse.UserSelection userSelection) {
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(((SSIKiwiRequest) m102918j()).m102342e());
        showLoginSelectionResponse.setRequestStatus(requestStatus);
        showLoginSelectionResponse.setUserSelection(userSelection);
        showLoginSelectionResponse.setLinkId(str);
        super.m102349a(showLoginSelectionResponse);
    }
}

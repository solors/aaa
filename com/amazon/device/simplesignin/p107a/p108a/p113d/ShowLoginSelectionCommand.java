package com.amazon.device.simplesignin.p107a.p108a.p113d;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;
import com.amazon.device.simplesignin.p107a.p117d.C3737a;
import com.amazon.p047a.p048a.p049a.ContextManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p066n.TaskManager;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.device.simplesignin.a.a.d.b */
/* loaded from: classes2.dex */
public class ShowLoginSelectionCommand extends SSIKiwiCommandBase {

    /* renamed from: d */
    private static final String f3400d = ShowLoginSelection.class.getSimpleName();

    /* renamed from: e */
    private static final String f3401e = "SSI_ShowLoginSelection";

    /* renamed from: f */
    private static final String f3402f = "1.0";
    @Resource

    /* renamed from: b */
    protected TaskManager f3403b;
    @Resource

    /* renamed from: c */
    protected ContextManager f3404c;

    /* renamed from: g */
    private final Map<String, String> f3405g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShowLoginSelectionCommand(ShowLoginSelection showLoginSelection, Map<String, String> map) {
        super(showLoginSelection, f3401e, "1.0");
        this.f3405g = map;
    }

    @Override // com.amazon.device.simplesignin.p107a.p108a.SSIKiwiCommandBase
    /* renamed from: a */
    protected void mo102339a(RequestStatus requestStatus) {
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(((SSIKiwiRequest) m102918j()).m102342e());
        if (!RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) && !RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            showLoginSelectionResponse.setRequestStatus(requestStatus);
            super.m102349a(showLoginSelectionResponse);
            return;
        }
        showLoginSelectionResponse.setRequestStatus(RequestStatus.FAILURE);
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws RemoteException {
        Map mo102570b = successResult.mo102570b();
        if (!mo102570b.containsKey(C3729a.f3366p)) {
            mo102339a(RequestStatus.FAILURE);
            return false;
        }
        Intent intent = (Intent) mo102570b.get(C3729a.f3366p);
        if (intent == null) {
            mo102339a(RequestStatus.FAILURE);
            return false;
        }
        intent.putExtra(C3729a.f3365o, new HashMap(this.f3405g));
        m102340a(intent);
        return true;
    }

    /* renamed from: a */
    private void m102340a(final Intent intent) {
        this.f3403b.mo102883b(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.device.simplesignin.a.a.d.b.1
            @Override // com.amazon.p047a.p048a.p066n.Task
            /* renamed from: a */
            public void mo102336a() {
                try {
                    Activity mo103187b = ShowLoginSelectionCommand.this.f3404c.mo103187b();
                    if (mo103187b == null) {
                        mo103187b = ShowLoginSelectionCommand.this.f3404c.mo103192a();
                    }
                    C3737a.m102308a(ShowLoginSelectionCommand.f3400d, "ShowLoginSelection activity initiated through startActivity");
                    mo103187b.startActivity(intent);
                } catch (Exception e) {
                    String str = ShowLoginSelectionCommand.f3400d;
                    C3737a.m102308a(str, "Exception when starting show login selection activity: " + e);
                }
            }
        });
    }
}

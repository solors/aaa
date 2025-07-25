package com.amazon.device.simplesignin.p107a.p108a.p110b;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import com.amazon.device.simplesignin.p107a.p117d.C3737a;
import com.amazon.p047a.p048a.p049a.ContextManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p066n.TaskManager;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amazon.device.simplesignin.a.a.b.b */
/* loaded from: classes2.dex */
public class LinkUserAccountCommand extends LinkUserAccountCommandBase {

    /* renamed from: d */
    private static final String f3383d = "SSI_LinkUserAccount";

    /* renamed from: e */
    private static final String f3384e = "1.0";

    /* renamed from: f */
    private static final String f3385f = "b";
    @Resource

    /* renamed from: b */
    protected TaskManager f3386b;
    @Resource

    /* renamed from: c */
    protected ContextManager f3387c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkUserAccountCommand(LinkUserAccount linkUserAccount, LinkUserAccountRequest linkUserAccountRequest) {
        super(linkUserAccount, f3383d, "1.0");
        super.m102923a(C3729a.f3354d, linkUserAccountRequest.getPartnerUserId());
        super.m102923a(C3729a.f3351a, linkUserAccountRequest.getIdentityProviderName());
        super.m102923a(C3729a.f3355e, linkUserAccountRequest.getUserLoginName());
        super.m102923a(C3729a.f3358h, C3729a.f3359i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject.put(C3729a.f3343E, linkUserAccountRequest.getLinkToken().getSchema());
            super.m102923a(C3729a.f3357g, jSONObject.toString());
            super.m102923a(C3729a.f3356f, linkUserAccountRequest.getLinkSigningKey());
        } catch (JSONException e) {
            C3737a.m102306b(f3385f, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e);
        }
    }

    /* renamed from: a */
    private void m102353a(final Intent intent) {
        this.f3386b.mo102883b(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.device.simplesignin.a.a.b.b.1
            @Override // com.amazon.p047a.p048a.p066n.Task
            /* renamed from: a */
            public void mo102336a() {
                try {
                    Activity mo103187b = LinkUserAccountCommand.this.f3387c.mo103187b();
                    if (mo103187b == null) {
                        mo103187b = LinkUserAccountCommand.this.f3387c.mo103192a();
                    }
                    String str = LinkUserAccountCommand.f3385f;
                    C3737a.m102308a(str, "Consent activity is about to start: " + mo103187b);
                    mo103187b.startActivity(intent);
                } catch (Exception e) {
                    String str2 = LinkUserAccountCommand.f3385f;
                    C3737a.m102308a(str2, "Exception when starting consent activity: " + e);
                }
            }
        });
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws RemoteException {
        Map mo102570b = successResult.mo102570b();
        if (mo102570b.containsKey(C3729a.f3360j) && mo102570b.get(C3729a.f3360j) != null) {
            m102353a((Intent) mo102570b.get(C3729a.f3360j));
            return true;
        }
        return super.m102350a(mo102570b);
    }
}

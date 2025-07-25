package com.amazon.device.simplesignin.p107a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.SSIEvent;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import com.amazon.device.simplesignin.p107a.p115b.SDKModes;
import com.amazon.device.simplesignin.p107a.p117d.C3737a;
import com.amazon.p047a.AppstoreSDK;
import com.amazon.p047a.p048a.p071o.Validator;
import java.util.Map;

/* renamed from: com.amazon.device.simplesignin.a.c */
/* loaded from: classes2.dex */
public class SimpleSignInManager {

    /* renamed from: a */
    private static String f3412a = "c";

    /* renamed from: b */
    private static final SimpleSignInManager f3413b = new SimpleSignInManager();

    /* renamed from: c */
    private static final IllegalStateException f3414c = new IllegalStateException(String.format("%s. %s", "Simple Sign-In SDK not initialized", "To initialize and register responseHandler, call SimpleSignInService.registerResponseHandler()"));

    /* renamed from: d */
    private Context f3415d;

    /* renamed from: e */
    private ISimpleSignInResponseHandler f3416e;

    /* renamed from: f */
    private ISimpleSignInRequestHandler f3417f;

    private SimpleSignInManager() {
    }

    /* renamed from: a */
    public static SimpleSignInManager m102335a() {
        return f3413b;
    }

    /* renamed from: f */
    private boolean m102323f() {
        if (this.f3415d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m102322g() {
        if (m102323f()) {
            return;
        }
        C3737a.m102306b(f3412a, "Simple Sign-In SDK not initialized.");
        throw f3414c;
    }

    /* renamed from: b */
    public String m102328b() {
        if (!m102323f()) {
            C3737a.m102306b(f3412a, "Application context not initialized, SDK mode is unknown.");
            return SDKModes.UNKNOWN.name();
        } else if (HandlerFactory.m102357a().m102355b(this.f3415d)) {
            return SDKModes.SANDBOX.name();
        } else {
            return SDKModes.PRODUCTION.name();
        }
    }

    /* renamed from: c */
    public Context m102326c() {
        return this.f3415d;
    }

    /* renamed from: d */
    public ISimpleSignInResponseHandler m102325d() {
        return this.f3416e;
    }

    /* renamed from: e */
    public ISimpleSignInRequestHandler m102324e() {
        return this.f3417f;
    }

    /* renamed from: a */
    public void m102333a(Context context, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        AppstoreSDK.m103237a(context.getApplicationContext());
        this.f3415d = context;
        this.f3416e = iSimpleSignInResponseHandler;
        this.f3417f = HandlerFactory.m102357a().m102356a(context);
    }

    /* renamed from: a */
    public RequestId m102330a(String str) {
        m102322g();
        Validator.m102805a(str, C3729a.f3376z);
        RequestId requestId = new RequestId();
        this.f3417f.mo102316a(requestId, str);
        return requestId;
    }

    /* renamed from: b */
    private void m102327b(LinkUserAccountRequest linkUserAccountRequest) {
        Validator.m102805a(linkUserAccountRequest.getPartnerUserId(), C3729a.f3339A);
        Validator.m102805a(linkUserAccountRequest.getIdentityProviderName(), C3729a.f3376z);
        Validator.m102807a(linkUserAccountRequest.getLinkToken(), "linkToken");
        Validator.m102805a(linkUserAccountRequest.getLinkToken().getToken(), "linkToken.token");
        Validator.m102805a(linkUserAccountRequest.getLinkToken().getSchema(), "linkToken.schema");
        Validator.m102805a(linkUserAccountRequest.getUserLoginName(), "userLoginName");
        Validator.m102805a(linkUserAccountRequest.getLinkSigningKey(), "linkSigningKey");
    }

    /* renamed from: a */
    public RequestId m102332a(LinkUserAccountRequest linkUserAccountRequest) {
        m102322g();
        m102327b(linkUserAccountRequest);
        RequestId requestId = new RequestId();
        this.f3417f.mo102318a(requestId, linkUserAccountRequest);
        return requestId;
    }

    /* renamed from: a */
    public RequestId m102329a(Map<String, String> map) {
        m102322g();
        if (!map.isEmpty()) {
            RequestId requestId = new RequestId();
            this.f3417f.mo102315a(requestId, map);
            return requestId;
        }
        throw new IllegalArgumentException("loginNames must not be empty");
    }

    /* renamed from: a */
    public RequestId m102331a(SSIEventRequest sSIEventRequest) {
        m102322g();
        if (sSIEventRequest.getEvent().equals(SSIEvent.LOGIN_FAILURE) && sSIEventRequest.getFailureReason() == null) {
            throw new IllegalArgumentException("failureReason must not be empty for login failure");
        }
        RequestId requestId = new RequestId();
        this.f3417f.mo102317a(requestId, sSIEventRequest);
        String str = f3412a;
        Log.i(str, "Initiating record event with requestId : " + requestId.toString());
        return requestId;
    }

    /* renamed from: a */
    public void m102334a(Context context, Intent intent) {
        this.f3417f.mo102320a(context, intent);
    }
}

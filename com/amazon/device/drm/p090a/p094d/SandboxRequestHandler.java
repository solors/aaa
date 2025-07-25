package com.amazon.device.drm.p090a.p094d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.LicensingService;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;
import com.amazon.device.drm.p090a.LicenseRequestHandler;
import com.amazon.device.drm.p090a.LicensingManager;
import com.amazon.device.drm.p090a.p093c.LicenseResponseBuilder;
import com.amazon.device.drm.p090a.p095e.Logger;
import com.amazon.p047a.p048a.p071o.Validator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amazon.device.drm.a.d.c */
/* loaded from: classes2.dex */
public class SandboxRequestHandler implements LicenseRequestHandler {

    /* renamed from: a */
    private static final String f3145a = "c";

    /* renamed from: b */
    private static final String f3146b = "com.amazon.sdktestclient";

    /* renamed from: c */
    private static final String f3147c = "com.amazon.sdktestclient.command.CommandBroker";

    @Override // com.amazon.device.drm.p090a.LicenseRequestHandler
    /* renamed from: a */
    public void mo102482a(RequestId requestId) {
        Logger.m102476a(f3145a, "sendGetLicenseRequest");
        try {
            Context m102491c = LicensingManager.m102490d().m102491c();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId);
            jSONObject.put("packageName", m102491c.getPackageName());
            jSONObject.put("sdkVersion", LicensingService.SDK_VERSION);
            bundle.putString("getLicenseInput", jSONObject.toString());
            Intent m102480a = m102480a("com.amazon.testclient.drm.getLicense");
            m102480a.addFlags(268435456);
            m102480a.putExtras(bundle);
            m102491c.startService(m102480a);
        } catch (JSONException unused) {
            Logger.m102474b(f3145a, "Error in sendGetUserDataRequest.");
        }
    }

    /* renamed from: a */
    private Intent m102480a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f3146b, f3147c));
        return intent;
    }

    @Override // com.amazon.device.drm.p090a.LicenseRequestHandler
    /* renamed from: a */
    public void mo102484a(Context context, Intent intent) {
        Logger.m102476a(f3145a, "handleResponse");
        intent.setComponent(new ComponentName(f3146b, f3147c));
        try {
            if (intent.getExtras().getString("responseType").equalsIgnoreCase("com.amazon.testclient.drm.getLicense")) {
                m102481a(m102483a(intent));
            }
        } catch (Exception e) {
            Log.e(f3145a, "Error handling response.", e);
        }
    }

    /* renamed from: a */
    private LicenseResponse m102483a(Intent intent) {
        RequestId requestId;
        LicenseResponse.RequestStatus requestStatus = LicenseResponse.RequestStatus.UNKNOWN_ERROR;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getLicenseOutput"));
            requestStatus = LicenseResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
        } catch (Exception e) {
            Log.e(f3145a, "Error parsing getLicense response", e);
            requestId = null;
        }
        return new LicenseResponseBuilder().m102498a(requestId).m102499a(requestStatus).m102500a();
    }

    /* renamed from: a */
    protected void m102481a(final Object obj) {
        Validator.m102807a(obj, "response");
        Context m102491c = LicensingManager.m102490d().m102491c();
        final LicensingListener m102492b = LicensingManager.m102490d().m102492b();
        if (m102491c != null && m102492b != null) {
            new Handler(m102491c.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.drm.a.d.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (!(obj2 instanceof LicenseResponse)) {
                            String str = SandboxRequestHandler.f3145a;
                            Logger.m102474b(str, "Unknown response type:" + obj.getClass().getName());
                        } else {
                            m102492b.onLicenseCommandResponse((LicenseResponse) obj2);
                        }
                    } catch (Exception e) {
                        String str2 = SandboxRequestHandler.f3145a;
                        Logger.m102474b(str2, "Error in sendResponse: " + e);
                    }
                }
            });
            return;
        }
        String str = f3145a;
        Logger.m102476a(str, "LicensingListener is not set. Dropping response: " + obj);
    }
}

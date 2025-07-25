package com.amazon.device.drm.p090a.p092b;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.model.RequestId;
import com.amazon.device.drm.p090a.LicenseRequestHandler;
import com.amazon.device.drm.p090a.p091a.GetLicenseRequest;
import com.amazon.device.drm.p090a.p095e.Logger;

/* renamed from: com.amazon.device.drm.a.b.c */
/* loaded from: classes2.dex */
public class KiwiRequestHandler implements LicenseRequestHandler {

    /* renamed from: a */
    private static final String f3128a = "c";

    @Override // com.amazon.device.drm.p090a.LicenseRequestHandler
    /* renamed from: a */
    public void mo102484a(Context context, Intent intent) {
    }

    @Override // com.amazon.device.drm.p090a.LicenseRequestHandler
    /* renamed from: a */
    public void mo102482a(RequestId requestId) {
        Logger.m102476a(f3128a, "sendGetLicense");
        new GetLicenseRequest(requestId).m102502e();
    }
}

package com.amazon.device.drm.p090a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.model.AppstoreSDKModes;
import com.amazon.device.drm.model.RequestId;
import com.amazon.device.drm.p090a.p095e.Logger;
import com.amazon.p047a.AppstoreSDK;

/* renamed from: com.amazon.device.drm.a.d */
/* loaded from: classes2.dex */
public final class LicensingManager {

    /* renamed from: a */
    private static String f3131a = "d";

    /* renamed from: b */
    private static LicensingManager f3132b = new LicensingManager();

    /* renamed from: c */
    private LicenseRequestHandler f3133c;

    /* renamed from: d */
    private Context f3134d;

    /* renamed from: e */
    private LicensingListener f3135e;

    private LicensingManager() {
    }

    /* renamed from: d */
    public static LicensingManager m102490d() {
        return f3132b;
    }

    /* renamed from: f */
    private void m102488f() {
        if (this.f3135e != null) {
            return;
        }
        throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
    }

    /* renamed from: g */
    private void m102487g() {
        if (this.f3134d != null) {
            return;
        }
        throw new IllegalStateException("You must register a ApplicationContext before invoking this operation");
    }

    /* renamed from: a */
    public void m102493a(Context context, LicensingListener licensingListener) {
        if (licensingListener != null && context != null) {
            String str = f3131a;
            Logger.m102476a(str, "LicensingListener registered: " + licensingListener);
            String str2 = f3131a;
            Logger.m102476a(str2, "LicensingListener Context: " + context);
            this.f3134d = context.getApplicationContext();
            this.f3135e = licensingListener;
            LicenseRequestHandler m102510a = LicenseImplementationFactory.m102511a().m102510a(this.f3134d);
            this.f3133c = m102510a;
            if (m102510a == null) {
                Logger.m102476a(f3131a, "requestHandler is null");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LicensingManager/Context cannot be null");
    }

    /* renamed from: b */
    public LicensingListener m102492b() {
        return this.f3135e;
    }

    /* renamed from: c */
    public Context m102491c() {
        return this.f3134d;
    }

    /* renamed from: e */
    public RequestId m102489e() {
        m102488f();
        RequestId requestId = new RequestId();
        this.f3133c.mo102482a(requestId);
        return requestId;
    }

    /* renamed from: a */
    public String m102495a() {
        try {
            m102487g();
            if (AppstoreSDK.m103238a((Application) this.f3134d.getApplicationContext())) {
                return AppstoreSDKModes.SANDBOX.name();
            }
            return AppstoreSDKModes.PRODUCTION.name();
        } catch (IllegalStateException unused) {
            return AppstoreSDKModes.UNKNOWN.name();
        }
    }

    /* renamed from: a */
    public void m102494a(Context context, Intent intent) {
        try {
            this.f3133c.mo102484a(context, intent);
        } catch (Exception e) {
            String str = f3131a;
            Logger.m102474b(str, "Error in onReceive: " + e);
        }
    }
}

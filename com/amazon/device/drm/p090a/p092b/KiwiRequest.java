package com.amazon.device.drm.p090a.p092b;

import android.content.Context;
import android.os.Handler;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;
import com.amazon.device.drm.p090a.LicensingManager;
import com.amazon.device.drm.p090a.p095e.Logger;
import com.amazon.p047a.p048a.p062j.AbstractKiwiRequest;
import com.amazon.p047a.p048a.p062j.KiwiRequestContext;
import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;
import com.amazon.p047a.p048a.p071o.Validator;

/* renamed from: com.amazon.device.drm.a.b.b */
/* loaded from: classes2.dex */
public class KiwiRequest extends AbstractKiwiRequest {

    /* renamed from: c */
    private static final String f3123c = "b";

    /* renamed from: d */
    private final RequestId f3124d;

    public KiwiRequest(RequestId requestId) {
        this.f3124d = requestId;
    }

    @Override // com.amazon.p047a.p048a.p062j.AbstractKiwiRequest
    /* renamed from: a */
    public void mo102461a(KiwiCommand kiwiCommand) {
        this.f2485b = kiwiCommand;
    }

    /* renamed from: d */
    public RequestId m102503d() {
        return this.f3124d;
    }

    /* renamed from: e */
    public void m102502e() {
        KiwiCommand kiwiCommand = this.f2485b;
        if (kiwiCommand != null) {
            kiwiCommand.mo102445l();
        } else {
            mo102345b();
        }
    }

    /* renamed from: a */
    public void m102504a(final Object obj) {
        Validator.m102807a(obj, "response");
        Context m102491c = LicensingManager.m102490d().m102491c();
        final LicensingListener m102492b = LicensingManager.m102490d().m102492b();
        if (m102491c != null && m102492b != null) {
            new Handler(m102491c.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.drm.a.b.b.1
                {
                    KiwiRequest.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (!(obj2 instanceof LicenseResponse)) {
                            String str = KiwiRequest.f3123c;
                            Logger.m102474b(str, "Unknown response type:" + obj.getClass().getName());
                        } else {
                            m102492b.onLicenseCommandResponse((LicenseResponse) obj2);
                        }
                    } catch (Throwable th) {
                        String str2 = KiwiRequest.f3123c;
                        Logger.m102474b(str2, "Error in sendResponse: " + th);
                    }
                }
            });
            return;
        }
        String str = f3123c;
        Logger.m102476a(str, "LicensingListener is not set. Dropping response: " + obj);
    }

    @Override // com.amazon.p047a.p048a.p062j.AbstractKiwiRequest
    /* renamed from: a */
    public KiwiRequestContext mo102462a() {
        return this.f2484a;
    }

    @Override // com.amazon.p047a.p048a.p062j.AbstractKiwiRequest
    /* renamed from: b */
    public void mo102345b() {
    }

    @Override // com.amazon.p047a.p048a.p062j.AbstractKiwiRequest
    /* renamed from: c */
    public void mo102344c() {
    }
}

package com.amazon.device.drm.p090a.p093c;

import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* renamed from: com.amazon.device.drm.a.c.a */
/* loaded from: classes2.dex */
public class LicenseResponseBuilder {

    /* renamed from: a */
    private RequestId f3129a;

    /* renamed from: b */
    private LicenseResponse.RequestStatus f3130b;

    /* renamed from: a */
    public LicenseResponse m102500a() {
        return new LicenseResponse(this);
    }

    /* renamed from: b */
    public RequestId m102497b() {
        return this.f3129a;
    }

    /* renamed from: c */
    public LicenseResponse.RequestStatus m102496c() {
        return this.f3130b;
    }

    /* renamed from: a */
    public LicenseResponseBuilder m102498a(RequestId requestId) {
        this.f3129a = requestId;
        return this;
    }

    /* renamed from: a */
    public LicenseResponseBuilder m102499a(LicenseResponse.RequestStatus requestStatus) {
        this.f3130b = requestStatus;
        return this;
    }
}

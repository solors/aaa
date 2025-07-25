package com.amazon.device.drm.p090a.p092b;

import com.amazon.device.drm.p090a.LicenseImplementationRegistry;
import com.amazon.device.drm.p090a.LicenseRequestHandler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.device.drm.a.b.a */
/* loaded from: classes2.dex */
public final class KiwiImplementationRegistry implements LicenseImplementationRegistry {

    /* renamed from: a */
    private static final Map<Class, Class> f3122a;

    static {
        HashMap hashMap = new HashMap();
        f3122a = hashMap;
        hashMap.put(LicenseRequestHandler.class, KiwiRequestHandler.class);
    }

    @Override // com.amazon.device.drm.p090a.LicenseImplementationRegistry
    /* renamed from: a */
    public <T> Class<T> mo102486a(Class<T> cls) {
        return f3122a.get(cls);
    }
}

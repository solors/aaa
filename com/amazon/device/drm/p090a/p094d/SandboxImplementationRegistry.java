package com.amazon.device.drm.p090a.p094d;

import com.amazon.device.drm.p090a.LicenseImplementationRegistry;
import com.amazon.device.drm.p090a.LicenseRequestHandler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.device.drm.a.d.b */
/* loaded from: classes2.dex */
public final class SandboxImplementationRegistry implements LicenseImplementationRegistry {

    /* renamed from: a */
    private static final Map<Class, Class> f3144a;

    static {
        HashMap hashMap = new HashMap();
        f3144a = hashMap;
        hashMap.put(LicenseRequestHandler.class, SandboxRequestHandler.class);
    }

    @Override // com.amazon.device.drm.p090a.LicenseImplementationRegistry
    /* renamed from: a */
    public <T> Class<T> mo102486a(Class<T> cls) {
        return f3144a.get(cls);
    }
}

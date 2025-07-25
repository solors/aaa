package com.amazon.device.iap.internal.p106c;

import com.amazon.device.iap.internal.ImplementationRegistry;
import com.amazon.device.iap.internal.RequestHandler;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SandboxImplementationRegistry.java */
/* renamed from: com.amazon.device.iap.internal.c.d */
/* loaded from: classes2.dex */
public final class C3719d implements ImplementationRegistry {

    /* renamed from: a */
    private static final Map<Class, Class> f3310a;

    static {
        HashMap hashMap = new HashMap();
        f3310a = hashMap;
        hashMap.put(RequestHandler.class, C3720e.class);
    }

    @Override // com.amazon.device.iap.internal.ImplementationRegistry
    /* renamed from: a */
    public <T> Class<T> mo102415a(Class<T> cls) {
        return f3310a.get(cls);
    }
}

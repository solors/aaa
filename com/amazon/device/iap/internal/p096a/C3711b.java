package com.amazon.device.iap.internal.p096a;

import com.amazon.device.iap.internal.ImplementationRegistry;
import com.amazon.device.iap.internal.RequestHandler;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KiwiImplementationRegistry.java */
/* renamed from: com.amazon.device.iap.internal.a.b */
/* loaded from: classes2.dex */
public final class C3711b implements ImplementationRegistry {

    /* renamed from: a */
    private static final Map<Class, Class> f3164a;

    static {
        HashMap hashMap = new HashMap();
        f3164a = hashMap;
        hashMap.put(RequestHandler.class, C3714d.class);
    }

    @Override // com.amazon.device.iap.internal.ImplementationRegistry
    /* renamed from: a */
    public <T> Class<T> mo102415a(Class<T> cls) {
        return f3164a.get(cls);
    }
}

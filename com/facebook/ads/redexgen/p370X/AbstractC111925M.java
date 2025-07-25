package com.facebook.ads.redexgen.p370X;

import java.lang.reflect.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.5M */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC111925M {
    public static <T> T A00(T impl, Class<T> clazz) {
        ClassLoader classLoader = impl.getClass().getClassLoader();
        return clazz.cast(Proxy.newProxyInstance(classLoader, new Class[]{clazz}, new C111915L(impl, classLoader)));
    }
}

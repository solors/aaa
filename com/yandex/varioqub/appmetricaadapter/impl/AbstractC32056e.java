package com.yandex.varioqub.appmetricaadapter.impl;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.e */
/* loaded from: classes8.dex */
public abstract class AbstractC32056e {
    /* renamed from: a */
    public static InterfaceC32055d m25923a() {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("io.appmetrica.analytics.AppMetrica", false, AbstractC32061j.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            return new C32054c();
        }
        try {
            cls2 = Class.forName("com.yandex.metrica.YandexMetrica", false, AbstractC32061j.class.getClassLoader());
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            return new C32060i();
        }
        return new C32057f();
    }
}

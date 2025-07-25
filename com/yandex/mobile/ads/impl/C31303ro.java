package com.yandex.mobile.ads.impl;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ro */
/* loaded from: classes8.dex */
public final class C31303ro {
    @Nullable

    /* renamed from: a */
    private final Method f84840a;
    @Nullable

    /* renamed from: b */
    private final Method f84841b;
    @Nullable

    /* renamed from: c */
    private final Method f84842c;

    /* renamed from: com.yandex.mobile.ads.impl.ro$a */
    /* loaded from: classes8.dex */
    public static final class C31304a {
        @NotNull
        /* renamed from: a */
        public static C31303ro m29972a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod(KiwiConstants.f2714as, new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new C31303ro(method, method3, method2);
        }
    }

    public C31303ro(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.f84840a = method;
        this.f84841b = method2;
        this.f84842c = method3;
    }

    @Nullable
    /* renamed from: a */
    public final Object m29974a() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = this.f84840a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f84841b;
                Intrinsics.m17074g(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m29973a(@Nullable Object obj) {
        if (obj != null) {
            try {
                Method method = this.f84842c;
                Intrinsics.m17074g(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}

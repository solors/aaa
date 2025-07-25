package com.amazon.p047a.p048a.p071o;

import com.amazon.p047a.p048a.p071o.p072a.Assert;
import java.lang.reflect.Method;

/* renamed from: com.amazon.a.a.o.d */
/* loaded from: classes2.dex */
public class ReflectionUtils {

    /* renamed from: a */
    private static final KiwiLogger f2776a = new KiwiLogger("Reflection");

    /* renamed from: a */
    public static Class<?> m102820a(String str) {
        Assert.m102872a((Object) str, "String className");
        try {
            return Thread.currentThread().getContextClassLoader().loadClass(str);
        } catch (ClassNotFoundException unused) {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger = f2776a;
                kiwiLogger.m102829a("ClassNoFound: " + str);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m102818b(Method method) {
        Assert.m102872a((Object) method, "Method m");
        return method.getReturnType().equals(Void.TYPE);
    }

    /* renamed from: c */
    public static boolean m102817c(Method method) {
        Assert.m102872a((Object) method, "Method m");
        if ((method.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m102819a(Method method) {
        Assert.m102872a((Object) method, "Method m");
        return method.getParameterTypes().length > 0;
    }
}

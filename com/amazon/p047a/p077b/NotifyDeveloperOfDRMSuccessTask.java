package com.amazon.p047a.p077b;

import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.ReflectionUtils;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import java.lang.reflect.Method;

/* renamed from: com.amazon.a.b.i */
/* loaded from: classes2.dex */
public class NotifyDeveloperOfDRMSuccessTask implements Task {

    /* renamed from: a */
    private static final KiwiLogger f2836a = new KiwiLogger("DRMSuccessTask");

    /* renamed from: b */
    private static final String f2837b = "com.amazon.drm.AmazonLicenseVerificationCallback";

    /* renamed from: c */
    private static final String f2838c = "onDRMSuccess";

    @Override // com.amazon.p047a.p048a.p066n.Task
    /* renamed from: a */
    public void mo102336a() {
        Method m102771a;
        Class<?> m102820a = ReflectionUtils.m102820a(f2837b);
        if (m102820a == null || (m102771a = m102771a(m102820a, f2838c)) == null) {
            return;
        }
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2836a;
            kiwiLogger.m102829a("Invoking callback: " + m102771a.getName());
        }
        try {
            m102771a.invoke(null, new Object[0]);
            if (KiwiLogger.f2770a) {
                f2836a.m102829a("Callback invoked.");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static Method m102771a(Class<?> cls, String str) {
        Assert.m102872a((Object) cls, "Class<?> target");
        Assert.m102872a((Object) str, "String methodName");
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                if (KiwiLogger.f2770a) {
                    KiwiLogger kiwiLogger = f2836a;
                    kiwiLogger.m102829a("No exception thrown, but method '" + str + "' was not found, this should not happen. ");
                }
                return null;
            }
            declaredMethod.setAccessible(true);
            if (!ReflectionUtils.m102817c(declaredMethod)) {
                if (KiwiLogger.f2770a) {
                    KiwiLogger kiwiLogger2 = f2836a;
                    kiwiLogger2.m102829a("Callback " + str + " isn't static, ignoring...");
                }
                return null;
            } else if (!ReflectionUtils.m102818b(declaredMethod)) {
                if (KiwiLogger.f2770a) {
                    KiwiLogger kiwiLogger3 = f2836a;
                    kiwiLogger3.m102829a("Callback " + str + " returns a value, ignoring...");
                }
                return null;
            } else if (ReflectionUtils.m102819a(declaredMethod)) {
                if (KiwiLogger.f2770a) {
                    KiwiLogger kiwiLogger4 = f2836a;
                    kiwiLogger4.m102829a("Callback " + str + " takes parameters, ignoring...");
                }
                return null;
            } else {
                return declaredMethod;
            }
        } catch (NoSuchMethodException unused) {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger5 = f2836a;
                kiwiLogger5.m102829a("Did not find method " + str);
            }
            return null;
        }
    }
}

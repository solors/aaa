package com.applovin.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.applovin.impl.n2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4985n2 {

    /* renamed from: a */
    private static Method f8493a;

    /* renamed from: a */
    public static IBinder m97039a(Bundle bundle, String str) {
        if (AbstractC5863xp.f12151a >= 18) {
            return bundle.getBinder(str);
        }
        return m97038b(bundle, str);
    }

    /* renamed from: b */
    private static IBinder m97038b(Bundle bundle, String str) {
        Method method = f8493a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f8493a = method2;
                method2.setAccessible(true);
                method = f8493a;
            } catch (NoSuchMethodException e) {
                AbstractC5063oc.m96804b("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            AbstractC5063oc.m96804b("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }
}

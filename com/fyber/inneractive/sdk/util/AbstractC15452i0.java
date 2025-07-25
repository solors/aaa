package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.AbstractC14392k;

/* renamed from: com.fyber.inneractive.sdk.util.i0 */
/* loaded from: classes4.dex */
public abstract class AbstractC15452i0 {
    /* renamed from: a */
    public static boolean m76501a(String str) {
        int i = AbstractC14392k.f27223a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains("crash")) {
            return true;
        }
        return false;
    }
}

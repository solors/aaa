package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class IronSourceQaProperties {

    /* renamed from: a */
    private static IronSourceQaProperties f53460a;

    /* renamed from: b */
    private static Map<String, String> f53461b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f53460a == null) {
            f53460a = new IronSourceQaProperties();
        }
        return f53460a;
    }

    public static boolean isInitialized() {
        if (f53460a != null) {
            return true;
        }
        return false;
    }

    public Map<String, String> getParameters() {
        return f53461b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f53461b.put(str, str2);
        }
    }
}

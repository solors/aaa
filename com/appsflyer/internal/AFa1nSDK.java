package com.appsflyer.internal;

import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK AFInAppEventParameterName;
    private final Object values = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        AFa1nSDK aFa1nSDK;
        synchronized (AFa1nSDK.class) {
            if (AFInAppEventParameterName == null) {
                AFInAppEventParameterName = new AFa1nSDK();
            }
            aFa1nSDK = AFInAppEventParameterName;
        }
        return aFa1nSDK;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.values) {
            str2 = (String) super.put((AFa1nSDK) num, (Integer) str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        boolean remove;
        synchronized (this.values) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(@Nullable Object obj) {
        String str;
        synchronized (this.values) {
            str = (String) super.remove(obj);
        }
        return str;
    }
}

package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.rc */
/* loaded from: classes9.dex */
public final class C34856rc extends HashMap {

    /* renamed from: a */
    public int f95276a;

    public C34856rc() {
        this.f95276a = 0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public final String put(String str, String str2) {
        if (containsKey(str)) {
            int i = 0;
            if (str2 == null) {
                if (containsKey(str)) {
                    String str3 = (String) get(str);
                    int i2 = this.f95276a;
                    int length = str.length();
                    if (str3 != null) {
                        i = str3.length();
                    }
                    this.f95276a = i2 - (length + i);
                }
                return (String) super.remove(str);
            }
            String str4 = (String) get(str);
            int i3 = this.f95276a;
            int length2 = str2.length();
            if (str4 != null) {
                i = str4.length();
            }
            this.f95276a = (length2 - i) + i3;
            return (String) super.put(str, str2);
        } else if (str2 != null) {
            this.f95276a = str2.length() + str.length() + this.f95276a;
            return (String) super.put(str, str2);
        } else {
            return null;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int length;
        if (containsKey(obj)) {
            String str = (String) get(obj);
            int i = this.f95276a;
            int length2 = ((String) obj).length();
            if (str == null) {
                length = 0;
            } else {
                length = str.length();
            }
            this.f95276a = i - (length2 + length);
        }
        return (String) super.remove(obj);
    }

    public C34856rc(String str) {
        super(AbstractC34451cb.m21875d(str));
        this.f95276a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f95276a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f95276a;
        }
    }
}

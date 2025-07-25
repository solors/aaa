package com.amazon.p047a.p048a.p071o;

import java.util.Collection;

/* renamed from: com.amazon.a.a.o.f */
/* loaded from: classes2.dex */
public class Validator {
    /* renamed from: a */
    public static void m102807a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str + " must not be null");
    }

    /* renamed from: a */
    public static void m102805a(String str, String str2) {
        if (m102806a(str)) {
            throw new IllegalArgumentException(str2 + " must not be null or empty");
        }
    }

    /* renamed from: a */
    public static void m102804a(Collection<? extends Object> collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(str + " must not be empty");
        }
    }

    /* renamed from: a */
    public static boolean m102806a(String str) {
        return str == null || str.trim().length() == 0;
    }
}

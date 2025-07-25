package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.d */
/* loaded from: classes4.dex */
public abstract class AbstractC15291d {

    /* renamed from: a */
    public static final Class f30243a;

    /* renamed from: b */
    public static final boolean f30244b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f30243a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f30244b = z;
    }

    /* renamed from: a */
    public static boolean m76886a() {
        if (f30243a != null && !f30244b) {
            return true;
        }
        return false;
    }
}

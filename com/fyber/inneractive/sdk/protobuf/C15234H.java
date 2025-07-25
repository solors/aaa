package com.fyber.inneractive.sdk.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.H */
/* loaded from: classes4.dex */
public final class C15234H {

    /* renamed from: b */
    public static volatile C15234H f30160b;

    /* renamed from: c */
    public static final C15234H f30161c = new C15234H();

    /* renamed from: a */
    public final Map f30162a = Collections.emptyMap();

    /* renamed from: a */
    public static C15234H m77000a() {
        C15234H c15234h = f30160b;
        if (c15234h == null) {
            synchronized (C15234H.class) {
                c15234h = f30160b;
                if (c15234h == null) {
                    Class cls = AbstractC15228F.f30155a;
                    C15234H c15234h2 = null;
                    if (cls != null) {
                        try {
                            c15234h2 = (C15234H) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (c15234h2 == null) {
                        c15234h2 = f30161c;
                    }
                    f30160b = c15234h2;
                    c15234h = c15234h2;
                }
            }
        }
        return c15234h;
    }

    /* renamed from: a */
    public final C15278Y m76999a(int i, InterfaceC15226E0 interfaceC15226E0) {
        return (C15278Y) this.f30162a.get(new C15231G(i, interfaceC15226E0));
    }
}

package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.A0 */
/* loaded from: classes4.dex */
public final class C15214A0 {
    /* renamed from: a */
    public static C15358z0 m77031a(Object obj, Object obj2) {
        C15358z0 c15358z0 = (C15358z0) obj;
        C15358z0 c15358z02 = (C15358z0) obj2;
        if (!c15358z02.isEmpty()) {
            if (!c15358z0.f30353a) {
                if (c15358z0.isEmpty()) {
                    c15358z0 = new C15358z0();
                } else {
                    c15358z0 = new C15358z0(c15358z0);
                }
            }
            if (c15358z0.f30353a) {
                if (!c15358z02.isEmpty()) {
                    c15358z0.putAll(c15358z02);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        return c15358z0;
    }
}

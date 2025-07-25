package com.amazon.p047a.p048a.p049a.p050a;

import com.amazon.p047a.p048a.p054c.EventIdentity;

/* renamed from: com.amazon.a.a.a.a.d */
/* loaded from: classes2.dex */
public enum ApplicationEventIdentity implements EventIdentity {
    CREATE,
    DESTROY,
    START,
    STOP;

    @Override // java.lang.Enum
    public String toString() {
        return "APPLICATION_" + name();
    }
}

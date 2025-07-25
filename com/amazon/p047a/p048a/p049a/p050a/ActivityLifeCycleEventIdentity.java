package com.amazon.p047a.p048a.p049a.p050a;

import com.amazon.p047a.p048a.p054c.EventIdentity;

/* renamed from: com.amazon.a.a.a.a.b */
/* loaded from: classes2.dex */
public enum ActivityLifeCycleEventIdentity implements EventIdentity {
    CREATE,
    DESTROY,
    RESUME,
    PAUSE,
    START,
    STOP;

    @Override // java.lang.Enum
    public String toString() {
        return "ACTIVITY_" + name();
    }
}

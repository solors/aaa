package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z3 */
/* loaded from: classes6.dex */
public final class C19548z3 {

    /* renamed from: a */
    public final List f48954a;

    /* renamed from: b */
    public final String f48955b;

    public C19548z3(ArrayList eventIDs, String payload) {
        Intrinsics.checkNotNullParameter(eventIDs, "eventIDs");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f48954a = eventIDs;
        this.f48955b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19548z3)) {
            return false;
        }
        C19548z3 c19548z3 = (C19548z3) obj;
        if (Intrinsics.m17075f(this.f48954a, c19548z3.f48954a) && Intrinsics.m17075f(this.f48955b, c19548z3.f48955b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f48955b.hashCode() + (this.f48954a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.f48954a + ", payload=" + this.f48955b + ", shouldFlushOnFailure=false)";
    }
}

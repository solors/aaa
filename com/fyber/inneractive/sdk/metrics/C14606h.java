package com.fyber.inneractive.sdk.metrics;

import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.metrics.h */
/* loaded from: classes4.dex */
public final class C14606h {

    /* renamed from: a */
    public final String f27678a = UUID.randomUUID().toString();

    /* renamed from: b */
    public final String f27679b;

    public C14606h(String str) {
        this.f27679b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14606h.class == obj.getClass()) {
            return this.f27678a.equals(((C14606h) obj).f27678a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27678a.hashCode();
    }
}

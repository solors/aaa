package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.networktasks.impl.d */
/* loaded from: classes9.dex */
public final class C35123d {

    /* renamed from: a */
    public final NetworkTask f95852a;

    /* renamed from: b */
    public final String f95853b;

    public C35123d(NetworkTask networkTask) {
        this.f95852a = networkTask;
        this.f95853b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C35123d.class == obj.getClass()) {
            return this.f95853b.equals(((C35123d) obj).f95853b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f95853b.hashCode();
    }
}

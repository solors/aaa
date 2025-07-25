package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Qg */
/* loaded from: classes9.dex */
public final class C34163Qg {

    /* renamed from: a */
    public final C34247U5 f93405a;

    /* renamed from: b */
    public final boolean f93406b;

    /* renamed from: c */
    public final int f93407c;

    /* renamed from: d */
    public final HashMap f93408d;

    /* renamed from: e */
    public final C34378Zg f93409e;

    public C34163Qg(C34247U5 c34247u5, boolean z, int i, HashMap hashMap, C34378Zg c34378Zg) {
        this.f93405a = c34247u5;
        this.f93406b = z;
        this.f93407c = i;
        this.f93408d = hashMap;
        this.f93409e = c34378Zg;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f93405a + ", serviceDataReporterType=" + this.f93407c + ", environment=" + this.f93409e + ", isCrashReport=" + this.f93406b + ", trimmedFields=" + this.f93408d + ')';
    }
}

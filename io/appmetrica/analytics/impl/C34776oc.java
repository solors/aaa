package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.oc */
/* loaded from: classes9.dex */
public final class C34776oc {

    /* renamed from: a */
    public final C34408am f95106a;

    /* renamed from: b */
    public final C34408am f95107b;

    /* renamed from: c */
    public final C33785B4 f95108c;

    /* renamed from: d */
    public final PublicLogger f95109d;

    /* renamed from: e */
    public final String f95110e;

    public C34776oc(String str, PublicLogger publicLogger) {
        this(new C33785B4(30), new C34408am(50, str.concat("map key"), publicLogger), new C34408am(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public C34776oc(C33785B4 c33785b4, C34408am c34408am, C34408am c34408am2, String str, PublicLogger publicLogger) {
        this.f95108c = c33785b4;
        this.f95106a = c34408am;
        this.f95107b = c34408am2;
        this.f95110e = str;
        this.f95109d = publicLogger;
    }
}

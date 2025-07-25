package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.gi */
/* loaded from: classes9.dex */
public final class C34566gi {

    /* renamed from: a */
    public final Revenue f94463a;

    /* renamed from: b */
    public final C34359Yl f94464b;

    /* renamed from: c */
    public final C34570gm f94465c;

    /* renamed from: d */
    public final C34570gm f94466d;

    /* renamed from: e */
    public final PublicLogger f94467e;

    public C34566gi(Revenue revenue, PublicLogger publicLogger) {
        this.f94467e = publicLogger;
        this.f94463a = revenue;
        this.f94464b = new C34359Yl(30720, "revenue payload", publicLogger);
        this.f94465c = new C34570gm(new C34359Yl(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f94466d = new C34570gm(new C34408am(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}

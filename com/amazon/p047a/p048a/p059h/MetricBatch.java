package com.amazon.p047a.p048a.p059h;

import com.ironsource.C21114v8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.amazon.a.a.h.b */
/* loaded from: classes2.dex */
public class MetricBatch implements Serializable, Iterable<Metric> {

    /* renamed from: a */
    private static final long f2411a = 1;

    /* renamed from: b */
    private final List<Metric> f2412b = new ArrayList();

    /* renamed from: a */
    public boolean m103115a() {
        return this.f2412b.isEmpty();
    }

    /* renamed from: b */
    public Collection<Metric> m103113b() {
        return this.f2412b;
    }

    /* renamed from: c */
    public int m103112c() {
        return this.f2412b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<Metric> iterator() {
        return this.f2412b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.f2412b + C21114v8.C21123i.f54139e;
    }

    /* renamed from: a */
    public void m103114a(Metric metric) {
        this.f2412b.add(metric);
    }
}

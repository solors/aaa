package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.InterfaceC10068na;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.chartboost.sdk.impl.l4 */
/* loaded from: classes3.dex */
public final class C10018l4 {

    /* renamed from: a */
    public int f22502a;

    /* renamed from: b */
    public int f22503b;

    /* renamed from: c */
    public final Map f22504c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f22505d = new LinkedHashMap();

    /* renamed from: e */
    public final Set f22506e = new LinkedHashSet();

    public C10018l4(int i, int i2) {
        this.f22502a = i;
        this.f22503b = i2;
    }

    /* renamed from: a */
    public final long m81187a(AbstractC10024la abstractC10024la) {
        Long l = (Long) this.f22504c.get(abstractC10024la.m81157f());
        if (l != null) {
            return l.longValue();
        }
        return abstractC10024la.m81154i();
    }

    /* renamed from: b */
    public final long m81186b(AbstractC10024la abstractC10024la) {
        return (abstractC10024la.m81154i() - m81187a(abstractC10024la)) / 1000;
    }

    /* renamed from: c */
    public final int m81185c(AbstractC10024la abstractC10024la) {
        Integer num = (Integer) this.f22505d.get(abstractC10024la.m81157f());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public final void m81184d(AbstractC10024la abstractC10024la) {
        if (!this.f22504c.containsKey(abstractC10024la.m81157f())) {
            this.f22504c.put(abstractC10024la.m81157f(), Long.valueOf(abstractC10024la.m81154i()));
        }
    }

    /* renamed from: e */
    public final synchronized AbstractC10024la m81183e(AbstractC10024la abstractC10024la) {
        if (abstractC10024la == null) {
            return null;
        }
        m81184d(abstractC10024la);
        if (m81186b(abstractC10024la) > this.f22503b) {
            m81181g(abstractC10024la);
        }
        if (this.f22506e.contains(abstractC10024la.m81157f())) {
            return null;
        }
        if (m81179i(abstractC10024la) > this.f22502a) {
            return m81182f(abstractC10024la);
        }
        return abstractC10024la;
    }

    /* renamed from: f */
    public final AbstractC10024la m81182f(AbstractC10024la abstractC10024la) {
        C10187s6 c10187s6 = new C10187s6(InterfaceC10068na.EnumC10075f.f22708i, abstractC10024la.m81157f().getValue(), null, null, null, null, 60, null);
        this.f22506e.add(abstractC10024la.m81157f());
        return c10187s6;
    }

    /* renamed from: g */
    public final void m81181g(AbstractC10024la abstractC10024la) {
        m81180h(abstractC10024la);
        this.f22505d.remove(abstractC10024la.m81157f());
    }

    /* renamed from: h */
    public final void m81180h(AbstractC10024la abstractC10024la) {
        this.f22504c.put(abstractC10024la.m81157f(), Long.valueOf(abstractC10024la.m81154i()));
    }

    /* renamed from: i */
    public final int m81179i(AbstractC10024la abstractC10024la) {
        int m81185c = m81185c(abstractC10024la) + 1;
        this.f22505d.put(abstractC10024la.m81157f(), Integer.valueOf(m81185c));
        return m81185c;
    }
}

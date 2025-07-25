package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.w0 */
/* loaded from: classes2.dex */
public class C5736w0 {

    /* renamed from: a */
    private final Map f11586a;

    /* renamed from: b */
    private final List f11587b;

    public C5736w0(Map map, List list) {
        this.f11586a = map;
        this.f11587b = list;
    }

    /* renamed from: a */
    protected boolean m93757a(Object obj) {
        return obj instanceof C5736w0;
    }

    /* renamed from: b */
    public List m93756b() {
        return this.f11587b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5736w0)) {
            return false;
        }
        C5736w0 c5736w0 = (C5736w0) obj;
        if (!c5736w0.m93757a(this)) {
            return false;
        }
        Map m93758a = m93758a();
        Map m93758a2 = c5736w0.m93758a();
        if (m93758a != null ? !m93758a.equals(m93758a2) : m93758a2 != null) {
            return false;
        }
        List m93756b = m93756b();
        List m93756b2 = c5736w0.m93756b();
        if (m93756b != null ? m93756b.equals(m93756b2) : m93756b2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Map m93758a = m93758a();
        int i = 43;
        if (m93758a == null) {
            hashCode = 43;
        } else {
            hashCode = m93758a.hashCode();
        }
        List m93756b = m93756b();
        int i2 = (hashCode + 59) * 59;
        if (m93756b != null) {
            i = m93756b.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + m93758a() + ", invalidEntries=" + m93756b() + ")";
    }

    /* renamed from: a */
    public Map m93758a() {
        return this.f11586a;
    }
}

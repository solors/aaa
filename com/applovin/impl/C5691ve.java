package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.ve */
/* loaded from: classes2.dex */
public class C5691ve {

    /* renamed from: b */
    private static final Set f11483b = new HashSet();

    /* renamed from: c */
    public static final C5691ve f11484c = m93906a("ar");

    /* renamed from: d */
    public static final C5691ve f11485d = m93906a("ttdasi_ms");

    /* renamed from: a */
    private String f11486a;

    /* renamed from: com.applovin.impl.ve$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5692a {
        /* renamed from: a */
        Object mo93905a(Object obj);
    }

    private C5691ve(String str) {
        this.f11486a = str;
    }

    /* renamed from: a */
    protected boolean m93907a(Object obj) {
        return obj instanceof C5691ve;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5691ve)) {
            return false;
        }
        C5691ve c5691ve = (C5691ve) obj;
        if (!c5691ve.m93907a(this)) {
            return false;
        }
        String m93908a = m93908a();
        String m93908a2 = c5691ve.m93908a();
        if (m93908a != null ? m93908a.equals(m93908a2) : m93908a2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String m93908a = m93908a();
        if (m93908a == null) {
            hashCode = 43;
        } else {
            hashCode = m93908a.hashCode();
        }
        return hashCode + 59;
    }

    public String toString() {
        return this.f11486a;
    }

    /* renamed from: a */
    public String m93908a() {
        return this.f11486a;
    }

    /* renamed from: a */
    private static C5691ve m93906a(String str) {
        Set set = f11483b;
        if (!set.contains(str)) {
            set.add(str);
            return new C5691ve(str);
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }
}

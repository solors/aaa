package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.ic */
/* loaded from: classes2.dex */
public class C4582ic implements Comparable {

    /* renamed from: a */
    private final String f6880a;

    /* renamed from: b */
    private final String f6881b;

    /* renamed from: c */
    private final boolean f6882c;

    /* renamed from: d */
    private final C4648je f6883d;

    public C4582ic(String str, String str2, boolean z, C4648je c4648je) {
        this.f6880a = str;
        this.f6881b = str2;
        this.f6882c = z;
        this.f6883d = c4648je;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C4582ic c4582ic) {
        return this.f6881b.compareToIgnoreCase(c4582ic.f6881b);
    }

    /* renamed from: b */
    public List m98447b() {
        List m98205l = this.f6883d.m98205l();
        if (m98205l != null && !m98205l.isEmpty()) {
            return m98205l;
        }
        return Collections.singletonList(this.f6880a);
    }

    /* renamed from: c */
    public String m98446c() {
        return this.f6880a;
    }

    /* renamed from: d */
    public C4648je m98445d() {
        return this.f6883d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4582ic c4582ic = (C4582ic) obj;
        String str = this.f6880a;
        if (str == null ? c4582ic.f6880a != null : !str.equals(c4582ic.f6880a)) {
            return false;
        }
        String str2 = this.f6881b;
        if (str2 == null ? c4582ic.f6881b != null : !str2.equals(c4582ic.f6881b)) {
            return false;
        }
        if (this.f6882c == c4582ic.f6882c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f6880a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f6881b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 + i2) * 31) + (this.f6882c ? 1 : 0);
    }

    /* renamed from: a */
    public String m98449a() {
        return this.f6881b;
    }
}

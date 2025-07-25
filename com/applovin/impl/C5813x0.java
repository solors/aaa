package com.applovin.impl;

/* renamed from: com.applovin.impl.x0 */
/* loaded from: classes2.dex */
public class C5813x0 {

    /* renamed from: a */
    private final String f11848a;

    /* renamed from: b */
    private final String f11849b;

    /* renamed from: c */
    private final String f11850c;

    /* renamed from: d */
    private final String f11851d;

    /* renamed from: e */
    private final String f11852e;

    /* renamed from: f */
    private final int f11853f;

    /* renamed from: g */
    private final boolean f11854g;

    public C5813x0(String str) {
        this(str, -1);
    }

    /* renamed from: a */
    protected boolean m93336a(Object obj) {
        return obj instanceof C5813x0;
    }

    /* renamed from: b */
    public String m93334b() {
        return this.f11848a;
    }

    /* renamed from: c */
    public String m93333c() {
        return this.f11849b;
    }

    /* renamed from: d */
    public String m93332d() {
        return this.f11852e;
    }

    /* renamed from: e */
    public String m93331e() {
        return this.f11850c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5813x0)) {
            return false;
        }
        C5813x0 c5813x0 = (C5813x0) obj;
        if (!c5813x0.m93336a(this)) {
            return false;
        }
        String m93334b = m93334b();
        String m93334b2 = c5813x0.m93334b();
        if (m93334b != null ? !m93334b.equals(m93334b2) : m93334b2 != null) {
            return false;
        }
        String m93333c = m93333c();
        String m93333c2 = c5813x0.m93333c();
        if (m93333c != null ? !m93333c.equals(m93333c2) : m93333c2 != null) {
            return false;
        }
        String m93331e = m93331e();
        String m93331e2 = c5813x0.m93331e();
        if (m93331e != null ? !m93331e.equals(m93331e2) : m93331e2 != null) {
            return false;
        }
        String m93337a = m93337a();
        String m93337a2 = c5813x0.m93337a();
        if (m93337a != null ? m93337a.equals(m93337a2) : m93337a2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m93330f() {
        return this.f11853f;
    }

    /* renamed from: g */
    public boolean m93329g() {
        return this.f11848a.equals("applovin.com");
    }

    /* renamed from: h */
    public boolean m93328h() {
        return this.f11854g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String m93334b = m93334b();
        int i = 43;
        if (m93334b == null) {
            hashCode = 43;
        } else {
            hashCode = m93334b.hashCode();
        }
        String m93333c = m93333c();
        int i2 = (hashCode + 59) * 59;
        if (m93333c == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = m93333c.hashCode();
        }
        int i3 = i2 + hashCode2;
        String m93331e = m93331e();
        int i4 = i3 * 59;
        if (m93331e == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = m93331e.hashCode();
        }
        int i5 = i4 + hashCode3;
        String m93337a = m93337a();
        int i6 = i5 * 59;
        if (m93337a != null) {
            i = m93337a.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + m93334b() + ", publisherId=" + m93333c() + ", relationship=" + m93331e() + ", certificateAuthorityId=" + m93337a() + ", rawValue=" + m93332d() + ", rowNumber=" + m93330f() + ", valid=" + m93328h() + ")";
    }

    public C5813x0(String str, int i) {
        this.f11852e = str;
        this.f11853f = i;
        String[] split = str.split(",");
        boolean z = split.length == 3 || split.length == 4;
        this.f11854g = z;
        if (z) {
            this.f11848a = m93335a(split[0]);
            this.f11849b = m93335a(split[1]);
            this.f11850c = m93335a(split[2]);
            this.f11851d = split.length == 4 ? m93335a(split[3]) : "";
            return;
        }
        this.f11848a = "";
        this.f11849b = "";
        this.f11850c = "";
        this.f11851d = "";
    }

    /* renamed from: a */
    public String m93337a() {
        return this.f11851d;
    }

    /* renamed from: a */
    private String m93335a(String str) {
        return str.replace((char) 173, ' ').trim();
    }
}

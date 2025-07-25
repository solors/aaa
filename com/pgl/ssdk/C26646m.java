package com.pgl.ssdk;

/* renamed from: com.pgl.ssdk.m */
/* loaded from: classes7.dex */
public final class C26646m<A, B> {

    /* renamed from: a */
    private final A f69921a;

    /* renamed from: b */
    private final B f69922b;

    public C26646m(A a, B b) {
        this.f69921a = a;
        this.f69922b = b;
    }

    /* renamed from: a */
    public static <A, B> C26646m<A, B> m40830a(A a, B b) {
        return new C26646m<>(a, b);
    }

    /* renamed from: b */
    public B m40829b() {
        return this.f69922b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C26646m.class != obj.getClass()) {
            return false;
        }
        C26646m c26646m = (C26646m) obj;
        A a = this.f69921a;
        if (a == null) {
            if (c26646m.f69921a != null) {
                return false;
            }
        } else if (!a.equals(c26646m.f69921a)) {
            return false;
        }
        B b = this.f69922b;
        if (b == null) {
            if (c26646m.f69922b != null) {
                return false;
            }
        } else if (!b.equals(c26646m.f69922b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        A a = this.f69921a;
        int i = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        B b = this.f69922b;
        if (b != null) {
            i = b.hashCode();
        }
        return i2 + i;
    }

    /* renamed from: a */
    public A m40831a() {
        return this.f69921a;
    }
}

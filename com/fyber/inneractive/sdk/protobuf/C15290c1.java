package com.fyber.inneractive.sdk.protobuf;

import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.c1 */
/* loaded from: classes4.dex */
public final class C15290c1 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f30240a;

    /* renamed from: b */
    public Object f30241b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC15299f1 f30242c;

    public C15290c1(AbstractC15299f1 abstractC15299f1, Map.Entry entry) {
        Object value = entry.getValue();
        this.f30242c = abstractC15299f1;
        this.f30240a = (Comparable) entry.getKey();
        this.f30241b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f30240a.compareTo(((C15290c1) obj).f30240a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f30240a;
        Object key = entry.getKey();
        if (comparable == null) {
            if (key == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f30241b;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    equals2 = true;
                } else {
                    equals2 = false;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f30240a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f30241b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f30240a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f30241b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f30242c.m76883a();
        Object obj2 = this.f30241b;
        this.f30241b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f30240a + "=" + this.f30241b;
    }

    public C15290c1(AbstractC15299f1 abstractC15299f1, Comparable comparable, Object obj) {
        this.f30242c = abstractC15299f1;
        this.f30240a = comparable;
        this.f30241b = obj;
    }
}

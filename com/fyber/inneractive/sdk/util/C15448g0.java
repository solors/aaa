package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.g0 */
/* loaded from: classes4.dex */
public final class C15448g0 {

    /* renamed from: a */
    public int f30598a;

    /* renamed from: b */
    public int f30599b;

    public C15448g0(int i, int i2) {
        this.f30598a = i;
        this.f30599b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15448g0.class != obj.getClass()) {
            return false;
        }
        C15448g0 c15448g0 = (C15448g0) obj;
        if (this.f30598a == c15448g0.f30598a && this.f30599b == c15448g0.f30599b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30598a * 31) + this.f30599b;
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.A4 */
/* loaded from: classes9.dex */
public final class C33760A4 {

    /* renamed from: a */
    public final boolean f92555a;

    /* renamed from: b */
    public final boolean f92556b;

    /* renamed from: c */
    public final boolean f92557c;

    /* renamed from: d */
    public final boolean f92558d;

    /* renamed from: e */
    public final boolean f92559e;

    /* renamed from: f */
    public final Boolean f92560f;

    public C33760A4(C35030y4 c35030y4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool;
        z = c35030y4.f95632a;
        this.f92555a = z;
        z2 = c35030y4.f95633b;
        this.f92556b = z2;
        z3 = c35030y4.f95634c;
        this.f92557c = z3;
        z4 = c35030y4.f95635d;
        this.f92558d = z4;
        z5 = c35030y4.f95636e;
        this.f92559e = z5;
        bool = c35030y4.f95637f;
        this.f92560f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33760A4.class != obj.getClass()) {
            return false;
        }
        C33760A4 c33760a4 = (C33760A4) obj;
        if (this.f92555a != c33760a4.f92555a || this.f92556b != c33760a4.f92556b || this.f92557c != c33760a4.f92557c || this.f92558d != c33760a4.f92558d || this.f92559e != c33760a4.f92559e) {
            return false;
        }
        Boolean bool = this.f92560f;
        Boolean bool2 = c33760a4.f92560f;
        if (bool != null) {
            return bool.equals(bool2);
        }
        if (bool2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((((((this.f92555a ? 1 : 0) * 31) + (this.f92556b ? 1 : 0)) * 31) + (this.f92557c ? 1 : 0)) * 31) + (this.f92558d ? 1 : 0)) * 31) + (this.f92559e ? 1 : 0)) * 31;
        Boolean bool = this.f92560f;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f92555a + ", featuresCollectingEnabled=" + this.f92556b + ", googleAid=" + this.f92557c + ", simInfo=" + this.f92558d + ", huaweiOaid=" + this.f92559e + ", sslPinning=" + this.f92560f + '}';
    }
}

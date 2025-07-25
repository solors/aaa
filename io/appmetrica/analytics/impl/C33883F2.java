package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.F2 */
/* loaded from: classes9.dex */
public final class C33883F2 {

    /* renamed from: a */
    public final EnumC33858E2 f92811a;

    /* renamed from: b */
    public final Boolean f92812b;

    public C33883F2(EnumC33858E2 enumC33858E2, Boolean bool) {
        this.f92811a = enumC33858E2;
        this.f92812b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33883F2.class != obj.getClass()) {
            return false;
        }
        C33883F2 c33883f2 = (C33883F2) obj;
        if (this.f92811a != c33883f2.f92811a) {
            return false;
        }
        Boolean bool = this.f92812b;
        if (bool != null) {
            return bool.equals(c33883f2.f92812b);
        }
        if (c33883f2.f92812b == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        EnumC33858E2 enumC33858E2 = this.f92811a;
        int i2 = 0;
        if (enumC33858E2 != null) {
            i = enumC33858E2.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Boolean bool = this.f92812b;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i3 + i2;
    }
}

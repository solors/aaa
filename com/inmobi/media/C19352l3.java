package com.inmobi.media;

/* renamed from: com.inmobi.media.l3 */
/* loaded from: classes6.dex */
public final class C19352l3 {

    /* renamed from: a */
    public final int f48459a;

    /* renamed from: b */
    public final int f48460b;

    /* renamed from: c */
    public final float f48461c;

    public C19352l3(int i, float f, int i2) {
        this.f48459a = i;
        this.f48460b = i2;
        this.f48461c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19352l3)) {
            return false;
        }
        C19352l3 c19352l3 = (C19352l3) obj;
        if (this.f48459a == c19352l3.f48459a && this.f48460b == c19352l3.f48460b && Float.compare(this.f48461c, c19352l3.f48461c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f48460b);
        return Float.hashCode(this.f48461c) + ((hashCode + (Integer.hashCode(this.f48459a) * 31)) * 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f48459a + ", height=" + this.f48460b + ", density=" + this.f48461c + ')';
    }
}

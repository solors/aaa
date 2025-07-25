package sg.bigo.ads.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: sg.bigo.ads.common.p */
/* loaded from: classes10.dex */
public class C43746p {

    /* renamed from: a */
    public final int f114477a;

    /* renamed from: b */
    public final int f114478b;

    public C43746p(int i, int i2) {
        this.f114477a = i;
        this.f114478b = i2;
    }

    /* renamed from: a */
    public static C43746p m5067a(int i, int i2, int i3) {
        return new C43746p(i3, (int) (((i3 * 1.0f) * i2) / i));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43746p) {
            C43746p c43746p = (C43746p) obj;
            if (c43746p.f114478b == this.f114478b && c43746p.f114477a == this.f114477a) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f114478b;
    }

    public int getWidth() {
        return this.f114477a;
    }

    public String toString() {
        int i = this.f114477a;
        int i2 = this.f114478b;
        return i + "x" + i2;
    }

    @NonNull
    /* renamed from: a */
    public static C43746p m5066a(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        if ((f * 1.0f) / f2 > (1.0f * f3) / f4) {
            f4 = (f3 / f) * f2;
        } else {
            f3 = (f4 / f2) * f;
        }
        return new C43746p((int) f3, (int) f4);
    }

    /* renamed from: a */
    public final boolean m5069a() {
        return this.f114477a > 0 && this.f114478b > 0;
    }

    /* renamed from: a */
    public final boolean m5068a(int i, int i2) {
        int i3;
        int i4;
        return (i == 0 || i2 == 0 || (i3 = this.f114477a) == 0 || (i4 = this.f114478b) == 0 || i * i4 != i2 * i3) ? false : true;
    }

    /* renamed from: a */
    public final boolean m5065a(C43746p c43746p) {
        return c43746p != null && this.f114477a * this.f114478b > c43746p.f114477a * c43746p.f114478b;
    }
}

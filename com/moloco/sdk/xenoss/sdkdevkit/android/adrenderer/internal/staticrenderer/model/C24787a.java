package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a */
/* loaded from: classes7.dex */
public final class C24787a {

    /* renamed from: a */
    public final int f64023a;

    /* renamed from: b */
    public final int f64024b;

    /* renamed from: c */
    public final int f64025c;

    /* renamed from: d */
    public final int f64026d;

    /* renamed from: e */
    public final int f64027e;

    /* renamed from: f */
    public final int f64028f;

    public C24787a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f64023a = i;
        this.f64024b = i2;
        this.f64025c = i3;
        this.f64026d = i4;
        this.f64027e = i5;
        this.f64028f = i6;
    }

    /* renamed from: a */
    public final int m45689a() {
        return this.f64027e;
    }

    /* renamed from: b */
    public final int m45688b() {
        return this.f64028f;
    }

    /* renamed from: c */
    public final int m45687c() {
        return this.f64023a;
    }

    /* renamed from: d */
    public final int m45686d() {
        return this.f64024b;
    }

    /* renamed from: e */
    public final int m45685e() {
        return this.f64025c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24787a)) {
            return false;
        }
        C24787a c24787a = (C24787a) obj;
        if (this.f64023a == c24787a.f64023a && this.f64024b == c24787a.f64024b && this.f64025c == c24787a.f64025c && this.f64026d == c24787a.f64026d && this.f64027e == c24787a.f64027e && this.f64028f == c24787a.f64028f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m45684f() {
        return this.f64026d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f64023a) * 31) + Integer.hashCode(this.f64024b)) * 31) + Integer.hashCode(this.f64025c)) * 31) + Integer.hashCode(this.f64026d)) * 31) + Integer.hashCode(this.f64027e)) * 31) + Integer.hashCode(this.f64028f);
    }

    @NotNull
    public String toString() {
        return "BannerAdTouch(viewPositionX=" + this.f64023a + ", viewPositionY=" + this.f64024b + ", viewSizeHeight=" + this.f64025c + ", viewSizeWidth=" + this.f64026d + ", touchX=" + this.f64027e + ", touchY=" + this.f64028f + ')';
    }
}

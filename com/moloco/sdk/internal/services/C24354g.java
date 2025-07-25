package com.moloco.sdk.internal.services;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.g */
/* loaded from: classes7.dex */
public final class C24354g {

    /* renamed from: a */
    public final int f63050a;

    /* renamed from: b */
    public final float f63051b;

    /* renamed from: c */
    public final int f63052c;

    /* renamed from: d */
    public final float f63053d;

    /* renamed from: e */
    public final float f63054e;

    /* renamed from: f */
    public final int f63055f;

    /* renamed from: g */
    public final float f63056g;

    /* renamed from: h */
    public final float f63057h;

    public C24354g(int i, float f, int i2, float f2, float f3, int i3, float f4, float f5) {
        this.f63050a = i;
        this.f63051b = f;
        this.f63052c = i2;
        this.f63053d = f2;
        this.f63054e = f3;
        this.f63055f = i3;
        this.f63056g = f4;
        this.f63057h = f5;
    }

    /* renamed from: a */
    public final float m46551a() {
        return this.f63054e;
    }

    /* renamed from: b */
    public final int m46550b() {
        return this.f63055f;
    }

    /* renamed from: c */
    public final float m46549c() {
        return this.f63053d;
    }

    /* renamed from: d */
    public final int m46548d() {
        return this.f63052c;
    }

    /* renamed from: e */
    public final float m46547e() {
        return this.f63051b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24354g)) {
            return false;
        }
        C24354g c24354g = (C24354g) obj;
        if (this.f63050a == c24354g.f63050a && Float.compare(this.f63051b, c24354g.f63051b) == 0 && this.f63052c == c24354g.f63052c && Float.compare(this.f63053d, c24354g.f63053d) == 0 && Float.compare(this.f63054e, c24354g.f63054e) == 0 && this.f63055f == c24354g.f63055f && Float.compare(this.f63056g, c24354g.f63056g) == 0 && Float.compare(this.f63057h, c24354g.f63057h) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m46546f() {
        return this.f63050a;
    }

    /* renamed from: g */
    public final float m46545g() {
        return this.f63056g;
    }

    /* renamed from: h */
    public final float m46544h() {
        return this.f63057h;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f63050a) * 31) + Float.hashCode(this.f63051b)) * 31) + Integer.hashCode(this.f63052c)) * 31) + Float.hashCode(this.f63053d)) * 31) + Float.hashCode(this.f63054e)) * 31) + Integer.hashCode(this.f63055f)) * 31) + Float.hashCode(this.f63056g)) * 31) + Float.hashCode(this.f63057h);
    }

    @NotNull
    public String toString() {
        return "ScreenInfo(screenWidthPx=" + this.f63050a + ", screenWidthDp=" + this.f63051b + ", screenHeightPx=" + this.f63052c + ", screenHeightDp=" + this.f63053d + ", density=" + this.f63054e + ", dpi=" + this.f63055f + ", xdpi=" + this.f63056g + ", ydpi=" + this.f63057h + ')';
    }
}

package com.moloco.sdk.internal.services.bidtoken.providers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.a */
/* loaded from: classes7.dex */
public final class C24278a {

    /* renamed from: a */
    public final boolean f62875a;

    /* renamed from: b */
    public final boolean f62876b;

    /* renamed from: c */
    public final boolean f62877c;

    /* renamed from: d */
    public final float f62878d;

    public C24278a(boolean z, boolean z2, boolean z3, float f) {
        this.f62875a = z;
        this.f62876b = z2;
        this.f62877c = z3;
        this.f62878d = f;
    }

    /* renamed from: a */
    public final boolean m46679a() {
        return this.f62875a;
    }

    /* renamed from: b */
    public final boolean m46678b() {
        return this.f62876b;
    }

    /* renamed from: c */
    public final float m46677c() {
        return this.f62878d;
    }

    /* renamed from: d */
    public final boolean m46676d() {
        return this.f62877c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24278a)) {
            return false;
        }
        C24278a c24278a = (C24278a) obj;
        if (this.f62875a == c24278a.f62875a && this.f62876b == c24278a.f62876b && this.f62877c == c24278a.f62877c && Float.compare(this.f62878d, c24278a.f62878d) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f62875a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.f62876b;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z2 = this.f62877c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((i4 + i) * 31) + Float.hashCode(this.f62878d);
    }

    @NotNull
    public String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.f62875a + ", accessibilityLargePointerIcon=" + this.f62876b + ", reduceBrightColorsActivated=" + this.f62877c + ", fontScale=" + this.f62878d + ')';
    }
}

package com.moloco.sdk.common_adapter_internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: com.moloco.sdk.common_adapter_internal.a */
/* loaded from: classes7.dex */
public final class C23862a {

    /* renamed from: a */
    public final int f61899a;

    /* renamed from: b */
    public final int f61900b;

    /* renamed from: c */
    public final float f61901c;

    /* renamed from: d */
    public final float f61902d;

    /* renamed from: e */
    public final int f61903e;

    /* renamed from: f */
    public final float f61904f;

    public C23862a(int i, int i2, float f, float f2, int i3, float f3) {
        this.f61899a = i;
        this.f61900b = i2;
        this.f61901c = f;
        this.f61902d = f2;
        this.f61903e = i3;
        this.f61904f = f3;
    }

    /* renamed from: a */
    public final int m47600a() {
        return this.f61903e;
    }

    /* renamed from: b */
    public final float m47599b() {
        return this.f61902d;
    }

    /* renamed from: c */
    public final int m47598c() {
        return this.f61900b;
    }

    /* renamed from: d */
    public final float m47597d() {
        return this.f61904f;
    }

    /* renamed from: e */
    public final float m47596e() {
        return this.f61901c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23862a)) {
            return false;
        }
        C23862a c23862a = (C23862a) obj;
        if (this.f61899a == c23862a.f61899a && this.f61900b == c23862a.f61900b && Float.compare(this.f61901c, c23862a.f61901c) == 0 && Float.compare(this.f61902d, c23862a.f61902d) == 0 && this.f61903e == c23862a.f61903e && Float.compare(this.f61904f, c23862a.f61904f) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m47595f() {
        return this.f61899a;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f61899a) * 31) + Integer.hashCode(this.f61900b)) * 31) + Float.hashCode(this.f61901c)) * 31) + Float.hashCode(this.f61902d)) * 31) + Integer.hashCode(this.f61903e)) * 31) + Float.hashCode(this.f61904f);
    }

    @NotNull
    public String toString() {
        return "ScreenData(widthPx=" + this.f61899a + ", heightPx=" + this.f61900b + ", widthDp=" + this.f61901c + ", heightDp=" + this.f61902d + ", dpi=" + this.f61903e + ", pxRatio=" + this.f61904f + ')';
    }
}

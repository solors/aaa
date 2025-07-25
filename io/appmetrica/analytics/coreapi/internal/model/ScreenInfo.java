package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class ScreenInfo {

    /* renamed from: a */
    private final int f92359a;

    /* renamed from: b */
    private final int f92360b;

    /* renamed from: c */
    private final int f92361c;

    /* renamed from: d */
    private final float f92362d;

    public ScreenInfo(int i, int i2, int i3, float f) {
        this.f92359a = i;
        this.f92360b = i2;
        this.f92361c = i3;
        this.f92362d = f;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i, int i2, int i3, float f, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = screenInfo.f92359a;
        }
        if ((i4 & 2) != 0) {
            i2 = screenInfo.f92360b;
        }
        if ((i4 & 4) != 0) {
            i3 = screenInfo.f92361c;
        }
        if ((i4 & 8) != 0) {
            f = screenInfo.f92362d;
        }
        return screenInfo.copy(i, i2, i3, f);
    }

    public final int component1() {
        return this.f92359a;
    }

    public final int component2() {
        return this.f92360b;
    }

    public final int component3() {
        return this.f92361c;
    }

    public final float component4() {
        return this.f92362d;
    }

    @NotNull
    public final ScreenInfo copy(int i, int i2, int i3, float f) {
        return new ScreenInfo(i, i2, i3, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        if (this.f92359a == screenInfo.f92359a && this.f92360b == screenInfo.f92360b && this.f92361c == screenInfo.f92361c && Intrinsics.m17075f(Float.valueOf(this.f92362d), Float.valueOf(screenInfo.f92362d))) {
            return true;
        }
        return false;
    }

    public final int getDpi() {
        return this.f92361c;
    }

    public final int getHeight() {
        return this.f92360b;
    }

    public final float getScaleFactor() {
        return this.f92362d;
    }

    public final int getWidth() {
        return this.f92359a;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f92360b);
        int hashCode2 = Integer.hashCode(this.f92361c);
        return Float.hashCode(this.f92362d) + ((hashCode2 + ((hashCode + (Integer.hashCode(this.f92359a) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ScreenInfo(width=" + this.f92359a + ", height=" + this.f92360b + ", dpi=" + this.f92361c + ", scaleFactor=" + this.f92362d + ')';
    }
}

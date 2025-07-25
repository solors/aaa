package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class Size {
    public static final Size UNKNOWN = new Size(-1, -1);
    public static final Size ZERO = new Size(0, 0);

    /* renamed from: a */
    private final int f36152a;

    /* renamed from: b */
    private final int f36153b;

    public Size(int i, int i2) {
        boolean z;
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            z = false;
        } else {
            z = true;
        }
        Assertions.checkArgument(z);
        this.f36152a = i;
        this.f36153b = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.f36152a != size.f36152a || this.f36153b != size.f36153b) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return this.f36153b;
    }

    public int getWidth() {
        return this.f36152a;
    }

    public int hashCode() {
        int i = this.f36153b;
        int i2 = this.f36152a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f36152a + "x" + this.f36153b;
    }
}

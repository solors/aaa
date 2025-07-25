package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class Size {
    public final int height;
    public final int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @NonNull
    private static NumberFormatException invalidSize(@NonNull String str) {
        throw new NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    @NonNull
    public static Size parseSize(@NonNull String str) throws NumberFormatException {
        Objects.requireNonNull(str, "string must not be null");
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf >= 0) {
            try {
                return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException unused) {
                throw invalidSize(str);
            }
        }
        throw invalidSize(str);
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
        if (this.width != size.width || this.height != size.height) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.height;
        int i2 = this.width;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    @NonNull
    public String toString() {
        return this.width + "x" + this.height;
    }
}

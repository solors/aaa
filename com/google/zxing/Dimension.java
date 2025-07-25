package com.google.zxing;

/* loaded from: classes5.dex */
public final class Dimension {

    /* renamed from: a */
    private final int f44153a;

    /* renamed from: b */
    private final int f44154b;

    public Dimension(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            this.f44153a = i;
            this.f44154b = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dimension) {
            Dimension dimension = (Dimension) obj;
            if (this.f44153a == dimension.f44153a && this.f44154b == dimension.f44154b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f44154b;
    }

    public int getWidth() {
        return this.f44153a;
    }

    public int hashCode() {
        return (this.f44153a * 32713) + this.f44154b;
    }

    public String toString() {
        return this.f44153a + "x" + this.f44154b;
    }
}

package com.google.zxing.oned.rss;

/* loaded from: classes5.dex */
public class DataCharacter {

    /* renamed from: a */
    private final int f44534a;

    /* renamed from: b */
    private final int f44535b;

    public DataCharacter(int i, int i2) {
        this.f44534a = i;
        this.f44535b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        if (this.f44534a != dataCharacter.f44534a || this.f44535b != dataCharacter.f44535b) {
            return false;
        }
        return true;
    }

    public final int getChecksumPortion() {
        return this.f44535b;
    }

    public final int getValue() {
        return this.f44534a;
    }

    public final int hashCode() {
        return this.f44534a ^ this.f44535b;
    }

    public final String toString() {
        return this.f44534a + "(" + this.f44535b + ')';
    }
}

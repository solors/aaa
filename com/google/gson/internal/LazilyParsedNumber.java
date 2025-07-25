package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* loaded from: classes5.dex */
public final class LazilyParsedNumber extends Number {

    /* renamed from: b */
    private final String f43948b;

    public LazilyParsedNumber(String str) {
        this.f43948b = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f43948b);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f43948b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        String str = this.f43948b;
        String str2 = ((LazilyParsedNumber) obj).f43948b;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f43948b);
    }

    public int hashCode() {
        return this.f43948b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f43948b);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f43948b).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f43948b);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f43948b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f43948b).longValue();
        }
    }

    public String toString() {
        return this.f43948b;
    }
}

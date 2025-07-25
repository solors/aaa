package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public class AtomicDoubleArray implements Serializable {

    /* renamed from: b */
    private transient AtomicLongArray f41707b;

    public AtomicDoubleArray(int i) {
        this.f41707b = new AtomicLongArray(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = ImmutableLongArray.builder();
        for (int i = 0; i < readInt; i++) {
            builder.add(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.f41707b = new AtomicLongArray(builder.build().toArray());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = length();
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeDouble(get(i));
        }
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i, double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f41707b.get(i);
            longBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!this.f41707b.compareAndSet(i, j, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean compareAndSet(int i, double d, double d2) {
        return this.f41707b.compareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public final double get(int i) {
        return Double.longBitsToDouble(this.f41707b.get(i));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i, double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f41707b.get(i);
            longBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.f41707b.compareAndSet(i, j, Double.doubleToRawLongBits(longBitsToDouble + d)));
        return longBitsToDouble;
    }

    public final double getAndSet(int i, double d) {
        return Double.longBitsToDouble(this.f41707b.getAndSet(i, Double.doubleToRawLongBits(d)));
    }

    public final void lazySet(int i, double d) {
        this.f41707b.lazySet(i, Double.doubleToRawLongBits(d));
    }

    public final int length() {
        return this.f41707b.length();
    }

    public final void set(int i, double d) {
        this.f41707b.set(i, Double.doubleToRawLongBits(d));
    }

    public String toString() {
        int length = length() - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 19);
        sb2.append('[');
        int i = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.f41707b.get(i)));
            if (i == length) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(',');
            sb2.append(' ');
            i++;
        }
    }

    public final boolean weakCompareAndSet(int i, double d, double d2) {
        return this.f41707b.weakCompareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public AtomicDoubleArray(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Double.doubleToRawLongBits(dArr[i]);
        }
        this.f41707b = new AtomicLongArray(jArr);
    }
}

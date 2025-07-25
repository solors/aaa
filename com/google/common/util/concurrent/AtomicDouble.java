package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class AtomicDouble extends Number implements Serializable {

    /* renamed from: b */
    private transient AtomicLong f41706b;

    public AtomicDouble(double d) {
        this.f41706b = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f41706b = new AtomicLong();
        set(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f41706b.get();
            longBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!this.f41706b.compareAndSet(j, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean compareAndSet(double d, double d2) {
        return this.f41706b.compareAndSet(Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.f41706b.get());
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f41706b.get();
            longBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.f41706b.compareAndSet(j, Double.doubleToRawLongBits(longBitsToDouble + d)));
        return longBitsToDouble;
    }

    public final double getAndSet(double d) {
        return Double.longBitsToDouble(this.f41706b.getAndSet(Double.doubleToRawLongBits(d)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double d) {
        this.f41706b.lazySet(Double.doubleToRawLongBits(d));
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double d) {
        this.f41706b.set(Double.doubleToRawLongBits(d));
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double d, double d2) {
        return this.f41706b.weakCompareAndSet(Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public AtomicDouble() {
        this(0.0d);
    }
}

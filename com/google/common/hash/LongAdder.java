package com.google.common.hash;

import com.google.common.hash.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f41198d = 0;
        this.f41196b = null;
        this.f41197c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // com.google.common.hash.LongAddable
    public void add(long j) {
        int length;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr = this.f41196b;
        if (cellArr == null) {
            long j2 = this.f41197c;
            if (m68279b(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = Striped64.f41190f.get();
        boolean z = true;
        if (iArr != null && cellArr != null && (length = cellArr.length) >= 1 && (cell = cellArr[(length - 1) & iArr[0]]) != null) {
            long j3 = cell.f41201a;
            z = cell.m68273a(j3, j3 + j);
            if (z) {
                return;
            }
        }
        m68274g(j, iArr, z);
    }

    @Override // com.google.common.hash.Striped64
    /* renamed from: d */
    final long mo68277d(long j, long j2) {
        return j + j2;
    }

    public void decrement() {
        add(-1L);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) sum();
    }

    @Override // com.google.common.hash.LongAddable
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public void reset() {
        m68275f(0L);
    }

    @Override // com.google.common.hash.LongAddable
    public long sum() {
        long j = this.f41197c;
        Striped64.Cell[] cellArr = this.f41196b;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.f41201a;
                }
            }
        }
        return j;
    }

    public long sumThenReset() {
        long j = this.f41197c;
        Striped64.Cell[] cellArr = this.f41196b;
        this.f41197c = 0L;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.f41201a;
                    cell.f41201a = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}

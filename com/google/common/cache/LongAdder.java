package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.cache.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f39697d = 0;
        this.f39695b = null;
        this.f39696c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // com.google.common.cache.LongAddable
    public void add(long j) {
        int length;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr = this.f39695b;
        if (cellArr == null) {
            long j2 = this.f39696c;
            if (m69826b(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = Striped64.f39689f.get();
        boolean z = true;
        if (iArr != null && cellArr != null && (length = cellArr.length) >= 1 && (cell = cellArr[(length - 1) & iArr[0]]) != null) {
            long j3 = cell.f39700a;
            z = cell.m69820a(j3, j3 + j);
            if (z) {
                return;
            }
        }
        m69821g(j, iArr, z);
    }

    @Override // com.google.common.cache.Striped64
    /* renamed from: d */
    final long mo69824d(long j, long j2) {
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

    @Override // com.google.common.cache.LongAddable
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
        m69822f(0L);
    }

    @Override // com.google.common.cache.LongAddable
    public long sum() {
        long j = this.f39696c;
        Striped64.Cell[] cellArr = this.f39695b;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.f39700a;
                }
            }
        }
        return j;
    }

    public long sumThenReset() {
        long j = this.f39696c;
        Striped64.Cell[] cellArr = this.f39695b;
        this.f39696c = 0L;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.f39700a;
                    cell.f39700a = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}

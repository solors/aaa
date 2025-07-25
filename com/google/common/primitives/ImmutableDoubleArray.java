package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ImmutableDoubleArray implements Serializable {

    /* renamed from: f */
    private static final ImmutableDoubleArray f41454f = new ImmutableDoubleArray(new double[0]);

    /* renamed from: b */
    private final double[] f41455b;

    /* renamed from: c */
    private final transient int f41456c;

    /* renamed from: d */
    private final int f41457d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: b */
        private final ImmutableDoubleArray f41458b;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.f41458b.equals(((AsList) obj).f41458b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() == list.size()) {
                int i = this.f41458b.f41456c;
                for (Object obj2 : list) {
                    if (obj2 instanceof Double) {
                        int i2 = i + 1;
                        if (ImmutableDoubleArray.m68033e(this.f41458b.f41455b[i], ((Double) obj2).doubleValue())) {
                            i = i2;
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f41458b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f41458b.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f41458b.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41458b.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i, int i2) {
            return this.f41458b.subArray(i, i2).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f41458b.toString();
        }

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.f41458b = immutableDoubleArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i) {
            return Double.valueOf(this.f41458b.get(i));
        }
    }

    public static Builder builder(int i) {
        Preconditions.checkArgument(i >= 0, "Invalid initialCapacity: %s", i);
        return new Builder(i);
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        if (dArr.length == 0) {
            return f41454f;
        }
        return new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m68033e(double d, double d2) {
        if (Double.doubleToLongBits(d) == Double.doubleToLongBits(d2)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m68032f() {
        if (this.f41456c <= 0 && this.f41457d >= this.f41455b.length) {
            return false;
        }
        return true;
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m68031of() {
        return f41454f;
    }

    public List<Double> asList() {
        return new AsList();
    }

    public boolean contains(double d) {
        if (indexOf(d) >= 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!m68033e(get(i), immutableDoubleArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    public double get(int i) {
        Preconditions.checkElementIndex(i, length());
        return this.f41455b[this.f41456c + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f41456c; i2 < this.f41457d; i2++) {
            i = (i * 31) + Doubles.hashCode(this.f41455b[i2]);
        }
        return i;
    }

    public int indexOf(double d) {
        for (int i = this.f41456c; i < this.f41457d; i++) {
            if (m68033e(this.f41455b[i], d)) {
                return i - this.f41456c;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.f41457d == this.f41456c) {
            return true;
        }
        return false;
    }

    public int lastIndexOf(double d) {
        int i = this.f41457d;
        while (true) {
            i--;
            if (i >= this.f41456c) {
                if (m68033e(this.f41455b[i], d)) {
                    return i - this.f41456c;
                }
            } else {
                return -1;
            }
        }
    }

    public int length() {
        return this.f41457d - this.f41456c;
    }

    Object readResolve() {
        if (isEmpty()) {
            return f41454f;
        }
        return this;
    }

    public ImmutableDoubleArray subArray(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, length());
        if (i == i2) {
            return f41454f;
        }
        double[] dArr = this.f41455b;
        int i3 = this.f41456c;
        return new ImmutableDoubleArray(dArr, i + i3, i3 + i2);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.f41455b, this.f41456c, this.f41457d);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.f41455b[this.f41456c]);
        int i = this.f41456c;
        while (true) {
            i++;
            if (i < this.f41457d) {
                sb2.append(", ");
                sb2.append(this.f41455b[i]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }

    public ImmutableDoubleArray trimmed() {
        if (m68032f()) {
            return new ImmutableDoubleArray(toArray());
        }
        return this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m68030of(double d) {
        return new ImmutableDoubleArray(new double[]{d});
    }

    @CanIgnoreReturnValue
    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private double[] f41459a;

        /* renamed from: b */
        private int f41460b = 0;

        Builder(int i) {
            this.f41459a = new double[i];
        }

        /* renamed from: a */
        private void m68023a(int i) {
            int i2 = this.f41460b + i;
            double[] dArr = this.f41459a;
            if (i2 > dArr.length) {
                this.f41459a = Arrays.copyOf(dArr, m68022b(dArr.length, i2));
            }
        }

        /* renamed from: b */
        private static int m68022b(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public Builder add(double d) {
            m68023a(1);
            double[] dArr = this.f41459a;
            int i = this.f41460b;
            dArr[i] = d;
            this.f41460b = i + 1;
            return this;
        }

        public Builder addAll(double[] dArr) {
            m68023a(dArr.length);
            System.arraycopy(dArr, 0, this.f41459a, this.f41460b, dArr.length);
            this.f41460b += dArr.length;
            return this;
        }

        @CheckReturnValue
        public ImmutableDoubleArray build() {
            if (this.f41460b == 0) {
                return ImmutableDoubleArray.f41454f;
            }
            return new ImmutableDoubleArray(this.f41459a, 0, this.f41460b);
        }

        public Builder addAll(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection) iterable);
            }
            for (Double d : iterable) {
                add(d.doubleValue());
            }
            return this;
        }

        public Builder addAll(Collection<Double> collection) {
            m68023a(collection.size());
            for (Double d : collection) {
                double[] dArr = this.f41459a;
                int i = this.f41460b;
                this.f41460b = i + 1;
                dArr[i] = d.doubleValue();
            }
            return this;
        }

        public Builder addAll(ImmutableDoubleArray immutableDoubleArray) {
            m68023a(immutableDoubleArray.length());
            System.arraycopy(immutableDoubleArray.f41455b, immutableDoubleArray.f41456c, this.f41459a, this.f41460b, immutableDoubleArray.length());
            this.f41460b += immutableDoubleArray.length();
            return this;
        }
    }

    private ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.f41455b = dArr;
        this.f41456c = i;
        this.f41457d = i2;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m68029of(double d, double d2) {
        return new ImmutableDoubleArray(new double[]{d, d2});
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        return collection.isEmpty() ? f41454f : new ImmutableDoubleArray(Doubles.toArray(collection));
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m68028of(double d, double d2, double d3) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3});
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Double>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m68027of(double d, double d2, double d3, double d4) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m68026of(double d, double d2, double d3, double d4, double d5) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m68025of(double d, double d2, double d3, double d4, double d5, double d6) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5, d6});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m68024of(double d, double... dArr) {
        Preconditions.checkArgument(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }
}

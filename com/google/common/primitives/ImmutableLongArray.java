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
public final class ImmutableLongArray implements Serializable {

    /* renamed from: f */
    private static final ImmutableLongArray f41468f = new ImmutableLongArray(new long[0]);

    /* renamed from: b */
    private final long[] f41469b;

    /* renamed from: c */
    private final transient int f41470c;

    /* renamed from: d */
    private final int f41471d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: b */
        private final ImmutableLongArray f41472b;

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
                return this.f41472b.equals(((AsList) obj).f41472b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() == list.size()) {
                int i = this.f41472b.f41470c;
                for (Object obj2 : list) {
                    if (obj2 instanceof Long) {
                        int i2 = i + 1;
                        if (this.f41472b.f41469b[i] == ((Long) obj2).longValue()) {
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
            return this.f41472b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f41472b.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f41472b.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41472b.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            return this.f41472b.subArray(i, i2).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f41472b.toString();
        }

        private AsList(ImmutableLongArray immutableLongArray) {
            this.f41472b = immutableLongArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i) {
            return Long.valueOf(this.f41472b.get(i));
        }
    }

    public static Builder builder(int i) {
        Preconditions.checkArgument(i >= 0, "Invalid initialCapacity: %s", i);
        return new Builder(i);
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        if (jArr.length == 0) {
            return f41468f;
        }
        return new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    /* renamed from: d */
    private boolean m68004d() {
        if (this.f41470c <= 0 && this.f41471d >= this.f41469b.length) {
            return false;
        }
        return true;
    }

    /* renamed from: of */
    public static ImmutableLongArray m68003of() {
        return f41468f;
    }

    public List<Long> asList() {
        return new AsList();
    }

    public boolean contains(long j) {
        if (indexOf(j) >= 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableLongArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i) {
        Preconditions.checkElementIndex(i, length());
        return this.f41469b[this.f41470c + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f41470c; i2 < this.f41471d; i2++) {
            i = (i * 31) + Longs.hashCode(this.f41469b[i2]);
        }
        return i;
    }

    public int indexOf(long j) {
        for (int i = this.f41470c; i < this.f41471d; i++) {
            if (this.f41469b[i] == j) {
                return i - this.f41470c;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.f41471d == this.f41470c) {
            return true;
        }
        return false;
    }

    public int lastIndexOf(long j) {
        int i = this.f41471d;
        while (true) {
            i--;
            int i2 = this.f41470c;
            if (i >= i2) {
                if (this.f41469b[i] == j) {
                    return i - i2;
                }
            } else {
                return -1;
            }
        }
    }

    public int length() {
        return this.f41471d - this.f41470c;
    }

    Object readResolve() {
        if (isEmpty()) {
            return f41468f;
        }
        return this;
    }

    public ImmutableLongArray subArray(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, length());
        if (i == i2) {
            return f41468f;
        }
        long[] jArr = this.f41469b;
        int i3 = this.f41470c;
        return new ImmutableLongArray(jArr, i + i3, i3 + i2);
    }

    public long[] toArray() {
        return Arrays.copyOfRange(this.f41469b, this.f41470c, this.f41471d);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.f41469b[this.f41470c]);
        int i = this.f41470c;
        while (true) {
            i++;
            if (i < this.f41471d) {
                sb2.append(", ");
                sb2.append(this.f41469b[i]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }

    public ImmutableLongArray trimmed() {
        if (m68004d()) {
            return new ImmutableLongArray(toArray());
        }
        return this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    /* renamed from: of */
    public static ImmutableLongArray m68002of(long j) {
        return new ImmutableLongArray(new long[]{j});
    }

    @CanIgnoreReturnValue
    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private long[] f41473a;

        /* renamed from: b */
        private int f41474b = 0;

        Builder(int i) {
            this.f41473a = new long[i];
        }

        /* renamed from: a */
        private void m67995a(int i) {
            int i2 = this.f41474b + i;
            long[] jArr = this.f41473a;
            if (i2 > jArr.length) {
                this.f41473a = Arrays.copyOf(jArr, m67994b(jArr.length, i2));
            }
        }

        /* renamed from: b */
        private static int m67994b(int i, int i2) {
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

        public Builder add(long j) {
            m67995a(1);
            long[] jArr = this.f41473a;
            int i = this.f41474b;
            jArr[i] = j;
            this.f41474b = i + 1;
            return this;
        }

        public Builder addAll(long[] jArr) {
            m67995a(jArr.length);
            System.arraycopy(jArr, 0, this.f41473a, this.f41474b, jArr.length);
            this.f41474b += jArr.length;
            return this;
        }

        @CheckReturnValue
        public ImmutableLongArray build() {
            if (this.f41474b == 0) {
                return ImmutableLongArray.f41468f;
            }
            return new ImmutableLongArray(this.f41473a, 0, this.f41474b);
        }

        public Builder addAll(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection) iterable);
            }
            for (Long l : iterable) {
                add(l.longValue());
            }
            return this;
        }

        public Builder addAll(Collection<Long> collection) {
            m67995a(collection.size());
            for (Long l : collection) {
                long[] jArr = this.f41473a;
                int i = this.f41474b;
                this.f41474b = i + 1;
                jArr[i] = l.longValue();
            }
            return this;
        }

        public Builder addAll(ImmutableLongArray immutableLongArray) {
            m67995a(immutableLongArray.length());
            System.arraycopy(immutableLongArray.f41469b, immutableLongArray.f41470c, this.f41473a, this.f41474b, immutableLongArray.length());
            this.f41474b += immutableLongArray.length();
            return this;
        }
    }

    private ImmutableLongArray(long[] jArr, int i, int i2) {
        this.f41469b = jArr;
        this.f41470c = i;
        this.f41471d = i2;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    /* renamed from: of */
    public static ImmutableLongArray m68001of(long j, long j2) {
        return new ImmutableLongArray(new long[]{j, j2});
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? f41468f : new ImmutableLongArray(Longs.toArray(collection));
    }

    /* renamed from: of */
    public static ImmutableLongArray m68000of(long j, long j2, long j3) {
        return new ImmutableLongArray(new long[]{j, j2, j3});
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Long>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    /* renamed from: of */
    public static ImmutableLongArray m67999of(long j, long j2, long j3, long j4) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4});
    }

    /* renamed from: of */
    public static ImmutableLongArray m67998of(long j, long j2, long j3, long j4, long j5) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5});
    }

    /* renamed from: of */
    public static ImmutableLongArray m67997of(long j, long j2, long j3, long j4, long j5, long j6) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5, j6});
    }

    /* renamed from: of */
    public static ImmutableLongArray m67996of(long j, long... jArr) {
        Preconditions.checkArgument(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }
}

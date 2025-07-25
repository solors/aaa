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
public final class ImmutableIntArray implements Serializable {

    /* renamed from: f */
    private static final ImmutableIntArray f41461f = new ImmutableIntArray(new int[0]);

    /* renamed from: b */
    private final int[] f41462b;

    /* renamed from: c */
    private final transient int f41463c;

    /* renamed from: d */
    private final int f41464d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: b */
        private final ImmutableIntArray f41465b;

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
                return this.f41465b.equals(((AsList) obj).f41465b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() == list.size()) {
                int i = this.f41465b.f41463c;
                for (Object obj2 : list) {
                    if (obj2 instanceof Integer) {
                        int i2 = i + 1;
                        if (this.f41465b.f41462b[i] == ((Integer) obj2).intValue()) {
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
            return this.f41465b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f41465b.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f41465b.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41465b.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            return this.f41465b.subArray(i, i2).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f41465b.toString();
        }

        private AsList(ImmutableIntArray immutableIntArray) {
            this.f41465b = immutableIntArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
            return Integer.valueOf(this.f41465b.get(i));
        }
    }

    public static Builder builder(int i) {
        Preconditions.checkArgument(i >= 0, "Invalid initialCapacity: %s", i);
        return new Builder(i);
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? f41461f : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    /* renamed from: d */
    private boolean m68018d() {
        if (this.f41463c <= 0 && this.f41464d >= this.f41462b.length) {
            return false;
        }
        return true;
    }

    /* renamed from: of */
    public static ImmutableIntArray m68017of() {
        return f41461f;
    }

    public List<Integer> asList() {
        return new AsList();
    }

    public boolean contains(int i) {
        if (indexOf(i) >= 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableIntArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        Preconditions.checkElementIndex(i, length());
        return this.f41462b[this.f41463c + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f41463c; i2 < this.f41464d; i2++) {
            i = (i * 31) + Ints.hashCode(this.f41462b[i2]);
        }
        return i;
    }

    public int indexOf(int i) {
        for (int i2 = this.f41463c; i2 < this.f41464d; i2++) {
            if (this.f41462b[i2] == i) {
                return i2 - this.f41463c;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.f41464d == this.f41463c) {
            return true;
        }
        return false;
    }

    public int lastIndexOf(int i) {
        int i2 = this.f41464d;
        while (true) {
            i2--;
            int i3 = this.f41463c;
            if (i2 >= i3) {
                if (this.f41462b[i2] == i) {
                    return i2 - i3;
                }
            } else {
                return -1;
            }
        }
    }

    public int length() {
        return this.f41464d - this.f41463c;
    }

    Object readResolve() {
        if (isEmpty()) {
            return f41461f;
        }
        return this;
    }

    public ImmutableIntArray subArray(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, length());
        if (i == i2) {
            return f41461f;
        }
        int[] iArr = this.f41462b;
        int i3 = this.f41463c;
        return new ImmutableIntArray(iArr, i + i3, i3 + i2);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.f41462b, this.f41463c, this.f41464d);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.f41462b[this.f41463c]);
        int i = this.f41463c;
        while (true) {
            i++;
            if (i < this.f41464d) {
                sb2.append(", ");
                sb2.append(this.f41462b[i]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }

    public ImmutableIntArray trimmed() {
        if (m68018d()) {
            return new ImmutableIntArray(toArray());
        }
        return this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? f41461f : new ImmutableIntArray(Ints.toArray(collection));
    }

    /* renamed from: of */
    public static ImmutableIntArray m68016of(int i) {
        return new ImmutableIntArray(new int[]{i});
    }

    @CanIgnoreReturnValue
    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private int[] f41466a;

        /* renamed from: b */
        private int f41467b = 0;

        Builder(int i) {
            this.f41466a = new int[i];
        }

        /* renamed from: a */
        private void m68009a(int i) {
            int i2 = this.f41467b + i;
            int[] iArr = this.f41466a;
            if (i2 > iArr.length) {
                this.f41466a = Arrays.copyOf(iArr, m68008b(iArr.length, i2));
            }
        }

        /* renamed from: b */
        private static int m68008b(int i, int i2) {
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

        public Builder add(int i) {
            m68009a(1);
            int[] iArr = this.f41466a;
            int i2 = this.f41467b;
            iArr[i2] = i;
            this.f41467b = i2 + 1;
            return this;
        }

        public Builder addAll(int[] iArr) {
            m68009a(iArr.length);
            System.arraycopy(iArr, 0, this.f41466a, this.f41467b, iArr.length);
            this.f41467b += iArr.length;
            return this;
        }

        @CheckReturnValue
        public ImmutableIntArray build() {
            if (this.f41467b == 0) {
                return ImmutableIntArray.f41461f;
            }
            return new ImmutableIntArray(this.f41466a, 0, this.f41467b);
        }

        public Builder addAll(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection) iterable);
            }
            for (Integer num : iterable) {
                add(num.intValue());
            }
            return this;
        }

        public Builder addAll(Collection<Integer> collection) {
            m68009a(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.f41466a;
                int i = this.f41467b;
                this.f41467b = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        public Builder addAll(ImmutableIntArray immutableIntArray) {
            m68009a(immutableIntArray.length());
            System.arraycopy(immutableIntArray.f41462b, immutableIntArray.f41463c, this.f41466a, this.f41467b, immutableIntArray.length());
            this.f41467b += immutableIntArray.length();
            return this;
        }
    }

    private ImmutableIntArray(int[] iArr, int i, int i2) {
        this.f41462b = iArr;
        this.f41463c = i;
        this.f41464d = i2;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Integer>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    /* renamed from: of */
    public static ImmutableIntArray m68015of(int i, int i2) {
        return new ImmutableIntArray(new int[]{i, i2});
    }

    /* renamed from: of */
    public static ImmutableIntArray m68014of(int i, int i2, int i3) {
        return new ImmutableIntArray(new int[]{i, i2, i3});
    }

    /* renamed from: of */
    public static ImmutableIntArray m68013of(int i, int i2, int i3, int i4) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4});
    }

    /* renamed from: of */
    public static ImmutableIntArray m68012of(int i, int i2, int i3, int i4, int i5) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5});
    }

    /* renamed from: of */
    public static ImmutableIntArray m68011of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5, i6});
    }

    /* renamed from: of */
    public static ImmutableIntArray m68010of(int i, int... iArr) {
        Preconditions.checkArgument(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }
}

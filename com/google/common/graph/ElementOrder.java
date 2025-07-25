package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.Immutable;
import java.util.Comparator;
import java.util.Map;

@Immutable
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ElementOrder<T> {

    /* renamed from: a */
    private final Type f40989a;

    /* renamed from: b */
    private final Comparator<T> f40990b;

    /* renamed from: com.google.common.graph.ElementOrder$1 */
    /* loaded from: classes4.dex */
    static /* synthetic */ class C169651 {

        /* renamed from: a */
        static final /* synthetic */ int[] f40991a;

        static {
            int[] iArr = new int[Type.values().length];
            f40991a = iArr;
            try {
                iArr[Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40991a[Type.INSERTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40991a[Type.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40991a[Type.SORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    private ElementOrder(Type type, Comparator<T> comparator) {
        boolean z;
        boolean z2;
        this.f40989a = (Type) Preconditions.checkNotNull(type);
        this.f40990b = comparator;
        if (type == Type.SORTED) {
            z = true;
        } else {
            z = false;
        }
        if (comparator != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z == z2);
    }

    public static <S> ElementOrder<S> insertion() {
        return new ElementOrder<>(Type.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> ElementOrder<S> natural() {
        return new ElementOrder<>(Type.SORTED, Ordering.natural());
    }

    public static <S> ElementOrder<S> sorted(Comparator<S> comparator) {
        return new ElementOrder<>(Type.SORTED, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <S> ElementOrder<S> stable() {
        return new ElementOrder<>(Type.STABLE, null);
    }

    public static <S> ElementOrder<S> unordered() {
        return new ElementOrder<>(Type.UNORDERED, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <K extends T, V> Map<K, V> m68477b(int i) {
        int i2 = C169651.f40991a[this.f40989a.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    return Maps.newTreeMap(comparator());
                }
                throw new AssertionError();
            }
            return Maps.newLinkedHashMapWithExpectedSize(i);
        }
        return Maps.newHashMapWithExpectedSize(i);
    }

    public Comparator<T> comparator() {
        Comparator<T> comparator = this.f40990b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        ElementOrder elementOrder = (ElementOrder) obj;
        if (this.f40989a == elementOrder.f40989a && Objects.equal(this.f40990b, elementOrder.f40990b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f40989a, this.f40990b);
    }

    public String toString() {
        MoreObjects.ToStringHelper add = MoreObjects.toStringHelper(this).add("type", this.f40989a);
        Comparator<T> comparator = this.f40990b;
        if (comparator != null) {
            add.add("comparator", comparator);
        }
        return add.toString();
    }

    public Type type() {
        return this.f40989a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T1 extends T> ElementOrder<T1> m68478a() {
        return this;
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C> {

    /* renamed from: d */
    private static final Range<Comparable> f40576d = new Range<>(Cut.m69590d(), Cut.m69592b());

    /* renamed from: b */
    final Cut<C> f40577b;

    /* renamed from: c */
    final Cut<C> f40578c;

    /* renamed from: com.google.common.collect.Range$1 */
    /* loaded from: classes4.dex */
    static /* synthetic */ class C168541 {

        /* renamed from: a */
        static final /* synthetic */ int[] f40579a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f40579a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40579a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes4.dex */
    static class LowerBoundFn implements Function<Range, Cut> {

        /* renamed from: b */
        static final LowerBoundFn f40580b = new LowerBoundFn();

        LowerBoundFn() {
        }

        @Override // com.google.common.base.Function
        public Cut apply(Range range) {
            return range.f40577b;
        }
    }

    /* loaded from: classes4.dex */
    private static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {

        /* renamed from: b */
        static final Ordering<Range<?>> f40581b = new RangeLexOrdering();

        private RangeLexOrdering() {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Range<?> range, Range<?> range2) {
            return ComparisonChain.start().compare(range.f40577b, range2.f40577b).compare(range.f40578c, range2.f40578c).result();
        }
    }

    /* loaded from: classes4.dex */
    static class UpperBoundFn implements Function<Range, Cut> {

        /* renamed from: b */
        static final UpperBoundFn f40582b = new UpperBoundFn();

        UpperBoundFn() {
        }

        @Override // com.google.common.base.Function
        public Cut apply(Range range) {
            return range.f40578c;
        }
    }

    private Range(Cut<C> cut, Cut<C> cut2) {
        String str;
        this.f40577b = (Cut) Preconditions.checkNotNull(cut);
        this.f40578c = (Cut) Preconditions.checkNotNull(cut2);
        if (cut.compareTo((Cut) cut2) <= 0 && cut != Cut.m69592b() && cut2 != Cut.m69590d()) {
            return;
        }
        String valueOf = String.valueOf(m68849e(cut, cut2));
        if (valueOf.length() != 0) {
            str = "Invalid range: ".concat(valueOf);
        } else {
            str = new String("Invalid range: ");
        }
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m68853a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return (Range<C>) f40576d;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c) {
        return m68852b(Cut.m69589e(c), Cut.m69592b());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c) {
        return m68852b(Cut.m69590d(), Cut.m69591c(c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <C extends Comparable<?>> Range<C> m68852b(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <C extends Comparable<?>> Function<Range<C>, Cut<C>> m68851c() {
        return LowerBoundFn.f40580b;
    }

    public static <C extends Comparable<?>> Range<C> closed(C c, C c2) {
        return m68852b(Cut.m69589e(c), Cut.m69591c(c2));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c, C c2) {
        return m68852b(Cut.m69589e(c), Cut.m69589e(c2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <C extends Comparable<?>> Ordering<Range<C>> m68850d() {
        return (Ordering<Range<C>>) RangeLexOrdering.f40581b;
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c, BoundType boundType) {
        int i = C168541.f40579a[boundType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return atLeast(c);
            }
            throw new AssertionError();
        }
        return greaterThan(c);
    }

    /* renamed from: e */
    private static String m68849e(Cut<?> cut, Cut<?> cut2) {
        StringBuilder sb2 = new StringBuilder(16);
        cut.mo69584g(sb2);
        sb2.append("..");
        cut2.mo69583h(sb2);
        return sb2.toString();
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) Preconditions.checkNotNull(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) Preconditions.checkNotNull(it.next());
            comparable = (Comparable) Ordering.natural().min(comparable, comparable3);
            comparable2 = (Comparable) Ordering.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <C extends Comparable<?>> Function<Range<C>, Cut<C>> m68848f() {
        return UpperBoundFn.f40582b;
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c) {
        return m68852b(Cut.m69591c(c), Cut.m69592b());
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c) {
        return m68852b(Cut.m69590d(), Cut.m69589e(c));
    }

    public static <C extends Comparable<?>> Range<C> open(C c, C c2) {
        return m68852b(Cut.m69591c(c), Cut.m69589e(c2));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c, C c2) {
        return m68852b(Cut.m69591c(c), Cut.m69591c(c2));
    }

    public static <C extends Comparable<?>> Range<C> range(C c, BoundType boundType, C c2, BoundType boundType2) {
        Cut m69589e;
        Cut m69591c;
        Preconditions.checkNotNull(boundType);
        Preconditions.checkNotNull(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        if (boundType == boundType3) {
            m69589e = Cut.m69591c(c);
        } else {
            m69589e = Cut.m69589e(c);
        }
        if (boundType2 == boundType3) {
            m69591c = Cut.m69589e(c2);
        } else {
            m69591c = Cut.m69591c(c2);
        }
        return m68852b(m69589e, m69591c);
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c) {
        return closed(c, c);
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c, BoundType boundType) {
        int i = C168541.f40579a[boundType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return atMost(c);
            }
            throw new AssertionError();
        }
        return lessThan(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Predicate
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return apply((Range<C>) ((Comparable) obj));
    }

    public Range<C> canonical(DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(discreteDomain);
        Cut<C> mo69587f = this.f40577b.mo69587f(discreteDomain);
        Cut<C> mo69587f2 = this.f40578c.mo69587f(discreteDomain);
        if (mo69587f == this.f40577b && mo69587f2 == this.f40578c) {
            return this;
        }
        return m68852b(mo69587f, mo69587f2);
    }

    public boolean contains(C c) {
        Preconditions.checkNotNull(c);
        if (this.f40577b.mo69581k(c) && !this.f40578c.mo69581k(c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsAll(Iterable<? extends C> iterable) {
        if (Iterables.isEmpty(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                if (contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last())) {
                    return true;
                }
                return false;
            }
        }
        for (C c : iterable) {
            if (!contains(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(Range<C> range) {
        if (this.f40577b.compareTo((Cut) range.f40577b) <= 0 && this.f40578c.compareTo((Cut) range.f40578c) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.f40577b.equals(range.f40577b) || !this.f40578c.equals(range.f40578c)) {
            return false;
        }
        return true;
    }

    public Range<C> gap(Range<C> range) {
        boolean z;
        Range<C> range2;
        if (this.f40577b.compareTo((Cut) range.f40578c) < 0 && range.f40577b.compareTo((Cut) this.f40578c) < 0) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(range);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length());
            sb2.append("Ranges have a nonempty intersection: ");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(valueOf2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.f40577b.compareTo((Cut) range.f40577b) < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            range2 = this;
        } else {
            range2 = range;
        }
        if (!z) {
            range = this;
        }
        return m68852b(range2.f40578c, range.f40577b);
    }

    public boolean hasLowerBound() {
        if (this.f40577b != Cut.m69590d()) {
            return true;
        }
        return false;
    }

    public boolean hasUpperBound() {
        if (this.f40578c != Cut.m69592b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40577b.hashCode() * 31) + this.f40578c.hashCode();
    }

    public Range<C> intersection(Range<C> range) {
        Cut<C> cut;
        Cut<C> cut2;
        boolean z;
        int compareTo = this.f40577b.compareTo((Cut) range.f40577b);
        int compareTo2 = this.f40578c.compareTo((Cut) range.f40578c);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return range;
        }
        if (compareTo >= 0) {
            cut = this.f40577b;
        } else {
            cut = range.f40577b;
        }
        if (compareTo2 <= 0) {
            cut2 = this.f40578c;
        } else {
            cut2 = range.f40578c;
        }
        if (cut.compareTo((Cut) cut2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return m68852b(cut, cut2);
    }

    public boolean isConnected(Range<C> range) {
        if (this.f40577b.compareTo((Cut) range.f40578c) <= 0 && range.f40577b.compareTo((Cut) this.f40578c) <= 0) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return this.f40577b.equals(this.f40578c);
    }

    public BoundType lowerBoundType() {
        return this.f40577b.mo69579m();
    }

    public C lowerEndpoint() {
        return this.f40577b.mo69586i();
    }

    Object readResolve() {
        if (equals(f40576d)) {
            return all();
        }
        return this;
    }

    public Range<C> span(Range<C> range) {
        Cut<C> cut;
        Cut<C> cut2;
        int compareTo = this.f40577b.compareTo((Cut) range.f40577b);
        int compareTo2 = this.f40578c.compareTo((Cut) range.f40578c);
        if (compareTo <= 0 && compareTo2 >= 0) {
            return this;
        }
        if (compareTo >= 0 && compareTo2 <= 0) {
            return range;
        }
        if (compareTo <= 0) {
            cut = this.f40577b;
        } else {
            cut = range.f40577b;
        }
        if (compareTo2 >= 0) {
            cut2 = this.f40578c;
        } else {
            cut2 = range.f40578c;
        }
        return m68852b(cut, cut2);
    }

    public String toString() {
        return m68849e(this.f40577b, this.f40578c);
    }

    public BoundType upperBoundType() {
        return this.f40578c.mo69578n();
    }

    public C upperEndpoint() {
        return this.f40578c.mo69586i();
    }

    @Deprecated
    public boolean apply(C c) {
        return contains(c);
    }
}

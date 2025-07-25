package p804nd;

import ae.KMarkers;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: nd.e0 */
/* loaded from: classes5.dex */
public final class UShortArray implements Collection<UShort>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final short[] f101859b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UShortArray.kt */
    @Metadata
    /* renamed from: nd.e0$a */
    /* loaded from: classes5.dex */
    public static final class C38496a implements Iterator<UShort>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final short[] f101860b;

        /* renamed from: c */
        private int f101861c;

        public C38496a(@NotNull short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f101860b = array;
        }

        /* renamed from: a */
        public short m14567a() {
            int i = this.f101861c;
            short[] sArr = this.f101860b;
            if (i < sArr.length) {
                this.f101861c = i + 1;
                return UShort.m14590c(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f101861c));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f101861c < this.f101860b.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UShort next() {
            return UShort.m14591b(m14567a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UShortArray(short[] sArr) {
        this.f101859b = sArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ UShortArray m14583a(short[] sArr) {
        return new UShortArray(sArr);
    }

    @NotNull
    /* renamed from: c */
    public static short[] m14582c(int i) {
        return m14581d(new short[i]);
    }

    @NotNull
    /* renamed from: d */
    public static short[] m14581d(@NotNull short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: g */
    public static boolean m14579g(short[] sArr, short s) {
        boolean m17337O;
        m17337O = _Arrays.m17337O(sArr, s);
        return m17337O;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m14578h(short[] r4, @org.jetbrains.annotations.NotNull java.util.Collection<p804nd.UShort> r5) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            goto L37
        L12:
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof p804nd.UShort
            r3 = 0
            if (r2 == 0) goto L33
            nd.d0 r0 = (p804nd.UShort) r0
            short r0 = r0.m14586g()
            boolean r0 = kotlin.collections.C37551l.m17468O(r4, r0)
            if (r0 == 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r3
        L34:
            if (r0 != 0) goto L16
            r1 = r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p804nd.UShortArray.m14578h(short[], java.util.Collection):boolean");
    }

    /* renamed from: i */
    public static boolean m14577i(short[] sArr, Object obj) {
        if (!(obj instanceof UShortArray) || !Intrinsics.m17075f(sArr, ((UShortArray) obj).m14568s())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final short m14576j(short[] sArr, int i) {
        return UShort.m14590c(sArr[i]);
    }

    /* renamed from: m */
    public static int m14574m(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: n */
    public static int m14573n(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: o */
    public static boolean m14572o(short[] sArr) {
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: p */
    public static Iterator<UShort> m14571p(short[] sArr) {
        return new C38496a(sArr);
    }

    /* renamed from: q */
    public static final void m14570q(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: r */
    public static String m14569r(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UShort uShort) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UShort)) {
            return false;
        }
        return m14580f(((UShort) obj).m14586g());
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m14578h(this.f101859b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m14577i(this.f101859b, obj);
    }

    /* renamed from: f */
    public boolean m14580f(short s) {
        return m14579g(this.f101859b, s);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m14573n(this.f101859b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m14572o(this.f101859b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UShort> iterator() {
        return m14571p(this.f101859b);
    }

    @Override // java.util.Collection
    /* renamed from: l */
    public int size() {
        return m14574m(this.f101859b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: s */
    public final /* synthetic */ short[] m14568s() {
        return this.f101859b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    public String toString() {
        return m14569r(this.f101859b);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }
}

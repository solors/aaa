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
/* renamed from: nd.b0 */
/* loaded from: classes5.dex */
public final class ULongArray implements Collection<ULong>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final long[] f101849b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ULongArray.kt */
    @Metadata
    /* renamed from: nd.b0$a */
    /* loaded from: classes5.dex */
    public static final class C38491a implements Iterator<ULong>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final long[] f101850b;

        /* renamed from: c */
        private int f101851c;

        public C38491a(@NotNull long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f101850b = array;
        }

        /* renamed from: a */
        public long m14594a() {
            int i = this.f101851c;
            long[] jArr = this.f101850b;
            if (i < jArr.length) {
                this.f101851c = i + 1;
                return ULong.m14617c(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f101851c));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f101851c < this.f101850b.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ULong next() {
            return ULong.m14618b(m14594a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ ULongArray(long[] jArr) {
        this.f101849b = jArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ ULongArray m14610a(long[] jArr) {
        return new ULongArray(jArr);
    }

    @NotNull
    /* renamed from: c */
    public static long[] m14609c(int i) {
        return m14608d(new long[i]);
    }

    @NotNull
    /* renamed from: d */
    public static long[] m14608d(@NotNull long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: g */
    public static boolean m14606g(long[] jArr, long j) {
        boolean m17339M;
        m17339M = _Arrays.m17339M(jArr, j);
        return m17339M;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m14605h(long[] r6, @org.jetbrains.annotations.NotNull java.util.Collection<p804nd.ULong> r7) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            goto L37
        L12:
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r7.next()
            boolean r2 = r0 instanceof p804nd.ULong
            r3 = 0
            if (r2 == 0) goto L33
            nd.a0 r0 = (p804nd.ULong) r0
            long r4 = r0.m14613g()
            boolean r0 = kotlin.collections.C37551l.m17470M(r6, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: p804nd.ULongArray.m14605h(long[], java.util.Collection):boolean");
    }

    /* renamed from: i */
    public static boolean m14604i(long[] jArr, Object obj) {
        if (!(obj instanceof ULongArray) || !Intrinsics.m17075f(jArr, ((ULongArray) obj).m14595s())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final long m14603j(long[] jArr, int i) {
        return ULong.m14617c(jArr[i]);
    }

    /* renamed from: m */
    public static int m14601m(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: n */
    public static int m14600n(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: o */
    public static boolean m14599o(long[] jArr) {
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: p */
    public static Iterator<ULong> m14598p(long[] jArr) {
        return new C38491a(jArr);
    }

    /* renamed from: q */
    public static final void m14597q(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: r */
    public static String m14596r(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ULong uLong) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ULong> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ULong)) {
            return false;
        }
        return m14607f(((ULong) obj).m14613g());
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m14605h(this.f101849b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m14604i(this.f101849b, obj);
    }

    /* renamed from: f */
    public boolean m14607f(long j) {
        return m14606g(this.f101849b, j);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m14600n(this.f101849b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m14599o(this.f101849b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<ULong> iterator() {
        return m14598p(this.f101849b);
    }

    @Override // java.util.Collection
    /* renamed from: l */
    public int size() {
        return m14601m(this.f101849b);
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
    public final /* synthetic */ long[] m14595s() {
        return this.f101849b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    public String toString() {
        return m14596r(this.f101849b);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }
}

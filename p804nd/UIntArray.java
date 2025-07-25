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
/* renamed from: nd.z */
/* loaded from: classes5.dex */
public final class UIntArray implements Collection<UInt>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final int[] f101891b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UIntArray.kt */
    @Metadata
    /* renamed from: nd.z$a */
    /* loaded from: classes5.dex */
    public static final class C38517a implements Iterator<UInt>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final int[] f101892b;

        /* renamed from: c */
        private int f101893c;

        public C38517a(@NotNull int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f101892b = array;
        }

        /* renamed from: a */
        public int m14486a() {
            int i = this.f101893c;
            int[] iArr = this.f101892b;
            if (i < iArr.length) {
                this.f101893c = i + 1;
                return UInt.m14507c(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f101893c));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f101893c < this.f101892b.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UInt next() {
            return UInt.m14508b(m14486a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UIntArray(int[] iArr) {
        this.f101891b = iArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ UIntArray m14502a(int[] iArr) {
        return new UIntArray(iArr);
    }

    @NotNull
    /* renamed from: c */
    public static int[] m14501c(int i) {
        return m14500d(new int[i]);
    }

    @NotNull
    /* renamed from: d */
    public static int[] m14500d(@NotNull int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: g */
    public static boolean m14498g(int[] iArr, int i) {
        boolean m17340L;
        m17340L = _Arrays.m17340L(iArr, i);
        return m17340L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m14497h(int[] r4, @org.jetbrains.annotations.NotNull java.util.Collection<p804nd.UInt> r5) {
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
            boolean r2 = r0 instanceof p804nd.UInt
            r3 = 0
            if (r2 == 0) goto L33
            nd.y r0 = (p804nd.UInt) r0
            int r0 = r0.m14503g()
            boolean r0 = kotlin.collections.C37551l.m17471L(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: p804nd.UIntArray.m14497h(int[], java.util.Collection):boolean");
    }

    /* renamed from: i */
    public static boolean m14496i(int[] iArr, Object obj) {
        if (!(obj instanceof UIntArray) || !Intrinsics.m17075f(iArr, ((UIntArray) obj).m14487s())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final int m14495j(int[] iArr, int i) {
        return UInt.m14507c(iArr[i]);
    }

    /* renamed from: m */
    public static int m14493m(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: n */
    public static int m14492n(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: o */
    public static boolean m14491o(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: p */
    public static Iterator<UInt> m14490p(int[] iArr) {
        return new C38517a(iArr);
    }

    /* renamed from: q */
    public static final void m14489q(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: r */
    public static String m14488r(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UInt uInt) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UInt)) {
            return false;
        }
        return m14499f(((UInt) obj).m14503g());
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m14497h(this.f101891b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m14496i(this.f101891b, obj);
    }

    /* renamed from: f */
    public boolean m14499f(int i) {
        return m14498g(this.f101891b, i);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m14492n(this.f101891b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m14491o(this.f101891b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UInt> iterator() {
        return m14490p(this.f101891b);
    }

    @Override // java.util.Collection
    /* renamed from: l */
    public int size() {
        return m14493m(this.f101891b);
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
    public final /* synthetic */ int[] m14487s() {
        return this.f101891b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    public String toString() {
        return m14488r(this.f101891b);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }
}

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
/* renamed from: nd.x */
/* loaded from: classes5.dex */
public final class UByteArray implements Collection<UByte>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final byte[] f101886b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UByteArray.kt */
    @Metadata
    /* renamed from: nd.x$a */
    /* loaded from: classes5.dex */
    public static final class C38515a implements Iterator<UByte>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final byte[] f101887b;

        /* renamed from: c */
        private int f101888c;

        public C38515a(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f101887b = array;
        }

        /* renamed from: a */
        public byte m14509a() {
            int i = this.f101888c;
            byte[] bArr = this.f101887b;
            if (i < bArr.length) {
                this.f101888c = i + 1;
                return UByte.m14530c(bArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f101888c));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f101888c < this.f101887b.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UByte next() {
            return UByte.m14531b(m14509a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UByteArray(byte[] bArr) {
        this.f101886b = bArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ UByteArray m14525a(byte[] bArr) {
        return new UByteArray(bArr);
    }

    @NotNull
    /* renamed from: c */
    public static byte[] m14524c(int i) {
        return m14523d(new byte[i]);
    }

    @NotNull
    /* renamed from: d */
    public static byte[] m14523d(@NotNull byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: g */
    public static boolean m14521g(byte[] bArr, byte b) {
        boolean m17342J;
        m17342J = _Arrays.m17342J(bArr, b);
        return m17342J;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m14520h(byte[] r4, @org.jetbrains.annotations.NotNull java.util.Collection<p804nd.UByte> r5) {
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
            boolean r2 = r0 instanceof p804nd.UByte
            r3 = 0
            if (r2 == 0) goto L33
            nd.w r0 = (p804nd.UByte) r0
            byte r0 = r0.m14526g()
            boolean r0 = kotlin.collections.C37551l.m17473J(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: p804nd.UByteArray.m14520h(byte[], java.util.Collection):boolean");
    }

    /* renamed from: i */
    public static boolean m14519i(byte[] bArr, Object obj) {
        if (!(obj instanceof UByteArray) || !Intrinsics.m17075f(bArr, ((UByteArray) obj).m14510s())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final byte m14518j(byte[] bArr, int i) {
        return UByte.m14530c(bArr[i]);
    }

    /* renamed from: m */
    public static int m14516m(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: n */
    public static int m14515n(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: o */
    public static boolean m14514o(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: p */
    public static Iterator<UByte> m14513p(byte[] bArr) {
        return new C38515a(bArr);
    }

    /* renamed from: q */
    public static final void m14512q(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* renamed from: r */
    public static String m14511r(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UByte)) {
            return false;
        }
        return m14522f(((UByte) obj).m14526g());
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m14520h(this.f101886b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m14519i(this.f101886b, obj);
    }

    /* renamed from: f */
    public boolean m14522f(byte b) {
        return m14521g(this.f101886b, b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m14515n(this.f101886b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m14514o(this.f101886b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UByte> iterator() {
        return m14513p(this.f101886b);
    }

    @Override // java.util.Collection
    /* renamed from: l */
    public int size() {
        return m14516m(this.f101886b);
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
    public final /* synthetic */ byte[] m14510s() {
        return this.f101886b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    public String toString() {
        return m14511r(this.f101886b);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }
}

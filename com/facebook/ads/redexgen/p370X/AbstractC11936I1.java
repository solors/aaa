package com.facebook.ads.redexgen.p370X;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H¦\u0002J\u0015\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0015¢\u0006\u0002\u0010\u0014J'\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0012\"\u0004\b\u0001\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0012H\u0014¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lkotlin/collections/AbstractCollection;", ExifInterface.LONGITUDE_EAST, "", "()V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", "", "toArray", "", "", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.I1 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11936I1<E> implements Collection<E> {
    public static byte[] A00;

    static {
        A09();
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{26, 22, 105, 86, 67, 84, 71, 82, 79, 73, 72, 6, 79, 85, 6, 72, 73, 82, 6, 85, 83, 86, 86, 73, 84, 82, 67, 66, 6, SignedBytes.MAX_POWER_OF_TWO, 73, 84, 6, 84, 67, 71, 66, 11, 73, 72, 74, 95, 6, 69, 73, 74, 74, 67, 69, 82, 79, 73, 72, 17, 39, 121, 106, 106, 121, 97, 40, 33, 40, 32, 40, 35, 57, 62};
    }

    public abstract int A0A();

    @Override // java.util.Collection
    public final boolean add(E e) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Collection, java.util.List
    public boolean contains(E e) {
        AbstractC11936I1<E> abstractC11936I1 = this;
        if ((abstractC11936I1 instanceof Collection) && abstractC11936I1.isEmpty()) {
            return false;
        }
        for (E e2 : abstractC11936I1) {
            if (C13227d7.A0A(e2, e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C13227d7.A07(collection, A08(60, 8, 90));
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return A0A();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC13229d9.A02(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C13227d7.A07(tArr, A08(55, 5, 15));
        return (T[]) AbstractC13229d9.A03(this, tArr);
    }

    public final String toString() {
        return AbstractC108910R.A03(this, A08(0, 2, 33), A08(53, 1, 93), A08(54, 1, 109), 0, null, new C110723O(this), 24, null);
    }
}

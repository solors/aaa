package com.facebook.ads.redexgen.p370X;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", FirebaseAnalytics.Param.INDEX, "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.6y */
/* loaded from: assets/audience_network.dex */
public class C112876y<E> extends AbstractC112866x<E>.IteratorImpl implements ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ AbstractC112866x<E> A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 45, 56, 47, 60, 41, 52, 50, 51, 125, 52, 46, 125, 51, 50, 41, 125, 46, 40, 45, 45, 50, 47, 41, 56, 57, 125, 59, 50, 47, 125, 47, 56, 60, 57, 112, 50, 51, 49, 36, 125, 62, 50, 49, 49, 56, 62, 41, 52, 50, 51};
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112876y(AbstractC112866x abstractC112866x, int i) {
        super(abstractC112866x);
        this.A00 = abstractC112866x;
        AbstractC112866x.A02.A04(i, this.A00.size());
        A05(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return A04() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return A04();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            AbstractC112866x<E> abstractC112866x = this.A00;
            A05(A04() - 1);
            return abstractC112866x.get(A04());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return A04() - 1;
    }
}

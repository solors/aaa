package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.2w */
/* loaded from: assets/audience_network.dex */
public final class C110452w<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    public static byte[] A04;
    public static String[] A05 = {"EcQijE7IVr04Rw61NGaoicInYj0Y5pIf", "PCDE4c", "BYuZqH1", "OJoSfp", "QCWxhSjCiFvhWHavsiQeM5doYPZYmeMK", "d82pg0nhnPmaH2Vj0U0d9nQwwUZrcRQP", "ixFFHsUoC5yCXRppT5dY", "J79m4yZ8T6gMUys2Mw9buLKZFKLQuXB5"};
    public int A00;
    public final /* synthetic */ AbstractC110472y A03;
    public boolean A02 = false;
    public int A01 = -1;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{123, 30, 34, 35, 57, 106, 41, 37, 36, 62, 43, 35, 36, 47, 56, 106, 46, 37, 47, 57, 106, 36, 37, 62, 106, 57, 63, 58, 58, 37, 56, 62, 106, 56, 47, 62, 43, 35, 36, 35, 36, 45, 106, 7, 43, 58, 100, 15, 36, 62, 56, 51, 106, 37, 40, 32, 47, 41, 62, 57};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public C110452w(AbstractC110472y abstractC110472y) {
        this.A03 = abstractC110472y;
        this.A00 = abstractC110472y.A04() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    /* renamed from: A00 */
    public final Map.Entry<K, V> next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.A02) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC110402r.A04(entry.getKey(), this.A03.A0B(this.A01, 0)) && AbstractC110402r.A04(entry.getValue(), this.A03.A0B(this.A01, 1));
            }
            return false;
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final K getKey() {
        if (this.A02) {
            return (K) this.A03.A0B(this.A01, 0);
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this.A02) {
            return (V) this.A03.A0B(this.A01, 1);
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01 < this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.A02) {
            Object A0B = this.A03.A0B(this.A01, 0);
            Object value = this.A03.A0B(this.A01, 1);
            return (value != null ? value.hashCode() : 0) ^ (A0B == null ? 0 : A0B.hashCode());
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A03.A0E(this.A01);
            this.A01--;
            int i = this.A00;
            String[] strArr = A05;
            if (strArr[4].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A05[6] = "BDV7jip61nQIrhzKiydP";
            this.A00 = i - 1;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (this.A02) {
            return (V) this.A03.A0C(this.A01, v);
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public final String toString() {
        return getKey() + A01(0, 1, 111) + getValue();
    }
}

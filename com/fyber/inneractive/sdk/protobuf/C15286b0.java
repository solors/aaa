package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC14857l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.b0 */
/* loaded from: classes4.dex */
public final class C15286b0 extends AbstractC15288c implements InterfaceC15304h0, RandomAccess, InterfaceC15256O0 {

    /* renamed from: d */
    public static final C15286b0 f30234d;

    /* renamed from: b */
    public int[] f30235b;

    /* renamed from: c */
    public int f30236c;

    static {
        C15286b0 c15286b0 = new C15286b0(new int[0], 0);
        f30234d = c15286b0;
        c15286b0.f30239a = false;
    }

    public C15286b0() {
        this.f30235b = new int[10];
        this.f30236c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m76887c();
        if (i >= 0 && i <= (i2 = this.f30236c)) {
            int[] iArr = this.f30235b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f30235b, i, iArr2, i + 1, this.f30236c - i);
                this.f30235b = iArr2;
            }
            this.f30235b[i] = intValue;
            this.f30236c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30236c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m76887c();
        Charset charset = AbstractC15319m0.f30280a;
        collection.getClass();
        if (!(collection instanceof C15286b0)) {
            return super.addAll(collection);
        }
        C15286b0 c15286b0 = (C15286b0) collection;
        int i = c15286b0.f30236c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30236c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f30235b;
            if (i3 > iArr.length) {
                this.f30235b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c15286b0.f30235b, 0, this.f30235b, this.f30236c, c15286b0.f30236c);
            this.f30236c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void m76890c(int i) {
        m76887c();
        int i2 = this.f30236c;
        int[] iArr = this.f30235b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f30235b = iArr2;
        }
        int[] iArr3 = this.f30235b;
        int i3 = this.f30236c;
        this.f30236c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m76889d(int i) {
        if (i >= 0 && i < this.f30236c) {
            return;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30236c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15316l0
    /* renamed from: e */
    public final C15286b0 mo76793b(int i) {
        if (i >= this.f30236c) {
            return new C15286b0(Arrays.copyOf(this.f30235b, i), this.f30236c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15286b0)) {
            return super.equals(obj);
        }
        C15286b0 c15286b0 = (C15286b0) obj;
        if (this.f30236c != c15286b0.f30236c) {
            return false;
        }
        int[] iArr = c15286b0.f30235b;
        for (int i = 0; i < this.f30236c; i++) {
            if (this.f30235b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m76889d(i);
        return Integer.valueOf(this.f30235b[i]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f30236c; i2++) {
            i = (i * 31) + this.f30235b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f30236c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f30235b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m76887c();
        m76889d(i);
        int[] iArr = this.f30235b;
        int i3 = iArr[i];
        if (i < this.f30236c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f30236c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m76887c();
        if (i2 >= i) {
            int[] iArr = this.f30235b;
            System.arraycopy(iArr, i2, iArr, i, this.f30236c - i2);
            this.f30236c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m76887c();
        m76889d(i);
        int[] iArr = this.f30235b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30236c;
    }

    public C15286b0(int[] iArr, int i) {
        this.f30235b = iArr;
        this.f30236c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m76890c(((Integer) obj).intValue());
        return true;
    }
}

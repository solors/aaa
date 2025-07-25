package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC14857l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.j */
/* loaded from: classes4.dex */
public final class C15309j extends AbstractC15288c implements InterfaceC15289c0, RandomAccess, InterfaceC15256O0 {

    /* renamed from: d */
    public static final C15309j f30270d;

    /* renamed from: b */
    public boolean[] f30271b;

    /* renamed from: c */
    public int f30272c;

    static {
        C15309j c15309j = new C15309j(new boolean[0], 0);
        f30270d = c15309j;
        c15309j.f30239a = false;
    }

    public C15309j() {
        this.f30271b = new boolean[10];
        this.f30272c = 0;
    }

    /* renamed from: a */
    public final void m76847a(boolean z) {
        m76887c();
        int i = this.f30272c;
        boolean[] zArr = this.f30271b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f30271b = zArr2;
        }
        boolean[] zArr3 = this.f30271b;
        int i2 = this.f30272c;
        this.f30272c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m76887c();
        if (i >= 0 && i <= (i2 = this.f30272c)) {
            boolean[] zArr = this.f30271b;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f30271b, i, zArr2, i + 1, this.f30272c - i);
                this.f30271b = zArr2;
            }
            this.f30271b[i] = booleanValue;
            this.f30272c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30272c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m76887c();
        Charset charset = AbstractC15319m0.f30280a;
        collection.getClass();
        if (!(collection instanceof C15309j)) {
            return super.addAll(collection);
        }
        C15309j c15309j = (C15309j) collection;
        int i = c15309j.f30272c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30272c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f30271b;
            if (i3 > zArr.length) {
                this.f30271b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c15309j.f30271b, 0, this.f30271b, this.f30272c, c15309j.f30272c);
            this.f30272c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15316l0
    /* renamed from: c */
    public final C15309j mo76793b(int i) {
        if (i >= this.f30272c) {
            return new C15309j(Arrays.copyOf(this.f30271b, i), this.f30272c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15309j)) {
            return super.equals(obj);
        }
        C15309j c15309j = (C15309j) obj;
        if (this.f30272c != c15309j.f30272c) {
            return false;
        }
        boolean[] zArr = c15309j.f30271b;
        for (int i = 0; i < this.f30272c; i++) {
            if (this.f30271b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.f30272c) {
            return Boolean.valueOf(this.f30271b[i]);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30272c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        int i2 = 1;
        for (int i3 = 0; i3 < this.f30272c; i3++) {
            int i4 = i2 * 31;
            boolean z = this.f30271b[i3];
            Charset charset = AbstractC15319m0.f30280a;
            if (z) {
                i = 1231;
            } else {
                i = 1237;
            }
            i2 = i4 + i;
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f30272c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f30271b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m76887c();
        if (i >= 0 && i < (i2 = this.f30272c)) {
            boolean[] zArr = this.f30271b;
            boolean z = zArr[i];
            if (i < i2 - 1) {
                System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
            }
            this.f30272c--;
            ((AbstractList) this).modCount++;
            return Boolean.valueOf(z);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30272c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m76887c();
        if (i2 >= i) {
            boolean[] zArr = this.f30271b;
            System.arraycopy(zArr, i2, zArr, i, this.f30272c - i2);
            this.f30272c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m76887c();
        if (i >= 0 && i < this.f30272c) {
            boolean[] zArr = this.f30271b;
            boolean z = zArr[i];
            zArr[i] = booleanValue;
            return Boolean.valueOf(z);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30272c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30272c;
    }

    public C15309j(boolean[] zArr, int i) {
        this.f30271b = zArr;
        this.f30272c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m76847a(((Boolean) obj).booleanValue());
        return true;
    }
}

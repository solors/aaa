package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC14857l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.v0 */
/* loaded from: classes4.dex */
public final class C15346v0 extends AbstractC15288c implements InterfaceC15313k0, RandomAccess, InterfaceC15256O0 {

    /* renamed from: d */
    public static final C15346v0 f30326d;

    /* renamed from: b */
    public long[] f30327b;

    /* renamed from: c */
    public int f30328c;

    static {
        C15346v0 c15346v0 = new C15346v0(new long[0], 0);
        f30326d = c15346v0;
        c15346v0.f30239a = false;
    }

    public C15346v0() {
        this.f30327b = new long[10];
        this.f30328c = 0;
    }

    /* renamed from: a */
    public final void m76794a(long j) {
        m76887c();
        int i = this.f30328c;
        long[] jArr = this.f30327b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f30327b = jArr2;
        }
        long[] jArr3 = this.f30327b;
        int i2 = this.f30328c;
        this.f30328c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m76887c();
        if (i >= 0 && i <= (i2 = this.f30328c)) {
            long[] jArr = this.f30327b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f30327b, i, jArr2, i + 1, this.f30328c - i);
                this.f30327b = jArr2;
            }
            this.f30327b[i] = longValue;
            this.f30328c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30328c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m76887c();
        Charset charset = AbstractC15319m0.f30280a;
        collection.getClass();
        if (!(collection instanceof C15346v0)) {
            return super.addAll(collection);
        }
        C15346v0 c15346v0 = (C15346v0) collection;
        int i = c15346v0.f30328c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30328c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f30327b;
            if (i3 > jArr.length) {
                this.f30327b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c15346v0.f30327b, 0, this.f30327b, this.f30328c, c15346v0.f30328c);
            this.f30328c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void m76792c(int i) {
        if (i >= 0 && i < this.f30328c) {
            return;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30328c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15316l0
    /* renamed from: d */
    public final C15346v0 mo76793b(int i) {
        if (i >= this.f30328c) {
            return new C15346v0(Arrays.copyOf(this.f30327b, i), this.f30328c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15346v0)) {
            return super.equals(obj);
        }
        C15346v0 c15346v0 = (C15346v0) obj;
        if (this.f30328c != c15346v0.f30328c) {
            return false;
        }
        long[] jArr = c15346v0.f30327b;
        for (int i = 0; i < this.f30328c; i++) {
            if (this.f30327b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m76792c(i);
        return Long.valueOf(this.f30327b[i]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f30328c; i2++) {
            long j = this.f30327b[i2];
            Charset charset = AbstractC15319m0.f30280a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f30328c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f30327b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m76887c();
        m76792c(i);
        long[] jArr = this.f30327b;
        long j = jArr[i];
        if (i < this.f30328c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f30328c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m76887c();
        if (i2 >= i) {
            long[] jArr = this.f30327b;
            System.arraycopy(jArr, i2, jArr, i, this.f30328c - i2);
            this.f30328c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m76887c();
        m76792c(i);
        long[] jArr = this.f30327b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30328c;
    }

    public C15346v0(long[] jArr, int i) {
        this.f30327b = jArr;
        this.f30328c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m76794a(((Long) obj).longValue());
        return true;
    }
}

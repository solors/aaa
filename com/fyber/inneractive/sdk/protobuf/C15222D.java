package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC14857l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.D */
/* loaded from: classes4.dex */
public final class C15222D extends AbstractC15288c implements InterfaceC15292d0, RandomAccess, InterfaceC15256O0 {

    /* renamed from: d */
    public static final C15222D f30151d;

    /* renamed from: b */
    public double[] f30152b;

    /* renamed from: c */
    public int f30153c;

    static {
        C15222D c15222d = new C15222D(new double[0], 0);
        f30151d = c15222d;
        c15222d.f30239a = false;
    }

    public C15222D() {
        this.f30152b = new double[10];
        this.f30153c = 0;
    }

    /* renamed from: a */
    public final void m77014a(double d) {
        m76887c();
        int i = this.f30153c;
        double[] dArr = this.f30152b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f30152b = dArr2;
        }
        double[] dArr3 = this.f30152b;
        int i2 = this.f30153c;
        this.f30153c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m76887c();
        if (i >= 0 && i <= (i2 = this.f30153c)) {
            double[] dArr = this.f30152b;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f30152b, i, dArr2, i + 1, this.f30153c - i);
                this.f30152b = dArr2;
            }
            this.f30152b[i] = doubleValue;
            this.f30153c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30153c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m76887c();
        Charset charset = AbstractC15319m0.f30280a;
        collection.getClass();
        if (!(collection instanceof C15222D)) {
            return super.addAll(collection);
        }
        C15222D c15222d = (C15222D) collection;
        int i = c15222d.f30153c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30153c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f30152b;
            if (i3 > dArr.length) {
                this.f30152b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c15222d.f30152b, 0, this.f30152b, this.f30153c, c15222d.f30153c);
            this.f30153c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15316l0
    /* renamed from: c */
    public final C15222D mo76793b(int i) {
        if (i >= this.f30153c) {
            return new C15222D(Arrays.copyOf(this.f30152b, i), this.f30153c);
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
        if (!(obj instanceof C15222D)) {
            return super.equals(obj);
        }
        C15222D c15222d = (C15222D) obj;
        if (this.f30153c != c15222d.f30153c) {
            return false;
        }
        double[] dArr = c15222d.f30152b;
        for (int i = 0; i < this.f30153c; i++) {
            if (Double.doubleToLongBits(this.f30152b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.f30153c) {
            return Double.valueOf(this.f30152b[i]);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30153c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f30153c; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f30152b[i2]);
            Charset charset = AbstractC15319m0.f30280a;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f30153c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f30152b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m76887c();
        if (i >= 0 && i < (i2 = this.f30153c)) {
            double[] dArr = this.f30152b;
            double d = dArr[i];
            if (i < i2 - 1) {
                System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
            }
            this.f30153c--;
            ((AbstractList) this).modCount++;
            return Double.valueOf(d);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30153c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m76887c();
        if (i2 >= i) {
            double[] dArr = this.f30152b;
            System.arraycopy(dArr, i2, dArr, i, this.f30153c - i2);
            this.f30153c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m76887c();
        if (i >= 0 && i < this.f30153c) {
            double[] dArr = this.f30152b;
            double d = dArr[i];
            dArr[i] = doubleValue;
            return Double.valueOf(d);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30153c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30153c;
    }

    public C15222D(double[] dArr, int i) {
        this.f30152b = dArr;
        this.f30153c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m77014a(((Double) obj).doubleValue());
        return true;
    }
}

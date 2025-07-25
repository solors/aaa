package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC14857l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.Q */
/* loaded from: classes4.dex */
public final class C15261Q extends AbstractC15288c implements InterfaceC15301g0, RandomAccess, InterfaceC15256O0 {

    /* renamed from: d */
    public static final C15261Q f30198d;

    /* renamed from: b */
    public float[] f30199b;

    /* renamed from: c */
    public int f30200c;

    static {
        C15261Q c15261q = new C15261Q(new float[0], 0);
        f30198d = c15261q;
        c15261q.f30239a = false;
    }

    public C15261Q() {
        this.f30199b = new float[10];
        this.f30200c = 0;
    }

    /* renamed from: a */
    public final void m76948a(float f) {
        m76887c();
        int i = this.f30200c;
        float[] fArr = this.f30199b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f30199b = fArr2;
        }
        float[] fArr3 = this.f30199b;
        int i2 = this.f30200c;
        this.f30200c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m76887c();
        if (i >= 0 && i <= (i2 = this.f30200c)) {
            float[] fArr = this.f30199b;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f30199b, i, fArr2, i + 1, this.f30200c - i);
                this.f30199b = fArr2;
            }
            this.f30199b[i] = floatValue;
            this.f30200c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30200c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m76887c();
        Charset charset = AbstractC15319m0.f30280a;
        collection.getClass();
        if (!(collection instanceof C15261Q)) {
            return super.addAll(collection);
        }
        C15261Q c15261q = (C15261Q) collection;
        int i = c15261q.f30200c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30200c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f30199b;
            if (i3 > fArr.length) {
                this.f30199b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c15261q.f30199b, 0, this.f30199b, this.f30200c, c15261q.f30200c);
            this.f30200c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15316l0
    /* renamed from: c */
    public final C15261Q mo76793b(int i) {
        if (i >= this.f30200c) {
            return new C15261Q(Arrays.copyOf(this.f30199b, i), this.f30200c);
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
        if (!(obj instanceof C15261Q)) {
            return super.equals(obj);
        }
        C15261Q c15261q = (C15261Q) obj;
        if (this.f30200c != c15261q.f30200c) {
            return false;
        }
        float[] fArr = c15261q.f30199b;
        for (int i = 0; i < this.f30200c; i++) {
            if (Float.floatToIntBits(this.f30199b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.f30200c) {
            return Float.valueOf(this.f30199b[i]);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30200c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f30200c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f30199b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f30200c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f30199b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m76887c();
        if (i >= 0 && i < (i2 = this.f30200c)) {
            float[] fArr = this.f30199b;
            float f = fArr[i];
            if (i < i2 - 1) {
                System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
            }
            this.f30200c--;
            ((AbstractList) this).modCount++;
            return Float.valueOf(f);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30200c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m76887c();
        if (i2 >= i) {
            float[] fArr = this.f30199b;
            System.arraycopy(fArr, i2, fArr, i, this.f30200c - i2);
            this.f30200c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m76887c();
        if (i >= 0 && i < this.f30200c) {
            float[] fArr = this.f30199b;
            float f = fArr[i];
            fArr[i] = floatValue;
            return Float.valueOf(f);
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30200c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30200c;
    }

    public C15261Q(float[] fArr, int i) {
        this.f30199b = fArr;
        this.f30200c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m76948a(((Float) obj).floatValue());
        return true;
    }
}

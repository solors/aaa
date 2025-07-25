package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC14857l;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.R0 */
/* loaded from: classes4.dex */
public final class C15264R0 extends AbstractC15288c implements RandomAccess {

    /* renamed from: d */
    public static final C15264R0 f30204d;

    /* renamed from: b */
    public Object[] f30205b;

    /* renamed from: c */
    public int f30206c;

    static {
        C15264R0 c15264r0 = new C15264R0(new Object[0], 0);
        f30204d = c15264r0;
        c15264r0.f30239a = false;
    }

    public C15264R0(Object[] objArr, int i) {
        this.f30205b = objArr;
        this.f30206c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m76887c();
        int i = this.f30206c;
        Object[] objArr = this.f30205b;
        if (i == objArr.length) {
            this.f30205b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f30205b;
        int i2 = this.f30206c;
        this.f30206c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15316l0
    /* renamed from: b */
    public final InterfaceC15316l0 mo76793b(int i) {
        if (i >= this.f30206c) {
            return new C15264R0(Arrays.copyOf(this.f30205b, i), this.f30206c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.f30206c) {
            return this.f30205b[i];
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30206c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m76887c();
        if (i >= 0 && i < (i2 = this.f30206c)) {
            Object[] objArr = this.f30205b;
            Object obj = objArr[i];
            if (i < i2 - 1) {
                System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
            }
            this.f30206c--;
            ((AbstractList) this).modCount++;
            return obj;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30206c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m76887c();
        if (i >= 0 && i < this.f30206c) {
            Object[] objArr = this.f30205b;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            ((AbstractList) this).modCount++;
            return obj2;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30206c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30206c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m76887c();
        if (i >= 0 && i <= (i2 = this.f30206c)) {
            Object[] objArr = this.f30205b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f30205b, i, objArr2, i + 1, this.f30206c - i);
                this.f30205b = objArr2;
            }
            this.f30205b[i] = obj;
            this.f30206c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m77492a = AbstractC14857l.m77492a("Index:", i, ", Size:");
        m77492a.append(this.f30206c);
        throw new IndexOutOfBoundsException(m77492a.toString());
    }
}

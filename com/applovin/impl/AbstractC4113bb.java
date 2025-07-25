package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.applovin.impl.bb */
/* loaded from: classes2.dex */
public abstract class AbstractC4113bb extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f4983a = new Object[0];

    /* renamed from: com.applovin.impl.bb$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4115b {
        AbstractC4115b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static int m100479a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo96654a(Object[] objArr, int i);

    /* renamed from: a */
    public AbstractC4247db mo96955a() {
        if (isEmpty()) {
            return AbstractC4247db.m99829h();
        }
        return AbstractC4247db.m99836a(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Object[] mo96653b() {
        return null;
    }

    /* renamed from: c */
    int mo96652c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo96651d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo96650e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract AbstractC5139pp iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f4983a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] mo96653b = mo96653b();
            if (mo96653b != null) {
                return AbstractC4957mh.m97099a(mo96653b, mo96651d(), mo96652c(), objArr);
            }
            objArr = AbstractC4393fg.m99173b(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo96654a(objArr, 0);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.bb$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4114a extends AbstractC4115b {

        /* renamed from: a */
        Object[] f4984a;

        /* renamed from: b */
        int f4985b;

        /* renamed from: c */
        boolean f4986c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC4114a(int i) {
            AbstractC5103p3.m96598a(i, "initialCapacity");
            this.f4984a = new Object[i];
            this.f4985b = 0;
        }

        /* renamed from: a */
        public AbstractC4114a m100480a(Object obj) {
            Preconditions.checkNotNull(obj);
            m100481a(this.f4985b + 1);
            Object[] objArr = this.f4984a;
            int i = this.f4985b;
            this.f4985b = i + 1;
            objArr[i] = obj;
            return this;
        }

        /* renamed from: a */
        private void m100481a(int i) {
            Object[] objArr = this.f4984a;
            if (objArr.length < i) {
                this.f4984a = Arrays.copyOf(objArr, AbstractC4115b.m100479a(objArr.length, i));
                this.f4986c = false;
            } else if (this.f4986c) {
                this.f4984a = (Object[]) objArr.clone();
                this.f4986c = false;
            }
        }
    }
}

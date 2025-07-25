package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    /* renamed from: d */
    transient ObjectCountHashMap<E> f39761d;

    /* renamed from: f */
    transient long f39762f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: b */
        int f39765b;

        /* renamed from: c */
        int f39766c = -1;

        /* renamed from: d */
        int f39767d;

        Itr() {
            AbstractMapBasedMultiset.this = r2;
            this.f39765b = r2.f39761d.mo68872d();
            this.f39767d = r2.f39761d.f40561d;
        }

        /* renamed from: a */
        private void m69763a() {
            if (AbstractMapBasedMultiset.this.f39761d.f40561d == this.f39767d) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @ParametricNullness
        /* renamed from: b */
        abstract T mo69762b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            m69763a();
            if (this.f39765b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (hasNext()) {
                T mo69762b = mo69762b(this.f39765b);
                int i = this.f39765b;
                this.f39766c = i;
                this.f39765b = AbstractMapBasedMultiset.this.f39761d.mo68868q(i);
                return mo69762b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            AbstractMapBasedMultiset abstractMapBasedMultiset;
            m69763a();
            if (this.f39766c != -1) {
                z = true;
            } else {
                z = false;
            }
            CollectPreconditions.m69724e(z);
            AbstractMapBasedMultiset.this.f39762f -= abstractMapBasedMultiset.f39761d.m68884t(this.f39766c);
            this.f39765b = AbstractMapBasedMultiset.this.f39761d.mo68867r(this.f39765b, this.f39766c);
            this.f39766c = -1;
            this.f39767d = AbstractMapBasedMultiset.this.f39761d.f40561d;
        }
    }

    public AbstractMapBasedMultiset(int i) {
        this.f39761d = mo69193h(i);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int m68793h = Serialization.m68793h(objectInputStream);
        this.f39761d = mo69193h(3);
        Serialization.m68794g(this, objectInputStream, m68793h);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.m68790k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@ParametricNullness E e, int i) {
        boolean z;
        if (i == 0) {
            return count(e);
        }
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "occurrences cannot be negative: %s", i);
        int m68888k = this.f39761d.m68888k(e);
        if (m68888k == -1) {
            this.f39761d.put(e, i);
            this.f39762f += i;
            return 0;
        }
        int m68890i = this.f39761d.m68890i(m68888k);
        long j = i;
        long j2 = m68890i + j;
        if (j2 > 2147483647L) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "too many occurrences: %s", j2);
        this.f39761d.m68881x(m68888k, (int) j2);
        this.f39762f += j;
        return m68890i;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f39761d.clear();
        this.f39762f = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(Object obj) {
        return this.f39761d.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: d */
    final int mo68665d() {
        return this.f39761d.m68880y();
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: e */
    final Iterator<E> mo68664e() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            {
                AbstractMapBasedMultiset.this = this;
            }

            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            @ParametricNullness
            /* renamed from: b */
            E mo69762b(int i) {
                return AbstractMapBasedMultiset.this.f39761d.m68892g(i);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: f */
    final Iterator<Multiset.Entry<E>> mo68663f() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            {
                AbstractMapBasedMultiset.this = this;
            }

            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            /* renamed from: c */
            public Multiset.Entry<E> mo69762b(int i) {
                return AbstractMapBasedMultiset.this.f39761d.m68894e(i);
            }
        };
    }

    /* renamed from: g */
    public void m69765g(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int mo68872d = this.f39761d.mo68872d();
        while (mo68872d >= 0) {
            multiset.add((E) this.f39761d.m68892g(mo68872d), this.f39761d.m68890i(mo68872d));
            mo68872d = this.f39761d.mo68868q(mo68872d);
        }
    }

    /* renamed from: h */
    abstract ObjectCountHashMap<E> mo69193h(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.m68924h(this);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(Object obj, int i) {
        boolean z;
        if (i == 0) {
            return count(obj);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "occurrences cannot be negative: %s", i);
        int m68888k = this.f39761d.m68888k(obj);
        if (m68888k == -1) {
            return 0;
        }
        int m68890i = this.f39761d.m68890i(m68888k);
        if (m68890i > i) {
            this.f39761d.m68881x(m68888k, m68890i - i);
        } else {
            this.f39761d.m68884t(m68888k);
            i = m68890i;
        }
        this.f39762f -= i;
        return m68890i;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@ParametricNullness E e, int i) {
        CollectPreconditions.m69727b(i, "count");
        ObjectCountHashMap<E> objectCountHashMap = this.f39761d;
        int remove = i == 0 ? objectCountHashMap.remove(e) : objectCountHashMap.put(e, i);
        this.f39762f += i - remove;
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.f39762f);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E e, int i, int i2) {
        CollectPreconditions.m69727b(i, "oldCount");
        CollectPreconditions.m69727b(i2, "newCount");
        int m68888k = this.f39761d.m68888k(e);
        if (m68888k == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.f39761d.put(e, i2);
                this.f39762f += i2;
            }
            return true;
        } else if (this.f39761d.m68890i(m68888k) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.f39761d.m68884t(m68888k);
                this.f39762f -= i;
            } else {
                this.f39761d.m68881x(m68888k, i2);
                this.f39762f += i2 - i;
            }
            return true;
        }
    }
}

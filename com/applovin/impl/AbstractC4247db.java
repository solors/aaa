package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.AbstractC4113bb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.applovin.impl.db */
/* loaded from: classes2.dex */
public abstract class AbstractC4247db extends AbstractC4113bb implements List, RandomAccess {

    /* renamed from: b */
    private static final AbstractC5211qp f5604b = new C4249b(C4958mi.f8432f, 0);

    /* renamed from: com.applovin.impl.db$a */
    /* loaded from: classes2.dex */
    public static final class C4248a extends AbstractC4113bb.AbstractC4114a {
        public C4248a() {
            this(4);
        }

        /* renamed from: a */
        public AbstractC4247db m99828a() {
            this.f4986c = true;
            return AbstractC4247db.m99833b(this.f4984a, this.f4985b);
        }

        /* renamed from: b */
        public C4248a m99827b(Object obj) {
            super.m100480a(obj);
            return this;
        }

        C4248a(int i) {
            super(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.db$b */
    /* loaded from: classes2.dex */
    public static class C4249b extends AbstractC4154c {

        /* renamed from: c */
        private final AbstractC4247db f5605c;

        C4249b(AbstractC4247db abstractC4247db, int i) {
            super(abstractC4247db.size(), i);
            this.f5605c = abstractC4247db;
        }

        @Override // com.applovin.impl.AbstractC4154c
        /* renamed from: a */
        protected Object mo93585a(int i) {
            return this.f5605c.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.db$c */
    /* loaded from: classes2.dex */
    public class C4250c extends AbstractC4247db {

        /* renamed from: c */
        final transient int f5606c;

        /* renamed from: d */
        final transient int f5607d;

        C4250c(int i, int i2) {
            this.f5606c = i;
            this.f5607d = i2;
        }

        @Override // com.applovin.impl.AbstractC4247db, java.util.List
        /* renamed from: a */
        public AbstractC4247db subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.f5607d);
            AbstractC4247db abstractC4247db = AbstractC4247db.this;
            int i3 = this.f5606c;
            return abstractC4247db.subList(i + i3, i2 + i3);
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: b */
        Object[] mo96653b() {
            return AbstractC4247db.this.mo96653b();
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: c */
        int mo96652c() {
            return AbstractC4247db.this.mo96651d() + this.f5606c + this.f5607d;
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: d */
        int mo96651d() {
            return AbstractC4247db.this.mo96651d() + this.f5606c;
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: e */
        boolean mo96650e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.f5607d);
            return AbstractC4247db.this.get(i + this.f5606c);
        }

        @Override // com.applovin.impl.AbstractC4247db, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.impl.AbstractC4247db, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f5607d;
        }

        @Override // com.applovin.impl.AbstractC4247db, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC4247db m99833b(Object[] objArr, int i) {
        if (i == 0) {
            return m99829h();
        }
        return new C4958mi(objArr, i);
    }

    /* renamed from: c */
    public static AbstractC4247db m99832c(Object[] objArr) {
        if (objArr.length == 0) {
            return m99829h();
        }
        return m99834b((Object[]) objArr.clone());
    }

    /* renamed from: f */
    public static C4248a m99831f() {
        return new C4248a();
    }

    /* renamed from: h */
    public static AbstractC4247db m99829h() {
        return C4958mi.f8432f;
    }

    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: a */
    public final AbstractC4247db mo96955a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.AbstractC4113bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return AbstractC4519hc.m98738a(this, obj);
    }

    @Override // java.util.List
    /* renamed from: g */
    public AbstractC5211qp listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC4519hc.m98737b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public AbstractC5139pp iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC4519hc.m98735d(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC4247db m99836a(Object[] objArr) {
        return m99833b(objArr, objArr.length);
    }

    /* renamed from: b */
    private static AbstractC4247db m99834b(Object... objArr) {
        return m99836a(AbstractC4393fg.m99175a(objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: a */
    public int mo96654a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: b */
    AbstractC4247db m99835b(int i, int i2) {
        return new C4250c(i, i2 - i);
    }

    /* renamed from: a */
    public static AbstractC4247db m99838a(Collection collection) {
        if (collection instanceof AbstractC4113bb) {
            AbstractC4247db mo96955a = ((AbstractC4113bb) collection).mo96955a();
            return mo96955a.mo96650e() ? m99836a(mo96955a.toArray()) : mo96955a;
        }
        return m99834b(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a */
    public AbstractC5211qp listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return f5604b;
        }
        return new C4249b(this, i);
    }

    /* renamed from: a */
    public static AbstractC4247db m99842a(Object obj) {
        return m99834b(obj);
    }

    /* renamed from: a */
    public static AbstractC4247db m99841a(Object obj, Object obj2) {
        return m99834b(obj, obj2);
    }

    /* renamed from: a */
    public static AbstractC4247db m99840a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m99834b(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: a */
    public static AbstractC4247db m99839a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m99834b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* renamed from: a */
    public static AbstractC4247db m99837a(Comparator comparator, Iterable iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] m93933c = AbstractC5687vb.m93933c(iterable);
        AbstractC4393fg.m99175a(m93933c);
        Arrays.sort(m93933c, comparator);
        return m99836a(m93933c);
    }

    @Override // java.util.List
    /* renamed from: a */
    public AbstractC4247db subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m99829h();
        }
        return m99835b(i, i2);
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {

    /* renamed from: i */
    static final RegularImmutableMultiset<Object> f40616i = new RegularImmutableMultiset<>(ObjectCountHashMap.m68897a());

    /* renamed from: f */
    final transient ObjectCountHashMap<E> f40617f;

    /* renamed from: g */
    private final transient int f40618g;
    @LazyInit

    /* renamed from: h */
    private transient ImmutableSet<E> f40619h;

    /* loaded from: classes4.dex */
    public final class ElementSet extends IndexedImmutableSet<E> {
        private ElementSet() {
            RegularImmutableMultiset.this = r1;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        E get(int i) {
            return RegularImmutableMultiset.this.f40617f.m68892g(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.f40617f.m68880y();
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static class SerializedForm implements Serializable {

        /* renamed from: b */
        final Object[] f40621b;

        /* renamed from: c */
        final int[] f40622c;

        SerializedForm(Multiset<? extends Object> multiset) {
            int size = multiset.entrySet().size();
            this.f40621b = new Object[size];
            this.f40622c = new int[size];
            int i = 0;
            for (Multiset.Entry<? extends Object> entry : multiset.entrySet()) {
                this.f40621b[i] = entry.getElement();
                this.f40622c[i] = entry.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            ImmutableMultiset.Builder builder = new ImmutableMultiset.Builder(this.f40621b.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.f40621b;
                if (i < objArr.length) {
                    builder.addCopies(objArr[i], this.f40622c[i]);
                    i++;
                } else {
                    return builder.build();
                }
            }
        }
    }

    public RegularImmutableMultiset(ObjectCountHashMap<E> objectCountHashMap) {
        this.f40617f = objectCountHashMap;
        long j = 0;
        for (int i = 0; i < objectCountHashMap.m68880y(); i++) {
            j += objectCountHashMap.m68890i(i);
        }
        this.f40618g = Ints.saturatedCast(j);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return this.f40617f.get(obj);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* renamed from: i */
    Multiset.Entry<E> mo68822i(int i) {
        return this.f40617f.m68894e(i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.f40618g;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f40619h;
        if (immutableSet == null) {
            ElementSet elementSet = new ElementSet();
            this.f40619h = elementSet;
            return elementSet;
        }
        return immutableSet;
    }
}

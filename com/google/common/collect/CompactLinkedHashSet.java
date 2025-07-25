package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class CompactLinkedHashSet<E> extends CompactHashSet<E> {

    /* renamed from: h */
    private transient int[] f39872h;

    /* renamed from: i */
    private transient int[] f39873i;

    /* renamed from: j */
    private transient int f39874j;

    /* renamed from: k */
    private transient int f39875k;

    CompactLinkedHashSet() {
    }

    /* renamed from: A */
    private int m69616A(int i) {
        return m69615B()[i] - 1;
    }

    /* renamed from: B */
    private int[] m69615B() {
        int[] iArr = this.f39872h;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: C */
    private int[] m69614C() {
        int[] iArr = this.f39873i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: D */
    private void m69613D(int i, int i2) {
        m69615B()[i] = i2 + 1;
    }

    /* renamed from: E */
    private void m69612E(int i, int i2) {
        if (i == -2) {
            this.f39874j = i2;
        } else {
            m69611F(i, i2);
        }
        if (i2 == -2) {
            this.f39875k = i;
        } else {
            m69613D(i2, i);
        }
    }

    /* renamed from: F */
    private void m69611F(int i, int i2) {
        m69614C()[i] = i2 + 1;
    }

    public static <E> CompactLinkedHashSet<E> create() {
        return new CompactLinkedHashSet<>();
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i) {
        return new CompactLinkedHashSet<>(i);
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: c */
    int mo69610c(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m69655q()) {
            return;
        }
        this.f39874j = -2;
        this.f39875k = -2;
        int[] iArr = this.f39872h;
        if (iArr != null && this.f39873i != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f39873i, 0, size(), 0);
        }
        super.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: d */
    public int mo69609d() {
        int mo69609d = super.mo69609d();
        this.f39872h = new int[mo69609d];
        this.f39873i = new int[mo69609d];
        return mo69609d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashSet
    @CanIgnoreReturnValue
    /* renamed from: e */
    public Set<E> mo69608e() {
        Set<E> mo69608e = super.mo69608e();
        this.f39872h = null;
        this.f39873i = null;
        return mo69608e;
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: j */
    int mo69607j() {
        return this.f39874j;
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: k */
    int mo69606k(int i) {
        return m69614C()[i] - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: n */
    public void mo69605n(int i) {
        super.mo69605n(i);
        this.f39874j = -2;
        this.f39875k = -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: o */
    public void mo69604o(int i, @ParametricNullness E e, int i2, int i3) {
        super.mo69604o(i, e, i2, i3);
        m69612E(this.f39875k, i);
        m69612E(i, -2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: p */
    public void mo69603p(int i, int i2) {
        int size = size() - 1;
        super.mo69603p(i, i2);
        m69612E(m69616A(i), mo69606k(i));
        if (i < size) {
            m69612E(m69616A(size), i);
            m69612E(i, mo69606k(size));
        }
        m69615B()[size] = 0;
        m69614C()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return ObjectArrays.m68900e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: u */
    public void mo69602u(int i) {
        super.mo69602u(i);
        this.f39872h = Arrays.copyOf(m69615B(), i);
        this.f39873i = Arrays.copyOf(m69614C(), i);
    }

    CompactLinkedHashSet(int i) {
        super(i);
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
        CompactLinkedHashSet<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ObjectArrays.m68899f(this, tArr);
    }

    @SafeVarargs
    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
        CompactLinkedHashSet<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }
}

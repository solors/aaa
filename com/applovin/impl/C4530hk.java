package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.hk */
/* loaded from: classes2.dex */
public final class C4530hk extends AbstractC4518hb {

    /* renamed from: c */
    final transient Object f6659c;

    /* renamed from: d */
    private transient int f6660d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4530hk(Object obj) {
        this.f6659c = Preconditions.checkNotNull(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: a */
    public int mo96654a(Object[] objArr, int i) {
        objArr[i] = this.f6659c;
        return i + 1;
    }

    @Override // com.applovin.impl.AbstractC4113bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f6659c.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: e */
    public boolean mo96650e() {
        return false;
    }

    @Override // com.applovin.impl.AbstractC4518hb
    /* renamed from: f */
    AbstractC4247db mo96649f() {
        return AbstractC4247db.m99842a(this.f6659c);
    }

    @Override // com.applovin.impl.AbstractC4518hb
    /* renamed from: g */
    boolean mo96648g() {
        if (this.f6660d != 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.AbstractC4518hb, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f6660d;
        if (i == 0) {
            int hashCode = this.f6659c.hashCode();
            this.f6660d = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public AbstractC5139pp iterator() {
        return AbstractC5767wb.m93596a(this.f6659c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f6659c.toString() + ']';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4530hk(Object obj, int i) {
        this.f6659c = obj;
        this.f6660d = i;
    }
}

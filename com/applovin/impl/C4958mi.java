package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.mi */
/* loaded from: classes2.dex */
public class C4958mi extends AbstractC4247db {

    /* renamed from: f */
    static final AbstractC4247db f8432f = new C4958mi(new Object[0], 0);

    /* renamed from: c */
    final transient Object[] f8433c;

    /* renamed from: d */
    private final transient int f8434d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4958mi(Object[] objArr, int i) {
        this.f8433c = objArr;
        this.f8434d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4247db, com.applovin.impl.AbstractC4113bb
    /* renamed from: a */
    public int mo96654a(Object[] objArr, int i) {
        System.arraycopy(this.f8433c, 0, objArr, i, this.f8434d);
        return i + this.f8434d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: b */
    public Object[] mo96653b() {
        return this.f8433c;
    }

    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: c */
    int mo96652c() {
        return this.f8434d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: d */
    public int mo96651d() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: e */
    public boolean mo96650e() {
        return false;
    }

    @Override // java.util.List
    public Object get(int i) {
        Preconditions.checkElementIndex(i, this.f8434d);
        return this.f8433c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8434d;
    }
}

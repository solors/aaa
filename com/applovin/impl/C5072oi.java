package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.oi */
/* loaded from: classes2.dex */
public final class C5072oi extends AbstractC4518hb {

    /* renamed from: i */
    static final C5072oi f8888i = new C5072oi(new Object[0], 0, null, 0, 0);

    /* renamed from: c */
    final transient Object[] f8889c;

    /* renamed from: d */
    final transient Object[] f8890d;

    /* renamed from: f */
    private final transient int f8891f;

    /* renamed from: g */
    private final transient int f8892g;

    /* renamed from: h */
    private final transient int f8893h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5072oi(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f8889c = objArr;
        this.f8890d = objArr2;
        this.f8891f = i2;
        this.f8892g = i;
        this.f8893h = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: a */
    public int mo96654a(Object[] objArr, int i) {
        System.arraycopy(this.f8889c, 0, objArr, i, this.f8893h);
        return i + this.f8893h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: b */
    public Object[] mo96653b() {
        return this.f8889c;
    }

    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: c */
    int mo96652c() {
        return this.f8893h;
    }

    @Override // com.applovin.impl.AbstractC4113bb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f8890d;
        if (obj == null || objArr == null) {
            return false;
        }
        int m98280a = AbstractC4643ja.m98280a(obj);
        while (true) {
            int i = m98280a & this.f8891f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m98280a = i + 1;
        }
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

    @Override // com.applovin.impl.AbstractC4518hb
    /* renamed from: f */
    AbstractC4247db mo96649f() {
        return AbstractC4247db.m99833b(this.f8889c, this.f8893h);
    }

    @Override // com.applovin.impl.AbstractC4518hb
    /* renamed from: g */
    boolean mo96648g() {
        return true;
    }

    @Override // com.applovin.impl.AbstractC4518hb, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f8892g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public AbstractC5139pp iterator() {
        return mo96955a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f8893h;
    }
}

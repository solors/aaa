package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.applovin.impl.hb */
/* loaded from: classes2.dex */
public abstract class AbstractC4518hb extends AbstractC4113bb implements Set {

    /* renamed from: b */
    private transient AbstractC4247db f6616b;

    /* renamed from: a */
    private static boolean m98748a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: h */
    public static AbstractC4518hb m98741h() {
        return C5072oi.f8888i;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4518hb) && mo96648g() && ((AbstractC4518hb) obj).mo96648g() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC5270rj.m95834a(this, obj);
    }

    /* renamed from: f */
    AbstractC4247db mo96649f() {
        return AbstractC4247db.m99836a(toArray());
    }

    /* renamed from: g */
    boolean mo96648g() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC5270rj.m95835a(this);
    }

    @Override // com.applovin.impl.AbstractC4113bb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract AbstractC5139pp iterator();

    @Override // com.applovin.impl.AbstractC4113bb
    /* renamed from: a */
    public AbstractC4247db mo96955a() {
        AbstractC4247db abstractC4247db = this.f6616b;
        if (abstractC4247db == null) {
            AbstractC4247db mo96649f = mo96649f();
            this.f6616b = mo96649f;
            return mo96649f;
        }
        return abstractC4247db;
    }

    /* renamed from: a */
    public static int m98749a(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        Preconditions.checkArgument(max < 1073741824, "collection too large");
        return 1073741824;
    }

    /* renamed from: a */
    private static AbstractC4518hb m98747a(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m98749a = m98749a(i);
                Object[] objArr2 = new Object[m98749a];
                int i2 = m98749a - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object m99176a = AbstractC4393fg.m99176a(objArr[i5], i5);
                    int hashCode = m99176a.hashCode();
                    int m98282a = AbstractC4643ja.m98282a(hashCode);
                    while (true) {
                        int i6 = m98282a & i2;
                        Object obj = objArr2[i6];
                        if (obj == null) {
                            objArr[i4] = m99176a;
                            objArr2[i6] = m99176a;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj.equals(m99176a)) {
                            break;
                        } else {
                            m98282a++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    return new C4530hk(objArr[0], i3);
                }
                if (m98749a(i4) < m98749a / 2) {
                    return m98747a(i4, objArr);
                }
                if (m98748a(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new C5072oi(objArr, i3, objArr2, i2, i4);
            }
            return m98746a(objArr[0]);
        }
        return m98741h();
    }

    /* renamed from: a */
    public static AbstractC4518hb m98743a(Collection collection) {
        if ((collection instanceof AbstractC4518hb) && !(collection instanceof SortedSet)) {
            AbstractC4518hb abstractC4518hb = (AbstractC4518hb) collection;
            if (!abstractC4518hb.mo96650e()) {
                return abstractC4518hb;
            }
        }
        Object[] array = collection.toArray();
        return m98747a(array.length, array);
    }

    /* renamed from: a */
    public static AbstractC4518hb m98742a(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return m98747a(objArr.length, (Object[]) objArr.clone());
            }
            return m98746a(objArr[0]);
        }
        return m98741h();
    }

    /* renamed from: a */
    public static AbstractC4518hb m98745a(Object obj, Object obj2) {
        return m98747a(2, obj, obj2);
    }

    /* renamed from: a */
    public static AbstractC4518hb m98744a(Object obj, Object obj2, Object obj3) {
        return m98747a(3, obj, obj2, obj3);
    }

    /* renamed from: a */
    public static AbstractC4518hb m98746a(Object obj) {
        return new C4530hk(obj);
    }
}

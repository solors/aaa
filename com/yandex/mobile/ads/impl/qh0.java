package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes8.dex */
public abstract class qh0<E> extends mh0<E> implements Set<E> {
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient oh0<E> f84366c;

    /* renamed from: com.yandex.mobile.ads.impl.qh0$a */
    /* loaded from: classes8.dex */
    private static class C31212a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final Object[] f84367b;

        C31212a(Object[] objArr) {
            this.f84367b = objArr;
        }

        Object readResolve() {
            return qh0.m30357a(this.f84367b);
        }
    }

    /* renamed from: a */
    public static int m30361a(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: b */
    public oh0<E> mo30356b() {
        oh0<E> oh0Var = this.f84366c;
        if (oh0Var == null) {
            oh0<E> mo30354g = mo30354g();
            this.f84366c = mo30354g;
            return mo30354g;
        }
        return oh0Var;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof qh0) && (this instanceof ek1)) {
            qh0 qh0Var = (qh0) obj;
            qh0Var.getClass();
            if ((qh0Var instanceof ek1) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return gt1.m33774a(this, obj);
    }

    /* renamed from: g */
    oh0<E> mo30354g() {
        Object[] array = toArray();
        int i = oh0.f83515d;
        return oh0.m31012b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return gt1.m33776a(this);
    }

    @Override // com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.yandex.mobile.ads.impl.mh0
    Object writeReplace() {
        return new C31212a(toArray());
    }

    /* renamed from: b */
    private static <E> qh0<E> m30355b(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m30361a = m30361a(i);
                Object[] objArr2 = new Object[m30361a];
                int i2 = m30361a - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int m29647a = sc0.m29647a(hashCode);
                        while (true) {
                            int i6 = m29647a & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                m29647a++;
                            }
                        }
                    } else {
                        throw new NullPointerException(C31736wd.m27978a("at index ", i5));
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new ou1(obj3);
                } else if (m30361a(i4) < m30361a / 2) {
                    return m30355b(i4, objArr);
                } else {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new ek1(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new ou1(obj4);
        }
        return ek1.f78685j;
    }

    /* renamed from: a */
    public static qh0 m30358a(Set set) {
        if ((set instanceof qh0) && !(set instanceof SortedSet)) {
            qh0 qh0Var = (qh0) set;
            if (!qh0Var.mo30881f()) {
                return qh0Var;
            }
        }
        Object[] array = set.toArray();
        return m30355b(array.length, array);
    }

    /* renamed from: a */
    public static <E> qh0<E> m30357a(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return m30355b(eArr.length, (Object[]) eArr.clone());
            }
            return new ou1(eArr[0]);
        }
        return ek1.f78685j;
    }

    /* renamed from: a */
    public static qh0 m30360a(String str, String str2) {
        return m30355b(2, str, str2);
    }

    /* renamed from: a */
    public static qh0 m30359a(String str, String str2, String str3) {
        return m30355b(3, str, str2, str3);
    }
}

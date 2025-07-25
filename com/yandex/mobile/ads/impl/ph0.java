package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.ironsource.C20517nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

@DoNotMock("Use ImmutableMap.of or another implementation")
/* loaded from: classes8.dex */
public abstract class ph0<K, V> implements Map<K, V>, Serializable {
    @RetainedWith
    @LazyInit

    /* renamed from: b */
    private transient qh0<Map.Entry<K, V>> f83962b;
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient qh0<K> f83963c;
    @RetainedWith
    @LazyInit

    /* renamed from: d */
    private transient mh0<V> f83964d;

    @DoNotMock
    /* renamed from: com.yandex.mobile.ads.impl.ph0$a */
    /* loaded from: classes8.dex */
    public static class C31134a<K, V> {

        /* renamed from: a */
        Object[] f83965a;

        /* renamed from: b */
        int f83966b;

        public C31134a() {
            this(4);
        }

        C31134a(int i) {
            this.f83965a = new Object[i * 2];
            this.f83966b = 0;
        }

        /* renamed from: a */
        public final ph0<K, V> m30661a() {
            return dk1.m34895a(this.f83966b, this.f83965a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m30660a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f83965a;
            if (i2 > objArr.length) {
                int length = objArr.length;
                if (i2 >= 0) {
                    int i3 = length + (length >> 1) + 1;
                    if (i3 < i2) {
                        i3 = Integer.highestOneBit(i2 - 1) << 1;
                    }
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    this.f83965a = Arrays.copyOf(objArr, i3);
                    return;
                }
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final C31134a<K, V> m30658a(K k, V v) {
            m30660a(this.f83966b + 1);
            if (k == null) {
                throw new NullPointerException("null key in entry: null=" + v);
            } else if (v != null) {
                Object[] objArr = this.f83965a;
                int i = this.f83966b;
                int i2 = i * 2;
                objArr[i2] = k;
                objArr[i2 + 1] = v;
                this.f83966b = i + 1;
                return this;
            } else {
                throw new NullPointerException("null value in entry: " + k + "=null");
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ph0$b */
    /* loaded from: classes8.dex */
    static class C31135b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final Object[] f83967b;

        /* renamed from: c */
        private final Object[] f83968c;

        C31135b(ph0<K, V> ph0Var) {
            Object[] objArr = new Object[ph0Var.size()];
            Object[] objArr2 = new Object[ph0Var.size()];
            d32<Map.Entry<K, V>> it = ph0Var.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.f83967b = objArr;
            this.f83968c = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object readResolve() {
            Object[] objArr = this.f83967b;
            if (!(objArr instanceof qh0)) {
                Object[] objArr2 = this.f83968c;
                C31134a c31134a = new C31134a(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    c31134a.m30658a((C31134a) objArr[i], objArr2[i]);
                }
                return dk1.m34895a(c31134a.f83966b, c31134a.f83965a);
            }
            qh0 qh0Var = (qh0) objArr;
            C31134a c31134a2 = new C31134a(qh0Var.size());
            Iterator it = qh0Var.iterator();
            d32 it2 = ((mh0) this.f83968c).iterator();
            while (it.hasNext()) {
                c31134a2.m30658a((C31134a) it.next(), (Object) it2.next());
            }
            return dk1.m34895a(c31134a2.f83966b, c31134a2.f83965a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static ph0 m30669a(HashMap hashMap) {
        if ((hashMap instanceof ph0) && !(hashMap instanceof SortedMap)) {
            ph0 ph0Var = (ph0) hashMap;
            ph0Var.getClass();
            return ph0Var;
        }
        Set<Map.Entry<K, V>> entrySet = hashMap.entrySet();
        boolean z = entrySet instanceof Collection;
        C31134a c31134a = new C31134a(z ? entrySet.size() : 4);
        if (z) {
            c31134a.m30660a(entrySet.size());
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c31134a.m30658a((C31134a) entry.getKey(), entry.getValue());
        }
        return dk1.m34895a(c31134a.f83966b, c31134a.f83965a);
    }

    /* renamed from: g */
    public static <K, V> ph0<K, V> m30663g() {
        return (ph0<K, V>) dk1.f78176h;
    }

    /* renamed from: b */
    abstract qh0<Map.Entry<K, V>> mo30668b();

    /* renamed from: c */
    abstract qh0<K> mo30667c();

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    abstract mh0<V> mo30666d();

    @Override // java.util.Map
    /* renamed from: e */
    public final qh0<Map.Entry<K, V>> entrySet() {
        qh0<Map.Entry<K, V>> qh0Var = this.f83962b;
        if (qh0Var == null) {
            qh0<Map.Entry<K, V>> mo30668b = mo30668b();
            this.f83962b = mo30668b;
            return mo30668b;
        }
        return qh0Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((qh0) entrySet()).equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public final qh0<K> keySet() {
        qh0<K> qh0Var = this.f83963c;
        if (qh0Var == null) {
            qh0<K> mo30667c = mo30667c();
            this.f83963c = mo30667c;
            return mo30667c;
        }
        return qh0Var;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public final mh0<V> values() {
        mh0<V> mh0Var = this.f83964d;
        if (mh0Var == null) {
            mh0<V> mo30666d = mo30666d();
            this.f83964d = mo30666d;
            return mo30666d;
        }
        return mh0Var;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return gt1.m33776a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        C30644jp.m32828a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(C20517nb.f52173T);
            sb2.append(entry.getValue());
            z = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    Object writeReplace() {
        return new C31135b(this);
    }

    /* renamed from: a */
    public static <K, V> C31134a<K, V> m30670a() {
        return new C31134a<>(4);
    }
}

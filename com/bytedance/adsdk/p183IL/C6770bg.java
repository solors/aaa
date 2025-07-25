package com.bytedance.adsdk.p183IL;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.adsdk.IL.bg */
/* loaded from: classes3.dex */
public final class C6770bg<E> implements Collection<E>, Set<E> {

    /* renamed from: Kg */
    private static int f14474Kg;

    /* renamed from: bX */
    private static final int[] f14475bX = new int[0];
    private static final Object[] eqN = new Object[0];

    /* renamed from: iR */
    private static Object[] f14476iR;
    private static int ldr;

    /* renamed from: zx */
    private static Object[] f14477zx;

    /* renamed from: IL */
    int f14478IL;

    /* renamed from: WR */
    private int[] f14479WR;

    /* renamed from: bg */
    Object[] f14480bg;

    /* renamed from: eo */
    private AbstractC6678Lq<E, E> f14481eo;

    public C6770bg() {
        this(0);
    }

    /* renamed from: bg */
    private int m90869bg(Object obj, int i) {
        int i2 = this.f14478IL;
        if (i2 == 0) {
            return -1;
        }
        int m91209bg = C6666IL.m91209bg(this.f14479WR, i2, i);
        if (m91209bg >= 0 && !obj.equals(this.f14480bg[m91209bg])) {
            int i3 = m91209bg + 1;
            while (i3 < i2 && this.f14479WR[i3] == i) {
                if (obj.equals(this.f14480bg[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m91209bg - 1; i4 >= 0 && this.f14479WR[i4] == i; i4--) {
                if (obj.equals(this.f14480bg[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return m91209bg;
    }

    private void eqN(int i) {
        if (i == 8) {
            synchronized (C6770bg.class) {
                Object[] objArr = f14476iR;
                if (objArr != null) {
                    this.f14480bg = objArr;
                    f14476iR = (Object[]) objArr[0];
                    this.f14479WR = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f14474Kg--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C6770bg.class) {
                Object[] objArr2 = f14477zx;
                if (objArr2 != null) {
                    this.f14480bg = objArr2;
                    f14477zx = (Object[]) objArr2[0];
                    this.f14479WR = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    ldr--;
                    return;
                }
            }
        }
        this.f14479WR = new int[i];
        this.f14480bg = new Object[i];
    }

    /* renamed from: IL */
    public E m90874IL(int i) {
        return (E) this.f14480bg[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m90869bg;
        if (e == null) {
            m90869bg = m90872bg();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m90869bg = m90869bg(e, hashCode);
        }
        if (m90869bg >= 0) {
            return false;
        }
        int i2 = ~m90869bg;
        int i3 = this.f14478IL;
        int[] iArr = this.f14479WR;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f14480bg;
            eqN(i4);
            int[] iArr2 = this.f14479WR;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f14480bg, 0, objArr.length);
            }
            m90868bg(iArr, objArr, this.f14478IL);
        }
        int i5 = this.f14478IL;
        if (i2 < i5) {
            int[] iArr3 = this.f14479WR;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f14480bg;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f14478IL - i2);
        }
        this.f14479WR[i2] = i;
        this.f14480bg[i2] = e;
        this.f14478IL++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m90871bg(this.f14478IL + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    /* renamed from: bX */
    public E m90873bX(int i) {
        Object[] objArr = this.f14480bg;
        E e = (E) objArr[i];
        int i2 = this.f14478IL;
        if (i2 <= 1) {
            m90868bg(this.f14479WR, objArr, i2);
            this.f14479WR = f14475bX;
            this.f14480bg = eqN;
            this.f14478IL = 0;
        } else {
            int[] iArr = this.f14479WR;
            int i3 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                eqN(i3);
                this.f14478IL--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f14479WR, 0, i);
                    System.arraycopy(objArr, 0, this.f14480bg, 0, i);
                }
                int i4 = this.f14478IL;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, this.f14479WR, i, i4 - i);
                    System.arraycopy(objArr, i5, this.f14480bg, i, this.f14478IL - i);
                }
            } else {
                int i6 = i2 - 1;
                this.f14478IL = i6;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, iArr, i, i6 - i);
                    Object[] objArr2 = this.f14480bg;
                    System.arraycopy(objArr2, i7, objArr2, i, this.f14478IL - i);
                }
                this.f14480bg[this.f14478IL] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f14478IL;
        if (i != 0) {
            m90868bg(this.f14479WR, this.f14480bg, i);
            this.f14479WR = f14475bX;
            this.f14480bg = eqN;
            this.f14478IL = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (m90870bg(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f14478IL; i++) {
                try {
                    if (!set.contains(m90874IL(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f14479WR;
        int i = this.f14478IL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.f14478IL <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m90875IL().eqN().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int m90870bg = m90870bg(obj);
        if (m90870bg >= 0) {
            m90873bX(m90870bg);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f14478IL - 1; i >= 0; i--) {
            if (!collection.contains(this.f14480bg[i])) {
                m90873bX(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f14478IL;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f14478IL;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f14480bg, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f14478IL * 14);
        sb2.append('{');
        for (int i = 0; i < this.f14478IL; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            E m90874IL = m90874IL(i);
            if (m90874IL != this) {
                sb2.append(m90874IL);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C6770bg(int i) {
        if (i == 0) {
            this.f14479WR = f14475bX;
            this.f14480bg = eqN;
        } else {
            eqN(i);
        }
        this.f14478IL = 0;
    }

    /* renamed from: IL */
    private AbstractC6678Lq<E, E> m90875IL() {
        if (this.f14481eo == null) {
            this.f14481eo = new AbstractC6678Lq<E, E>() { // from class: com.bytedance.adsdk.IL.bg.1
                @Override // com.bytedance.adsdk.p183IL.AbstractC6678Lq
                /* renamed from: IL */
                protected Map<E, E> mo90867IL() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.p183IL.AbstractC6678Lq
                /* renamed from: bX */
                protected void mo90866bX() {
                    C6770bg.this.clear();
                }

                @Override // com.bytedance.adsdk.p183IL.AbstractC6678Lq
                /* renamed from: bg */
                protected int mo90865bg() {
                    return C6770bg.this.f14478IL;
                }

                @Override // com.bytedance.adsdk.p183IL.AbstractC6678Lq
                /* renamed from: bg */
                protected Object mo90863bg(int i, int i2) {
                    return C6770bg.this.f14480bg[i];
                }

                @Override // com.bytedance.adsdk.p183IL.AbstractC6678Lq
                /* renamed from: bg */
                protected int mo90862bg(Object obj) {
                    return C6770bg.this.m90870bg(obj);
                }

                @Override // com.bytedance.adsdk.p183IL.AbstractC6678Lq
                /* renamed from: bg */
                protected void mo90864bg(int i) {
                    C6770bg.this.m90873bX(i);
                }
            };
        }
        return this.f14481eo;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f14478IL) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f14478IL));
        }
        System.arraycopy(this.f14480bg, 0, tArr, 0, this.f14478IL);
        int length = tArr.length;
        int i = this.f14478IL;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* renamed from: bg */
    private int m90872bg() {
        int i = this.f14478IL;
        if (i == 0) {
            return -1;
        }
        int m91209bg = C6666IL.m91209bg(this.f14479WR, i, 0);
        if (m91209bg >= 0 && this.f14480bg[m91209bg] != null) {
            int i2 = m91209bg + 1;
            while (i2 < i && this.f14479WR[i2] == 0) {
                if (this.f14480bg[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m91209bg - 1; i3 >= 0 && this.f14479WR[i3] == 0; i3--) {
                if (this.f14480bg[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return m91209bg;
    }

    /* renamed from: bg */
    private static void m90868bg(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C6770bg.class) {
                if (f14474Kg < 10) {
                    objArr[0] = f14476iR;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f14476iR = objArr;
                    f14474Kg++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C6770bg.class) {
                if (ldr < 10) {
                    objArr[0] = f14477zx;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f14477zx = objArr;
                    ldr++;
                }
            }
        }
    }

    /* renamed from: bg */
    public void m90871bg(int i) {
        int[] iArr = this.f14479WR;
        if (iArr.length < i) {
            Object[] objArr = this.f14480bg;
            eqN(i);
            int i2 = this.f14478IL;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f14479WR, 0, i2);
                System.arraycopy(objArr, 0, this.f14480bg, 0, this.f14478IL);
            }
            m90868bg(iArr, objArr, this.f14478IL);
        }
    }

    /* renamed from: bg */
    public int m90870bg(Object obj) {
        return obj == null ? m90872bg() : m90869bg(obj, obj.hashCode());
    }
}

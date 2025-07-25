package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: b */
    private transient Object f39859b;

    /* renamed from: c */
    private transient int[] f39860c;
    @VisibleForTesting

    /* renamed from: d */
    transient Object[] f39861d;

    /* renamed from: f */
    private transient int f39862f;

    /* renamed from: g */
    private transient int f39863g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompactHashSet() {
        mo69605n(3);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i) {
        return new CompactHashSet<>(i);
    }

    /* renamed from: f */
    private Set<E> m69661f(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public E m69659h(int i) {
        return (E) m69654r()[i];
    }

    /* renamed from: i */
    private int m69658i(int i) {
        return m69653s()[i];
    }

    /* renamed from: l */
    private int m69657l() {
        return (1 << (this.f39862f & 31)) - 1;
    }

    /* renamed from: r */
    private Object[] m69654r() {
        Object[] objArr = this.f39861d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo69605n(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid size: ");
        sb2.append(readInt);
        throw new InvalidObjectException(sb2.toString());
    }

    /* renamed from: s */
    private int[] m69653s() {
        int[] iArr = this.f39860c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: t */
    private Object m69652t() {
        Object obj = this.f39859b;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: v */
    private void m69651v(int i) {
        int min;
        int length = m69653s().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            mo69602u(min);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: w */
    private int m69650w(int i, int i2, int i3, int i4) {
        Object m69644a = CompactHashing.m69644a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            CompactHashing.m69636i(m69644a, i3 & i5, i4 + 1);
        }
        Object m69652t = m69652t();
        int[] m69653s = m69653s();
        for (int i6 = 0; i6 <= i; i6++) {
            int m69637h = CompactHashing.m69637h(m69652t, i6);
            while (m69637h != 0) {
                int i7 = m69637h - 1;
                int i8 = m69653s[i7];
                int m69643b = CompactHashing.m69643b(i8, i) | i6;
                int i9 = m69643b & i5;
                int m69637h2 = CompactHashing.m69637h(m69644a, i9);
                CompactHashing.m69636i(m69644a, i9, m69637h);
                m69653s[i7] = CompactHashing.m69641d(m69643b, m69637h2, i5);
                m69637h = CompactHashing.m69642c(i8, i);
            }
        }
        this.f39859b = m69644a;
        m69647z(i5);
        return i5;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* renamed from: x */
    private void m69649x(int i, E e) {
        m69654r()[i] = e;
    }

    /* renamed from: y */
    private void m69648y(int i, int i2) {
        m69653s()[i] = i2;
    }

    /* renamed from: z */
    private void m69647z(int i) {
        this.f39862f = CompactHashing.m69641d(this.f39862f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e) {
        if (m69655q()) {
            mo69609d();
        }
        Set<E> m69660g = m69660g();
        if (m69660g != null) {
            return m69660g.add(e);
        }
        int[] m69653s = m69653s();
        Object[] m69654r = m69654r();
        int i = this.f39863g;
        int i2 = i + 1;
        int m69450d = Hashing.m69450d(e);
        int m69657l = m69657l();
        int i3 = m69450d & m69657l;
        int m69637h = CompactHashing.m69637h(m69652t(), i3);
        if (m69637h == 0) {
            if (i2 > m69657l) {
                m69657l = m69650w(m69657l, CompactHashing.m69640e(m69657l), m69450d, i);
            } else {
                CompactHashing.m69636i(m69652t(), i3, i2);
            }
        } else {
            int m69643b = CompactHashing.m69643b(m69450d, m69657l);
            int i4 = 0;
            while (true) {
                int i5 = m69637h - 1;
                int i6 = m69653s[i5];
                if (CompactHashing.m69643b(i6, m69657l) == m69643b && com.google.common.base.Objects.equal(e, m69654r[i5])) {
                    return false;
                }
                int m69642c = CompactHashing.m69642c(i6, m69657l);
                i4++;
                if (m69642c == 0) {
                    if (i4 >= 9) {
                        return mo69608e().add(e);
                    }
                    if (i2 > m69657l) {
                        m69657l = m69650w(m69657l, CompactHashing.m69640e(m69657l), m69450d, i);
                    } else {
                        m69653s[i5] = CompactHashing.m69641d(i6, i2, m69657l);
                    }
                } else {
                    m69637h = m69642c;
                }
            }
        }
        m69651v(i2);
        mo69604o(i, e, m69450d, m69657l);
        this.f39863g = i2;
        m69656m();
        return true;
    }

    /* renamed from: c */
    int mo69610c(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m69655q()) {
            return;
        }
        m69656m();
        Set<E> m69660g = m69660g();
        if (m69660g != null) {
            this.f39862f = Ints.constrainToRange(size(), 3, 1073741823);
            m69660g.clear();
            this.f39859b = null;
            this.f39863g = 0;
            return;
        }
        Arrays.fill(m69654r(), 0, this.f39863g, (Object) null);
        CompactHashing.m69638g(m69652t());
        Arrays.fill(m69653s(), 0, this.f39863g, 0);
        this.f39863g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (m69655q()) {
            return false;
        }
        Set<E> m69660g = m69660g();
        if (m69660g != null) {
            return m69660g.contains(obj);
        }
        int m69450d = Hashing.m69450d(obj);
        int m69657l = m69657l();
        int m69637h = CompactHashing.m69637h(m69652t(), m69450d & m69657l);
        if (m69637h == 0) {
            return false;
        }
        int m69643b = CompactHashing.m69643b(m69450d, m69657l);
        do {
            int i = m69637h - 1;
            int m69658i = m69658i(i);
            if (CompactHashing.m69643b(m69658i, m69657l) == m69643b && com.google.common.base.Objects.equal(obj, m69659h(i))) {
                return true;
            }
            m69637h = CompactHashing.m69642c(m69658i, m69657l);
        } while (m69637h != 0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: d */
    public int mo69609d() {
        Preconditions.checkState(m69655q(), "Arrays already allocated");
        int i = this.f39862f;
        int m69635j = CompactHashing.m69635j(i);
        this.f39859b = CompactHashing.m69644a(m69635j);
        m69647z(m69635j - 1);
        this.f39860c = new int[i];
        this.f39861d = new Object[i];
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    @CanIgnoreReturnValue
    /* renamed from: e */
    public Set<E> mo69608e() {
        Set<E> m69661f = m69661f(m69657l() + 1);
        int mo69607j = mo69607j();
        while (mo69607j >= 0) {
            m69661f.add(m69659h(mo69607j));
            mo69607j = mo69606k(mo69607j);
        }
        this.f39859b = m69661f;
        this.f39860c = null;
        this.f39861d = null;
        m69656m();
        return m69661f;
    }

    @VisibleForTesting
    /* renamed from: g */
    Set<E> m69660g() {
        Object obj = this.f39859b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> m69660g = m69660g();
        if (m69660g != null) {
            return m69660g.iterator();
        }
        return new Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1

            /* renamed from: b */
            int f39864b;

            /* renamed from: c */
            int f39865c;

            /* renamed from: d */
            int f39866d = -1;

            {
                this.f39864b = CompactHashSet.this.f39862f;
                this.f39865c = CompactHashSet.this.mo69607j();
            }

            /* renamed from: a */
            private void m69646a() {
                if (CompactHashSet.this.f39862f == this.f39864b) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            /* renamed from: b */
            void m69645b() {
                this.f39864b += 32;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f39865c >= 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public E next() {
                m69646a();
                if (hasNext()) {
                    int i = this.f39865c;
                    this.f39866d = i;
                    E e = (E) CompactHashSet.this.m69659h(i);
                    this.f39865c = CompactHashSet.this.mo69606k(this.f39865c);
                    return e;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                m69646a();
                if (this.f39866d >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                CollectPreconditions.m69724e(z);
                m69645b();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.m69659h(this.f39866d));
                this.f39865c = CompactHashSet.this.mo69610c(this.f39865c, this.f39866d);
                this.f39866d = -1;
            }
        };
    }

    /* renamed from: j */
    int mo69607j() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    /* renamed from: k */
    int mo69606k(int i) {
        int i2 = i + 1;
        if (i2 >= this.f39863g) {
            return -1;
        }
        return i2;
    }

    /* renamed from: m */
    void m69656m() {
        this.f39862f += 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo69605n(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected size must be >= 0");
        this.f39862f = Ints.constrainToRange(i, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo69604o(int i, @ParametricNullness E e, int i2, int i3) {
        m69648y(i, CompactHashing.m69641d(i2, 0, i3));
        m69649x(i, e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo69603p(int i, int i2) {
        Object m69652t = m69652t();
        int[] m69653s = m69653s();
        Object[] m69654r = m69654r();
        int size = size() - 1;
        if (i < size) {
            Object obj = m69654r[size];
            m69654r[i] = obj;
            m69654r[size] = null;
            m69653s[i] = m69653s[size];
            m69653s[size] = 0;
            int m69450d = Hashing.m69450d(obj) & i2;
            int m69637h = CompactHashing.m69637h(m69652t, m69450d);
            int i3 = size + 1;
            if (m69637h == i3) {
                CompactHashing.m69636i(m69652t, m69450d, i + 1);
                return;
            }
            while (true) {
                int i4 = m69637h - 1;
                int i5 = m69653s[i4];
                int m69642c = CompactHashing.m69642c(i5, i2);
                if (m69642c == i3) {
                    m69653s[i4] = CompactHashing.m69641d(i5, i + 1, i2);
                    return;
                }
                m69637h = m69642c;
            }
        } else {
            m69654r[i] = null;
            m69653s[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: q */
    public boolean m69655q() {
        if (this.f39859b == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        if (m69655q()) {
            return false;
        }
        Set<E> m69660g = m69660g();
        if (m69660g != null) {
            return m69660g.remove(obj);
        }
        int m69657l = m69657l();
        int m69639f = CompactHashing.m69639f(obj, null, m69657l, m69652t(), m69653s(), m69654r(), null);
        if (m69639f == -1) {
            return false;
        }
        mo69603p(m69639f, m69657l);
        this.f39863g--;
        m69656m();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> m69660g = m69660g();
        if (m69660g != null) {
            return m69660g.size();
        }
        return this.f39863g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (m69655q()) {
            return new Object[0];
        }
        Set<E> m69660g = m69660g();
        return m69660g != null ? m69660g.toArray() : Arrays.copyOf(m69654r(), this.f39863g);
    }

    public void trimToSize() {
        if (m69655q()) {
            return;
        }
        Set<E> m69660g = m69660g();
        if (m69660g != null) {
            Set<E> m69661f = m69661f(size());
            m69661f.addAll(m69660g);
            this.f39859b = m69661f;
            return;
        }
        int i = this.f39863g;
        if (i < m69653s().length) {
            mo69602u(i);
        }
        int m69635j = CompactHashing.m69635j(i);
        int m69657l = m69657l();
        if (m69635j < m69657l) {
            m69650w(m69657l, m69635j, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo69602u(int i) {
        this.f39860c = Arrays.copyOf(m69653s(), i);
        this.f39861d = Arrays.copyOf(m69654r(), i);
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompactHashSet(int i) {
        mo69605n(i);
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (m69655q()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> m69660g = m69660g();
        if (m69660g != null) {
            return (T[]) m69660g.toArray(tArr);
        }
        return (T[]) ObjectArrays.m68898g(m69654r(), 0, this.f39863g, tArr);
    }
}

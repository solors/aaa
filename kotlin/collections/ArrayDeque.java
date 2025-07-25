package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.collections.k */
/* loaded from: classes7.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    @NotNull

    /* renamed from: f */
    public static final C37550a f99254f = new C37550a(null);
    @NotNull

    /* renamed from: g */
    private static final Object[] f99255g = new Object[0];

    /* renamed from: b */
    private int f99256b;
    @NotNull

    /* renamed from: c */
    private Object[] f99257c = f99255g;

    /* renamed from: d */
    private int f99258d;

    /* compiled from: ArrayDeque.kt */
    @Metadata
    /* renamed from: kotlin.collections.k$a */
    /* loaded from: classes7.dex */
    public static final class C37550a {
        private C37550a() {
        }

        public /* synthetic */ C37550a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m17499a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f99257c.length;
        while (i < length && it.hasNext()) {
            this.f99257c[i] = it.next();
            i++;
        }
        int i2 = this.f99256b;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f99257c[i3] = it.next();
        }
        this.f99258d = size() + collection.size();
    }

    /* renamed from: c */
    private final void m17498c(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f99257c;
        _ArraysJvm.m17393l(objArr2, objArr, 0, this.f99256b, objArr2.length);
        Object[] objArr3 = this.f99257c;
        int length = objArr3.length;
        int i2 = this.f99256b;
        _ArraysJvm.m17393l(objArr3, objArr, length - i2, 0, i2);
        this.f99256b = 0;
        this.f99257c = objArr;
    }

    /* renamed from: d */
    private final int m17497d(int i) {
        int m17325a0;
        if (i == 0) {
            m17325a0 = _Arrays.m17325a0(this.f99257c);
            return m17325a0;
        }
        return i - 1;
    }

    /* renamed from: f */
    private final void m17496f(int i) {
        int m16917e;
        if (i >= 0) {
            Object[] objArr = this.f99257c;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f99255g) {
                m16917e = _Ranges.m16917e(i, 10);
                this.f99257c = new Object[m16917e];
                return;
            }
            m17498c(AbstractList.Companion.m17587e(objArr.length, i));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: g */
    private final int m17495g(int i) {
        int m17325a0;
        m17325a0 = _Arrays.m17325a0(this.f99257c);
        if (i == m17325a0) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: i */
    private final int m17493i(int i) {
        if (i < 0) {
            return i + this.f99257c.length;
        }
        return i;
    }

    /* renamed from: j */
    private final int m17492j(int i) {
        Object[] objArr = this.f99257c;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m17496f(size() + elements.size());
        m17499a(m17492j(this.f99256b + size()), elements);
        return true;
    }

    public final void addFirst(E e) {
        m17496f(size() + 1);
        int m17497d = m17497d(this.f99256b);
        this.f99256b = m17497d;
        this.f99257c[m17497d] = e;
        this.f99258d = size() + 1;
    }

    public final void addLast(E e) {
        m17496f(size() + 1);
        this.f99257c[m17492j(this.f99256b + size())] = e;
        this.f99258d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m17492j = m17492j(this.f99256b + size());
        int i = this.f99256b;
        if (i < m17492j) {
            _ArraysJvm.m17383v(this.f99257c, null, i, m17492j);
        } else if (!isEmpty()) {
            Object[] objArr = this.f99257c;
            _ArraysJvm.m17383v(objArr, null, this.f99256b, objArr.length);
            _ArraysJvm.m17383v(this.f99257c, null, 0, m17492j);
        }
        this.f99256b = 0;
        this.f99258d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.m17590b(i, size());
        return (E) this.f99257c[m17492j(this.f99256b + i)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.f99258d;
    }

    @Nullable
    /* renamed from: h */
    public final E m17494h() {
        int m17164o;
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.f99257c;
        int i = this.f99256b;
        m17164o = C37563v.m17164o(this);
        return (E) objArr[m17492j(i + m17164o)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int m17492j = m17492j(this.f99256b + size());
        int i2 = this.f99256b;
        if (i2 < m17492j) {
            while (i2 < m17492j) {
                if (Intrinsics.m17075f(obj, this.f99257c[i2])) {
                    i = this.f99256b;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 >= m17492j) {
            int length = this.f99257c.length;
            while (true) {
                if (i2 < length) {
                    if (Intrinsics.m17075f(obj, this.f99257c[i2])) {
                        i = this.f99256b;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < m17492j; i3++) {
                        if (Intrinsics.m17075f(obj, this.f99257c[i3])) {
                            i2 = i3 + this.f99257c.length;
                            i = this.f99256b;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: l */
    public final E m17491l() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m17325a0;
        int i;
        int m17492j = m17492j(this.f99256b + size());
        int i2 = this.f99256b;
        if (i2 < m17492j) {
            m17325a0 = m17492j - 1;
            if (i2 <= m17325a0) {
                while (!Intrinsics.m17075f(obj, this.f99257c[m17325a0])) {
                    if (m17325a0 != i2) {
                        m17325a0--;
                    }
                }
                i = this.f99256b;
                return m17325a0 - i;
            }
            return -1;
        }
        if (i2 > m17492j) {
            int i3 = m17492j - 1;
            while (true) {
                if (-1 >= i3) {
                    m17325a0 = _Arrays.m17325a0(this.f99257c);
                    int i4 = this.f99256b;
                    if (i4 <= m17325a0) {
                        while (!Intrinsics.m17075f(obj, this.f99257c[m17325a0])) {
                            if (m17325a0 != i4) {
                                m17325a0--;
                            }
                        }
                        i = this.f99256b;
                    }
                } else if (Intrinsics.m17075f(obj, this.f99257c[i3])) {
                    m17325a0 = i3 + this.f99257c.length;
                    i = this.f99256b;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return -1;
    }

    @Nullable
    /* renamed from: m */
    public final E m17490m() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        byte b;
        int m17492j;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f99257c.length == 0) {
                b = 1;
            } else {
                b = 0;
            }
            if (b == 0) {
                int m17492j2 = m17492j(this.f99256b + size());
                int i = this.f99256b;
                if (i < m17492j2) {
                    m17492j = i;
                    while (i < m17492j2) {
                        Object obj = this.f99257c[i];
                        if (!elements.contains(obj)) {
                            this.f99257c[m17492j] = obj;
                            m17492j++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    _ArraysJvm.m17383v(this.f99257c, null, m17492j, m17492j2);
                } else {
                    int length = this.f99257c.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f99257c;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!elements.contains(obj2)) {
                            this.f99257c[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    m17492j = m17492j(i2);
                    for (int i3 = 0; i3 < m17492j2; i3++) {
                        Object[] objArr2 = this.f99257c;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!elements.contains(obj3)) {
                            this.f99257c[m17492j] = obj3;
                            m17492j = m17495g(m17492j);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f99258d = m17493i(m17492j - this.f99256b);
                }
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        int m17164o;
        int m17164o2;
        AbstractList.Companion.m17590b(i, size());
        m17164o = C37563v.m17164o(this);
        if (i == m17164o) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int m17492j = m17492j(this.f99256b + i);
        E e = (E) this.f99257c[m17492j];
        if (i < (size() >> 1)) {
            int i2 = this.f99256b;
            if (m17492j >= i2) {
                Object[] objArr = this.f99257c;
                _ArraysJvm.m17393l(objArr, objArr, i2 + 1, i2, m17492j);
            } else {
                Object[] objArr2 = this.f99257c;
                _ArraysJvm.m17393l(objArr2, objArr2, 1, 0, m17492j);
                Object[] objArr3 = this.f99257c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f99256b;
                _ArraysJvm.m17393l(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f99257c;
            int i4 = this.f99256b;
            objArr4[i4] = null;
            this.f99256b = m17495g(i4);
        } else {
            int i5 = this.f99256b;
            m17164o2 = C37563v.m17164o(this);
            int m17492j2 = m17492j(i5 + m17164o2);
            if (m17492j <= m17492j2) {
                Object[] objArr5 = this.f99257c;
                _ArraysJvm.m17393l(objArr5, objArr5, m17492j, m17492j + 1, m17492j2 + 1);
            } else {
                Object[] objArr6 = this.f99257c;
                _ArraysJvm.m17393l(objArr6, objArr6, m17492j, m17492j + 1, objArr6.length);
                Object[] objArr7 = this.f99257c;
                objArr7[objArr7.length - 1] = objArr7[0];
                _ArraysJvm.m17393l(objArr7, objArr7, 0, 1, m17492j2 + 1);
            }
            this.f99257c[m17492j2] = null;
        }
        this.f99258d = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f99257c;
            int i = this.f99256b;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f99256b = m17495g(i);
            this.f99258d = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        int m17164o;
        if (!isEmpty()) {
            int i = this.f99256b;
            m17164o = C37563v.m17164o(this);
            int m17492j = m17492j(i + m17164o);
            Object[] objArr = this.f99257c;
            E e = (E) objArr[m17492j];
            objArr[m17492j] = null;
            this.f99258d = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        byte b;
        int m17492j;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f99257c.length == 0) {
                b = 1;
            } else {
                b = 0;
            }
            if (b == 0) {
                int m17492j2 = m17492j(this.f99256b + size());
                int i = this.f99256b;
                if (i < m17492j2) {
                    m17492j = i;
                    while (i < m17492j2) {
                        Object obj = this.f99257c[i];
                        if (elements.contains(obj)) {
                            this.f99257c[m17492j] = obj;
                            m17492j++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    _ArraysJvm.m17383v(this.f99257c, null, m17492j, m17492j2);
                } else {
                    int length = this.f99257c.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f99257c;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (elements.contains(obj2)) {
                            this.f99257c[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    m17492j = m17492j(i2);
                    for (int i3 = 0; i3 < m17492j2; i3++) {
                        Object[] objArr2 = this.f99257c;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (elements.contains(obj3)) {
                            this.f99257c[m17492j] = obj3;
                            m17492j = m17495g(m17492j);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f99258d = m17493i(m17492j - this.f99256b);
                }
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractList.Companion.m17590b(i, size());
        int m17492j = m17492j(this.f99256b + i);
        Object[] objArr = this.f99257c;
        E e2 = (E) objArr[m17492j];
        objArr[m17492j] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Object[] m17174f;
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysJVM.m17418a(array, size());
        }
        int m17492j = m17492j(this.f99256b + size());
        int i = this.f99256b;
        if (i < m17492j) {
            _ArraysJvm.m17389p(this.f99257c, array, 0, i, m17492j, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f99257c;
            _ArraysJvm.m17393l(objArr, array, 0, this.f99256b, objArr.length);
            Object[] objArr2 = this.f99257c;
            _ArraysJvm.m17393l(objArr2, array, objArr2.length - this.f99256b, 0, m17492j);
        }
        m17174f = CollectionsJVM.m17174f(size(), array);
        return (T[]) m17174f;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractList.Companion.m17589c(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            m17496f(size() + 1);
            int m17492j = m17492j(this.f99256b + i);
            if (i < ((size() + 1) >> 1)) {
                int m17497d = m17497d(m17492j);
                int m17497d2 = m17497d(this.f99256b);
                int i2 = this.f99256b;
                if (m17497d >= i2) {
                    Object[] objArr = this.f99257c;
                    objArr[m17497d2] = objArr[i2];
                    _ArraysJvm.m17393l(objArr, objArr, i2, i2 + 1, m17497d + 1);
                } else {
                    Object[] objArr2 = this.f99257c;
                    _ArraysJvm.m17393l(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f99257c;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    _ArraysJvm.m17393l(objArr3, objArr3, 0, 1, m17497d + 1);
                }
                this.f99257c[m17497d] = e;
                this.f99256b = m17497d2;
            } else {
                int m17492j2 = m17492j(this.f99256b + size());
                if (m17492j < m17492j2) {
                    Object[] objArr4 = this.f99257c;
                    _ArraysJvm.m17393l(objArr4, objArr4, m17492j + 1, m17492j, m17492j2);
                } else {
                    Object[] objArr5 = this.f99257c;
                    _ArraysJvm.m17393l(objArr5, objArr5, 1, 0, m17492j2);
                    Object[] objArr6 = this.f99257c;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    _ArraysJvm.m17393l(objArr6, objArr6, m17492j + 1, m17492j, objArr6.length - 1);
                }
                this.f99257c[m17492j] = e;
            }
            this.f99258d = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.m17589c(i, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        m17496f(size() + elements.size());
        int m17492j = m17492j(this.f99256b + size());
        int m17492j2 = m17492j(this.f99256b + i);
        int size = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f99256b;
            int i3 = i2 - size;
            if (m17492j2 < i2) {
                Object[] objArr = this.f99257c;
                _ArraysJvm.m17393l(objArr, objArr, i3, i2, objArr.length);
                if (size >= m17492j2) {
                    Object[] objArr2 = this.f99257c;
                    _ArraysJvm.m17393l(objArr2, objArr2, objArr2.length - size, 0, m17492j2);
                } else {
                    Object[] objArr3 = this.f99257c;
                    _ArraysJvm.m17393l(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f99257c;
                    _ArraysJvm.m17393l(objArr4, objArr4, 0, size, m17492j2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f99257c;
                _ArraysJvm.m17393l(objArr5, objArr5, i3, i2, m17492j2);
            } else {
                Object[] objArr6 = this.f99257c;
                i3 += objArr6.length;
                int i4 = m17492j2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    _ArraysJvm.m17393l(objArr6, objArr6, i3, i2, m17492j2);
                } else {
                    _ArraysJvm.m17393l(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f99257c;
                    _ArraysJvm.m17393l(objArr7, objArr7, 0, this.f99256b + length, m17492j2);
                }
            }
            this.f99256b = i3;
            m17499a(m17493i(m17492j2 - size), elements);
        } else {
            int i5 = m17492j2 + size;
            if (m17492j2 < m17492j) {
                int i6 = size + m17492j;
                Object[] objArr8 = this.f99257c;
                if (i6 <= objArr8.length) {
                    _ArraysJvm.m17393l(objArr8, objArr8, i5, m17492j2, m17492j);
                } else if (i5 >= objArr8.length) {
                    _ArraysJvm.m17393l(objArr8, objArr8, i5 - objArr8.length, m17492j2, m17492j);
                } else {
                    int length2 = m17492j - (i6 - objArr8.length);
                    _ArraysJvm.m17393l(objArr8, objArr8, 0, length2, m17492j);
                    Object[] objArr9 = this.f99257c;
                    _ArraysJvm.m17393l(objArr9, objArr9, i5, m17492j2, length2);
                }
            } else {
                Object[] objArr10 = this.f99257c;
                _ArraysJvm.m17393l(objArr10, objArr10, size, 0, m17492j);
                Object[] objArr11 = this.f99257c;
                if (i5 >= objArr11.length) {
                    _ArraysJvm.m17393l(objArr11, objArr11, i5 - objArr11.length, m17492j2, objArr11.length);
                } else {
                    _ArraysJvm.m17393l(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f99257c;
                    _ArraysJvm.m17393l(objArr12, objArr12, i5, m17492j2, objArr12.length - size);
                }
            }
            m17499a(m17492j2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}

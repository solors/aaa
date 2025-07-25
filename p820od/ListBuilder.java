package p820od;

import ae.KMarkers;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: od.b */
/* loaded from: classes7.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements RandomAccess, Serializable {
    @NotNull

    /* renamed from: i */
    private static final C39141a f102816i = new C39141a(null);
    @NotNull

    /* renamed from: j */
    private static final ListBuilder f102817j;
    @NotNull

    /* renamed from: b */
    private E[] f102818b;

    /* renamed from: c */
    private int f102819c;

    /* renamed from: d */
    private int f102820d;

    /* renamed from: f */
    private boolean f102821f;
    @Nullable

    /* renamed from: g */
    private final ListBuilder<E> f102822g;
    @Nullable

    /* renamed from: h */
    private final ListBuilder<E> f102823h;

    /* compiled from: ListBuilder.kt */
    @Metadata
    /* renamed from: od.b$a */
    /* loaded from: classes7.dex */
    private static final class C39141a {
        private C39141a() {
        }

        public /* synthetic */ C39141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListBuilder.kt */
    @Metadata
    /* renamed from: od.b$b */
    /* loaded from: classes7.dex */
    public static final class C39142b<E> implements ListIterator<E>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final ListBuilder<E> f102824b;

        /* renamed from: c */
        private int f102825c;

        /* renamed from: d */
        private int f102826d;

        /* renamed from: f */
        private int f102827f;

        public C39142b(@NotNull ListBuilder<E> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f102824b = list;
            this.f102825c = i;
            this.f102826d = -1;
            this.f102827f = ((AbstractList) list).modCount;
        }

        /* renamed from: a */
        private final void m13825a() {
            if (((AbstractList) this.f102824b).modCount == this.f102827f) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            m13825a();
            ListBuilder<E> listBuilder = this.f102824b;
            int i = this.f102825c;
            this.f102825c = i + 1;
            listBuilder.add(i, e);
            this.f102826d = -1;
            this.f102827f = ((AbstractList) this.f102824b).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f102825c < ((ListBuilder) this.f102824b).f102820d) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f102825c > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            m13825a();
            if (this.f102825c < ((ListBuilder) this.f102824b).f102820d) {
                int i = this.f102825c;
                this.f102825c = i + 1;
                this.f102826d = i;
                return (E) ((ListBuilder) this.f102824b).f102818b[((ListBuilder) this.f102824b).f102819c + this.f102826d];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f102825c;
        }

        @Override // java.util.ListIterator
        public E previous() {
            m13825a();
            int i = this.f102825c;
            if (i > 0) {
                int i2 = i - 1;
                this.f102825c = i2;
                this.f102826d = i2;
                return (E) ((ListBuilder) this.f102824b).f102818b[((ListBuilder) this.f102824b).f102819c + this.f102826d];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f102825c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z;
            m13825a();
            int i = this.f102826d;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f102824b.remove(i);
                this.f102825c = this.f102826d;
                this.f102826d = -1;
                this.f102827f = ((AbstractList) this.f102824b).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            boolean z;
            m13825a();
            int i = this.f102826d;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f102824b.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f102821f = true;
        f102817j = listBuilder;
    }

    private ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f102818b = eArr;
        this.f102819c = i;
        this.f102820d = i2;
        this.f102821f = z;
        this.f102822g = listBuilder;
        this.f102823h = listBuilder2;
        if (listBuilder != null) {
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }
    }

    /* renamed from: f */
    private final void m13839f(int i, Collection<? extends E> collection, int i2) {
        m13829q();
        ListBuilder<E> listBuilder = this.f102822g;
        if (listBuilder != null) {
            listBuilder.m13839f(i, collection, i2);
            this.f102818b = this.f102822g.f102818b;
            this.f102820d += i2;
            return;
        }
        m13831o(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f102818b[i + i3] = it.next();
        }
    }

    /* renamed from: g */
    private final void m13838g(int i, E e) {
        m13829q();
        ListBuilder<E> listBuilder = this.f102822g;
        if (listBuilder != null) {
            listBuilder.m13838g(i, e);
            this.f102818b = this.f102822g.f102818b;
            this.f102820d++;
            return;
        }
        m13831o(i, 1);
        this.f102818b[i] = e;
    }

    /* renamed from: i */
    private final void m13836i() {
        ListBuilder<E> listBuilder = this.f102823h;
        if (listBuilder != null && ((AbstractList) listBuilder).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: j */
    private final void m13835j() {
        if (!m13830p()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    private final boolean m13834l(List<?> list) {
        boolean m13817h;
        m13817h = C39143c.m13817h(this.f102818b, this.f102819c, this.f102820d, list);
        return m13817h;
    }

    /* renamed from: m */
    private final void m13833m(int i) {
        if (i >= 0) {
            E[] eArr = this.f102818b;
            if (i > eArr.length) {
                this.f102818b = (E[]) C39143c.m13820e(this.f102818b, kotlin.collections.AbstractList.Companion.m17587e(eArr.length, i));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: n */
    private final void m13832n(int i) {
        m13833m(this.f102820d + i);
    }

    /* renamed from: o */
    private final void m13831o(int i, int i2) {
        m13832n(i2);
        E[] eArr = this.f102818b;
        _ArraysJvm.m17393l(eArr, eArr, i + i2, i, this.f102819c + this.f102820d);
        this.f102820d += i2;
    }

    /* renamed from: p */
    private final boolean m13830p() {
        ListBuilder<E> listBuilder;
        if (!this.f102821f && ((listBuilder = this.f102823h) == null || !listBuilder.f102821f)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private final void m13829q() {
        ((AbstractList) this).modCount++;
    }

    /* renamed from: r */
    private final E m13828r(int i) {
        m13829q();
        ListBuilder<E> listBuilder = this.f102822g;
        if (listBuilder != null) {
            this.f102820d--;
            return listBuilder.m13828r(i);
        }
        E[] eArr = this.f102818b;
        E e = eArr[i];
        _ArraysJvm.m17393l(eArr, eArr, i, i + 1, this.f102819c + this.f102820d);
        C39143c.m13819f(this.f102818b, (this.f102819c + this.f102820d) - 1);
        this.f102820d--;
        return e;
    }

    /* renamed from: s */
    private final void m13827s(int i, int i2) {
        if (i2 > 0) {
            m13829q();
        }
        ListBuilder<E> listBuilder = this.f102822g;
        if (listBuilder != null) {
            listBuilder.m13827s(i, i2);
        } else {
            E[] eArr = this.f102818b;
            _ArraysJvm.m17393l(eArr, eArr, i, i + i2, this.f102820d);
            E[] eArr2 = this.f102818b;
            int i3 = this.f102820d;
            C39143c.m13818g(eArr2, i3 - i2, i3);
        }
        this.f102820d -= i2;
    }

    /* renamed from: t */
    private final int m13826t(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3;
        ListBuilder<E> listBuilder = this.f102822g;
        if (listBuilder != null) {
            i3 = listBuilder.m13826t(i, i2, collection, z);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = i + i4;
                if (collection.contains(this.f102818b[i6]) == z) {
                    E[] eArr = this.f102818b;
                    i4++;
                    eArr[i5 + i] = eArr[i6];
                    i5++;
                } else {
                    i4++;
                }
            }
            int i7 = i2 - i5;
            E[] eArr2 = this.f102818b;
            _ArraysJvm.m17393l(eArr2, eArr2, i + i5, i2 + i, this.f102820d);
            E[] eArr3 = this.f102818b;
            int i8 = this.f102820d;
            C39143c.m13818g(eArr3, i8 - i7, i8);
            i3 = i7;
        }
        if (i3 > 0) {
            m13829q();
        }
        this.f102820d -= i3;
        return i3;
    }

    private final Object writeReplace() {
        if (m13830p()) {
            return new C39154h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m13835j();
        m13836i();
        m13838g(this.f102819c + this.f102820d, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m13835j();
        m13836i();
        int size = elements.size();
        m13839f(this.f102819c + this.f102820d, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m13835j();
        m13836i();
        m13827s(this.f102819c, this.f102820d);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        m13836i();
        if (obj != this && (!(obj instanceof List) || !m13834l((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        m13836i();
        kotlin.collections.AbstractList.Companion.m17590b(i, this.f102820d);
        return this.f102818b[this.f102819c + i];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        m13836i();
        return this.f102820d;
    }

    @NotNull
    /* renamed from: h */
    public final List<E> m13837h() {
        if (this.f102822g == null) {
            m13835j();
            this.f102821f = true;
            if (this.f102820d > 0) {
                return this;
            }
            return f102817j;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int m13816i;
        m13836i();
        m13816i = C39143c.m13816i(this.f102818b, this.f102819c, this.f102820d);
        return m13816i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        m13836i();
        for (int i = 0; i < this.f102820d; i++) {
            if (Intrinsics.m17075f(this.f102818b[this.f102819c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        m13836i();
        if (this.f102820d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        m13836i();
        for (int i = this.f102820d - 1; i >= 0; i--) {
            if (Intrinsics.m17075f(this.f102818b[this.f102819c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m13835j();
        m13836i();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m13835j();
        m13836i();
        if (m13826t(this.f102819c, this.f102820d, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        m13835j();
        m13836i();
        kotlin.collections.AbstractList.Companion.m17590b(i, this.f102820d);
        return m13828r(this.f102819c + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m13835j();
        m13836i();
        if (m13826t(this.f102819c, this.f102820d, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m13835j();
        m13836i();
        kotlin.collections.AbstractList.Companion.m17590b(i, this.f102820d);
        E[] eArr = this.f102818b;
        int i2 = this.f102819c;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        ListBuilder<E> listBuilder;
        kotlin.collections.AbstractList.Companion.m17588d(i, i2, this.f102820d);
        E[] eArr = this.f102818b;
        int i3 = this.f102819c + i;
        int i4 = i2 - i;
        boolean z = this.f102821f;
        ListBuilder<E> listBuilder2 = this.f102823h;
        if (listBuilder2 == null) {
            listBuilder = this;
        } else {
            listBuilder = listBuilder2;
        }
        return new ListBuilder(eArr, i3, i4, z, this, listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] destination) {
        Object[] m17174f;
        Intrinsics.checkNotNullParameter(destination, "destination");
        m13836i();
        int length = destination.length;
        int i = this.f102820d;
        if (length < i) {
            E[] eArr = this.f102818b;
            int i2 = this.f102819c;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, destination.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }
        E[] eArr2 = this.f102818b;
        int i3 = this.f102819c;
        _ArraysJvm.m17393l(eArr2, destination, 0, i3, i + i3);
        m17174f = CollectionsJVM.m17174f(this.f102820d, destination);
        return (T[]) m17174f;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        String m13815j;
        m13836i();
        m13815j = C39143c.m13815j(this.f102818b, this.f102819c, this.f102820d, this);
        return m13815j;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        m13836i();
        kotlin.collections.AbstractList.Companion.m17589c(i, this.f102820d);
        return new C39142b(this, i);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        m13835j();
        m13836i();
        kotlin.collections.AbstractList.Companion.m17589c(i, this.f102820d);
        m13838g(this.f102819c + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m13835j();
        m13836i();
        kotlin.collections.AbstractList.Companion.m17589c(i, this.f102820d);
        int size = elements.size();
        m13839f(this.f102819c + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        Object[] m17386s;
        m13836i();
        E[] eArr = this.f102818b;
        int i = this.f102819c;
        m17386s = _ArraysJvm.m17386s(eArr, i, this.f102820d + i);
        return m17386s;
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(C39143c.m13821d(i), 0, 0, false, null, null);
    }
}

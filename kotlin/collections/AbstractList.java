package kotlin.collections;

import ae.KMarkers;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.collections.c */
/* loaded from: classes7.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
    @NotNull
    public static final C37532a Companion = new C37532a(null);
    private static final int maxArraySize = 2147483639;

    /* compiled from: AbstractList.kt */
    @Metadata
    /* renamed from: kotlin.collections.c$a */
    /* loaded from: classes7.dex */
    public static final class C37532a {
        private C37532a() {
        }

        public /* synthetic */ C37532a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m17591a(int i, int i2, int i3) {
            if (i >= 0 && i2 <= i3) {
                if (i <= i2) {
                    return;
                }
                throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
            }
            throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
        }

        /* renamed from: b */
        public final void m17590b(int i, int i2) {
            if (i >= 0 && i < i2) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }

        /* renamed from: c */
        public final void m17589c(int i, int i2) {
            if (i >= 0 && i <= i2) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }

        /* renamed from: d */
        public final void m17588d(int i, int i2, int i3) {
            if (i >= 0 && i2 <= i3) {
                if (i <= i2) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }

        /* renamed from: e */
        public final int m17587e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - AbstractList.maxArraySize > 0) {
                if (i2 <= AbstractList.maxArraySize) {
                    return AbstractList.maxArraySize;
                }
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        /* renamed from: f */
        public final boolean m17586f(@NotNull Collection<?> c, @NotNull Collection<?> other) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.m17075f(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public final int m17585g(@NotNull Collection<?> c) {
            int i;
            Intrinsics.checkNotNullParameter(c, "c");
            int i2 = 1;
            for (Object obj : c) {
                int i3 = i2 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractList.kt */
    @Metadata
    /* renamed from: kotlin.collections.c$b */
    /* loaded from: classes7.dex */
    public class C37533b implements Iterator<E>, KMarkers {

        /* renamed from: b */
        private int f99225b;

        public C37533b() {
        }

        /* renamed from: a */
        protected final int m17584a() {
            return this.f99225b;
        }

        /* renamed from: b */
        protected final void m17583b(int i) {
            this.f99225b = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f99225b < AbstractList.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                AbstractList<E> abstractList = AbstractList.this;
                int i = this.f99225b;
                this.f99225b = i + 1;
                return abstractList.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata
    /* renamed from: kotlin.collections.c$c */
    /* loaded from: classes7.dex */
    private class C37534c extends AbstractList<E>.C37533b implements ListIterator<E> {
        public C37534c(int i) {
            super();
            AbstractList.Companion.m17589c(i, AbstractList.this.size());
            m17583b(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (m17584a() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m17584a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                AbstractList<E> abstractList = AbstractList.this;
                m17583b(m17584a() - 1);
                return abstractList.get(m17584a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m17584a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata
    /* renamed from: kotlin.collections.c$d */
    /* loaded from: classes7.dex */
    private static final class C37535d<E> extends AbstractList<E> implements RandomAccess {
        @NotNull

        /* renamed from: b */
        private final AbstractList<E> f99228b;

        /* renamed from: c */
        private final int f99229c;

        /* renamed from: d */
        private int f99230d;

        /* JADX WARN: Multi-variable type inference failed */
        public C37535d(@NotNull AbstractList<? extends E> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f99228b = list;
            this.f99229c = i;
            AbstractList.Companion.m17588d(i, i2, list.size());
            this.f99230d = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i) {
            AbstractList.Companion.m17590b(i, this.f99230d);
            return this.f99228b.get(this.f99229c + i);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f99230d;
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return Companion.m17586f(this, (Collection) obj);
    }

    public abstract E get(int i);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.m17585g(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (!Intrinsics.m17075f(e2, e)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new C37533b();
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.m17075f(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new C37534c(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public List<E> subList(int i, int i2) {
        return new C37535d(this, i, i2);
    }

    @NotNull
    public ListIterator<E> listIterator(int i) {
        return new C37534c(i);
    }
}

package androidx.compose.runtime.collection;

import ae.InterfaceC0038d;
import ae.KMarkers;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.ExceptionsH;

/* compiled from: MutableVector.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    @NotNull
    private T[] content;
    @Nullable
    private List<T> list;
    private int size;

    /* compiled from: MutableVector.kt */
    @Metadata
    /* loaded from: classes.dex */
    private static final class MutableVectorList<T> implements List<T>, InterfaceC0038d {
        @NotNull
        private final MutableVector<T> vector;

        public MutableVectorList(@NotNull MutableVector<T> vector) {
            Intrinsics.checkNotNullParameter(vector, "vector");
            this.vector = vector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.vector.add(t);
        }

        @Override // java.util.List
        public boolean addAll(int i, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.addAll(i, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.getContent()[i];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.removeAll(elements);
        }

        public T removeAt(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.retainAll(elements);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.set(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i, int i2) {
            MutableVectorKt.checkSubIndex(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.m17045a(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.vector.add(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.vector.addAll(elements);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.m17044b(this, array);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata
    /* loaded from: classes.dex */
    private static final class SubList<T> implements List<T>, InterfaceC0038d {
        private int end;
        @NotNull
        private final List<T> list;
        private final int start;

        public SubList(@NotNull List<T> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(i + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.m17075f(this.list.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.list.get(i + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.m17075f(this.list.get(i2), obj)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.end == this.start) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (!Intrinsics.m17075f(this.list.get(i), obj)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.start;
            }
            return -1;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.end) {
                return true;
            }
            return false;
        }

        public T removeAt(int i) {
            MutableVectorKt.checkIndex(this, i);
            this.end--;
            return this.list.remove(i + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!elements.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.end) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            MutableVectorKt.checkIndex(this, i);
            return this.list.set(i + this.start, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i, int i2) {
            MutableVectorKt.checkSubIndex(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.m17045a(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.list.add(i + this.start, t);
            this.end++;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.m17075f(this.list.get(i2), obj)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.m17044b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata
    /* loaded from: classes.dex */
    private static final class VectorListIterator<T> implements ListIterator<T>, KMarkers {
        private int index;
        @NotNull
        private final List<T> list;

        public VectorListIterator(@NotNull List<T> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.list.add(this.index, t);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.index < this.list.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.index > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.list.set(this.index, t);
        }
    }

    public MutableVector(@NotNull T[] content, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.size = i;
    }

    public final boolean add(T t) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i = this.size;
        tArr[i] = t;
        this.size = i + 1;
        return true;
    }

    public final boolean addAll(int i, @NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size());
        T[] tArr = this.content;
        if (i != this.size) {
            _ArraysJvm.m17393l(tArr, tArr, elements.size() + i, i, this.size);
        }
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            tArr[i + i2] = elements.get(i2);
        }
        this.size += elements.size();
        return true;
    }

    public final boolean any(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size <= 0) {
            return false;
        }
        T[] content = getContent();
        int i = 0;
        while (!predicate.invoke(content[i]).booleanValue()) {
            i++;
            if (i >= size) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list == null) {
            MutableVectorList mutableVectorList = new MutableVectorList(this);
            this.list = mutableVectorList;
            return mutableVectorList;
        }
        return list;
    }

    public final void clear() {
        T[] tArr = this.content;
        int size = getSize();
        while (true) {
            size--;
            if (-1 < size) {
                tArr[size] = null;
            } else {
                this.size = 0;
                return;
            }
        }
    }

    public final boolean contains(T t) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !Intrinsics.m17075f(getContent()[i], t); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(@NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(@NotNull MutableVector<T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; Intrinsics.m17075f(other.getContent()[i], getContent()[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        T[] tArr = this.content;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T first() {
        if (!isEmpty()) {
            return getContent()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    @Nullable
    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R r, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                r = operation.mo105910invoke(r, content[i]);
                i++;
            } while (i < size);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R r, @NotNull InterfaceC45268n<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                r = operation.invoke(Integer.valueOf(i), r, content[i]);
                i++;
            } while (i < size);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R r, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                r = operation.mo105910invoke(content[i], r);
                i--;
            } while (i >= 0);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R r, @NotNull InterfaceC45268n<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                r = operation.invoke(Integer.valueOf(i), content[i], r);
                i--;
            } while (i >= 0);
            return r;
        }
        return r;
    }

    public final void forEach(@NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                block.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                block.mo105910invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachReversed(@NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                block.invoke(content[i]);
                i--;
            } while (i >= 0);
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                block.mo105910invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int i) {
        return getContent()[i];
    }

    @NotNull
    public final T[] getContent() {
        return this.content;
    }

    @NotNull
    public final PrimitiveRanges getIndices() {
        return new PrimitiveRanges(0, getSize() - 1);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T t) {
        int i = this.size;
        if (i > 0) {
            T[] tArr = this.content;
            int i2 = 0;
            while (!Intrinsics.m17075f(t, tArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            while (!predicate.invoke(content[i]).booleanValue()) {
                i++;
                if (i >= size) {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            while (!predicate.invoke(content[i]).booleanValue()) {
                i--;
                if (i < 0) {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.size != 0) {
            return true;
        }
        return false;
    }

    public final T last() {
        if (!isEmpty()) {
            return getContent()[getSize() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int lastIndexOf(T t) {
        int i = this.size;
        if (i > 0) {
            int i2 = i - 1;
            T[] tArr = this.content;
            while (!Intrinsics.m17075f(t, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    @Nullable
    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        Intrinsics.m17067n(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(getContent()[i]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        Intrinsics.m17067n(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.mo105910invoke(Integer.valueOf(i), getContent()[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        int i = 0;
        Intrinsics.m17067n(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R mo105910invoke = transform.mo105910invoke(Integer.valueOf(i), content[i]);
                if (mo105910invoke != null) {
                    objArr[i2] = mo105910invoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        int i = 0;
        Intrinsics.m17067n(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R invoke = transform.invoke(content[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final void minusAssign(T t) {
        remove(t);
    }

    public final void plusAssign(T t) {
        add(t);
    }

    public final boolean remove(T t) {
        int indexOf = indexOf(t);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.size;
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(elements.get(i2));
        }
        return i != this.size;
    }

    public final T removeAt(int i) {
        T[] tArr = this.content;
        T t = tArr[i];
        if (i != getSize() - 1) {
            _ArraysJvm.m17393l(tArr, tArr, i, i + 1, this.size);
        }
        int i2 = this.size - 1;
        this.size = i2;
        tArr[i2] = null;
        return t;
    }

    public final void removeRange(int i, int i2) {
        if (i2 > i) {
            int i3 = this.size;
            if (i2 < i3) {
                T[] tArr = this.content;
                _ArraysJvm.m17393l(tArr, tArr, i, i2, i3);
            }
            int i4 = this.size - (i2 - i);
            int size = getSize() - 1;
            if (i4 <= size) {
                int i5 = i4;
                while (true) {
                    this.content[i5] = null;
                    if (i5 == size) {
                        break;
                    }
                    i5++;
                }
            }
            this.size = i4;
        }
    }

    public final boolean retainAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(getContent()[size])) {
                removeAt(size);
            }
        }
        if (i != this.size) {
            return true;
        }
        return false;
    }

    public final boolean reversedAny(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            while (!predicate.invoke(content[i]).booleanValue()) {
                i--;
                if (i < 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final T set(int i, T t) {
        T[] tArr = this.content;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    public final void setContent(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<set-?>");
        this.content = tArr;
    }

    public final void sortWith(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        _ArraysJvm.m17401G(this.content, comparator, 0, this.size);
    }

    public final int sumBy(@NotNull Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        int size = getSize();
        int i = 0;
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                i += selector.invoke(content[i2]).intValue();
                i2++;
            } while (i2 < size);
            return i;
        }
        return i;
    }

    @NotNull
    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean containsAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (T t : elements) {
            if (!contains(t)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final T firstOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size);
            return null;
        }
        return null;
    }

    public final void add(int i, T t) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i2 = this.size;
        if (i != i2) {
            _ArraysJvm.m17393l(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.size++;
    }

    public final T first(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size);
            throwNoSuchElementException();
            throw new ExceptionsH();
        }
        throwNoSuchElementException();
        throw new ExceptionsH();
    }

    @Nullable
    public final T lastOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
            return null;
        }
        return null;
    }

    public final T last(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
            throwNoSuchElementException();
            throw new ExceptionsH();
        }
        throwNoSuchElementException();
        throw new ExceptionsH();
    }

    public final boolean removeAll(@NotNull MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(elements.getContent()[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.size;
    }

    public final boolean containsAll(@NotNull MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PrimitiveRanges primitiveRanges = new PrimitiveRanges(0, elements.getSize() - 1);
        int m16953c = primitiveRanges.m16953c();
        int m16952d = primitiveRanges.m16952d();
        if (m16953c <= m16952d) {
            while (contains(elements.getContent()[m16953c])) {
                if (m16953c != m16952d) {
                    m16953c++;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean removeAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.size;
        for (T t : elements) {
            remove(t);
        }
        return i != this.size;
    }

    public final boolean addAll(int i, @NotNull MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size);
        T[] tArr = this.content;
        int i2 = this.size;
        if (i != i2) {
            _ArraysJvm.m17393l(tArr, tArr, elements.size + i, i, i2);
        }
        _ArraysJvm.m17393l(elements.content, tArr, i, 0, elements.size);
        this.size += elements.size;
        return true;
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean addAll(@NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(getSize(), (List) elements);
    }

    public final boolean addAll(@NotNull MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(getSize(), elements);
    }

    public final boolean addAll(@NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this.size + elements.length);
        _ArraysJvm.m17389p(elements, this.content, this.size, 0, 0, 12, null);
        this.size += elements.length;
        return true;
    }

    public final boolean addAll(int i, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size());
        T[] tArr = this.content;
        if (i != this.size) {
            _ArraysJvm.m17393l(tArr, tArr, elements.size() + i, i, this.size);
        }
        for (T t : elements) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C37563v.m17156w();
            }
            tArr[i2 + i] = t;
            i2 = i3;
        }
        this.size += elements.size();
        return true;
    }

    public final boolean addAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this.size, elements);
    }
}

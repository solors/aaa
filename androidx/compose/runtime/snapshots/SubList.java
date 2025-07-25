package androidx.compose.runtime.snapshots;

import ae.InterfaceC0038d;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateList.kt */
@Metadata
/* loaded from: classes.dex */
public final class SubList<T> implements List<T>, InterfaceC0038d {
    private int modification;
    private final int offset;
    @NotNull
    private final SnapshotStateList<T> parentList;
    private int size;

    public SubList(@NotNull SnapshotStateList<T> parentList, int i, int i2) {
        Intrinsics.checkNotNullParameter(parentList, "parentList");
        this.parentList = parentList;
        this.offset = i;
        this.modification = parentList.getModification$runtime_release();
        this.size = i2 - i;
    }

    private final void validateModification() {
        if (this.parentList.getModification$runtime_release() == this.modification) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        validateModification();
        this.parentList.add(this.offset + size(), t);
        this.size = size() + 1;
        this.modification = this.parentList.getModification$runtime_release();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        validateModification();
        boolean addAll = this.parentList.addAll(i + this.offset, elements);
        if (addAll) {
            this.size = size() + elements.size();
            this.modification = this.parentList.getModification$runtime_release();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i = this.offset;
            snapshotStateList.removeRange(i, size() + i);
            this.size = 0;
            this.modification = this.parentList.getModification$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i) {
        validateModification();
        SnapshotStateListKt.validateRange(i, size());
        return this.parentList.get(this.offset + i);
    }

    @NotNull
    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        PrimitiveRanges m16900v;
        validateModification();
        int i = this.offset;
        m16900v = _Ranges.m16900v(i, size() + i);
        Iterator<Integer> it = m16900v.iterator();
        while (it.hasNext()) {
            int nextInt = ((PrimitiveIterators) it).nextInt();
            if (Intrinsics.m17075f(obj, this.parentList.get(nextInt))) {
                return nextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = this.offset + size();
        while (true) {
            size--;
            if (size >= this.offset) {
                if (Intrinsics.m17075f(obj, this.parentList.get(size))) {
                    return size - this.offset;
                }
            } else {
                return -1;
            }
        }
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        while (true) {
            boolean z = false;
            for (Object obj : elements) {
                if (remove(obj) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public T removeAt(int i) {
        validateModification();
        T remove = this.parentList.remove(this.offset + i);
        this.size = size() - 1;
        this.modification = this.parentList.getModification$runtime_release();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        int retainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(elements, i, size() + i);
        if (retainAllInRange$runtime_release > 0) {
            this.modification = this.parentList.getModification$runtime_release();
            this.size = size() - retainAllInRange$runtime_release;
        }
        if (retainAllInRange$runtime_release > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        SnapshotStateListKt.validateRange(i, size());
        validateModification();
        T t2 = this.parentList.set(i + this.offset, t);
        this.modification = this.parentList.getModification$runtime_release();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i2 > size()) {
            z2 = false;
        }
        if (z2) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i3 = this.offset;
            return new SubList(snapshotStateList, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i) {
        validateModification();
        C37607l0 c37607l0 = new C37607l0();
        c37607l0.f99325b = i - 1;
        return new SubList$listIterator$1(c37607l0, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        validateModification();
        this.parentList.add(this.offset + i, t);
        this.size = size() + 1;
        this.modification = this.parentList.getModification$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(size(), elements);
    }
}

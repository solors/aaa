package androidx.compose.runtime.collection;

import ae.KMarkers;
import androidx.compose.runtime.ActualJvm_jvmKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IdentityArraySet.kt */
@Metadata
/* loaded from: classes.dex */
public final class IdentityArraySet<T> implements Set<T>, KMarkers {
    private int size;
    @NotNull
    private Object[] values = new Object[16];

    private final int find(Object obj) {
        int size = size() - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            T t = get(i2);
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(t);
            if (identityHashCode2 < identityHashCode) {
                i = i2 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                size = i2 - 1;
            } else if (t == obj) {
                return i2;
            } else {
                return findExactIndex(i2, obj, identityHashCode);
            }
        }
        return -(i + 1);
    }

    private final int findExactIndex(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.values[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int size = size();
        while (true) {
            if (i4 < size) {
                Object obj3 = this.values[i4];
                if (obj3 == obj) {
                    return i4;
                }
                if (ActualJvm_jvmKt.identityHashCode(obj3) != i2) {
                    break;
                }
                i4++;
            } else {
                i4 = size();
                break;
            }
        }
        return -(i4 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@NotNull T value) {
        int i;
        Intrinsics.checkNotNullParameter(value, "value");
        if (size() > 0) {
            i = find(value);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int size = size();
        Object[] objArr = this.values;
        if (size != objArr.length) {
            _ArraysJvm.m17393l(objArr, objArr, i2 + 1, i2, size());
        } else {
            Object[] objArr2 = new Object[objArr.length * 2];
            _ArraysJvm.m17393l(objArr, objArr2, i2 + 1, i2, size());
            _ArraysJvm.m17389p(this.values, objArr2, 0, 0, i2, 6, null);
            this.values = objArr2;
        }
        this.values[i2] = value;
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int size = size();
        for (int i = 0; i < size; i++) {
            this.values[i] = null;
        }
        setSize(0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        if (obj == null || find(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
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

    public final void forEach(@NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = size();
        for (int i = 0; i < size; i++) {
            block.invoke(get(i));
        }
    }

    @NotNull
    public final T get(int i) {
        T t = (T) this.values[i];
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
    }

    public int getSize() {
        return this.size;
    }

    @NotNull
    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new IdentityArraySet$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(@Nullable T t) {
        int find;
        if (t == null || (find = find(t)) < 0) {
            return false;
        }
        if (find < size() - 1) {
            Object[] objArr = this.values;
            _ArraysJvm.m17393l(objArr, objArr, find, find + 1, size());
        }
        setSize(size() - 1);
        this.values[size()] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeValueIf(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = getValues()[i2];
            if (obj != null) {
                if (!predicate.invoke(obj).booleanValue()) {
                    if (i != i2) {
                        getValues()[i] = obj;
                    }
                    i++;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
        }
        int size2 = size();
        for (int i3 = i; i3 < size2; i3++) {
            getValues()[i3] = null;
        }
        setSize(i);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void setSize(int i) {
        this.size = i;
    }

    public final void setValues(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.values = objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }

    public static /* synthetic */ void getValues$annotations() {
    }
}

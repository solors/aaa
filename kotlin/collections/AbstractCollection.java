package kotlin.collections;

import ae.KMarkers;
import com.ironsource.C21114v8;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.collections.a */
/* loaded from: classes7.dex */
public abstract class AbstractCollection<E> implements Collection<E>, KMarkers {

    /* compiled from: AbstractCollection.kt */
    @Metadata
    /* renamed from: kotlin.collections.a$a */
    /* loaded from: classes7.dex */
    static final class C37529a extends Lambda implements Function1<E, CharSequence> {

        /* renamed from: g */
        final /* synthetic */ AbstractCollection<E> f99212g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C37529a(AbstractCollection<? extends E> abstractCollection) {
            super(1);
            this.f99212g = abstractCollection;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b */
        public final CharSequence invoke(E e) {
            if (e == this.f99212g) {
                return "(this Collection)";
            }
            return String.valueOf(e);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (E e2 : this) {
            if (Intrinsics.m17075f(e2, e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    @NotNull
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    @NotNull
    public String toString() {
        String m17521z0;
        m17521z0 = _Collections.m17521z0(this, ", ", C21114v8.C21123i.f54137d, C21114v8.C21123i.f54139e, 0, null, new C37529a(this), 24, null);
        return m17521z0;
    }

    @Override // java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }
}

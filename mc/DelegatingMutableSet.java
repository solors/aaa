package mc;

import ae.InterfaceC0041f;
import ae.KMarkers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mc.n */
/* loaded from: classes9.dex */
public class DelegatingMutableSet<From, To> implements Set<To>, InterfaceC0041f {
    @NotNull

    /* renamed from: b */
    private final Set<From> f101144b;
    @NotNull

    /* renamed from: c */
    private final Function1<From, To> f101145c;
    @NotNull

    /* renamed from: d */
    private final Function1<To, From> f101146d;

    /* renamed from: f */
    private final int f101147f;

    /* compiled from: DelegatingMutableSet.kt */
    @Metadata
    /* renamed from: mc.n$a */
    /* loaded from: classes9.dex */
    public static final class C38271a implements Iterator<To>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final Iterator<From> f101148b;

        /* renamed from: c */
        final /* synthetic */ DelegatingMutableSet<From, To> f101149c;

        C38271a(DelegatingMutableSet<From, To> delegatingMutableSet) {
            this.f101149c = delegatingMutableSet;
            this.f101148b = ((DelegatingMutableSet) delegatingMutableSet).f101144b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f101148b.hasNext();
        }

        @Override // java.util.Iterator
        public To next() {
            return (To) ((DelegatingMutableSet) this.f101149c).f101145c.invoke(this.f101148b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f101148b.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelegatingMutableSet(@NotNull Set<From> delegate, @NotNull Function1<? super From, ? extends To> convertTo, @NotNull Function1<? super To, ? extends From> convert) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(convertTo, "convertTo");
        Intrinsics.checkNotNullParameter(convert, "convert");
        this.f101144b = delegate;
        this.f101145c = convertTo;
        this.f101146d = convert;
        this.f101147f = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(To to) {
        return this.f101144b.add(this.f101146d.invoke(to));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends To> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f101144b.addAll(m15224c(elements));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: c */
    public Collection<From> m15224c(@NotNull Collection<? extends To> collection) {
        int m17154x;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection<? extends To> collection2 = collection;
        m17154x = C37566w.m17154x(collection2, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f101146d.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f101144b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f101144b.contains(this.f101146d.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f101144b.containsAll(m15224c(elements));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: d */
    public Collection<To> m15223d(@NotNull Collection<? extends From> collection) {
        int m17154x;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection<? extends From> collection2 = collection;
        m17154x = C37566w.m17154x(collection2, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f101145c.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        Collection<To> m15223d = m15223d(this.f101144b);
        if (!((Set) obj).containsAll(m15223d) || !m15223d.containsAll((Collection) obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int m15222f() {
        return this.f101147f;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f101144b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f101144b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<To> iterator() {
        return new C38271a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f101144b.remove(this.f101146d.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f101144b.removeAll(m15224c(elements));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f101144b.retainAll(m15224c(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m15222f();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    @NotNull
    public String toString() {
        return m15223d(this.f101144b).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }
}

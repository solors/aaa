package kotlin.collections;

import ae.KMarkers;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
@Metadata
/* renamed from: kotlin.collections.v0 */
/* loaded from: classes7.dex */
public class C37564v0<T> extends AbstractList<T> {
    @NotNull

    /* renamed from: b */
    private final List<T> f99266b;

    /* compiled from: ReversedViews.kt */
    @Metadata
    /* renamed from: kotlin.collections.v0$a */
    /* loaded from: classes7.dex */
    public static final class C37565a implements ListIterator<T>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final ListIterator<T> f99267b;

        /* renamed from: c */
        final /* synthetic */ C37564v0<T> f99268c;

        /* JADX WARN: Multi-variable type inference failed */
        C37565a(C37564v0<? extends T> c37564v0, int i) {
            int m17594a0;
            this.f99268c = c37564v0;
            List list = ((C37564v0) c37564v0).f99266b;
            m17594a0 = ReversedViews.m17594a0(c37564v0, i);
            this.f99267b = list.listIterator(m17594a0);
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f99267b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f99267b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f99267b.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int m17595Z;
            m17595Z = ReversedViews.m17595Z(this.f99268c, this.f99267b.previousIndex());
            return m17595Z;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f99267b.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int m17595Z;
            m17595Z = ReversedViews.m17595Z(this.f99268c, this.f99267b.nextIndex());
            return m17595Z;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37564v0(@NotNull List<? extends T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f99266b = delegate;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i) {
        int m17596Y;
        List<T> list = this.f99266b;
        m17596Y = ReversedViews.m17596Y(this, i);
        return list.get(m17596Y);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f99266b.size();
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i) {
        return new C37565a(this, i);
    }
}

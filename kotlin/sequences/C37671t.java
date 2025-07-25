package kotlin.sequences;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata
/* renamed from: kotlin.sequences.t */
/* loaded from: classes7.dex */
public final class C37671t<T, R> implements Sequence<R> {
    @NotNull

    /* renamed from: a */
    private final Sequence<T> f99437a;
    @NotNull

    /* renamed from: b */
    private final Function1<T, R> f99438b;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.t$a */
    /* loaded from: classes7.dex */
    public static final class C37672a implements Iterator<R>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final Iterator<T> f99439b;

        /* renamed from: c */
        final /* synthetic */ C37671t<T, R> f99440c;

        C37672a(C37671t<T, R> c37671t) {
            this.f99440c = c37671t;
            this.f99439b = ((C37671t) c37671t).f99437a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f99439b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((C37671t) this.f99440c).f99438b.invoke(this.f99439b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37671t(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f99437a = sequence;
        this.f99438b = transformer;
    }

    @NotNull
    /* renamed from: e */
    public final <E> Sequence<E> m16787e(@NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new C37642f(this.f99437a, this.f99438b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<R> iterator() {
        return new C37672a(this);
    }
}

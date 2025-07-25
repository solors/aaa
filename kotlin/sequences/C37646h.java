package kotlin.sequences;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata
/* renamed from: kotlin.sequences.h */
/* loaded from: classes7.dex */
public final class C37646h<T1, T2, V> implements Sequence<V> {
    @NotNull

    /* renamed from: a */
    private final Sequence<T1> f99392a;
    @NotNull

    /* renamed from: b */
    private final Sequence<T2> f99393b;
    @NotNull

    /* renamed from: c */
    private final Function2<T1, T2, V> f99394c;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.h$a */
    /* loaded from: classes7.dex */
    public static final class C37647a implements Iterator<V>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final Iterator<T1> f99395b;
        @NotNull

        /* renamed from: c */
        private final Iterator<T2> f99396c;

        /* renamed from: d */
        final /* synthetic */ C37646h<T1, T2, V> f99397d;

        C37647a(C37646h<T1, T2, V> c37646h) {
            this.f99397d = c37646h;
            this.f99395b = ((C37646h) c37646h).f99392a.iterator();
            this.f99396c = ((C37646h) c37646h).f99393b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f99395b.hasNext() && this.f99396c.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((C37646h) this.f99397d).f99394c.mo105910invoke(this.f99395b.next(), this.f99396c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37646h(@NotNull Sequence<? extends T1> sequence1, @NotNull Sequence<? extends T2> sequence2, @NotNull Function2<? super T1, ? super T2, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f99392a = sequence1;
        this.f99393b = sequence2;
        this.f99394c = transform;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<V> iterator() {
        return new C37647a(this);
    }
}

package kotlin.sequences;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.sequences.b */
/* loaded from: classes7.dex */
public final class Sequences<T> implements Sequence<T>, InterfaceC37638c<T> {
    @NotNull

    /* renamed from: a */
    private final Sequence<T> f99369a;

    /* renamed from: b */
    private final int f99370b;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.b$a */
    /* loaded from: classes7.dex */
    public static final class C37637a implements Iterator<T>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final Iterator<T> f99371b;

        /* renamed from: c */
        private int f99372c;

        C37637a(Sequences<T> sequences) {
            this.f99371b = ((Sequences) sequences).f99369a.iterator();
            this.f99372c = ((Sequences) sequences).f99370b;
        }

        /* renamed from: a */
        private final void m16897a() {
            while (this.f99372c > 0 && this.f99371b.hasNext()) {
                this.f99371b.next();
                this.f99372c--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m16897a();
            return this.f99371b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m16897a();
            return this.f99371b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Sequences(@NotNull Sequence<? extends T> sequence, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f99369a = sequence;
        this.f99370b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // kotlin.sequences.InterfaceC37638c
    @NotNull
    /* renamed from: a */
    public Sequence<T> mo16796a(int i) {
        int i2 = this.f99370b + i;
        if (i2 < 0) {
            return new Sequences(this, i);
        }
        return new Sequences(this.f99369a, i2);
    }

    @Override // kotlin.sequences.InterfaceC37638c
    @NotNull
    /* renamed from: b */
    public Sequence<T> mo16795b(int i) {
        int i2 = this.f99370b;
        int i3 = i2 + i;
        if (i3 < 0) {
            return new C37667r(this, i);
        }
        return new C37665q(this.f99369a, i2, i3);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C37637a(this);
    }
}

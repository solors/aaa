package kotlin.sequences;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata
/* renamed from: kotlin.sequences.r */
/* loaded from: classes7.dex */
public final class C37667r<T> implements Sequence<T>, InterfaceC37638c<T> {
    @NotNull

    /* renamed from: a */
    private final Sequence<T> f99427a;

    /* renamed from: b */
    private final int f99428b;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.r$a */
    /* loaded from: classes7.dex */
    public static final class C37668a implements Iterator<T>, KMarkers {

        /* renamed from: b */
        private int f99429b;
        @NotNull

        /* renamed from: c */
        private final Iterator<T> f99430c;

        C37668a(C37667r<T> c37667r) {
            this.f99429b = ((C37667r) c37667r).f99428b;
            this.f99430c = ((C37667r) c37667r).f99427a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f99429b > 0 && this.f99430c.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.f99429b;
            if (i != 0) {
                this.f99429b = i - 1;
                return this.f99430c.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37667r(@NotNull Sequence<? extends T> sequence, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f99427a = sequence;
        this.f99428b = i;
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
        Sequence<T> m16839e;
        int i2 = this.f99428b;
        if (i >= i2) {
            m16839e = C37653n.m16839e();
            return m16839e;
        }
        return new C37665q(this.f99427a, i, i2);
    }

    @Override // kotlin.sequences.InterfaceC37638c
    @NotNull
    /* renamed from: b */
    public Sequence<T> mo16795b(int i) {
        if (i >= this.f99428b) {
            return this;
        }
        return new C37667r(this.f99427a, i);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C37668a(this);
    }
}

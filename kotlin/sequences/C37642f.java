package kotlin.sequences;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Sequences.kt */
@Metadata
/* renamed from: kotlin.sequences.f */
/* loaded from: classes7.dex */
public final class C37642f<T, R, E> implements Sequence<E> {
    @NotNull

    /* renamed from: a */
    private final Sequence<T> f99381a;
    @NotNull

    /* renamed from: b */
    private final Function1<T, R> f99382b;
    @NotNull

    /* renamed from: c */
    private final Function1<R, Iterator<E>> f99383c;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.f$a */
    /* loaded from: classes7.dex */
    public static final class C37643a implements Iterator<E>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final Iterator<T> f99384b;
        @Nullable

        /* renamed from: c */
        private Iterator<? extends E> f99385c;

        /* renamed from: d */
        final /* synthetic */ C37642f<T, R, E> f99386d;

        C37643a(C37642f<T, R, E> c37642f) {
            this.f99386d = c37642f;
            this.f99384b = ((C37642f) c37642f).f99381a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            return true;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean m16887a() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f99385c
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f99385c = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f99385c
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.f99384b
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f99384b
                java.lang.Object r0 = r0.next()
                kotlin.sequences.f<T, R, E> r3 = r5.f99386d
                kotlin.jvm.functions.Function1 r3 = kotlin.sequences.C37642f.m16890c(r3)
                kotlin.sequences.f<T, R, E> r4 = r5.f99386d
                kotlin.jvm.functions.Function1 r4 = kotlin.sequences.C37642f.m16888e(r4)
                java.lang.Object r0 = r4.invoke(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f99385c = r0
            L45:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.C37642f.C37643a.m16887a():boolean");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return m16887a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (m16887a()) {
                Iterator<? extends E> it = this.f99385c;
                Intrinsics.m17074g(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37642f(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f99381a = sequence;
        this.f99382b = transformer;
        this.f99383c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<E> iterator() {
        return new C37643a(this);
    }
}

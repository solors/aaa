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
/* renamed from: kotlin.sequences.e */
/* loaded from: classes7.dex */
public final class C37640e<T> implements Sequence<T> {
    @NotNull

    /* renamed from: a */
    private final Sequence<T> f99374a;

    /* renamed from: b */
    private final boolean f99375b;
    @NotNull

    /* renamed from: c */
    private final Function1<T, Boolean> f99376c;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.e$a */
    /* loaded from: classes7.dex */
    public static final class C37641a implements Iterator<T>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final Iterator<T> f99377b;

        /* renamed from: c */
        private int f99378c = -1;
        @Nullable

        /* renamed from: d */
        private T f99379d;

        /* renamed from: f */
        final /* synthetic */ C37640e<T> f99380f;

        C37641a(C37640e<T> c37640e) {
            this.f99380f = c37640e;
            this.f99377b = ((C37640e) c37640e).f99374a.iterator();
        }

        /* renamed from: a */
        private final void m16891a() {
            while (this.f99377b.hasNext()) {
                T next = this.f99377b.next();
                if (((Boolean) ((C37640e) this.f99380f).f99376c.invoke(next)).booleanValue() == ((C37640e) this.f99380f).f99375b) {
                    this.f99379d = next;
                    this.f99378c = 1;
                    return;
                }
            }
            this.f99378c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f99378c == -1) {
                m16891a();
            }
            if (this.f99378c == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f99378c == -1) {
                m16891a();
            }
            if (this.f99378c != 0) {
                T t = this.f99379d;
                this.f99379d = null;
                this.f99378c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37640e(@NotNull Sequence<? extends T> sequence, boolean z, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f99374a = sequence;
        this.f99375b = z;
        this.f99376c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C37641a(this);
    }
}

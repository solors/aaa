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
/* renamed from: kotlin.sequences.s */
/* loaded from: classes7.dex */
public final class C37669s<T> implements Sequence<T> {
    @NotNull

    /* renamed from: a */
    private final Sequence<T> f99431a;
    @NotNull

    /* renamed from: b */
    private final Function1<T, Boolean> f99432b;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.s$a */
    /* loaded from: classes7.dex */
    public static final class C37670a implements Iterator<T>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final Iterator<T> f99433b;

        /* renamed from: c */
        private int f99434c = -1;
        @Nullable

        /* renamed from: d */
        private T f99435d;

        /* renamed from: f */
        final /* synthetic */ C37669s<T> f99436f;

        C37670a(C37669s<T> c37669s) {
            this.f99436f = c37669s;
            this.f99433b = ((C37669s) c37669s).f99431a.iterator();
        }

        /* renamed from: a */
        private final void m16790a() {
            if (this.f99433b.hasNext()) {
                T next = this.f99433b.next();
                if (((Boolean) ((C37669s) this.f99436f).f99432b.invoke(next)).booleanValue()) {
                    this.f99434c = 1;
                    this.f99435d = next;
                    return;
                }
            }
            this.f99434c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f99434c == -1) {
                m16790a();
            }
            if (this.f99434c == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f99434c == -1) {
                m16790a();
            }
            if (this.f99434c != 0) {
                T t = this.f99435d;
                this.f99435d = null;
                this.f99434c = -1;
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
    public C37669s(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f99431a = sequence;
        this.f99432b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C37670a(this);
    }
}

package kotlin.sequences;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
@Metadata
/* renamed from: kotlin.sequences.g */
/* loaded from: classes7.dex */
public final class C37644g<T> implements Sequence<T> {
    @NotNull

    /* renamed from: a */
    private final Functions<T> f99387a;
    @NotNull

    /* renamed from: b */
    private final Function1<T, T> f99388b;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.g$a */
    /* loaded from: classes7.dex */
    public static final class C37645a implements Iterator<T>, KMarkers {
        @Nullable

        /* renamed from: b */
        private T f99389b;

        /* renamed from: c */
        private int f99390c = -2;

        /* renamed from: d */
        final /* synthetic */ C37644g<T> f99391d;

        C37645a(C37644g<T> c37644g) {
            this.f99391d = c37644g;
        }

        /* renamed from: a */
        private final void m16884a() {
            T t;
            int i;
            if (this.f99390c != -2) {
                Function1 function1 = ((C37644g) this.f99391d).f99388b;
                T t2 = this.f99389b;
                Intrinsics.m17074g(t2);
                t = (T) function1.invoke(t2);
            } else {
                t = (T) ((C37644g) this.f99391d).f99387a.invoke();
            }
            this.f99389b = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f99390c = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f99390c < 0) {
                m16884a();
            }
            if (this.f99390c == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @NotNull
        public T next() {
            if (this.f99390c < 0) {
                m16884a();
            }
            if (this.f99390c != 0) {
                T t = this.f99389b;
                Intrinsics.m17073h(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f99390c = -1;
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
    public C37644g(@NotNull Functions<? extends T> getInitialValue, @NotNull Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f99387a = getInitialValue;
        this.f99388b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C37645a(this);
    }
}

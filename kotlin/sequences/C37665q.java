package kotlin.sequences;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata
/* renamed from: kotlin.sequences.q */
/* loaded from: classes7.dex */
public final class C37665q<T> implements Sequence<T>, InterfaceC37638c<T> {
    @NotNull

    /* renamed from: a */
    private final Sequence<T> f99421a;

    /* renamed from: b */
    private final int f99422b;

    /* renamed from: c */
    private final int f99423c;

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.q$a */
    /* loaded from: classes7.dex */
    public static final class C37666a implements Iterator<T>, KMarkers {
        @NotNull

        /* renamed from: b */
        private final Iterator<T> f99424b;

        /* renamed from: c */
        private int f99425c;

        /* renamed from: d */
        final /* synthetic */ C37665q<T> f99426d;

        C37666a(C37665q<T> c37665q) {
            this.f99426d = c37665q;
            this.f99424b = ((C37665q) c37665q).f99421a.iterator();
        }

        /* renamed from: a */
        private final void m16797a() {
            while (this.f99425c < ((C37665q) this.f99426d).f99422b && this.f99424b.hasNext()) {
                this.f99424b.next();
                this.f99425c++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m16797a();
            if (this.f99425c < ((C37665q) this.f99426d).f99423c && this.f99424b.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            m16797a();
            if (this.f99425c < ((C37665q) this.f99426d).f99423c) {
                this.f99425c++;
                return this.f99424b.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37665q(@NotNull Sequence<? extends T> sequence, int i, int i2) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f99421a = sequence;
        this.f99422b = i;
        this.f99423c = i2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 >= i) {
                    return;
                }
                throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
    }

    /* renamed from: f */
    private final int m16798f() {
        return this.f99423c - this.f99422b;
    }

    @Override // kotlin.sequences.InterfaceC37638c
    @NotNull
    /* renamed from: a */
    public Sequence<T> mo16796a(int i) {
        Sequence<T> m16839e;
        if (i >= m16798f()) {
            m16839e = C37653n.m16839e();
            return m16839e;
        }
        return new C37665q(this.f99421a, this.f99422b + i, this.f99423c);
    }

    @Override // kotlin.sequences.InterfaceC37638c
    @NotNull
    /* renamed from: b */
    public Sequence<T> mo16795b(int i) {
        if (i >= m16798f()) {
            return this;
        }
        Sequence<T> sequence = this.f99421a;
        int i2 = this.f99422b;
        return new C37665q(sequence, i2, i + i2);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C37666a(this);
    }
}

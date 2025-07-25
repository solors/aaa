package kotlin.text;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.text.b */
/* loaded from: classes7.dex */
public final class Strings implements Sequence<PrimitiveRanges> {
    @NotNull

    /* renamed from: a */
    private final CharSequence f99457a;

    /* renamed from: b */
    private final int f99458b;

    /* renamed from: c */
    private final int f99459c;
    @NotNull

    /* renamed from: d */
    private final Function2<CharSequence, Integer, Tuples<Integer, Integer>> f99460d;

    /* compiled from: Strings.kt */
    @Metadata
    /* renamed from: kotlin.text.b$a */
    /* loaded from: classes7.dex */
    public static final class C37678a implements Iterator<PrimitiveRanges>, KMarkers {

        /* renamed from: b */
        private int f99461b = -1;

        /* renamed from: c */
        private int f99462c;

        /* renamed from: d */
        private int f99463d;
        @Nullable

        /* renamed from: f */
        private PrimitiveRanges f99464f;

        /* renamed from: g */
        private int f99465g;

        C37678a() {
            int m16908n;
            m16908n = _Ranges.m16908n(Strings.this.f99458b, 0, Strings.this.f99457a.length());
            this.f99462c = m16908n;
            this.f99463d = m16908n;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f99466h.f99459c) goto L13;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m16752a() {
            /*
                r6 = this;
                int r0 = r6.f99463d
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f99461b = r1
                r0 = 0
                r6.f99464f = r0
                goto L9e
            Lc:
                kotlin.text.b r0 = kotlin.text.Strings.this
                int r0 = kotlin.text.Strings.m16754e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f99465g
                int r0 = r0 + r3
                r6.f99465g = r0
                kotlin.text.b r4 = kotlin.text.Strings.this
                int r4 = kotlin.text.Strings.m16754e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f99463d
                kotlin.text.b r4 = kotlin.text.Strings.this
                java.lang.CharSequence r4 = kotlin.text.Strings.m16755d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.f99462c
                kotlin.text.b r4 = kotlin.text.Strings.this
                java.lang.CharSequence r4 = kotlin.text.Strings.m16755d(r4)
                int r4 = kotlin.text.C37686h.m16699Y(r4)
                r0.<init>(r1, r4)
                r6.f99464f = r0
                r6.f99463d = r2
                goto L9c
            L47:
                kotlin.text.b r0 = kotlin.text.Strings.this
                kotlin.jvm.functions.Function2 r0 = kotlin.text.Strings.m16756c(r0)
                kotlin.text.b r4 = kotlin.text.Strings.this
                java.lang.CharSequence r4 = kotlin.text.Strings.m16755d(r4)
                int r5 = r6.f99463d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo105910invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Tuples) r0
                if (r0 != 0) goto L77
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.f99462c
                kotlin.text.b r4 = kotlin.text.Strings.this
                java.lang.CharSequence r4 = kotlin.text.Strings.m16755d(r4)
                int r4 = kotlin.text.C37686h.m16699Y(r4)
                r0.<init>(r1, r4)
                r6.f99464f = r0
                r6.f99463d = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m17632a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m17631b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f99462c
                kotlin.ranges.IntRange r4 = kotlin.ranges.C37635g.m16922v(r4, r2)
                r6.f99464f = r4
                int r2 = r2 + r0
                r6.f99462c = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f99463d = r2
            L9c:
                r6.f99461b = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Strings.C37678a.m16752a():void");
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: b */
        public PrimitiveRanges next() {
            if (this.f99461b == -1) {
                m16752a();
            }
            if (this.f99461b != 0) {
                PrimitiveRanges primitiveRanges = this.f99464f;
                Intrinsics.m17073h(primitiveRanges, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f99464f = null;
                this.f99461b = -1;
                return primitiveRanges;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f99461b == -1) {
                m16752a();
            }
            if (this.f99461b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Strings(@NotNull CharSequence input, int i, int i2, @NotNull Function2<? super CharSequence, ? super Integer, Tuples<Integer, Integer>> getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f99457a = input;
        this.f99458b = i;
        this.f99459c = i2;
        this.f99460d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<PrimitiveRanges> iterator() {
        return new C37678a();
    }
}

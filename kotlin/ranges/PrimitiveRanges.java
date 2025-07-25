package kotlin.ranges;

import de.InterfaceC32867c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.ranges.IntRange */
/* loaded from: classes7.dex */
public final class PrimitiveRanges extends C37629d implements InterfaceC32867c<Integer> {
    @NotNull

    /* renamed from: g */
    public static final C37624a f99347g = new C37624a(null);
    @NotNull

    /* renamed from: h */
    private static final PrimitiveRanges f99348h = new PrimitiveRanges(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata
    /* renamed from: kotlin.ranges.IntRange$a */
    /* loaded from: classes7.dex */
    public static final class C37624a {
        private C37624a() {
        }

        public /* synthetic */ C37624a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final PrimitiveRanges m16965a() {
            return PrimitiveRanges.f99348h;
        }
    }

    public PrimitiveRanges(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // kotlin.ranges.C37629d
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof PrimitiveRanges) {
            if (!isEmpty() || !((PrimitiveRanges) obj).isEmpty()) {
                PrimitiveRanges primitiveRanges = (PrimitiveRanges) obj;
                if (m16953c() != primitiveRanges.m16953c() || m16952d() != primitiveRanges.m16952d()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.C37629d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m16953c() * 31) + m16952d();
    }

    /* renamed from: i */
    public boolean m16968i(int i) {
        if (m16953c() <= i && i <= m16952d()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.C37629d, de.InterfaceC32867c
    public boolean isEmpty() {
        if (m16953c() > m16952d()) {
            return true;
        }
        return false;
    }

    @Override // de.InterfaceC32867c
    @NotNull
    /* renamed from: j */
    public Integer getEndInclusive() {
        return Integer.valueOf(m16952d());
    }

    @Override // de.InterfaceC32867c
    @NotNull
    /* renamed from: l */
    public Integer getStart() {
        return Integer.valueOf(m16953c());
    }

    @Override // kotlin.ranges.C37629d
    @NotNull
    public String toString() {
        return m16953c() + ".." + m16952d();
    }
}

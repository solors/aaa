package kotlin.ranges;

import de.InterfaceC32867c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrimitiveRanges.kt */
@Metadata
/* renamed from: kotlin.ranges.f */
/* loaded from: classes7.dex */
public final class C37633f extends C37631e implements InterfaceC32867c<Long> {
    @NotNull

    /* renamed from: g */
    public static final C37634a f99365g = new C37634a(null);
    @NotNull

    /* renamed from: h */
    private static final C37633f f99366h = new C37633f(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata
    /* renamed from: kotlin.ranges.f$a */
    /* loaded from: classes7.dex */
    public static final class C37634a {
        private C37634a() {
        }

        public /* synthetic */ C37634a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37633f(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C37633f) {
            if (!isEmpty() || !((C37633f) obj).isEmpty()) {
                C37633f c37633f = (C37633f) obj;
                if (m16948c() != c37633f.m16948c() || m16947d() != c37633f.m16947d()) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m16945g(long j) {
        if (m16948c() <= j && j <= m16947d()) {
            return true;
        }
        return false;
    }

    @Override // de.InterfaceC32867c
    @NotNull
    /* renamed from: h */
    public Long getEndInclusive() {
        return Long.valueOf(m16947d());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (m16948c() ^ (m16948c() >>> 32))) + (m16947d() ^ (m16947d() >>> 32)));
    }

    @Override // de.InterfaceC32867c
    @NotNull
    /* renamed from: i */
    public Long getStart() {
        return Long.valueOf(m16948c());
    }

    @Override // de.InterfaceC32867c
    public boolean isEmpty() {
        if (m16948c() > m16947d()) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return m16948c() + ".." + m16947d();
    }
}

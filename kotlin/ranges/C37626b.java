package kotlin.ranges;

import de.InterfaceC32867c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrimitiveRanges.kt */
@Metadata
/* renamed from: kotlin.ranges.b */
/* loaded from: classes7.dex */
public final class C37626b extends Progressions implements InterfaceC32867c<Character> {
    @NotNull

    /* renamed from: g */
    public static final C37627a f99353g = new C37627a(null);
    @NotNull

    /* renamed from: h */
    private static final C37626b f99354h = new C37626b(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata
    /* renamed from: kotlin.ranges.b$a */
    /* loaded from: classes7.dex */
    public static final class C37627a {
        private C37627a() {
        }

        public /* synthetic */ C37627a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37626b(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C37626b) {
            if (!isEmpty() || !((C37626b) obj).isEmpty()) {
                C37626b c37626b = (C37626b) obj;
                if (m16964c() != c37626b.m16964c() || m16963d() != c37626b.m16963d()) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m16961g(char c) {
        if (Intrinsics.m17071j(m16964c(), c) <= 0 && Intrinsics.m17071j(c, m16963d()) <= 0) {
            return true;
        }
        return false;
    }

    @Override // de.InterfaceC32867c
    @NotNull
    /* renamed from: h */
    public Character getEndInclusive() {
        return Character.valueOf(m16963d());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m16964c() * 31) + m16963d();
    }

    @Override // de.InterfaceC32867c
    @NotNull
    /* renamed from: i */
    public Character getStart() {
        return Character.valueOf(m16964c());
    }

    @Override // de.InterfaceC32867c
    public boolean isEmpty() {
        if (Intrinsics.m17071j(m16964c(), m16963d()) > 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return m16964c() + ".." + m16963d();
    }
}

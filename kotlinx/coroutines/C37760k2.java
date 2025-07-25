package kotlinx.coroutines;

import ie.Symbol;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata
/* renamed from: kotlinx.coroutines.k2 */
/* loaded from: classes7.dex */
public final class C37760k2 {
    @NotNull

    /* renamed from: a */
    private static final Symbol f99597a = new Symbol("COMPLETING_ALREADY");
    @NotNull

    /* renamed from: b */
    public static final Symbol f99598b = new Symbol("COMPLETING_WAITING_CHILDREN");
    @NotNull

    /* renamed from: c */
    private static final Symbol f99599c = new Symbol("COMPLETING_RETRY");
    @NotNull

    /* renamed from: d */
    private static final Symbol f99600d = new Symbol("TOO_LATE_TO_CANCEL");
    @NotNull

    /* renamed from: e */
    private static final Symbol f99601e = new Symbol("SEALED");
    @NotNull

    /* renamed from: f */
    private static final C37744j1 f99602f = new C37744j1(false);
    @NotNull

    /* renamed from: g */
    private static final C37744j1 f99603g = new C37744j1(true);

    @Nullable
    /* renamed from: g */
    public static final Object m16202g(@Nullable Object obj) {
        if (obj instanceof InterfaceC37808v1) {
            return new C37812w1((InterfaceC37808v1) obj);
        }
        return obj;
    }

    @Nullable
    /* renamed from: h */
    public static final Object m16201h(@Nullable Object obj) {
        C37812w1 c37812w1;
        InterfaceC37808v1 interfaceC37808v1;
        if (obj instanceof C37812w1) {
            c37812w1 = (C37812w1) obj;
        } else {
            c37812w1 = null;
        }
        if (c37812w1 != null && (interfaceC37808v1 = c37812w1.f99653a) != null) {
            return interfaceC37808v1;
        }
        return obj;
    }
}

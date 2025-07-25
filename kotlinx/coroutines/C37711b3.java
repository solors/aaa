package kotlinx.coroutines;

import ie.Symbol;
import ie.ThreadLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventLoop.common.kt */
@Metadata
/* renamed from: kotlinx.coroutines.b3 */
/* loaded from: classes7.dex */
public final class C37711b3 {
    @NotNull

    /* renamed from: a */
    public static final C37711b3 f99517a = new C37711b3();
    @NotNull

    /* renamed from: b */
    private static final ThreadLocal<AbstractC37759k1> f99518b = ThreadLocal.m22932a(new Symbol("ThreadLocalEventLoop"));

    private C37711b3() {
    }

    @Nullable
    /* renamed from: a */
    public final AbstractC37759k1 m16404a() {
        return f99518b.get();
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC37759k1 m16403b() {
        ThreadLocal<AbstractC37759k1> threadLocal = f99518b;
        AbstractC37759k1 abstractC37759k1 = threadLocal.get();
        if (abstractC37759k1 == null) {
            AbstractC37759k1 m16171a = C37779n1.m16171a();
            threadLocal.set(m16171a);
            return m16171a;
        }
        return abstractC37759k1;
    }

    /* renamed from: c */
    public final void m16402c() {
        f99518b.set(null);
    }

    /* renamed from: d */
    public final void m16401d(@NotNull AbstractC37759k1 abstractC37759k1) {
        f99518b.set(abstractC37759k1);
    }
}

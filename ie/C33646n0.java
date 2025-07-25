package ie;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadContext.kt */
@Metadata
/* renamed from: ie.n0 */
/* loaded from: classes8.dex */
public final class C33646n0 implements CoroutineContext.InterfaceC37576b<C33645m0<?>> {
    @NotNull

    /* renamed from: b */
    private final ThreadLocal<?> f92117b;

    public C33646n0(@NotNull ThreadLocal<?> threadLocal) {
        this.f92117b = threadLocal;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C33646n0) && Intrinsics.m17075f(this.f92117b, ((C33646n0) obj).f92117b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f92117b.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f92117b + ')';
    }
}

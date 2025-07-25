package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.ranges._Ranges;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: Delay.kt */
@Metadata
/* renamed from: kotlinx.coroutines.y0 */
/* loaded from: classes7.dex */
public final class C37819y0 {
    @Nullable
    /* renamed from: a */
    public static final Object m16068a(long j, @NotNull Continuation<? super Unit> continuation) {
        Continuation m6961c;
        Object m6959e;
        Object m6959e2;
        if (j > 0) {
            m6961c = IntrinsicsJvm.m6961c(continuation);
            C37784p c37784p = new C37784p(m6961c, 1);
            c37784p.m16132y();
            if (j < Long.MAX_VALUE) {
                m16067b(c37784p.getContext()).scheduleResumeAfterDelay(j, c37784p);
            }
            Object m16135u = c37784p.m16135u();
            m6959e = C42688d.m6959e();
            if (m16135u == m6959e) {
                C37591h.m17084c(continuation);
            }
            m6959e2 = C42688d.m6959e();
            if (m16135u == m6959e2) {
                return m16135u;
            }
            return Unit.f99208a;
        }
        return Unit.f99208a;
    }

    @NotNull
    /* renamed from: b */
    public static final InterfaceC37814x0 m16067b(@NotNull CoroutineContext coroutineContext) {
        InterfaceC37814x0 interfaceC37814x0;
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.f99287Z7);
        if (element instanceof InterfaceC37814x0) {
            interfaceC37814x0 = (InterfaceC37814x0) element;
        } else {
            interfaceC37814x0 = null;
        }
        if (interfaceC37814x0 == null) {
            return C37804u0.m16088a();
        }
        return interfaceC37814x0;
    }

    /* renamed from: c */
    public static final long m16066c(long j) {
        long m16916f;
        if (Duration.m16492i(j, Duration.f99494c.m16472c()) > 0) {
            m16916f = _Ranges.m16916f(Duration.m16484q(j), 1L);
            return m16916f;
        }
        return 0L;
    }
}

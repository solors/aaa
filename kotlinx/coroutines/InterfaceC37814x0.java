package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C37591h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: Delay.kt */
@Metadata
/* renamed from: kotlinx.coroutines.x0 */
/* loaded from: classes7.dex */
public interface InterfaceC37814x0 {

    /* compiled from: Delay.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.x0$a */
    /* loaded from: classes7.dex */
    public static final class C37815a {
        @Nullable
        /* renamed from: a */
        public static Object m16081a(@NotNull InterfaceC37814x0 interfaceC37814x0, long j, @NotNull Continuation<? super Unit> continuation) {
            Continuation m6961c;
            Object m6959e;
            Object m6959e2;
            if (j > 0) {
                m6961c = IntrinsicsJvm.m6961c(continuation);
                C37784p c37784p = new C37784p(m6961c, 1);
                c37784p.m16132y();
                interfaceC37814x0.scheduleResumeAfterDelay(j, c37784p);
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
        public static InterfaceC37731g1 m16080b(@NotNull InterfaceC37814x0 interfaceC37814x0, long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return C37804u0.m16088a().invokeOnTimeout(j, runnable, coroutineContext);
        }
    }

    @NotNull
    InterfaceC37731g1 invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext);

    void scheduleResumeAfterDelay(long j, @NotNull InterfaceC37780o<? super Unit> interfaceC37780o);
}

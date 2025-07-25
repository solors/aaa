package kotlinx.coroutines;

import ie.DispatchedContinuation;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: kotlinx.coroutines.s0 */
/* loaded from: classes7.dex */
public final class DebugStrings {
    @NotNull
    /* renamed from: a */
    public static final String m16104a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    /* renamed from: b */
    public static final String m16103b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    /* renamed from: c */
    public static final String m16102c(@NotNull Continuation<?> continuation) {
        String m14549b;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(continuation + '@' + m16103b(continuation));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14546e(m14549b) != null) {
            m14549b = continuation.getClass().getName() + '@' + m16103b(continuation);
        }
        return (String) m14549b;
    }
}

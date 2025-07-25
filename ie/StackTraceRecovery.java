package ie;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import p000a.CoroutineDebugging;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: ie.g0 */
/* loaded from: classes8.dex */
public final class StackTraceRecovery {
    @NotNull

    /* renamed from: a */
    private static final StackTraceElement f92092a = new CoroutineDebugging().m105908a();

    /* renamed from: b */
    private static final String f92093b;

    /* renamed from: c */
    private static final String f92094c;

    static {
        Object m14549b;
        Object m14549b2;
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(ContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14546e(m14549b) != null) {
            m14549b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f92093b = (String) m14549b;
        try {
            m14549b2 = Result.m14549b(StackTraceRecovery.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.C38506a c38506a3 = Result.f101870c;
            m14549b2 = Result.m14549b(C38508r.m14540a(th2));
        }
        if (Result.m14546e(m14549b2) != null) {
            m14549b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f92094c = (String) m14549b2;
    }

    @NotNull
    /* renamed from: a */
    public static final <E extends Throwable> E m22982a(@NotNull E e) {
        return e;
    }
}

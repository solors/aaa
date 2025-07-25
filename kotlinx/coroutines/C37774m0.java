package kotlinx.coroutines;

import ie.C33636h;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p804nd.C38497f;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata
/* renamed from: kotlinx.coroutines.m0 */
/* loaded from: classes7.dex */
public final class C37774m0 {
    /* renamed from: a */
    public static final void m16176a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        try {
            InterfaceC37764l0 interfaceC37764l0 = (InterfaceC37764l0) coroutineContext.get(InterfaceC37764l0.f99607a8);
            if (interfaceC37764l0 != null) {
                interfaceC37764l0.handleException(coroutineContext, th);
            } else {
                C33636h.m22981a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            C33636h.m22981a(coroutineContext, m16175b(th, th2));
        }
    }

    @NotNull
    /* renamed from: b */
    public static final Throwable m16175b(@NotNull Throwable th, @NotNull Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C38497f.m14566a(runtimeException, th);
        return runtimeException;
    }
}

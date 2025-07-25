package ie;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C37774m0;
import kotlinx.coroutines.InterfaceC37764l0;
import org.jetbrains.annotations.NotNull;
import p804nd.C38497f;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
@Metadata
/* renamed from: ie.h */
/* loaded from: classes8.dex */
public final class C33636h {
    /* renamed from: a */
    public static final void m22981a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        for (InterfaceC37764l0 interfaceC37764l0 : CoroutineExceptionHandlerImpl.m22984a()) {
            try {
                interfaceC37764l0.handleException(coroutineContext, th);
            } catch (Throwable th2) {
                CoroutineExceptionHandlerImpl.m22983b(C37774m0.m16175b(th, th2));
            }
        }
        try {
            C38497f.m14566a(th, new C33637i(coroutineContext));
        } catch (Throwable unused) {
        }
        CoroutineExceptionHandlerImpl.m22983b(th);
    }
}

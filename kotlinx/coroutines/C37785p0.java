package kotlinx.coroutines;

import ie.C33634f;
import ie.Scopes;
import java.util.concurrent.CancellationException;
import je.Undispatched;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: CoroutineScope.kt */
@Metadata
/* renamed from: kotlinx.coroutines.p0 */
/* loaded from: classes7.dex */
public final class C37785p0 {
    @NotNull
    /* renamed from: a */
    public static final CoroutineScope m16131a(@NotNull CoroutineContext coroutineContext) {
        CompletableJob m16339b;
        if (coroutineContext.get(InterfaceC37708b2.f99515b8) == null) {
            m16339b = C37733h2.m16339b(null, 1, null);
            coroutineContext = coroutineContext.plus(m16339b);
        }
        return new C33634f(coroutineContext);
    }

    @NotNull
    /* renamed from: b */
    public static final CoroutineScope m16130b() {
        return new C33634f(C37821y2.m16064b(null, 1, null).plus(Dispatchers.m16376c()));
    }

    /* renamed from: c */
    public static final void m16129c(@NotNull CoroutineScope coroutineScope, @NotNull String str, @Nullable Throwable th) {
        m16128d(coroutineScope, C37786p1.m16121a(str, th));
    }

    /* renamed from: d */
    public static final void m16128d(@NotNull CoroutineScope coroutineScope, @Nullable CancellationException cancellationException) {
        InterfaceC37708b2 interfaceC37708b2 = (InterfaceC37708b2) coroutineScope.getCoroutineContext().get(InterfaceC37708b2.f99515b8);
        if (interfaceC37708b2 != null) {
            interfaceC37708b2.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m16127e(CoroutineScope coroutineScope, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m16129c(coroutineScope, str, th);
    }

    /* renamed from: f */
    public static /* synthetic */ void m16126f(CoroutineScope coroutineScope, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m16128d(coroutineScope, cancellationException);
    }

    @Nullable
    /* renamed from: g */
    public static final <R> Object m16125g(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        Object m6959e;
        Scopes scopes = new Scopes(continuation.getContext(), continuation);
        Object m18365b = Undispatched.m18365b(scopes, scopes, function2);
        m6959e = C42688d.m6959e();
        if (m18365b == m6959e) {
            C37591h.m17084c(continuation);
        }
        return m18365b;
    }

    /* renamed from: h */
    public static final void m16124h(@NotNull CoroutineScope coroutineScope) {
        C37726f2.m16358l(coroutineScope.getCoroutineContext());
    }

    /* renamed from: i */
    public static final boolean m16123i(@NotNull CoroutineScope coroutineScope) {
        InterfaceC37708b2 interfaceC37708b2 = (InterfaceC37708b2) coroutineScope.getCoroutineContext().get(InterfaceC37708b2.f99515b8);
        if (interfaceC37708b2 != null) {
            return interfaceC37708b2.isActive();
        }
        return true;
    }

    @NotNull
    /* renamed from: j */
    public static final CoroutineScope m16122j(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext) {
        return new C33634f(coroutineScope.getCoroutineContext().plus(coroutineContext));
    }
}

package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.f2 */
/* loaded from: classes7.dex */
public final class C37726f2 {
    @NotNull
    /* renamed from: a */
    public static final CompletableJob m16369a(@Nullable InterfaceC37708b2 interfaceC37708b2) {
        return C37733h2.m16340a(interfaceC37708b2);
    }

    /* renamed from: b */
    public static /* synthetic */ CompletableJob m16368b(InterfaceC37708b2 interfaceC37708b2, int i, Object obj) {
        return C37733h2.m16339b(interfaceC37708b2, i, obj);
    }

    /* renamed from: c */
    public static final void m16367c(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        C37733h2.m16338c(coroutineContext, cancellationException);
    }

    /* renamed from: d */
    public static final void m16366d(@NotNull InterfaceC37708b2 interfaceC37708b2, @NotNull String str, @Nullable Throwable th) {
        C37733h2.m16337d(interfaceC37708b2, str, th);
    }

    @Nullable
    /* renamed from: g */
    public static final Object m16363g(@NotNull InterfaceC37708b2 interfaceC37708b2, @NotNull Continuation<? super Unit> continuation) {
        return C37733h2.m16334g(interfaceC37708b2, continuation);
    }

    /* renamed from: h */
    public static final void m16362h(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        C37733h2.m16333h(coroutineContext, cancellationException);
    }

    /* renamed from: j */
    public static final void m16360j(@NotNull InterfaceC37780o<?> interfaceC37780o, @NotNull Future<?> future) {
        Future.m16343a(interfaceC37780o, future);
    }

    @NotNull
    /* renamed from: k */
    public static final InterfaceC37731g1 m16359k(@NotNull InterfaceC37708b2 interfaceC37708b2, @NotNull InterfaceC37731g1 interfaceC37731g1) {
        return C37733h2.m16331j(interfaceC37708b2, interfaceC37731g1);
    }

    /* renamed from: l */
    public static final void m16358l(@NotNull CoroutineContext coroutineContext) {
        C37733h2.m16330k(coroutineContext);
    }

    /* renamed from: m */
    public static final void m16357m(@NotNull InterfaceC37708b2 interfaceC37708b2) {
        C37733h2.m16329l(interfaceC37708b2);
    }

    @NotNull
    /* renamed from: n */
    public static final InterfaceC37708b2 m16356n(@NotNull CoroutineContext coroutineContext) {
        return C37733h2.m16328m(coroutineContext);
    }

    /* renamed from: o */
    public static final boolean m16355o(@NotNull CoroutineContext coroutineContext) {
        return C37733h2.m16327n(coroutineContext);
    }
}

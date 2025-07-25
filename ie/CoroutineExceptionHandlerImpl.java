package ie;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import kotlinx.coroutines.InterfaceC37764l0;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ie.g */
/* loaded from: classes8.dex */
public final class CoroutineExceptionHandlerImpl {
    @NotNull

    /* renamed from: a */
    private static final Collection<InterfaceC37764l0> f92091a;

    static {
        Sequence m16841c;
        List m16822J;
        m16841c = C37653n.m16841c(ServiceLoader.load(InterfaceC37764l0.class, InterfaceC37764l0.class.getClassLoader()).iterator());
        m16822J = _Sequences.m16822J(m16841c);
        f92091a = m16822J;
    }

    @NotNull
    /* renamed from: a */
    public static final Collection<InterfaceC37764l0> m22984a() {
        return f92091a;
    }

    /* renamed from: b */
    public static final void m22983b(@NotNull Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}

package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C37734i;
import kotlinx.coroutines.C37784p;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: ActualAndroid.android.kt */
@Metadata
/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    @NotNull
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) C37734i.m16319e(Dispatchers.m16376c().getImmediate(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, interfaceC37576b);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, interfaceC37576b);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull final Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        Continuation m6961c;
        Object m6959e;
        m6961c = IntrinsicsJvm.m6961c(continuation);
        final C37784p c37784p = new C37784p(m6961c, 1);
        c37784p.m16132y();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object m14549b;
                Continuation continuation2 = c37784p;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                Function1<Long, R> function12 = function1;
                try {
                    Result.C38506a c38506a = Result.f101870c;
                    m14549b = Result.m14549b(function12.invoke(Long.valueOf(j)));
                } catch (Throwable th) {
                    Result.C38506a c38506a2 = Result.f101870c;
                    m14549b = Result.m14549b(C38508r.m14540a(th));
                }
                continuation2.resumeWith(m14549b);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        c37784p.mo15160z(new DefaultChoreographerFrameClock$withFrameNanos$2$1(frameCallback));
        Object m16135u = c37784p.m16135u();
        m6959e = C42688d.m6959e();
        if (m16135u == m6959e) {
            C37591h.m17084c(continuation);
        }
        return m16135u;
    }
}

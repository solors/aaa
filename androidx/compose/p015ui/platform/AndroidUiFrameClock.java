package androidx.compose.p015ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37784p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: AndroidUiFrameClock.android.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock */
/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    @NotNull
    private final Choreographer choreographer;

    public AndroidUiFrameClock(@NotNull Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.choreographer = choreographer;
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

    @NotNull
    public final Choreographer getChoreographer() {
        return this.choreographer;
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
        AndroidUiDispatcher androidUiDispatcher;
        Continuation m6961c;
        Object m6959e;
        CoroutineContext.Element element = continuation.getContext().get(ContinuationInterceptor.f99287Z7);
        if (element instanceof AndroidUiDispatcher) {
            androidUiDispatcher = (AndroidUiDispatcher) element;
        } else {
            androidUiDispatcher = null;
        }
        m6961c = IntrinsicsJvm.m6961c(continuation);
        final C37784p c37784p = new C37784p(m6961c, 1);
        c37784p.m16132y();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object m14549b;
                Continuation continuation2 = c37784p;
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
        if (androidUiDispatcher != null && Intrinsics.m17075f(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            c37784p.mo15160z(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        } else {
            getChoreographer().postFrameCallback(frameCallback);
            c37784p.mo15160z(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        }
        Object m16135u = c37784p.m16135u();
        m6959e = C42688d.m6959e();
        if (m16135u == m6959e) {
            C37591h.m17084c(continuation);
        }
        return m16135u;
    }
}

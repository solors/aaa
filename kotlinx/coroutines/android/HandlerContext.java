package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import kotlinx.coroutines.C37726f2;
import kotlinx.coroutines.C37792q2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterfaceC37731g1;
import kotlinx.coroutines.InterfaceC37780o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandlerDispatcher.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HandlerContext extends HandlerDispatcher {
    @Nullable
    private volatile HandlerContext _immediate;
    @NotNull
    private final Handler handler;
    @NotNull
    private final HandlerContext immediate;
    private final boolean invokeImmediately;
    @Nullable
    private final String name;

    private HandlerContext(Handler handler, String str, boolean z) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z;
        this._immediate = z ? this : null;
        HandlerContext handlerContext = this._immediate;
        if (handlerContext == null) {
            handlerContext = new HandlerContext(handler, str, true);
            this._immediate = handlerContext;
        }
        this.immediate = handlerContext;
    }

    private final void cancelOnRejection(CoroutineContext coroutineContext, Runnable runnable) {
        C37726f2.m16367c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.m16377b().dispatch(coroutineContext, runnable);
    }

    public static final void invokeOnTimeout$lambda$3(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (!this.handler.post(runnable)) {
            cancelOnRejection(coroutineContext, runnable);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof HandlerContext) && ((HandlerContext) obj).handler == this.handler) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.InterfaceC37814x0
    @NotNull
    public InterfaceC37731g1 invokeOnTimeout(long j, @NotNull final Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        long m16911k;
        Handler handler = this.handler;
        m16911k = _Ranges.m16911k(j, 4611686018427387903L);
        if (handler.postDelayed(runnable, m16911k)) {
            return new InterfaceC37731g1() { // from class: kotlinx.coroutines.android.a
                {
                    HandlerContext.this = this;
                }

                @Override // kotlinx.coroutines.InterfaceC37731g1
                public final void dispose() {
                    HandlerContext.invokeOnTimeout$lambda$3(HandlerContext.this, runnable);
                }
            };
        }
        cancelOnRejection(coroutineContext, runnable);
        return C37792q2.f99638b;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        if (this.invokeImmediately && Intrinsics.m17075f(Looper.myLooper(), this.handler.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.InterfaceC37814x0
    public void scheduleResumeAfterDelay(long j, @NotNull final InterfaceC37780o<? super Unit> interfaceC37780o) {
        long m16911k;
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC37780o.mo15169D(this, Unit.f99208a);
            }
        };
        Handler handler = this.handler;
        m16911k = _Ranges.m16911k(j, 4611686018427387903L);
        if (handler.postDelayed(runnable, m16911k)) {
            interfaceC37780o.mo15160z(new HandlerContext$scheduleResumeAfterDelay$1(this, runnable));
        } else {
            cancelOnRejection(interfaceC37780o.getContext(), runnable);
        }
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl == null) {
            String str = this.name;
            if (str == null) {
                str = this.handler.toString();
            }
            if (this.invokeImmediately) {
                return str + ".immediate";
            }
            return str;
        }
        return stringInternalImpl;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    @NotNull
    public HandlerContext getImmediate() {
        return this.immediate;
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public HandlerContext(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}

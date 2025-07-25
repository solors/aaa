package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37734i;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterfaceC37731g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: CoroutineLiveData.kt */
@Metadata
/* loaded from: classes.dex */
public final class EmittedSource implements InterfaceC37731g1 {
    private boolean disposed;
    @NotNull
    private final MediatorLiveData<?> mediator;
    @NotNull
    private final LiveData<?> source;

    public EmittedSource(@NotNull LiveData<?> source, @NotNull MediatorLiveData<?> mediator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (!this.disposed) {
            this.mediator.removeSource(this.source);
            this.disposed = true;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC37731g1
    public void dispose() {
        C37756k.m16221d(C37785p0.m16131a(Dispatchers.m16376c().getImmediate()), null, null, new EmittedSource$dispose$1(this, null), 3, null);
    }

    @Nullable
    public final Object disposeNow(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m16317g = C37734i.m16317g(Dispatchers.m16376c().getImmediate(), new EmittedSource$disposeNow$2(this, null), continuation);
        m6959e = C42688d.m6959e();
        if (m16317g == m6959e) {
            return m16317g;
        }
        return Unit.f99208a;
    }
}

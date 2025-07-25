package ke;

import ie.C33648p;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@Metadata
/* renamed from: ke.m */
/* loaded from: classes8.dex */
final class C37513m extends CoroutineDispatcher {
    @NotNull

    /* renamed from: b */
    public static final C37513m f99171b = new C37513m();

    private C37513m() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        C37504c.f99152i.m17680u(runnable, C37512l.f99170h, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        C37504c.f99152i.m17680u(runnable, C37512l.f99170h, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int i) {
        C33648p.m22931a(i);
        if (i >= C37512l.f99166d) {
            return this;
        }
        return super.limitedParallelism(i);
    }
}

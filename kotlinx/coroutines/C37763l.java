package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Future.kt */
@Metadata
/* renamed from: kotlinx.coroutines.l */
/* loaded from: classes7.dex */
final class C37763l extends AbstractC37773m {
    @NotNull

    /* renamed from: b */
    private final Future<?> f99606b;

    public C37763l(@NotNull Future<?> future) {
        this.f99606b = future;
    }

    @Override // kotlinx.coroutines.AbstractC37777n
    /* renamed from: g */
    public void mo15522g(@Nullable Throwable th) {
        if (th != null) {
            this.f99606b.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo15522g(th);
        return Unit.f99208a;
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.f99606b + ']';
    }
}

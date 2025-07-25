package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Executors.kt */
@Metadata
/* renamed from: kotlinx.coroutines.f1 */
/* loaded from: classes7.dex */
final class C37725f1 implements InterfaceC37731g1 {
    @NotNull

    /* renamed from: b */
    private final Future<?> f99548b;

    public C37725f1(@NotNull Future<?> future) {
        this.f99548b = future;
    }

    @Override // kotlinx.coroutines.InterfaceC37731g1
    public void dispose() {
        this.f99548b.cancel(false);
    }

    @NotNull
    public String toString() {
        return "DisposableFutureHandle[" + this.f99548b + ']';
    }
}

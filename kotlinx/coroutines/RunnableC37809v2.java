package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: Executors.kt */
@Metadata
/* renamed from: kotlinx.coroutines.v2 */
/* loaded from: classes7.dex */
final class RunnableC37809v2 implements Runnable {
    @NotNull

    /* renamed from: b */
    private final CoroutineDispatcher f99651b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC37780o<Unit> f99652c;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC37809v2(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC37780o<? super Unit> interfaceC37780o) {
        this.f99651b = coroutineDispatcher;
        this.f99652c = interfaceC37780o;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99652c.mo15169D(this.f99651b, Unit.f99208a);
    }
}

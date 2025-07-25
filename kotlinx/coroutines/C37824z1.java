package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata
/* renamed from: kotlinx.coroutines.z1 */
/* loaded from: classes7.dex */
final class C37824z1 extends AbstractC37717d2 {
    @NotNull

    /* renamed from: h */
    private static final AtomicIntegerFieldUpdater f99658h = AtomicIntegerFieldUpdater.newUpdater(C37824z1.class, "_invoked");
    private volatile int _invoked;
    @NotNull

    /* renamed from: g */
    private final Function1<Throwable, Unit> f99659g;

    /* JADX WARN: Multi-variable type inference failed */
    public C37824z1(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f99659g = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo16059q(th);
        return Unit.f99208a;
    }

    @Override // kotlinx.coroutines.CompletionHandler
    /* renamed from: q */
    public void mo16059q(@Nullable Throwable th) {
        if (f99658h.compareAndSet(this, 0, 1)) {
            this.f99659g.invoke(th);
        }
    }
}

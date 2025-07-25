package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.h1 */
/* loaded from: classes7.dex */
final class CancellableContinuation extends AbstractC37773m {
    @NotNull

    /* renamed from: b */
    private final InterfaceC37731g1 f99558b;

    public CancellableContinuation(@NotNull InterfaceC37731g1 interfaceC37731g1) {
        this.f99558b = interfaceC37731g1;
    }

    @Override // kotlinx.coroutines.AbstractC37777n
    /* renamed from: g */
    public void mo15522g(@Nullable Throwable th) {
        this.f99558b.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo15522g(th);
        return Unit.f99208a;
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.f99558b + ']';
    }
}

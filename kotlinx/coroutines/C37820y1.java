package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata
/* renamed from: kotlinx.coroutines.y1 */
/* loaded from: classes7.dex */
final class C37820y1 extends AbstractC37773m {
    @NotNull

    /* renamed from: b */
    private final Function1<Throwable, Unit> f99657b;

    /* JADX WARN: Multi-variable type inference failed */
    public C37820y1(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f99657b = function1;
    }

    @Override // kotlinx.coroutines.AbstractC37777n
    /* renamed from: g */
    public void mo15522g(@Nullable Throwable th) {
        this.f99657b.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo15522g(th);
        return Unit.f99208a;
    }

    @NotNull
    public String toString() {
        return "InvokeOnCancel[" + DebugStrings.m16104a(this.f99657b) + '@' + DebugStrings.m16103b(this) + ']';
    }
}

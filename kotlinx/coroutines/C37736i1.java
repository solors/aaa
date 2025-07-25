package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata
/* renamed from: kotlinx.coroutines.i1 */
/* loaded from: classes7.dex */
public final class C37736i1 extends AbstractC37737i2 {
    @NotNull

    /* renamed from: g */
    private final InterfaceC37731g1 f99560g;

    public C37736i1(@NotNull InterfaceC37731g1 interfaceC37731g1) {
        this.f99560g = interfaceC37731g1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo16059q(th);
        return Unit.f99208a;
    }

    @Override // kotlinx.coroutines.CompletionHandler
    /* renamed from: q */
    public void mo16059q(@Nullable Throwable th) {
        this.f99560g.dispose();
    }
}

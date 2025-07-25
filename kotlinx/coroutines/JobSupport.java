package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlinx.coroutines.a2 */
/* loaded from: classes7.dex */
public final class JobSupport extends AbstractC37737i2 {
    @NotNull

    /* renamed from: g */
    private final Function1<Throwable, Unit> f99505g;

    /* JADX WARN: Multi-variable type inference failed */
    public JobSupport(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f99505g = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo16059q(th);
        return Unit.f99208a;
    }

    @Override // kotlinx.coroutines.CompletionHandler
    /* renamed from: q */
    public void mo16059q(@Nullable Throwable th) {
        this.f99505g.invoke(th);
    }
}

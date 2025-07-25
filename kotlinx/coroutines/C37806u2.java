package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
@Metadata
/* renamed from: kotlinx.coroutines.u2 */
/* loaded from: classes7.dex */
public final class C37806u2 extends AbstractC37737i2 {
    @NotNull

    /* renamed from: g */
    private final Continuation<Unit> f99649g;

    /* JADX WARN: Multi-variable type inference failed */
    public C37806u2(@NotNull Continuation<? super Unit> continuation) {
        this.f99649g = continuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo16059q(th);
        return Unit.f99208a;
    }

    @Override // kotlinx.coroutines.CompletionHandler
    /* renamed from: q */
    public void mo16059q(@Nullable Throwable th) {
        Continuation<Unit> continuation = this.f99649g;
        Result.C38506a c38506a = Result.f101870c;
        continuation.resumeWith(Result.m14549b(Unit.f99208a));
    }
}

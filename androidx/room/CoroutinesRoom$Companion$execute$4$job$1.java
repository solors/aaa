package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.InterfaceC37780o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;

/* compiled from: CoroutinesRoom.kt */
@DebugMetadata(m17095c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m17094f = "CoroutinesRoom.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes2.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ InterfaceC37780o<R> $continuation;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, InterfaceC37780o<? super R> interfaceC37780o, Continuation<? super CoroutinesRoom$Companion$execute$4$job$1> continuation) {
        super(2, continuation);
        this.$callable = callable;
        this.$continuation = interfaceC37780o;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            try {
                this.$continuation.resumeWith(Result.m14549b(this.$callable.call()));
            } catch (Throwable th) {
                Continuation continuation = this.$continuation;
                Result.C38506a c38506a = Result.f101870c;
                continuation.resumeWith(Result.m14549b(C38508r.m14540a(th)));
            }
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}

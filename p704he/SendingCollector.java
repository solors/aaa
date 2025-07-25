package p704he;

import ge.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674fe.InterfaceC33136u;
import sd.C42688d;

@Metadata
/* renamed from: he.w */
/* loaded from: classes8.dex */
public final class SendingCollector<T> implements FlowCollector<T> {
    @NotNull

    /* renamed from: b */
    private final InterfaceC33136u<T> f91542b;

    /* JADX WARN: Multi-variable type inference failed */
    public SendingCollector(@NotNull InterfaceC33136u<? super T> interfaceC33136u) {
        this.f91542b = interfaceC33136u;
    }

    @Override // ge.FlowCollector
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object mo24644F = this.f91542b.mo24644F(t, continuation);
        m6959e = C42688d.m6959e();
        if (mo24644F == m6959e) {
            return mo24644F;
        }
        return Unit.f99208a;
    }
}

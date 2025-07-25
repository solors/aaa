package p704he;

import ge.FlowCollector;
import ge.InterfaceC33327h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674fe.BufferOverflow;
import sd.C42688d;

/* compiled from: ChannelFlow.kt */
@Metadata
/* renamed from: he.h */
/* loaded from: classes8.dex */
public final class C33513h<T> extends AbstractC33511g<T, T> {
    public /* synthetic */ C33513h(InterfaceC33327h interfaceC33327h, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC33327h, (i2 & 2) != 0 ? C37586g.f99289b : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // p704he.ChannelFlow
    @NotNull
    /* renamed from: i */
    protected ChannelFlow<T> mo23576i(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        return new C33513h(this.f91477f, coroutineContext, i, bufferOverflow);
    }

    @Override // p704he.ChannelFlow
    @NotNull
    /* renamed from: j */
    public InterfaceC33327h<T> mo23577j() {
        return (InterfaceC33327h<T>) this.f91477f;
    }

    @Override // p704he.AbstractC33511g
    @Nullable
    /* renamed from: q */
    protected Object mo23575q(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object collect = this.f91477f.collect(flowCollector, continuation);
        m6959e = C42688d.m6959e();
        if (collect == m6959e) {
            return collect;
        }
        return Unit.f99208a;
    }

    public C33513h(@NotNull InterfaceC33327h<? extends T> interfaceC33327h, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        super(interfaceC33327h, coroutineContext, i, bufferOverflow);
    }
}

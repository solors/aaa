package ge;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674fe.BufferOverflow;
import p704he.InterfaceC33528p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@Metadata
/* renamed from: ge.a0 */
/* loaded from: classes8.dex */
public final class C33309a0<T> implements SharedFlow<T>, InterfaceC33312c<T>, InterfaceC33528p<T> {
    @Nullable

    /* renamed from: b */
    private final InterfaceC37708b2 f90900b;

    /* renamed from: c */
    private final /* synthetic */ SharedFlow<T> f90901c;

    /* JADX WARN: Multi-variable type inference failed */
    public C33309a0(@NotNull SharedFlow<? extends T> sharedFlow, @Nullable InterfaceC37708b2 interfaceC37708b2) {
        this.f90900b = interfaceC37708b2;
        this.f90901c = sharedFlow;
    }

    @Override // p704he.InterfaceC33528p
    @NotNull
    /* renamed from: b */
    public InterfaceC33327h<T> mo23569b(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        return C33323f0.m24124e(this, coroutineContext, i, bufferOverflow);
    }

    @Override // ge.SharedFlow, ge.InterfaceC33327h
    @Nullable
    public Object collect(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<?> continuation) {
        return this.f90901c.collect(flowCollector, continuation);
    }
}

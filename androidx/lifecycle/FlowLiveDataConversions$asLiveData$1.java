package androidx.lifecycle;

import ge.FlowCollector;
import ge.InterfaceC33327h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: FlowLiveData.kt */
@DebugMetadata(m17095c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m17094f = "FlowLiveData.kt", m17093l = {81}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class FlowLiveDataConversions$asLiveData$1<T> extends AbstractC37596l implements Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC33327h<T> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowLiveDataConversions$asLiveData$1(InterfaceC33327h<? extends T> interfaceC33327h, Continuation<? super FlowLiveDataConversions$asLiveData$1> continuation) {
        super(2, continuation);
        this.$this_asLiveData = interfaceC33327h;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, continuation);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Nullable
    public final Object invoke(@NotNull LiveDataScope<T> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowLiveDataConversions$asLiveData$1) create(liveDataScope, continuation)).invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C38508r.m14539b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C38508r.m14539b(obj);
            final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            InterfaceC33327h<T> interfaceC33327h = this.$this_asLiveData;
            FlowCollector<? super T> flowCollector = new FlowCollector() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                @Override // ge.FlowCollector
                @Nullable
                public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
                    Object m6959e2;
                    Object emit = liveDataScope.emit(t, continuation);
                    m6959e2 = C42688d.m6959e();
                    if (emit == m6959e2) {
                        return emit;
                    }
                    return Unit.f99208a;
                }
            };
            this.label = 1;
            if (interfaceC33327h.collect(flowCollector, this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((LiveDataScope) ((LiveDataScope) obj), continuation);
    }
}

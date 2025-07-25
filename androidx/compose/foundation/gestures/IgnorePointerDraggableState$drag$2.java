package androidx.compose.foundation.gestures;

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

/* compiled from: Draggable.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", m17094f = "Draggable.kt", m17093l = {478}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class IgnorePointerDraggableState$drag$2 extends AbstractC37596l implements Function2<DragScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerAwareDragScope, Continuation<? super Unit>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IgnorePointerDraggableState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IgnorePointerDraggableState$drag$2(IgnorePointerDraggableState ignorePointerDraggableState, Function2<? super PointerAwareDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super IgnorePointerDraggableState$drag$2> continuation) {
        super(2, continuation);
        this.this$0 = ignorePointerDraggableState;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        IgnorePointerDraggableState$drag$2 ignorePointerDraggableState$drag$2 = new IgnorePointerDraggableState$drag$2(this.this$0, this.$block, continuation);
        ignorePointerDraggableState$drag$2.L$0 = obj;
        return ignorePointerDraggableState$drag$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
        return ((IgnorePointerDraggableState$drag$2) create(dragScope, continuation)).invokeSuspend(Unit.f99208a);
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
            this.this$0.setLatestConsumptionScope((DragScope) this.L$0);
            Function2<PointerAwareDragScope, Continuation<? super Unit>, Object> function2 = this.$block;
            IgnorePointerDraggableState ignorePointerDraggableState = this.this$0;
            this.label = 1;
            if (function2.mo105910invoke(ignorePointerDraggableState, this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }
}

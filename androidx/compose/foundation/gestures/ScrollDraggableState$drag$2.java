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

/* compiled from: Scrollable.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", m17094f = "Scrollable.kt", m17093l = {445}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class ScrollDraggableState$drag$2 extends AbstractC37596l implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerAwareDragScope, Continuation<? super Unit>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollDraggableState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, Function2<? super PointerAwareDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super ScrollDraggableState$drag$2> continuation) {
        super(2, continuation);
        this.this$0 = scrollDraggableState;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.this$0, this.$block, continuation);
        scrollDraggableState$drag$2.L$0 = obj;
        return scrollDraggableState$drag$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ScrollDraggableState$drag$2) create(scrollScope, continuation)).invokeSuspend(Unit.f99208a);
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
            this.this$0.setLatestScrollScope((ScrollScope) this.L$0);
            Function2<PointerAwareDragScope, Continuation<? super Unit>, Object> function2 = this.$block;
            ScrollDraggableState scrollDraggableState = this.this$0;
            this.label = 1;
            if (function2.mo105910invoke(scrollDraggableState, this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }
}

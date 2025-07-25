package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Draggable.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", m17094f = "Draggable.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
public final class DraggableKt$draggable$2 extends AbstractC37596l implements InterfaceC45268n<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DraggableKt$draggable$2(Continuation<? super DraggableKt$draggable$2> continuation) {
        super(3, continuation);
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, f.floatValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, float f, @Nullable Continuation<? super Unit> continuation) {
        return new DraggableKt$draggable$2(continuation).invokeSuspend(Unit.f99208a);
    }
}

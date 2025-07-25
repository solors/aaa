package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.ScrollingLogic", m17094f = "Scrollable.kt", m17093l = {378, 383, 385, 387, 393}, m17092m = "onDragStopped")
@Metadata
/* loaded from: classes.dex */
public final class ScrollingLogic$onDragStopped$1 extends AbstractC37589d {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$1> continuation) {
        super(continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onDragStopped(0.0f, this);
    }
}

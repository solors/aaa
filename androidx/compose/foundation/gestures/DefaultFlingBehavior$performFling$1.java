package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", m17094f = "Scrollable.kt", m17093l = {496}, m17092m = "performFling")
@Metadata
/* loaded from: classes.dex */
public final class DefaultFlingBehavior$performFling$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$1(DefaultFlingBehavior defaultFlingBehavior, Continuation<? super DefaultFlingBehavior$performFling$1> continuation) {
        super(continuation);
        this.this$0 = defaultFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling(null, 0.0f, this);
    }
}

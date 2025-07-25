package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", m17094f = "Scrollable.kt", m17093l = {477}, m17092m = "onPostFling-RZ2iAVY")
@Metadata
/* loaded from: classes.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends AbstractC37589d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollableKt$scrollableNestedScrollConnection$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1, Continuation<? super ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1> continuation) {
        super(continuation);
        this.this$0 = scrollableKt$scrollableNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo106219onPostFlingRZ2iAVY(0L, 0L, this);
    }
}

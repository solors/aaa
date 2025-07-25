package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextSelectionMouseDetector.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", m17094f = "TextSelectionMouseDetector.kt", m17093l = {127}, m17092m = "awaitMouseEventDown")
@Metadata
/* loaded from: classes.dex */
public final class TextSelectionMouseDetectorKt$awaitMouseEventDown$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextSelectionMouseDetectorKt$awaitMouseEventDown$1(Continuation<? super TextSelectionMouseDetectorKt$awaitMouseEventDown$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object awaitMouseEventDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(null, this);
        return awaitMouseEventDown;
    }
}

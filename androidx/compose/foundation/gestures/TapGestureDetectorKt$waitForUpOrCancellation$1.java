package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TapGestureDetector.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m17094f = "TapGestureDetector.kt", m17093l = {262, 277}, m17092m = "waitForUpOrCancellation")
@Metadata
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$waitForUpOrCancellation$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapGestureDetectorKt$waitForUpOrCancellation$1(Continuation<? super TapGestureDetectorKt$waitForUpOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.waitForUpOrCancellation(null, this);
    }
}

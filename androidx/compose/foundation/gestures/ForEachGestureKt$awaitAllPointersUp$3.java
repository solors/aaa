package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForEachGesture.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.ForEachGestureKt", m17094f = "ForEachGesture.kt", m17093l = {79}, m17092m = "awaitAllPointersUp")
@Metadata
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitAllPointersUp$3 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ForEachGestureKt$awaitAllPointersUp$3(Continuation<? super ForEachGestureKt$awaitAllPointersUp$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGesture.awaitAllPointersUp((AwaitPointerEventScope) null, this);
    }
}

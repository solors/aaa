package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForEachGesture.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.ForEachGestureKt", m17094f = "ForEachGesture.kt", m17093l = {41, 44, 49}, m17092m = "forEachGesture")
@Metadata
/* loaded from: classes.dex */
public final class ForEachGestureKt$forEachGesture$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ForEachGestureKt$forEachGesture$1(Continuation<? super ForEachGestureKt$forEachGesture$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGesture.forEachGesture(null, null, this);
    }
}

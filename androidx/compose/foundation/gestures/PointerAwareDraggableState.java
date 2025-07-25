package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Draggable.kt */
@Metadata
/* loaded from: classes.dex */
public interface PointerAwareDraggableState {
    static /* synthetic */ Object drag$default(PointerAwareDraggableState pointerAwareDraggableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return pointerAwareDraggableState.drag(mutatePriority, function2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
    }

    void dispatchRawDelta(float f);

    @Nullable
    Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super PointerAwareDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation);
}

package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Draggable.kt */
@Metadata
/* loaded from: classes.dex */
final class DraggableKt$draggable$4 extends Lambda implements Function1<PointerInputChange, Boolean> {
    public static final DraggableKt$draggable$4 INSTANCE = new DraggableKt$draggable$4();

    DraggableKt$draggable$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull PointerInputChange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}

package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Draggable.kt */
@Metadata
/* loaded from: classes.dex */
final class DraggableKt$draggable$5 extends Lambda implements Functions<Boolean> {
    final /* synthetic */ boolean $startDragImmediately;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$5(boolean z) {
        super(0);
        this.$startDragImmediately = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.$startDragImmediately);
    }
}

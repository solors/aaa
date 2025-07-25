package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Draggable.kt */
@Metadata
/* loaded from: classes.dex */
final class DraggableKt$draggable$3 extends Lambda implements Function2<Composer, Integer, PointerAwareDraggableState> {
    final /* synthetic */ DraggableState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$3(DraggableState draggableState) {
        super(2);
        this.$state = draggableState;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ PointerAwareDraggableState mo105910invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }

    @Composable
    @NotNull
    public final PointerAwareDraggableState invoke(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(830271906);
        DraggableState draggableState = this.$state;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(draggableState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new IgnorePointerDraggableState(draggableState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        IgnorePointerDraggableState ignorePointerDraggableState = (IgnorePointerDraggableState) rememberedValue;
        composer.endReplaceableGroup();
        return ignorePointerDraggableState;
    }
}

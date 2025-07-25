package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* loaded from: classes.dex */
public final class SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ DraggableState $draggableState$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ State $gestureEndAction$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ boolean $isRtl$inlined;
    final /* synthetic */ float $maxPx$inlined;
    final /* synthetic */ SnapshotState $pressOffset$inlined;
    final /* synthetic */ State $rawOffset$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f, boolean z, State state, State state2, SnapshotState snapshotState, boolean z2) {
        super(1);
        this.$draggableState$inlined = draggableState;
        this.$interactionSource$inlined = mutableInteractionSource;
        this.$maxPx$inlined = f;
        this.$isRtl$inlined = z;
        this.$rawOffset$inlined = state;
        this.$gestureEndAction$inlined = state2;
        this.$pressOffset$inlined = snapshotState;
        this.$enabled$inlined = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("sliderTapModifier");
        inspectorInfo.getProperties().set("draggableState", this.$draggableState$inlined);
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("maxPx", Float.valueOf(this.$maxPx$inlined));
        inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(this.$isRtl$inlined));
        inspectorInfo.getProperties().set("rawOffset", this.$rawOffset$inlined);
        inspectorInfo.getProperties().set("gestureEndAction", this.$gestureEndAction$inlined);
        inspectorInfo.getProperties().set("pressOffset", this.$pressOffset$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
    }
}

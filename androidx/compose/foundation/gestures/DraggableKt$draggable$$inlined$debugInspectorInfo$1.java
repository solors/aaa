package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: InspectableValue.kt */
@Metadata
/* loaded from: classes.dex */
public final class DraggableKt$draggable$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function1 $canDrag$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ InterfaceC45268n $onDragStarted$inlined;
    final /* synthetic */ InterfaceC45268n $onDragStopped$inlined;
    final /* synthetic */ Orientation $orientation$inlined;
    final /* synthetic */ boolean $reverseDirection$inlined;
    final /* synthetic */ Functions $startDragImmediately$inlined;
    final /* synthetic */ Function2 $stateFactory$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$$inlined$debugInspectorInfo$1(Function1 function1, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, Functions functions, InterfaceC45268n interfaceC45268n, InterfaceC45268n interfaceC45268n2, Function2 function2) {
        super(1);
        this.$canDrag$inlined = function1;
        this.$orientation$inlined = orientation;
        this.$enabled$inlined = z;
        this.$reverseDirection$inlined = z2;
        this.$interactionSource$inlined = mutableInteractionSource;
        this.$startDragImmediately$inlined = functions;
        this.$onDragStarted$inlined = interfaceC45268n;
        this.$onDragStopped$inlined = interfaceC45268n2;
        this.$stateFactory$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("canDrag", this.$canDrag$inlined);
        inspectorInfo.getProperties().set("orientation", this.$orientation$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.$reverseDirection$inlined));
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("startDragImmediately", this.$startDragImmediately$inlined);
        inspectorInfo.getProperties().set("onDragStarted", this.$onDragStarted$inlined);
        inspectorInfo.getProperties().set("onDragStopped", this.$onDragStopped$inlined);
        inspectorInfo.getProperties().set("stateFactory", this.$stateFactory$inlined);
    }
}

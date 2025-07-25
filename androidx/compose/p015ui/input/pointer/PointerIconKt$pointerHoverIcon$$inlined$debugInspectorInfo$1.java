package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ PointerIcon $icon$inlined;
    final /* synthetic */ boolean $overrideDescendants$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1(PointerIcon pointerIcon, boolean z) {
        super(1);
        this.$icon$inlined = pointerIcon;
        this.$overrideDescendants$inlined = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("pointerHoverIcon");
        inspectorInfo.getProperties().set("icon", this.$icon$inlined);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(this.$overrideDescendants$inlined));
    }
}

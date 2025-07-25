package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0837x2d9a6f60 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function1 $block$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0837x2d9a6f60(Function1 function1) {
        super(1);
        this.$block$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("block", this.$block$inlined);
    }
}
